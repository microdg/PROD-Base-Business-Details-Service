package com.services


/**
 * Created by pc on 19/01/2016.
 */

import org.scalatest.{FlatSpec, ShouldMatchers}

class BBDRetrievalSpec extends FlatSpec {
    
    //Return the full List of Businesses
    "Calling the Business List function" should "return an object of type String" in {
        assert(BBDRetrieval.businessList().isInstanceOf[String])
    }
    it should "have a length greater or equal to 0" in {
        assert(BBDRetrieval.businessList().length >= 0)
    }
    it should "should return a valid JSON array" in {
        assert(BBDRetrieval.businessList().startsWith("[") && BBDRetrieval.businessList().endsWith("]"))
    }
    
    //Return the count of all Businesses
    "Calling the Business List Count function" should "return an object of type Integer" in {
        assert(BBDRetrieval.businessListCount().isInstanceOf[Int])
    }
    it should "return an Integer greater or equal to 0" in {
        assert(BBDRetrieval.businessListCount() >= 0)
    }
    
    val inputParameterID = 1
    
    //Return the an idividual business based on ID
    "Calling the businessById function with parameter = 1" should "return an object of type String" in {
        assert(BBDRetrieval.businessById(inputParameterID).isInstanceOf[String])
    }
    it should "have a length greater or equal to 0" in {
        assert(BBDRetrieval.businessById(inputParameterID).length >= 0)
    }
    it should "should return a valid JSON array" in {
        assert(BBDRetrieval.businessById(inputParameterID).startsWith("[") && BBDRetrieval.businessList().endsWith("]"))
    }
    
    
    
    val inputParameterTown = "Balbriggan"
    
    //Return the subset of business based on town value
    "Calling the businessesByTown function" should "return an object of type String" in {
        assert(BBDRetrieval.businessesByTown(inputParameterTown).isInstanceOf[String])
    }
    it should "have a length greater or equal to 0" in {
        assert(BBDRetrieval.businessesByTown(inputParameterTown).length >= 0)
    }
    it should "should return a valid JSON array" in {
        assert(BBDRetrieval.businessesByTown(inputParameterTown).startsWith("[") && BBDRetrieval.businessList().endsWith("]"))
    }
    it should "have equal or less businesses than the master list" in {
        val fullBusinessListCount = BBDRetrieval.businessList().length
        val subBusinessListCount = BBDRetrieval.businessesByTown(inputParameterTown).length
        assert(subBusinessListCount <= fullBusinessListCount)
    }
    
    val inputParameterCounty = "Dublin"
    
    //Return the subset of business based on county value
    "Calling the businessesByCounty function" should "return an object of type String" in {
        assert(BBDRetrieval.businessesByCounty(inputParameterCounty).isInstanceOf[String])
    }
    it should "have a length greater or equal to 0" in {
        assert(BBDRetrieval.businessesByCounty(inputParameterCounty).length >= 0)
    }
    it should "should return a valid JSON array" in {
        assert(BBDRetrieval.businessesByCounty(inputParameterCounty).startsWith("[") && BBDRetrieval.businessList().endsWith("]"))
    }
    it should "have equal or less businesses than the master list" in {
        val fullBusinessListCount = BBDRetrieval.businessList().length
        val subBusinessListCount = BBDRetrieval.businessesByCounty(inputParameterCounty).length
        assert(subBusinessListCount <= fullBusinessListCount)
    }
    
    val inputParameterRegion = "Leinster"
    
    //Return the subset of business based on town value
    "Calling the businessesByRegion function" should "return an object of type String" in {
        assert(BBDRetrieval.businessesByRegion(inputParameterRegion).isInstanceOf[String])
    }
    it should "have a length greater or equal to 0" in {
        assert(BBDRetrieval.businessesByRegion(inputParameterRegion).length >= 0)
    }
    it should "should return a valid JSON array" in {
        assert(BBDRetrieval.businessesByRegion(inputParameterRegion).startsWith("[") && BBDRetrieval.businessList().endsWith("]"))
    }
    it should "have equal or less businesses than the master list" in {
        val fullBusinessListCount = BBDRetrieval.businessList().length
        val subBusinessListCount = BBDRetrieval.businessesByRegion(inputParameterRegion).length
        assert(subBusinessListCount <= fullBusinessListCount)
    }
    
}

