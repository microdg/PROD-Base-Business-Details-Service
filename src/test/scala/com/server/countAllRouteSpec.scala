package com.server

/**
 * Created by pc on 19/01/2016.
 */

import org.scalatest.{FlatSpec, ShouldMatchers}
import spray.testkit.ScalatestRouteTest
import spray.routing.Directives


class countAllRouteSpec  extends FlatSpec with ShouldMatchers
with ScalatestRouteTest with Directives {


//  "The number of Base Business Details" should "be greater or equal to zero" in {
//     Get("/baseBusinesses/all/count") ~> BaseBusinessDetailsService.countAllRoute ~> check {
//      responseAs[Int] should be >= 0
//     }
//  }


}
