package com.server

import org.scalatest.{FlatSpec, ShouldMatchers}
import spray.testkit.ScalatestRouteTest
import spray.routing.Directives


class ListAllRouteSpec extends FlatSpec with ShouldMatchers
    with ScalatestRouteTest with Directives {


    // it should "produce a valid json string with a list of businesses" in {
    //   Get("baseBusinesses/all/details") ~> BaseBusinessDetailsService.listAllRoute ~> check {
    //       val sampleString = 
    //     responseAs[String] should include (sampleString)
    //   }
    // }
    
    // it should "return a non-empty json string" in {
    //   Get("/baseBusinessDetails/all/details") ~> BaseBusinessDetailsService.listAllRoute ~> check {
    //     responseAs[String] should include ("Welcome to the Base Business Details Service \n " +
    //       "here are a list of the available routes:")
    //   }
    // }



}
