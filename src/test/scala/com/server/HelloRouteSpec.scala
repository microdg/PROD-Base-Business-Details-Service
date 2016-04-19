package com.server


/**
 * Created by pc on 19/01/2016.
 */

import org.scalatest.{FlatSpec, ShouldMatchers}
import spray.testkit.ScalatestRouteTest
import spray.routing.Directives


class HelloRouteSpec extends FlatSpec with ShouldMatchers
    with ScalatestRouteTest with Directives {


    it should "produce a welocme message" in {
      Get("/hello") ~> BaseBusinessDetailsService.helloRoute ~> check {
        responseAs[String] should include ("Welcome to the MicroDG Base Business Details Service" +
            "\n Routes:" +
            "\n Count All: baseBusinesses/all/count" +
            "\n List All: baseBusinesses/all/details" +
            "\n List by Town: baseBusinesses/all/details/towns/{town_name}" +
            "\n List by County: baseBusinesses/all/details/counties/{county_name}" +
            "\n List by Region: baseBusinesses/all/details/regions/{region_name}" +
            "\n List by ID: baseBusinesses/{id}/details")
      }
    }
    
    // it should "return a non-empty json string" in {
    //   Get("/baseBusinessDetails/all/details") ~> BaseBusinessDetailsService.listAllRoute ~> check {
    //     responseAs[String] should include ("Welcome to the Base Business Details Service \n " +
    //       "here are a list of the available routes:")
    //   }
    // }



}
