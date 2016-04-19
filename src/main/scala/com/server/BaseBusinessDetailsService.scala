package com.server

import akka.actor.ActorSystem
import com.models.Business
import com.support.CORSSupport
import com.services.BBDRetrieval
import spray.http.MediaTypes
import spray.routing.{Route, SimpleRoutingApp}

object BaseBusinessDetailsService extends App with SimpleRoutingApp with CORSSupport{


  implicit val actorSystem = ActorSystem()


  //Custom directive to replace the inclcusion of the stated return type header
  def getJson(route: Route) = get{
    respondWithMediaType(MediaTypes.`application/json`){
      route
    }
  }

  //I have defined each route independently as lazy vals to keep the code clean

  //Endpoint: List avalable endpoints
  lazy val helloRoute = get {
      cors{
        path("hello") {
          complete {
            "Welcome to the MicroDG Base Business Details Service" +
            "\n Routes:" +
            "\n Count All: baseBusinesses/all/count" +
            "\n List All: baseBusinesses/all/details" +
            "\n List by Town: baseBusinesses/all/details/towns/{town_name}" +
            "\n List by County: baseBusinesses/all/details/counties/{county_name}" +
            "\n List by Region: baseBusinesses/all/details/regions/{region_name}" +
            "\n List by ID: baseBusinesses/{id}/details"
          }
        }
      }
  }

  //Endpoint: Return a count of all records
  lazy val countAllRoute = getJson{
      cors{
        path("baseBusinesses" / "all" / "count"){
          complete{
              val count = BBDRetrieval.businessListCount().toInt
              s"$count"
          }
        }
      }
  }

  //Endpoint: Return all records 
  lazy val listAllRoute = getJson {
      cors{
        path("baseBusinesses" / "all" / "details"){
          complete{
                    BBDRetrieval.businessList()
          }
        }
      }
  }
  
  //Endpoint: Return all records based on town name
  lazy val listAllByTownRoute = getJson {
      cors{
        path("baseBusinesses" / "all" / "details" / "towns" / Segment ){ town =>
          complete{
                    BBDRetrieval.businessesByTown(town)
          }
        }
      }
  }
  
  //Endpoint: Return all records based on county name
  lazy val listAllByCountyRoute = getJson {
      cors{
        path("baseBusinesses" / "all" / "details" / "counties" / Segment ){ county =>
          complete{
                    BBDRetrieval.businessesByCounty(county)
          }
        }
      }
  }
  
  //Endpoint: Return all records based on region name
  lazy val listAllByRegionRoute = getJson {
      cors{
        path("baseBusinesses" / "all" / "details" / "regions" / Segment ){ region =>
          complete{
                    BBDRetrieval.businessesByRegion(region)
          }
        }
      }
  }
  
  //Endpoint: Return record based on ID
  lazy val selectWithIdRoute = get{
     cors{ 
         path("baseBusinesses" / IntNumber / "details"){ id =>
          complete{
             BBDRetrieval.businessById(id)
          }
         }
     }
  }

  //Each route is chained together in the start server method
  startServer(interface = "localhost", port = 8080) {
    helloRoute~
    listAllRoute~
    countAllRoute~
    selectWithIdRoute~
    listAllByTownRoute~
    listAllByCountyRoute~
    listAllByRegionRoute
  }

}

  