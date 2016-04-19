//Below is a sample collection of Businesses
//By storing this sampple data in an in memory collection rather than a database it vastly increases the query speed

package com.models

trait Business

object Business{
    
    case class Business(id: Int, name: String, channel: String, channel_type: String, phone: String, address: String, town: String, county: String, region: String )
    
    val businesses = List[Business](
        //Dublin
        Business(0, "Brooks Hire", "retail", "hire", "+35318410436", "Unit BC5 M1 Business Park Courtlough Balbriggan Co. Dublin", "Balbriggan","Dublin", "Leinster"),
        Business(1, "Harry Hire", "retail", "hire", "+35318412417", "3 Dublin Street Balbriggan Co. Dublin", "Balbriggan","Dublin", "Leinster"),
        Business(2, "O' Rourke Plant Hire", "retail", "hire", "+35318415942", "51 Pinewood Green Lawn Balbriggan Co. Dublin", "Balbriggan","Dublin", "Leinster"),
        Business(3, "Quads For Hire", "retail", "hire", "+353868723219", "Balrothery Balbriggan Co. Dublin", "Balbriggan","Dublin", "Leinster"),
        Business(4, "Jack Doyles Bar", "f&b", "pub", "+35318413333", "Bridge Street Balbriggan Co. Dublin", "Balbriggan","Dublin", "Leinster"),
        Business(5, "Harvest Inn", "f&b", "pub", "+35318411265", "Drogheda Street Balbriggan Co. Dublin", "Balbriggan","Dublin", "Leinster"),
        Business(6, "Milestone Inn", "f&b", "pub", "+35318412176", "Drogheda Street Balbriggan Co Dublin", "Balbriggan","Dublin", "Leinster"),
        Business(7, "White Hart Inn", "f&b", "pub", "+35318412190", "Dublin Street Balbriggan Co. Dublin", "Balbriggan","Dublin", "Leinster"),
        Business(8, "Man O War Inn", "f&b", "pub", "+35318414052", "Courtlough Balbriggan Co. Dublin", "Balbriggan","Dublin", "Leinster"),
        Business(9, "Brownes Butchers", "food", "butchers", "+35318412113", "19 Bridge Street Balbriggan Co. Dublin", "Balbriggan","Dublin", "Leinster"),
        Business(10, "Landmark Estates", "property", "estate agents", "+35318414726", "21 Drogheda Street Balbriggan Co. Dublin", "Balbriggan", "Dublin", "Leinster"),
        Business(11, "Landmark Estates", "property", "estate agents", "+35318414726", "21 Drogheda Street Balbriggan Co. Dublin", "Balbriggan", "Dublin", "Leinster"),
        Business(12, "Village Art Gallery", "art", "gallery", "+35318492236", "83 Strand Street Skerries Co. Dublin", "Skerries", "Dublin", "Leinster"),
        Business(13, "Carrolls Pierhouse Hotel Restaurant", "f&b", "restaurant", "+35318491033", "Harbour Road Skerries Co. Dublin", "Skerries", "Dublin", "Leinster"),
        Business(14, "Central Cafe", "f&b", "cafe", "+35318491374", "75 Strand Street Skerries Co.Dublin", "Skerries", "Dublin", "Leinster"),
        Business(15, "O'Sheas Bar & Restaurant", "f&b", "pub", "+35318491374", "17 New Street Skerries Co Dublin", "Skerries", "Dublin", "Leinster"),
        Business(16, "Olive", "f&b", "cafe", "+35318490310", "86A Strand Street Skerries Co. Dublin", "Skerries", "Dublin", "Leinster"),
        Business(17, "Parachute Cafe", "f&b", "cafe", "+35318492322", "47 Thomas Hand Street Skerries Co. Dublin", "Skerries", "Dublin", "Leinster"),
        Business(18, "Pasta Pizza", "f&b", "restaurant", "+35318492724", "54 Strand Street Skerries Co. Dublin", "Skerries", "Dublin", "Leinster"),
        Business(19, "Pheonix Chinese Take Away", "f&b", "takeaway", "+35318490848", "South Strand Skerries Co Dublin", "Skerries", "Dublin", "Leinster"),
        Business(20, "Russelle Restauran", "f&b", "restaurant", "+35318492450", "24 Strand Street Skerries Co. Dublin", "Skerries", "Dublin", "Leinster"),
        Business(21, "The Cottage Bistro", "f&b", "restaurant", "+35318492450", "17 New Street Skerries Co. Dublin", "Skerries", "Dublin", "Leinster"),
        Business(22, "The Lifeboat Restaurant", "f&b", "restaurant", "+35318490109", "Harbour Road Skerries Co Dublin", "Skerries", "Dublin", "Leinster"),
        //Munster
        Business(23, "Stratton Consultants", "finance", "consultants", "+353214341483", "Stratton House, Bishopstown Cork Co. Cork", "Cork", "Cork", "Munster"),
        Business(24, "IFAC Accountants", "finance", "accountants", "+353214381096", "U12A Sunbury, Blarney, Co. Cork", "Cork", "Cork", "Munster"),
        Business(25, "Biz Mate", "finance", "consultants", "+353214897116", "Tranquillity, Rochestown Road, Cork, Co. Cork", "Cork", "Cork", "Munster"),
        Business(26, "Hartnett & Co", "finance", "consultants", "+353215005890", " 1st Floor, Red Abbey Building, Unit 20 South Link Park, Frankfield, Co. Cork", "Cork", "Cork", "Munster"),
        Business(27, "Gordon Lane & Co", "finance", "accountants", "+353214272320", "4th Floor, Hanover House, 85/89 South Main Street, Cork City Centre, Co. Cork", "Cork", "Cork", "Munster"),
        //Connacht
        Business(28, "Da Roberta Ristorante", "f&b", "restaurant", "+35391585808", "169 Upper Salthill, Salthill, Co. Galway", "Galway", "Galway", "Connacht"),
        Business(29, "Culture Cafe", "f&b", "cafe", "+35391547676", "5 Lombard St, Co. Galway", "Galway", "Galway", "Connacht"),
        Business(30, "Cookes Restaraunt & Wine Bar", "f&b", "restaurant", "+35391568203", "28 Upper Abbeygate St, Co. Galway", "Galway", "Galway", "Connacht"),
        Business(31, "City Villa", "f&b", "restaurant", "+35391562383", "3 Prospect Hill, Co. Galway", "Galway", "Galway", "Connacht"),
        Business(32, "Franklin's Restaraunt", "f&b", "restaurant", "+35391564627", "Galway Shopping Centre, Co Galway", "Galway", "Galway", "Connacht"),
        //Ulster
        Business(33, "Ann's Pantry", "f&b", "bakery", "+3532890249090", "29 Queens Arcade, Belfast, County Antrim, BT1 5FE", "Belfast", "Antrim", "Ulster"),
        Business(34, "Boyles Home Bakery", "f&b", "bakery", "+3532890324485", "7 Castle Street, Belfast, County Antrim, BT1 1HB", "Belfast", "Antrim", "Ulster"),
        Business(35, "Country Kitchen", "f&b", "bakery", "+3532890740668", " 294 Cliftonville Road, Belfast, County Antrim, BT14 6LE", "Belfast", "Antrim", "Ulster"),
        Business(36, "Elisabeths Bake Shop", "f&b", "bakery", "+3532890658292", "352 Upper Newtownards Road, Belfast, County Antrim, BT4 3EX", "Belfast", "Antrim", "Ulster"),
        Business(37, "Helen's", "f&b", "bakery", "+3532890241680", "162 Ormeau Road, Belfast, County Antrim, BT7 2ED", "Belfast", "Antrim", "Ulster")
      )

}



