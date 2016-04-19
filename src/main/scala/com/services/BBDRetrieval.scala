//This is the retrieval Service
//Each funtcion perform a query on the collection and returns a JSON object
//Each function calls on the Logging function defined in the support directory

package com.services

import com.models.Business
import com.support.LoggingSupport

import scala.collection.mutable._ 
import net.liftweb.json._
import net.liftweb.json.Serialization.write
import java.util.Calendar

object BBDRetrieval {
    
	implicit val formats = DefaultFormats	
	
	//Query: Retrieve all records
	def businessList() : String = {
		val businesses = Business.businesses
		val jsonString = write(businesses)
		return jsonString
	}
    
    //Query: Retrieve a count of all records
	def businessListCount() : Int = {
		val businesses = Business.businesses
		val count = businesses.length
		return count
	}
	
	//Query: Retrieve all records based on a town name
	def businessesByTown(town: String) : String = {
		val businesses = Business.businesses
		val businessesByTown = for(b <- businesses if b.town == town) yield b
		val jsonString = write(businessesByTown)
		LoggingSupport.serviceRequestlog1("Business By Town", "Town")
		return jsonString
	}
	
	//Query: Retrieve all records based on a county name
	def businessesByCounty(county: String) : String = {
		val businesses = Business.businesses
		val businessesByCounty = for(b <- businesses if b.county == county) yield b
		val jsonString = write(businessesByCounty)
		LoggingSupport.serviceRequestlog1("Business By County", "County")
		return jsonString
	}
	
	//Query: Retrieve all records based on a region name
	def businessesByRegion(region: String) : String = {
		val businesses = Business.businesses
		val businessByRegion = for(b <- businesses if b.region == region) yield b
		val jsonString = write(businessByRegion)
		LoggingSupport.serviceRequestlog1("Business By Region", "Region")
		return jsonString
	}
	
	//Query: Retrieve a record based on an ID
	def businessById(id: Int) : String = {
		val businesses = Business.businesses
		val businessById = for(b <- businesses if b.id == id) yield b
		val jsonString = write(businessById)
		return jsonString
	}
	

}