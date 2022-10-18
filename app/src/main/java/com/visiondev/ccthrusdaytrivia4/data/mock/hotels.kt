package com.visiondev.ccthrusdaytrivia4.data.mock

import android.location.Location
import com.visiondev.ccthrusdaytrivia4.R
import com.visiondev.ccthrusdaytrivia4.data.models.Hotel


val MOCK_NAMES  = arrayOf(
    "Coast Hotels", "Kings Inn", "Lustrio Inn", "Moss View Hotel", "Omni Hotels", "Paramount Hotel", "Primland", "Roadside", "Malibu", "Happy Mornings Motel", "Hillside Hotel", "Small Town B&B", "The Local B&B", "Quaint Motel", "Quality Hotels", "Breeze Blows", "La Parisienne", "The Worldly Traveler", "Quick Stop Hotel", "Clean Convenience", "Better And Better", "Sea Otter Inn", "Lake Union Cottage", "The Travel Inn", "The Mc star Isle", "Windsor Suites Hotel", "Secret Mirage", "Columbus Motor Inn", "Millenium Hotels & Resorts", "Zzz Motel", "The Arctic Club", "Your Tokyo Hotel", "Harborview Inn & Suites", "Lotte New York Palace", "Waltzing Matilda", "Sapphire Shield Resort", "Hampton Inn & Suites San Bernardino", "Royal Orbit", "Hotel 48LEX", "Omni Hotels", "Bluewaves Motels", "Hard Rock Hotel", "Friendship Inn", "Country Inn", "Sand Castle Inn and Suites", "Big Dick’s Halfway Inn", "The Arctic Club", "The Houstonian Hotel", "Downtowner Hotel", "Joy Hunch Inn", "Palm Springs Resort", "Homewood Suites", "The Gregory Hotel", "Nebula Hotel", "Wedgewood Resort", "The Nines", "Sweet Dreams B&B", "The Standard High Line", "Enchanting Castle", "Amerin suites", "Diode Inn", "Stay Alfred Pike Place", "Studio Hotel", "Debbie’s Hide A Way", "Cabernet House", "Casa Palmero", "Big Dreams", "Best Western Escondido Hotel", "Seattle Pacific Hotel", "Jackson Hole Resort", "McMenamins Anderson School", "Hotel De La Crème", "Hampton Inn & Suites Tahoe-Truckee", "Kimpton Palladian Hotel", "Hyatt House Seattle/Downtown", "Hotel Stratesphere", "Hotel Corque", "Marianne Hotel", "Backyard B&B", "Pinnacle Lodge", "Moore Hotel", "DuPont Plaza Hotel", "Sleeping Dragon", "Country Comfort", "Hotel Chicberry", "Hotel Minute Masti", "Beachside", "Convention Center Apartments", "Happyland Motels", "Downtown Seattle Condos by Barsala", "Happy Hotel", "Door Motel", "TrioSpire", "Courtyard by Marriott Irvine Spectrum", "Cedar Point", "Travelodge Hotel", "Weekly Inn", "Hyatt House San Jose/Silicon Valley", "Marco Polo Motel", "Woodlark"
)

 val MOCK_HOTELS = buildList {
     for ( i in (0 until 100))
         add(Hotel(MOCK_NAMES[i],"address $i", R.drawable.hotel,""))
 }