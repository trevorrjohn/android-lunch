package com.example.api;

/*
{
 "kind": "qpxExpress#tripsSearch",
 "trips": {
  "kind": "qpxexpress#tripOptions",
  "requestId": "adxtepsUNQMKLZPTy0KZvI",
  "data": {
   "kind": "qpxexpress#data",
   "airport": [
    {
     "kind": "qpxexpress#airportData",
     "code": "ATL",
     "city": "ATL",
     "name": "Atlanta Hartsfield-Jackson ATL"
    },
    {
     "kind": "qpxexpress#airportData",
     "code": "DTW",
     "city": "DTT",
     "name": "Detroit Wayne County"
    },
    {
     "kind": "qpxexpress#airportData",
     "code": "IAD",
     "city": "WAS",
     "name": "Washington Dulles International"
    },
    {
     "kind": "qpxexpress#airportData",
     "code": "LGA",
     "city": "NYC",
     "name": "New York La Guardia"
    },
    {
     "kind": "qpxexpress#airportData",
     "code": "ORD",
     "city": "CHI",
     "name": "Chicago O'Hare"
    }
   ],
   "city": [
    {
     "kind": "qpxexpress#cityData",
     "code": "ATL",
     "name": "Atlanta"
    },
    {
     "kind": "qpxexpress#cityData",
     "code": "CHI",
     "name": "Chicago"
    },
    {
     "kind": "qpxexpress#cityData",
     "code": "DTT",
     "name": "Detroit"
    },
    {
     "kind": "qpxexpress#cityData",
     "code": "NYC",
     "name": "New York"
    },
    {
     "kind": "qpxexpress#cityData",
     "code": "WAS",
     "name": "Washington"
    }
   ],
   "aircraft": [
    {
     "kind": "qpxexpress#aircraftData",
     "code": "319",
     "name": "Airbus A319"
    },
    {
     "kind": "qpxexpress#aircraftData",
     "code": "320",
     "name": "Airbus A320"
    },
    {
     "kind": "qpxexpress#aircraftData",
     "code": "717",
     "name": "Boeing 717"
    },
    {
     "kind": "qpxexpress#aircraftData",
     "code": "738",
     "name": "Boeing 737"
    },
    {
     "kind": "qpxexpress#aircraftData",
     "code": "73G",
     "name": "Boeing 737"
    },
    {
     "kind": "qpxexpress#aircraftData",
     "code": "73W",
     "name": "Boeing 737"
    },
    {
     "kind": "qpxexpress#aircraftData",
     "code": "CR7",
     "name": "Canadair RJ 700"
    },
    {
     "kind": "qpxexpress#aircraftData",
     "code": "CRJ",
     "name": "Canadair Reg. Jet"
    },
    {
     "kind": "qpxexpress#aircraftData",
     "code": "E70",
     "name": "Embraer RJ-170"
    },
    {
     "kind": "qpxexpress#aircraftData",
     "code": "ERJ",
     "name": "Embraer ERJ-135/145"
    }
   ],
   "tax": [
    {
     "kind": "qpxexpress#taxData",
     "id": "ZP",
     "name": "US Flight Segment Tax"
    },
    {
     "kind": "qpxexpress#taxData",
     "id": "XF",
     "name": "US Passenger Facility Charge"
    },
    {
     "kind": "qpxexpress#taxData",
     "id": "AY",
     "name": "US September 11th Security Fee"
    },
    {
     "kind": "qpxexpress#taxData",
     "id": "US_1",
     "name": "US Transportation Tax"
    }
   ],
   "carrier": [
    {
     "kind": "qpxexpress#carrierData",
     "code": "FL",
     "name": "AirTran Airways, Inc."
    },
    {
     "kind": "qpxexpress#carrierData",
     "code": "NK",
     "name": "Spirit Airlines"
    },
    {
     "kind": "qpxexpress#carrierData",
     "code": "UA",
     "name": "United Airlines, Inc."
    }
   ]
  },
  "tripOption": [
   {
    "kind": "qpxexpress#tripOption",
    "saleTotal": "USD109.60",
    "id": "NKqGcEHF9CAUo7UcIR3NN6004",
    "slice": [
     {
      "kind": "qpxexpress#sliceInfo",
      "duration": 390,
      "segment": [
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 120,
        "flight": {
         "carrier": "FL",
         "number": "216"
        },
        "id": "G8DukfHMhe1LIJM8",
        "cabin": "COACH",
        "bookingCode": "X",
        "bookingCodeCount": 7,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "LFarCHyaBl633Jyc",
          "aircraft": "717",
          "arrivalTime": "2014-10-30T17:50-04:00",
          "departureTime": "2014-10-30T15:50-04:00",
          "origin": "DTW",
          "destination": "ATL",
          "originTerminal": "N",
          "destinationTerminal": "N",
          "duration": 120,
          "onTimePerformance": 80,
          "mileage": 595,
          "secure": true
         }
        ],
        "connectionDuration": 125
       },
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 145,
        "flight": {
         "carrier": "FL",
         "number": "5122"
        },
        "id": "G4dTX6QulLaAEo9-",
        "cabin": "COACH",
        "bookingCode": "X",
        "bookingCodeCount": 7,
        "marriedSegmentGroup": "1",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "LOA821hnXT7b2vB2",
          "aircraft": "73W",
          "arrivalTime": "2014-10-30T22:20-04:00",
          "departureTime": "2014-10-30T19:55-04:00",
          "origin": "ATL",
          "destination": "LGA",
          "originTerminal": "N",
          "destinationTerminal": "B",
          "duration": 145,
          "operatingDisclosure": "OPERATED BY SOUTHWEST AIRLINES CO.",
          "mileage": 760,
          "secure": true
         }
        ]
       }
      ]
     }
    ],
    "pricing": [
     {
      "kind": "qpxexpress#pricingInfo",
      "fare": [
       {
        "kind": "qpxexpress#fareInfo",
        "id": "Az977L2IPr1R4Vns0/MNFYE9DFOeerTQN0HDugLD7idU",
        "carrier": "FL",
        "origin": "DTT",
        "destination": "NYC",
        "basisCode": "XLAVWNRO"
       }
      ],
      "segmentPricing": [
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "Az977L2IPr1R4Vns0/MNFYE9DFOeerTQN0HDugLD7idU",
        "segmentId": "G8DukfHMhe1LIJM8",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "pieces": 0
         }
        ]
       },
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "Az977L2IPr1R4Vns0/MNFYE9DFOeerTQN0HDugLD7idU",
        "segmentId": "G4dTX6QulLaAEo9-",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "pieces": 0
         }
        ]
       }
      ],
      "baseFareTotal": "USD80.93",
      "saleFareTotal": "USD80.93",
      "saleTaxTotal": "USD28.67",
      "saleTotal": "USD109.60",
      "passengers": {
       "kind": "qpxexpress#passengerCounts",
       "adultCount": 1
      },
      "tax": [
       {
        "kind": "qpxexpress#taxInfo",
        "id": "US_1",
        "chargeType": "GOVERNMENT",
        "code": "US",
        "country": "US",
        "salePrice": "USD6.07"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "AY",
        "chargeType": "GOVERNMENT",
        "code": "AY",
        "country": "US",
        "salePrice": "USD5.60"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "XF",
        "chargeType": "GOVERNMENT",
        "code": "XF",
        "country": "US",
        "salePrice": "USD9.00"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "ZP",
        "chargeType": "GOVERNMENT",
        "code": "ZP",
        "country": "US",
        "salePrice": "USD8.00"
       }
      ],
      "fareCalculation": "DTT FL X/ATL FL NYC 80.93XLAVWNRO USD 80.93 END ZP DTW ATL XT 6.07US 8.00ZP 5.60AY 9.00XF DTW4.50 ATL4.50",
      "latestTicketingTime": "2014-09-02T23:59-04:00",
      "ptc": "ADT"
     }
    ]
   },
   {
    "kind": "qpxexpress#tripOption",
    "saleTotal": "USD112.10",
    "id": "NKqGcEHF9CAUo7UcIR3NN6001",
    "slice": [
     {
      "kind": "qpxexpress#sliceInfo",
      "duration": 95,
      "segment": [
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 95,
        "flight": {
         "carrier": "NK",
         "number": "316"
        },
        "id": "GWHAb5QA-7l6vA6o",
        "cabin": "COACH",
        "bookingCode": "U",
        "bookingCodeCount": 4,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "Lx-oEBUGPjTnXpqT",
          "aircraft": "320",
          "arrivalTime": "2014-10-30T07:40-04:00",
          "departureTime": "2014-10-30T06:05-04:00",
          "origin": "DTW",
          "destination": "LGA",
          "originTerminal": "N",
          "destinationTerminal": "B",
          "duration": 95,
          "mileage": 500,
          "secure": true
         }
        ]
       }
      ]
     }
    ],
    "pricing": [
     {
      "kind": "qpxexpress#pricingInfo",
      "fare": [
       {
        "kind": "qpxexpress#fareInfo",
        "id": "AuQjp060w4GDa9xInJulr/VuKYgzW+hjsrKL12TsqCw2",
        "carrier": "NK",
        "origin": "DTT",
        "destination": "NYC",
        "basisCode": "UA7NR"
       }
      ],
      "segmentPricing": [
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "AuQjp060w4GDa9xInJulr/VuKYgzW+hjsrKL12TsqCw2",
        "segmentId": "GWHAb5QA-7l6vA6o"
       }
      ],
      "baseFareTotal": "USD91.16",
      "saleFareTotal": "USD91.16",
      "saleTaxTotal": "USD20.94",
      "saleTotal": "USD112.10",
      "passengers": {
       "kind": "qpxexpress#passengerCounts",
       "adultCount": 1
      },
      "tax": [
       {
        "kind": "qpxexpress#taxInfo",
        "id": "US_1",
        "chargeType": "GOVERNMENT",
        "code": "US",
        "country": "US",
        "salePrice": "USD6.84"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "AY",
        "chargeType": "GOVERNMENT",
        "code": "AY",
        "country": "US",
        "salePrice": "USD5.60"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "XF",
        "chargeType": "GOVERNMENT",
        "code": "XF",
        "country": "US",
        "salePrice": "USD4.50"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "ZP",
        "chargeType": "GOVERNMENT",
        "code": "ZP",
        "country": "US",
        "salePrice": "USD4.00"
       }
      ],
      "fareCalculation": "DTT NK NYC Q17.67 Q4.65 68.84UA7NR USD 91.16 END ZP DTW XT 6.84US 4.00ZP 5.60AY 4.50XF DTW4.50",
      "latestTicketingTime": "2014-09-02T00:12-04:00",
      "ptc": "ADT"
     }
    ]
   },
   {
    "kind": "qpxexpress#tripOption",
    "saleTotal": "USD117.10",
    "id": "NKqGcEHF9CAUo7UcIR3NN6002",
    "slice": [
     {
      "kind": "qpxexpress#sliceInfo",
      "duration": 107,
      "segment": [
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 107,
        "flight": {
         "carrier": "NK",
         "number": "188"
        },
        "id": "GLYigLxf-Onr9zJS",
        "cabin": "COACH",
        "bookingCode": "R",
        "bookingCodeCount": 4,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "LkhZMwZMPFMvQJfw",
          "aircraft": "320",
          "arrivalTime": "2014-10-30T17:44-04:00",
          "departureTime": "2014-10-30T15:57-04:00",
          "origin": "DTW",
          "destination": "LGA",
          "originTerminal": "N",
          "destinationTerminal": "B",
          "duration": 107,
          "mileage": 500,
          "secure": true
         }
        ]
       }
      ]
     }
    ],
    "pricing": [
     {
      "kind": "qpxexpress#pricingInfo",
      "fare": [
       {
        "kind": "qpxexpress#fareInfo",
        "id": "AxJhlodxpanXoICpk8PI3wsG8IYX+MamJqEvN7D+igxA",
        "carrier": "NK",
        "origin": "DTT",
        "destination": "NYC",
        "basisCode": "R7Z2NR"
       }
      ],
      "segmentPricing": [
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "AxJhlodxpanXoICpk8PI3wsG8IYX+MamJqEvN7D+igxA",
        "segmentId": "GLYigLxf-Onr9zJS"
       }
      ],
      "baseFareTotal": "USD95.81",
      "saleFareTotal": "USD95.81",
      "saleTaxTotal": "USD21.29",
      "saleTotal": "USD117.10",
      "passengers": {
       "kind": "qpxexpress#passengerCounts",
       "adultCount": 1
      },
      "tax": [
       {
        "kind": "qpxexpress#taxInfo",
        "id": "US_1",
        "chargeType": "GOVERNMENT",
        "code": "US",
        "country": "US",
        "salePrice": "USD7.19"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "AY",
        "chargeType": "GOVERNMENT",
        "code": "AY",
        "country": "US",
        "salePrice": "USD5.60"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "XF",
        "chargeType": "GOVERNMENT",
        "code": "XF",
        "country": "US",
        "salePrice": "USD4.50"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "ZP",
        "chargeType": "GOVERNMENT",
        "code": "ZP",
        "country": "US",
        "salePrice": "USD4.00"
       }
      ],
      "fareCalculation": "DTT NK NYC Q17.67 Q4.65 73.49R7Z2NR USD 95.81 END ZP DTW XT 7.19US 4.00ZP 5.60AY 4.50XF DTW4.50",
      "latestTicketingTime": "2014-09-02T00:12-04:00",
      "ptc": "ADT"
     }
    ]
   },
   {
    "kind": "qpxexpress#tripOption",
    "saleTotal": "USD131.60",
    "id": "NKqGcEHF9CAUo7UcIR3NN6003",
    "slice": [
     {
      "kind": "qpxexpress#sliceInfo",
      "duration": 213,
      "segment": [
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 89,
        "flight": {
         "carrier": "UA",
         "number": "4563"
        },
        "id": "G3hY8wB94JBoH6MF",
        "cabin": "COACH",
        "bookingCode": "L",
        "bookingCodeCount": 6,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "Lbuta3HOxmgy+HLz",
          "aircraft": "ERJ",
          "arrivalTime": "2014-10-30T21:07-04:00",
          "departureTime": "2014-10-30T19:38-04:00",
          "origin": "DTW",
          "destination": "IAD",
          "originTerminal": "N",
          "duration": 89,
          "operatingDisclosure": "OPERATED BY EXPRESSJET AIRLINES DBA UNITED EXPRESS",
          "mileage": 382,
          "secure": true
         }
        ],
        "connectionDuration": 54
       },
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 70,
        "flight": {
         "carrier": "UA",
         "number": "3770"
        },
        "id": "G2SZnKuhKveTqcI+",
        "cabin": "COACH",
        "bookingCode": "L",
        "bookingCodeCount": 6,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "LdRnOW79OiGWtFM4",
          "aircraft": "CR7",
          "arrivalTime": "2014-10-30T23:11-04:00",
          "departureTime": "2014-10-30T22:01-04:00",
          "origin": "IAD",
          "destination": "LGA",
          "destinationTerminal": "B",
          "duration": 70,
          "operatingDisclosure": "OPERATED BY MESA AIRLINES DBA UNITED EXPRESS",
          "mileage": 228,
          "secure": true
         }
        ]
       }
      ]
     }
    ],
    "pricing": [
     {
      "kind": "qpxexpress#pricingInfo",
      "fare": [
       {
        "kind": "qpxexpress#fareInfo",
        "id": "ABLGq16KSMo/n5Zp/iu+YQhRfiMxbTHZ8p8sps9wrpqo",
        "carrier": "UA",
        "origin": "DTT",
        "destination": "NYC",
        "basisCode": "LAA14AZN"
       }
      ],
      "segmentPricing": [
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "ABLGq16KSMo/n5Zp/iu+YQhRfiMxbTHZ8p8sps9wrpqo",
        "segmentId": "G3hY8wB94JBoH6MF",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "bagDescriptor": [
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "UPTO50LB 23KG AND62LI 158LCM",
            "count": 0,
            "description": [
             "Up to 50 lb/23 kg",
             "Up to 62 li/158 lcm"
            ],
            "subcode": "0GO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "MUSICAL INSTRUMENTS",
            "count": 0,
            "subcode": "0F2"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "ARCHERY EQUIPMENT",
            "count": 0,
            "description": [
             "Archery Equipment"
            ],
            "subcode": "0FO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "BOWLING EQUIPMENT",
            "count": 0,
            "description": [
             "Bowling Equipment"
            ],
            "subcode": "0FS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "FISHING EQUIPMENT",
            "count": 0,
            "description": [
             "Fishing Equipment"
            ],
            "subcode": "0D6"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "GOLF EQUIPMENT",
            "count": 0,
            "description": [
             "Golf Equipment"
            ],
            "subcode": "0DC"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "HOCKEY EQUIPMENT",
            "count": 0,
            "description": [
             "Hockey Equipment"
            ],
            "subcode": "0F0"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKATEBOARD",
            "count": 0,
            "description": [
             "Skateboard"
            ],
            "subcode": "0IS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Ski Equipment"
            ],
            "subcode": "0DD"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "WATER SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Water Ski Equipment"
            ],
            "subcode": "0G2"
           }
          ],
          "pieces": 0
         }
        ]
       },
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "ABLGq16KSMo/n5Zp/iu+YQhRfiMxbTHZ8p8sps9wrpqo",
        "segmentId": "G2SZnKuhKveTqcI+",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "bagDescriptor": [
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "UPTO50LB 23KG AND62LI 158LCM",
            "count": 0,
            "description": [
             "Up to 50 lb/23 kg",
             "Up to 62 li/158 lcm"
            ],
            "subcode": "0GO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "MUSICAL INSTRUMENTS",
            "count": 0,
            "subcode": "0F2"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "ARCHERY EQUIPMENT",
            "count": 0,
            "description": [
             "Archery Equipment"
            ],
            "subcode": "0FO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "BOWLING EQUIPMENT",
            "count": 0,
            "description": [
             "Bowling Equipment"
            ],
            "subcode": "0FS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "FISHING EQUIPMENT",
            "count": 0,
            "description": [
             "Fishing Equipment"
            ],
            "subcode": "0D6"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "GOLF EQUIPMENT",
            "count": 0,
            "description": [
             "Golf Equipment"
            ],
            "subcode": "0DC"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "HOCKEY EQUIPMENT",
            "count": 0,
            "description": [
             "Hockey Equipment"
            ],
            "subcode": "0F0"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKATEBOARD",
            "count": 0,
            "description": [
             "Skateboard"
            ],
            "subcode": "0IS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Ski Equipment"
            ],
            "subcode": "0DD"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "WATER SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Water Ski Equipment"
            ],
            "subcode": "0G2"
           }
          ],
          "pieces": 0
         }
        ]
       }
      ],
      "baseFareTotal": "USD101.40",
      "saleFareTotal": "USD101.40",
      "saleTaxTotal": "USD30.20",
      "saleTotal": "USD131.60",
      "passengers": {
       "kind": "qpxexpress#passengerCounts",
       "adultCount": 1
      },
      "tax": [
       {
        "kind": "qpxexpress#taxInfo",
        "id": "US_1",
        "chargeType": "GOVERNMENT",
        "code": "US",
        "country": "US",
        "salePrice": "USD7.60"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "AY",
        "chargeType": "GOVERNMENT",
        "code": "AY",
        "country": "US",
        "salePrice": "USD5.60"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "XF",
        "chargeType": "GOVERNMENT",
        "code": "XF",
        "country": "US",
        "salePrice": "USD9.00"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "ZP",
        "chargeType": "GOVERNMENT",
        "code": "ZP",
        "country": "US",
        "salePrice": "USD8.00"
       }
      ],
      "fareCalculation": "DTT UA X/WAS UA NYC 101.40LAA14AZN USD 101.40 END ZP DTW IAD XT 7.60US 8.00ZP 5.60AY 9.00XF DTW4.50 IAD4.50",
      "latestTicketingTime": "2014-09-02T23:59-04:00",
      "ptc": "ADT"
     }
    ]
   },
   {
    "kind": "qpxexpress#tripOption",
    "saleTotal": "USD131.60",
    "id": "NKqGcEHF9CAUo7UcIR3NN6005",
    "slice": [
     {
      "kind": "qpxexpress#sliceInfo",
      "duration": 400,
      "segment": [
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 120,
        "flight": {
         "carrier": "FL",
         "number": "72"
        },
        "id": "GSm3sVUnkKKWVjHK",
        "cabin": "COACH",
        "bookingCode": "Z",
        "bookingCodeCount": 7,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "LLpyHsY6o7TFoPcx",
          "aircraft": "717",
          "arrivalTime": "2014-10-30T15:15-04:00",
          "departureTime": "2014-10-30T13:15-04:00",
          "origin": "DTW",
          "destination": "ATL",
          "originTerminal": "N",
          "destinationTerminal": "N",
          "duration": 120,
          "onTimePerformance": 90,
          "mileage": 595,
          "secure": true
         }
        ],
        "connectionDuration": 135
       },
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 145,
        "flight": {
         "carrier": "FL",
         "number": "4880"
        },
        "id": "G3Irqf2q95FyIRuq",
        "cabin": "COACH",
        "bookingCode": "Z",
        "bookingCodeCount": 7,
        "marriedSegmentGroup": "1",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "L8yTdU0oYU10VmWa",
          "aircraft": "73W",
          "arrivalTime": "2014-10-30T19:55-04:00",
          "departureTime": "2014-10-30T17:30-04:00",
          "origin": "ATL",
          "destination": "LGA",
          "originTerminal": "N",
          "destinationTerminal": "B",
          "duration": 145,
          "operatingDisclosure": "OPERATED BY SOUTHWEST AIRLINES CO.",
          "mileage": 760,
          "secure": true
         }
        ]
       }
      ]
     }
    ],
    "pricing": [
     {
      "kind": "qpxexpress#pricingInfo",
      "fare": [
       {
        "kind": "qpxexpress#fareInfo",
        "id": "AA5NWZkhufBQ2GmIvGpN0ij7lardQTwe7vOg0thOlAMw",
        "carrier": "FL",
        "origin": "DTT",
        "destination": "NYC",
        "basisCode": "ZLA7WNRO"
       }
      ],
      "segmentPricing": [
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "AA5NWZkhufBQ2GmIvGpN0ij7lardQTwe7vOg0thOlAMw",
        "segmentId": "G3Irqf2q95FyIRuq",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "pieces": 0
         }
        ]
       },
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "AA5NWZkhufBQ2GmIvGpN0ij7lardQTwe7vOg0thOlAMw",
        "segmentId": "GSm3sVUnkKKWVjHK",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "pieces": 0
         }
        ]
       }
      ],
      "baseFareTotal": "USD101.40",
      "saleFareTotal": "USD101.40",
      "saleTaxTotal": "USD30.20",
      "saleTotal": "USD131.60",
      "passengers": {
       "kind": "qpxexpress#passengerCounts",
       "adultCount": 1
      },
      "tax": [
       {
        "kind": "qpxexpress#taxInfo",
        "id": "US_1",
        "chargeType": "GOVERNMENT",
        "code": "US",
        "country": "US",
        "salePrice": "USD7.60"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "AY",
        "chargeType": "GOVERNMENT",
        "code": "AY",
        "country": "US",
        "salePrice": "USD5.60"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "XF",
        "chargeType": "GOVERNMENT",
        "code": "XF",
        "country": "US",
        "salePrice": "USD9.00"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "ZP",
        "chargeType": "GOVERNMENT",
        "code": "ZP",
        "country": "US",
        "salePrice": "USD8.00"
       }
      ],
      "fareCalculation": "DTT FL X/ATL FL NYC 101.40ZLA7WNRO USD 101.40 END ZP DTW ATL XT 7.60US 8.00ZP 5.60AY 9.00XF DTW4.50 ATL4.50",
      "latestTicketingTime": "2014-09-02T23:59-04:00",
      "ptc": "ADT"
     }
    ]
   },
   {
    "kind": "qpxexpress#tripOption",
    "saleTotal": "USD152.60",
    "id": "NKqGcEHF9CAUo7UcIR3NN6006",
    "slice": [
     {
      "kind": "qpxexpress#sliceInfo",
      "duration": 458,
      "segment": [
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 84,
        "flight": {
         "carrier": "UA",
         "number": "3667"
        },
        "id": "Gkun3uKRK8Fxxsio",
        "cabin": "COACH",
        "bookingCode": "S",
        "bookingCodeCount": 6,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "LMRCP4gVVjTE34Fx",
          "aircraft": "CR7",
          "arrivalTime": "2014-10-30T14:15-05:00",
          "departureTime": "2014-10-30T13:51-04:00",
          "origin": "DTW",
          "destination": "ORD",
          "originTerminal": "N",
          "destinationTerminal": "2",
          "duration": 84,
          "operatingDisclosure": "OPERATED BY GOJET AIRLINES DBA UNITED EXPRESS",
          "mileage": 233,
          "secure": true
         }
        ],
        "connectionDuration": 238
       },
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 136,
        "flight": {
         "carrier": "UA",
         "number": "1254"
        },
        "id": "GRxuR9aCfpwFt5UI",
        "cabin": "COACH",
        "bookingCode": "S",
        "bookingCodeCount": 6,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "LP3eX7B4m6Qd3Ew4",
          "aircraft": "738",
          "arrivalTime": "2014-10-30T21:29-04:00",
          "departureTime": "2014-10-30T18:13-05:00",
          "origin": "ORD",
          "destination": "LGA",
          "originTerminal": "1",
          "destinationTerminal": "B",
          "duration": 136,
          "onTimePerformance": 30,
          "mileage": 731,
          "meal": "Food and Beverages for Purchase",
          "secure": true
         }
        ]
       }
      ]
     }
    ],
    "pricing": [
     {
      "kind": "qpxexpress#pricingInfo",
      "fare": [
       {
        "kind": "qpxexpress#fareInfo",
        "id": "AUcJfjbOzKTMlNOmb6uImIkDcio2lECZLFEUZC3HY2cI",
        "carrier": "UA",
        "origin": "DTT",
        "destination": "NYC",
        "basisCode": "SAA07AZN"
       }
      ],
      "segmentPricing": [
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "AUcJfjbOzKTMlNOmb6uImIkDcio2lECZLFEUZC3HY2cI",
        "segmentId": "Gkun3uKRK8Fxxsio",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "bagDescriptor": [
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "UPTO50LB 23KG AND62LI 158LCM",
            "count": 0,
            "description": [
             "Up to 50 lb/23 kg",
             "Up to 62 li/158 lcm"
            ],
            "subcode": "0GO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "MUSICAL INSTRUMENTS",
            "count": 0,
            "subcode": "0F2"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "ARCHERY EQUIPMENT",
            "count": 0,
            "description": [
             "Archery Equipment"
            ],
            "subcode": "0FO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "BOWLING EQUIPMENT",
            "count": 0,
            "description": [
             "Bowling Equipment"
            ],
            "subcode": "0FS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "FISHING EQUIPMENT",
            "count": 0,
            "description": [
             "Fishing Equipment"
            ],
            "subcode": "0D6"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "GOLF EQUIPMENT",
            "count": 0,
            "description": [
             "Golf Equipment"
            ],
            "subcode": "0DC"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "HOCKEY EQUIPMENT",
            "count": 0,
            "description": [
             "Hockey Equipment"
            ],
            "subcode": "0F0"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKATEBOARD",
            "count": 0,
            "description": [
             "Skateboard"
            ],
            "subcode": "0IS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Ski Equipment"
            ],
            "subcode": "0DD"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "WATER SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Water Ski Equipment"
            ],
            "subcode": "0G2"
           }
          ],
          "pieces": 0
         }
        ]
       },
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "AUcJfjbOzKTMlNOmb6uImIkDcio2lECZLFEUZC3HY2cI",
        "segmentId": "GRxuR9aCfpwFt5UI",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "bagDescriptor": [
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "UPTO50LB 23KG AND62LI 158LCM",
            "count": 0,
            "description": [
             "Up to 50 lb/23 kg",
             "Up to 62 li/158 lcm"
            ],
            "subcode": "0GO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "MUSICAL INSTRUMENTS",
            "count": 0,
            "subcode": "0F2"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "ARCHERY EQUIPMENT",
            "count": 0,
            "description": [
             "Archery Equipment"
            ],
            "subcode": "0FO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "BOWLING EQUIPMENT",
            "count": 0,
            "description": [
             "Bowling Equipment"
            ],
            "subcode": "0FS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "FISHING EQUIPMENT",
            "count": 0,
            "description": [
             "Fishing Equipment"
            ],
            "subcode": "0D6"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "GOLF EQUIPMENT",
            "count": 0,
            "description": [
             "Golf Equipment"
            ],
            "subcode": "0DC"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "HOCKEY EQUIPMENT",
            "count": 0,
            "description": [
             "Hockey Equipment"
            ],
            "subcode": "0F0"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKATEBOARD",
            "count": 0,
            "description": [
             "Skateboard"
            ],
            "subcode": "0IS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Ski Equipment"
            ],
            "subcode": "0DD"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "WATER SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Water Ski Equipment"
            ],
            "subcode": "0G2"
           }
          ],
          "pieces": 0
         }
        ]
       }
      ],
      "baseFareTotal": "USD120.93",
      "saleFareTotal": "USD120.93",
      "saleTaxTotal": "USD31.67",
      "saleTotal": "USD152.60",
      "passengers": {
       "kind": "qpxexpress#passengerCounts",
       "adultCount": 1
      },
      "tax": [
       {
        "kind": "qpxexpress#taxInfo",
        "id": "US_1",
        "chargeType": "GOVERNMENT",
        "code": "US",
        "country": "US",
        "salePrice": "USD9.07"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "AY",
        "chargeType": "GOVERNMENT",
        "code": "AY",
        "country": "US",
        "salePrice": "USD5.60"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "XF",
        "chargeType": "GOVERNMENT",
        "code": "XF",
        "country": "US",
        "salePrice": "USD9.00"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "ZP",
        "chargeType": "GOVERNMENT",
        "code": "ZP",
        "country": "US",
        "salePrice": "USD8.00"
       }
      ],
      "fareCalculation": "DTT UA X/CHI UA NYC 120.93SAA07AZN USD 120.93 END ZP DTW ORD XT 9.07US 8.00ZP 5.60AY 9.00XF DTW4.50 ORD4.50",
      "latestTicketingTime": "2014-09-02T23:59-04:00",
      "ptc": "ADT"
     }
    ]
   },
   {
    "kind": "qpxexpress#tripOption",
    "saleTotal": "USD263.60",
    "id": "NKqGcEHF9CAUo7UcIR3NN600F",
    "slice": [
     {
      "kind": "qpxexpress#sliceInfo",
      "duration": 322,
      "segment": [
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 84,
        "flight": {
         "carrier": "UA",
         "number": "3667"
        },
        "id": "Gkun3uKRK8Fxxsio",
        "cabin": "COACH",
        "bookingCode": "H",
        "bookingCodeCount": 9,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "LMRCP4gVVjTE34Fx",
          "aircraft": "CR7",
          "arrivalTime": "2014-10-30T14:15-05:00",
          "departureTime": "2014-10-30T13:51-04:00",
          "origin": "DTW",
          "destination": "ORD",
          "originTerminal": "N",
          "destinationTerminal": "2",
          "duration": 84,
          "operatingDisclosure": "OPERATED BY GOJET AIRLINES DBA UNITED EXPRESS",
          "mileage": 233,
          "secure": true
         }
        ],
        "connectionDuration": 105
       },
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 133,
        "flight": {
         "carrier": "UA",
         "number": "688"
        },
        "id": "G+RGy1B+ETRHkxO5",
        "cabin": "COACH",
        "bookingCode": "H",
        "bookingCodeCount": 9,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "LLYurq-IbqMqnU02",
          "aircraft": "319",
          "arrivalTime": "2014-10-30T19:13-04:00",
          "departureTime": "2014-10-30T16:00-05:00",
          "origin": "ORD",
          "destination": "LGA",
          "originTerminal": "1",
          "destinationTerminal": "B",
          "duration": 133,
          "mileage": 731,
          "meal": "Food and Beverages for Purchase",
          "secure": true
         }
        ]
       }
      ]
     }
    ],
    "pricing": [
     {
      "kind": "qpxexpress#pricingInfo",
      "fare": [
       {
        "kind": "qpxexpress#fareInfo",
        "id": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "carrier": "UA",
        "origin": "DTT",
        "destination": "NYC",
        "basisCode": "HAA00AZN"
       }
      ],
      "segmentPricing": [
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "segmentId": "Gkun3uKRK8Fxxsio",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "bagDescriptor": [
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "UPTO50LB 23KG AND62LI 158LCM",
            "count": 0,
            "description": [
             "Up to 50 lb/23 kg",
             "Up to 62 li/158 lcm"
            ],
            "subcode": "0GO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "MUSICAL INSTRUMENTS",
            "count": 0,
            "subcode": "0F2"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "ARCHERY EQUIPMENT",
            "count": 0,
            "description": [
             "Archery Equipment"
            ],
            "subcode": "0FO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "BOWLING EQUIPMENT",
            "count": 0,
            "description": [
             "Bowling Equipment"
            ],
            "subcode": "0FS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "FISHING EQUIPMENT",
            "count": 0,
            "description": [
             "Fishing Equipment"
            ],
            "subcode": "0D6"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "GOLF EQUIPMENT",
            "count": 0,
            "description": [
             "Golf Equipment"
            ],
            "subcode": "0DC"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "HOCKEY EQUIPMENT",
            "count": 0,
            "description": [
             "Hockey Equipment"
            ],
            "subcode": "0F0"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKATEBOARD",
            "count": 0,
            "description": [
             "Skateboard"
            ],
            "subcode": "0IS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Ski Equipment"
            ],
            "subcode": "0DD"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "WATER SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Water Ski Equipment"
            ],
            "subcode": "0G2"
           }
          ],
          "pieces": 0
         }
        ]
       },
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "segmentId": "G+RGy1B+ETRHkxO5",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "bagDescriptor": [
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "UPTO50LB 23KG AND62LI 158LCM",
            "count": 0,
            "description": [
             "Up to 50 lb/23 kg",
             "Up to 62 li/158 lcm"
            ],
            "subcode": "0GO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "MUSICAL INSTRUMENTS",
            "count": 0,
            "subcode": "0F2"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "ARCHERY EQUIPMENT",
            "count": 0,
            "description": [
             "Archery Equipment"
            ],
            "subcode": "0FO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "BOWLING EQUIPMENT",
            "count": 0,
            "description": [
             "Bowling Equipment"
            ],
            "subcode": "0FS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "FISHING EQUIPMENT",
            "count": 0,
            "description": [
             "Fishing Equipment"
            ],
            "subcode": "0D6"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "GOLF EQUIPMENT",
            "count": 0,
            "description": [
             "Golf Equipment"
            ],
            "subcode": "0DC"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "HOCKEY EQUIPMENT",
            "count": 0,
            "description": [
             "Hockey Equipment"
            ],
            "subcode": "0F0"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKATEBOARD",
            "count": 0,
            "description": [
             "Skateboard"
            ],
            "subcode": "0IS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Ski Equipment"
            ],
            "subcode": "0DD"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "WATER SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Water Ski Equipment"
            ],
            "subcode": "0G2"
           }
          ],
          "pieces": 0
         }
        ]
       }
      ],
      "baseFareTotal": "USD224.19",
      "saleFareTotal": "USD224.19",
      "saleTaxTotal": "USD39.41",
      "saleTotal": "USD263.60",
      "passengers": {
       "kind": "qpxexpress#passengerCounts",
       "adultCount": 1
      },
      "tax": [
       {
        "kind": "qpxexpress#taxInfo",
        "id": "US_1",
        "chargeType": "GOVERNMENT",
        "code": "US",
        "country": "US",
        "salePrice": "USD16.81"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "AY",
        "chargeType": "GOVERNMENT",
        "code": "AY",
        "country": "US",
        "salePrice": "USD5.60"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "XF",
        "chargeType": "GOVERNMENT",
        "code": "XF",
        "country": "US",
        "salePrice": "USD9.00"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "ZP",
        "chargeType": "GOVERNMENT",
        "code": "ZP",
        "country": "US",
        "salePrice": "USD8.00"
       }
      ],
      "fareCalculation": "DTT UA X/CHI UA NYC 224.19HAA00AZN USD 224.19 END ZP DTW ORD XT 16.81US 8.00ZP 5.60AY 9.00XF DTW4.50 ORD4.50",
      "latestTicketingTime": "2014-09-02T23:59-04:00",
      "ptc": "ADT"
     }
    ]
   },
   {
    "kind": "qpxexpress#tripOption",
    "saleTotal": "USD263.60",
    "id": "NKqGcEHF9CAUo7UcIR3NN600C",
    "slice": [
     {
      "kind": "qpxexpress#sliceInfo",
      "duration": 278,
      "segment": [
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 81,
        "flight": {
         "carrier": "UA",
         "number": "3454"
        },
        "id": "GVT-jZ86LuzOaRih",
        "cabin": "COACH",
        "bookingCode": "H",
        "bookingCodeCount": 9,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "LYaweH9NXGrZLbfw",
          "aircraft": "E70",
          "arrivalTime": "2014-10-30T16:00-05:00",
          "departureTime": "2014-10-30T15:39-04:00",
          "origin": "DTW",
          "destination": "ORD",
          "originTerminal": "N",
          "destinationTerminal": "1",
          "duration": 81,
          "operatingDisclosure": "OPERATED BY SHUTTLE AMERICA DBA UNITED EXPRESS",
          "mileage": 233,
          "secure": true
         }
        ],
        "connectionDuration": 60
       },
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 137,
        "flight": {
         "carrier": "UA",
         "number": "690"
        },
        "id": "G16AWdqbJfpt1yzX",
        "cabin": "COACH",
        "bookingCode": "H",
        "bookingCodeCount": 9,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "La+5pCI+LlQCTqJ-",
          "aircraft": "319",
          "arrivalTime": "2014-10-30T20:17-04:00",
          "departureTime": "2014-10-30T17:00-05:00",
          "origin": "ORD",
          "destination": "LGA",
          "originTerminal": "1",
          "destinationTerminal": "B",
          "duration": 137,
          "onTimePerformance": 60,
          "mileage": 731,
          "meal": "Food and Beverages for Purchase",
          "secure": true
         }
        ]
       }
      ]
     }
    ],
    "pricing": [
     {
      "kind": "qpxexpress#pricingInfo",
      "fare": [
       {
        "kind": "qpxexpress#fareInfo",
        "id": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "carrier": "UA",
        "origin": "DTT",
        "destination": "NYC",
        "basisCode": "HAA00AZN"
       }
      ],
      "segmentPricing": [
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "segmentId": "G16AWdqbJfpt1yzX",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "bagDescriptor": [
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "UPTO50LB 23KG AND62LI 158LCM",
            "count": 0,
            "description": [
             "Up to 50 lb/23 kg",
             "Up to 62 li/158 lcm"
            ],
            "subcode": "0GO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "MUSICAL INSTRUMENTS",
            "count": 0,
            "subcode": "0F2"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "ARCHERY EQUIPMENT",
            "count": 0,
            "description": [
             "Archery Equipment"
            ],
            "subcode": "0FO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "BOWLING EQUIPMENT",
            "count": 0,
            "description": [
             "Bowling Equipment"
            ],
            "subcode": "0FS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "FISHING EQUIPMENT",
            "count": 0,
            "description": [
             "Fishing Equipment"
            ],
            "subcode": "0D6"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "GOLF EQUIPMENT",
            "count": 0,
            "description": [
             "Golf Equipment"
            ],
            "subcode": "0DC"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "HOCKEY EQUIPMENT",
            "count": 0,
            "description": [
             "Hockey Equipment"
            ],
            "subcode": "0F0"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKATEBOARD",
            "count": 0,
            "description": [
             "Skateboard"
            ],
            "subcode": "0IS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Ski Equipment"
            ],
            "subcode": "0DD"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "WATER SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Water Ski Equipment"
            ],
            "subcode": "0G2"
           }
          ],
          "pieces": 0
         }
        ]
       },
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "segmentId": "GVT-jZ86LuzOaRih",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "bagDescriptor": [
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "UPTO50LB 23KG AND62LI 158LCM",
            "count": 0,
            "description": [
             "Up to 50 lb/23 kg",
             "Up to 62 li/158 lcm"
            ],
            "subcode": "0GO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "MUSICAL INSTRUMENTS",
            "count": 0,
            "subcode": "0F2"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "ARCHERY EQUIPMENT",
            "count": 0,
            "description": [
             "Archery Equipment"
            ],
            "subcode": "0FO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "BOWLING EQUIPMENT",
            "count": 0,
            "description": [
             "Bowling Equipment"
            ],
            "subcode": "0FS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "FISHING EQUIPMENT",
            "count": 0,
            "description": [
             "Fishing Equipment"
            ],
            "subcode": "0D6"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "GOLF EQUIPMENT",
            "count": 0,
            "description": [
             "Golf Equipment"
            ],
            "subcode": "0DC"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "HOCKEY EQUIPMENT",
            "count": 0,
            "description": [
             "Hockey Equipment"
            ],
            "subcode": "0F0"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKATEBOARD",
            "count": 0,
            "description": [
             "Skateboard"
            ],
            "subcode": "0IS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Ski Equipment"
            ],
            "subcode": "0DD"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "WATER SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Water Ski Equipment"
            ],
            "subcode": "0G2"
           }
          ],
          "pieces": 0
         }
        ]
       }
      ],
      "baseFareTotal": "USD224.19",
      "saleFareTotal": "USD224.19",
      "saleTaxTotal": "USD39.41",
      "saleTotal": "USD263.60",
      "passengers": {
       "kind": "qpxexpress#passengerCounts",
       "adultCount": 1
      },
      "tax": [
       {
        "kind": "qpxexpress#taxInfo",
        "id": "US_1",
        "chargeType": "GOVERNMENT",
        "code": "US",
        "country": "US",
        "salePrice": "USD16.81"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "AY",
        "chargeType": "GOVERNMENT",
        "code": "AY",
        "country": "US",
        "salePrice": "USD5.60"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "XF",
        "chargeType": "GOVERNMENT",
        "code": "XF",
        "country": "US",
        "salePrice": "USD9.00"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "ZP",
        "chargeType": "GOVERNMENT",
        "code": "ZP",
        "country": "US",
        "salePrice": "USD8.00"
       }
      ],
      "fareCalculation": "DTT UA X/CHI UA NYC 224.19HAA00AZN USD 224.19 END ZP DTW ORD XT 16.81US 8.00ZP 5.60AY 9.00XF DTW4.50 ORD4.50",
      "latestTicketingTime": "2014-09-02T23:59-04:00",
      "ptc": "ADT"
     }
    ]
   },
   {
    "kind": "qpxexpress#tripOption",
    "saleTotal": "USD263.60",
    "id": "NKqGcEHF9CAUo7UcIR3NN6007",
    "slice": [
     {
      "kind": "qpxexpress#sliceInfo",
      "duration": 225,
      "segment": [
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 90,
        "flight": {
         "carrier": "UA",
         "number": "5739"
        },
        "id": "GW+gIHbOvzoEnphl",
        "cabin": "COACH",
        "bookingCode": "H",
        "bookingCodeCount": 9,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "L1C6Vtuo+wEeqs4q",
          "aircraft": "CRJ",
          "arrivalTime": "2014-10-30T11:40-04:00",
          "departureTime": "2014-10-30T10:10-04:00",
          "origin": "DTW",
          "destination": "IAD",
          "originTerminal": "N",
          "duration": 90,
          "operatingDisclosure": "OPERATED BY EXPRESSJET AIRLINES DBA UNITED EXPRESS",
          "mileage": 382,
          "secure": true
         }
        ],
        "connectionDuration": 45
       },
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 90,
        "flight": {
         "carrier": "UA",
         "number": "5713"
        },
        "id": "GZuupk-xCDKG17Di",
        "cabin": "COACH",
        "bookingCode": "H",
        "bookingCodeCount": 9,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "LZQY6Dk8Ft+uZXLP",
          "aircraft": "CRJ",
          "arrivalTime": "2014-10-30T13:55-04:00",
          "departureTime": "2014-10-30T12:25-04:00",
          "origin": "IAD",
          "destination": "LGA",
          "destinationTerminal": "B",
          "duration": 90,
          "operatingDisclosure": "OPERATED BY EXPRESSJET AIRLINES DBA UNITED EXPRESS",
          "mileage": 228,
          "secure": true
         }
        ]
       }
      ]
     }
    ],
    "pricing": [
     {
      "kind": "qpxexpress#pricingInfo",
      "fare": [
       {
        "kind": "qpxexpress#fareInfo",
        "id": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "carrier": "UA",
        "origin": "DTT",
        "destination": "NYC",
        "basisCode": "HAA00AZN"
       }
      ],
      "segmentPricing": [
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "segmentId": "GW+gIHbOvzoEnphl",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "bagDescriptor": [
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "UPTO50LB 23KG AND62LI 158LCM",
            "count": 0,
            "description": [
             "Up to 50 lb/23 kg",
             "Up to 62 li/158 lcm"
            ],
            "subcode": "0GO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "MUSICAL INSTRUMENTS",
            "count": 0,
            "subcode": "0F2"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "ARCHERY EQUIPMENT",
            "count": 0,
            "description": [
             "Archery Equipment"
            ],
            "subcode": "0FO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "BOWLING EQUIPMENT",
            "count": 0,
            "description": [
             "Bowling Equipment"
            ],
            "subcode": "0FS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "FISHING EQUIPMENT",
            "count": 0,
            "description": [
             "Fishing Equipment"
            ],
            "subcode": "0D6"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "GOLF EQUIPMENT",
            "count": 0,
            "description": [
             "Golf Equipment"
            ],
            "subcode": "0DC"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "HOCKEY EQUIPMENT",
            "count": 0,
            "description": [
             "Hockey Equipment"
            ],
            "subcode": "0F0"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKATEBOARD",
            "count": 0,
            "description": [
             "Skateboard"
            ],
            "subcode": "0IS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Ski Equipment"
            ],
            "subcode": "0DD"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "WATER SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Water Ski Equipment"
            ],
            "subcode": "0G2"
           }
          ],
          "pieces": 0
         }
        ]
       },
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "segmentId": "GZuupk-xCDKG17Di",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "bagDescriptor": [
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "UPTO50LB 23KG AND62LI 158LCM",
            "count": 0,
            "description": [
             "Up to 50 lb/23 kg",
             "Up to 62 li/158 lcm"
            ],
            "subcode": "0GO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "MUSICAL INSTRUMENTS",
            "count": 0,
            "subcode": "0F2"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "ARCHERY EQUIPMENT",
            "count": 0,
            "description": [
             "Archery Equipment"
            ],
            "subcode": "0FO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "BOWLING EQUIPMENT",
            "count": 0,
            "description": [
             "Bowling Equipment"
            ],
            "subcode": "0FS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "FISHING EQUIPMENT",
            "count": 0,
            "description": [
             "Fishing Equipment"
            ],
            "subcode": "0D6"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "GOLF EQUIPMENT",
            "count": 0,
            "description": [
             "Golf Equipment"
            ],
            "subcode": "0DC"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "HOCKEY EQUIPMENT",
            "count": 0,
            "description": [
             "Hockey Equipment"
            ],
            "subcode": "0F0"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKATEBOARD",
            "count": 0,
            "description": [
             "Skateboard"
            ],
            "subcode": "0IS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Ski Equipment"
            ],
            "subcode": "0DD"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "WATER SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Water Ski Equipment"
            ],
            "subcode": "0G2"
           }
          ],
          "pieces": 0
         }
        ]
       }
      ],
      "baseFareTotal": "USD224.19",
      "saleFareTotal": "USD224.19",
      "saleTaxTotal": "USD39.41",
      "saleTotal": "USD263.60",
      "passengers": {
       "kind": "qpxexpress#passengerCounts",
       "adultCount": 1
      },
      "tax": [
       {
        "kind": "qpxexpress#taxInfo",
        "id": "US_1",
        "chargeType": "GOVERNMENT",
        "code": "US",
        "country": "US",
        "salePrice": "USD16.81"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "AY",
        "chargeType": "GOVERNMENT",
        "code": "AY",
        "country": "US",
        "salePrice": "USD5.60"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "XF",
        "chargeType": "GOVERNMENT",
        "code": "XF",
        "country": "US",
        "salePrice": "USD9.00"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "ZP",
        "chargeType": "GOVERNMENT",
        "code": "ZP",
        "country": "US",
        "salePrice": "USD8.00"
       }
      ],
      "fareCalculation": "DTT UA X/WAS UA NYC 224.19HAA00AZN USD 224.19 END ZP DTW IAD XT 16.81US 8.00ZP 5.60AY 9.00XF DTW4.50 IAD4.50",
      "latestTicketingTime": "2014-09-02T23:59-04:00",
      "ptc": "ADT"
     }
    ]
   },
   {
    "kind": "qpxexpress#tripOption",
    "saleTotal": "USD263.60",
    "id": "NKqGcEHF9CAUo7UcIR3NN600B",
    "slice": [
     {
      "kind": "qpxexpress#sliceInfo",
      "duration": 273,
      "segment": [
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 86,
        "flight": {
         "carrier": "UA",
         "number": "3352"
        },
        "id": "GBKidj0m-S4lU2eA",
        "cabin": "COACH",
        "bookingCode": "H",
        "bookingCodeCount": 9,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "LZSVoT0cTfetROob",
          "aircraft": "ERJ",
          "arrivalTime": "2014-10-30T08:46-05:00",
          "departureTime": "2014-10-30T08:20-04:00",
          "origin": "DTW",
          "destination": "ORD",
          "originTerminal": "N",
          "destinationTerminal": "2",
          "duration": 86,
          "operatingDisclosure": "OPERATED BY TRANS STATES AIRLINES DBA UNITED EXPRESS",
          "mileage": 233,
          "secure": true
         }
        ],
        "connectionDuration": 60
       },
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 127,
        "flight": {
         "carrier": "UA",
         "number": "1620"
        },
        "id": "GBp298jbCfqzNaLR",
        "cabin": "COACH",
        "bookingCode": "H",
        "bookingCodeCount": 9,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "LkqC8kAwjkJVSxZm",
          "aircraft": "73G",
          "arrivalTime": "2014-10-30T12:53-04:00",
          "departureTime": "2014-10-30T09:46-05:00",
          "origin": "ORD",
          "destination": "LGA",
          "originTerminal": "1",
          "destinationTerminal": "B",
          "duration": 127,
          "mileage": 731,
          "meal": "Food and Beverages for Purchase",
          "secure": true
         }
        ]
       }
      ]
     }
    ],
    "pricing": [
     {
      "kind": "qpxexpress#pricingInfo",
      "fare": [
       {
        "kind": "qpxexpress#fareInfo",
        "id": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "carrier": "UA",
        "origin": "DTT",
        "destination": "NYC",
        "basisCode": "HAA00AZN"
       }
      ],
      "segmentPricing": [
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "segmentId": "GBKidj0m-S4lU2eA",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "bagDescriptor": [
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "UPTO50LB 23KG AND62LI 158LCM",
            "count": 0,
            "description": [
             "Up to 50 lb/23 kg",
             "Up to 62 li/158 lcm"
            ],
            "subcode": "0GO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "MUSICAL INSTRUMENTS",
            "count": 0,
            "subcode": "0F2"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "ARCHERY EQUIPMENT",
            "count": 0,
            "description": [
             "Archery Equipment"
            ],
            "subcode": "0FO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "BOWLING EQUIPMENT",
            "count": 0,
            "description": [
             "Bowling Equipment"
            ],
            "subcode": "0FS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "FISHING EQUIPMENT",
            "count": 0,
            "description": [
             "Fishing Equipment"
            ],
            "subcode": "0D6"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "GOLF EQUIPMENT",
            "count": 0,
            "description": [
             "Golf Equipment"
            ],
            "subcode": "0DC"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "HOCKEY EQUIPMENT",
            "count": 0,
            "description": [
             "Hockey Equipment"
            ],
            "subcode": "0F0"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKATEBOARD",
            "count": 0,
            "description": [
             "Skateboard"
            ],
            "subcode": "0IS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Ski Equipment"
            ],
            "subcode": "0DD"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "WATER SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Water Ski Equipment"
            ],
            "subcode": "0G2"
           }
          ],
          "pieces": 0
         }
        ]
       },
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "segmentId": "GBp298jbCfqzNaLR",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "bagDescriptor": [
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "UPTO50LB 23KG AND62LI 158LCM",
            "count": 0,
            "description": [
             "Up to 50 lb/23 kg",
             "Up to 62 li/158 lcm"
            ],
            "subcode": "0GO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "MUSICAL INSTRUMENTS",
            "count": 0,
            "subcode": "0F2"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "ARCHERY EQUIPMENT",
            "count": 0,
            "description": [
             "Archery Equipment"
            ],
            "subcode": "0FO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "BOWLING EQUIPMENT",
            "count": 0,
            "description": [
             "Bowling Equipment"
            ],
            "subcode": "0FS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "FISHING EQUIPMENT",
            "count": 0,
            "description": [
             "Fishing Equipment"
            ],
            "subcode": "0D6"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "GOLF EQUIPMENT",
            "count": 0,
            "description": [
             "Golf Equipment"
            ],
            "subcode": "0DC"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "HOCKEY EQUIPMENT",
            "count": 0,
            "description": [
             "Hockey Equipment"
            ],
            "subcode": "0F0"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKATEBOARD",
            "count": 0,
            "description": [
             "Skateboard"
            ],
            "subcode": "0IS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Ski Equipment"
            ],
            "subcode": "0DD"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "WATER SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Water Ski Equipment"
            ],
            "subcode": "0G2"
           }
          ],
          "pieces": 0
         }
        ]
       }
      ],
      "baseFareTotal": "USD224.19",
      "saleFareTotal": "USD224.19",
      "saleTaxTotal": "USD39.41",
      "saleTotal": "USD263.60",
      "passengers": {
       "kind": "qpxexpress#passengerCounts",
       "adultCount": 1
      },
      "tax": [
       {
        "kind": "qpxexpress#taxInfo",
        "id": "US_1",
        "chargeType": "GOVERNMENT",
        "code": "US",
        "country": "US",
        "salePrice": "USD16.81"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "AY",
        "chargeType": "GOVERNMENT",
        "code": "AY",
        "country": "US",
        "salePrice": "USD5.60"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "XF",
        "chargeType": "GOVERNMENT",
        "code": "XF",
        "country": "US",
        "salePrice": "USD9.00"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "ZP",
        "chargeType": "GOVERNMENT",
        "code": "ZP",
        "country": "US",
        "salePrice": "USD8.00"
       }
      ],
      "fareCalculation": "DTT UA X/CHI UA NYC 224.19HAA00AZN USD 224.19 END ZP DTW ORD XT 16.81US 8.00ZP 5.60AY 9.00XF DTW4.50 ORD4.50",
      "latestTicketingTime": "2014-09-02T23:59-04:00",
      "ptc": "ADT"
     }
    ]
   },
   {
    "kind": "qpxexpress#tripOption",
    "saleTotal": "USD263.60",
    "id": "NKqGcEHF9CAUo7UcIR3NN600K",
    "slice": [
     {
      "kind": "qpxexpress#sliceInfo",
      "duration": 386,
      "segment": [
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 84,
        "flight": {
         "carrier": "UA",
         "number": "3667"
        },
        "id": "Gkun3uKRK8Fxxsio",
        "cabin": "COACH",
        "bookingCode": "H",
        "bookingCodeCount": 9,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "LMRCP4gVVjTE34Fx",
          "aircraft": "CR7",
          "arrivalTime": "2014-10-30T14:15-05:00",
          "departureTime": "2014-10-30T13:51-04:00",
          "origin": "DTW",
          "destination": "ORD",
          "originTerminal": "N",
          "destinationTerminal": "2",
          "duration": 84,
          "operatingDisclosure": "OPERATED BY GOJET AIRLINES DBA UNITED EXPRESS",
          "mileage": 233,
          "secure": true
         }
        ],
        "connectionDuration": 165
       },
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 137,
        "flight": {
         "carrier": "UA",
         "number": "690"
        },
        "id": "G16AWdqbJfpt1yzX",
        "cabin": "COACH",
        "bookingCode": "H",
        "bookingCodeCount": 9,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "La+5pCI+LlQCTqJ-",
          "aircraft": "319",
          "arrivalTime": "2014-10-30T20:17-04:00",
          "departureTime": "2014-10-30T17:00-05:00",
          "origin": "ORD",
          "destination": "LGA",
          "originTerminal": "1",
          "destinationTerminal": "B",
          "duration": 137,
          "onTimePerformance": 60,
          "mileage": 731,
          "meal": "Food and Beverages for Purchase",
          "secure": true
         }
        ]
       }
      ]
     }
    ],
    "pricing": [
     {
      "kind": "qpxexpress#pricingInfo",
      "fare": [
       {
        "kind": "qpxexpress#fareInfo",
        "id": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "carrier": "UA",
        "origin": "DTT",
        "destination": "NYC",
        "basisCode": "HAA00AZN"
       }
      ],
      "segmentPricing": [
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "segmentId": "G16AWdqbJfpt1yzX",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "bagDescriptor": [
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "UPTO50LB 23KG AND62LI 158LCM",
            "count": 0,
            "description": [
             "Up to 50 lb/23 kg",
             "Up to 62 li/158 lcm"
            ],
            "subcode": "0GO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "MUSICAL INSTRUMENTS",
            "count": 0,
            "subcode": "0F2"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "ARCHERY EQUIPMENT",
            "count": 0,
            "description": [
             "Archery Equipment"
            ],
            "subcode": "0FO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "BOWLING EQUIPMENT",
            "count": 0,
            "description": [
             "Bowling Equipment"
            ],
            "subcode": "0FS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "FISHING EQUIPMENT",
            "count": 0,
            "description": [
             "Fishing Equipment"
            ],
            "subcode": "0D6"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "GOLF EQUIPMENT",
            "count": 0,
            "description": [
             "Golf Equipment"
            ],
            "subcode": "0DC"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "HOCKEY EQUIPMENT",
            "count": 0,
            "description": [
             "Hockey Equipment"
            ],
            "subcode": "0F0"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKATEBOARD",
            "count": 0,
            "description": [
             "Skateboard"
            ],
            "subcode": "0IS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Ski Equipment"
            ],
            "subcode": "0DD"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "WATER SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Water Ski Equipment"
            ],
            "subcode": "0G2"
           }
          ],
          "pieces": 0
         }
        ]
       },
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "segmentId": "Gkun3uKRK8Fxxsio",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "bagDescriptor": [
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "UPTO50LB 23KG AND62LI 158LCM",
            "count": 0,
            "description": [
             "Up to 50 lb/23 kg",
             "Up to 62 li/158 lcm"
            ],
            "subcode": "0GO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "MUSICAL INSTRUMENTS",
            "count": 0,
            "subcode": "0F2"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "ARCHERY EQUIPMENT",
            "count": 0,
            "description": [
             "Archery Equipment"
            ],
            "subcode": "0FO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "BOWLING EQUIPMENT",
            "count": 0,
            "description": [
             "Bowling Equipment"
            ],
            "subcode": "0FS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "FISHING EQUIPMENT",
            "count": 0,
            "description": [
             "Fishing Equipment"
            ],
            "subcode": "0D6"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "GOLF EQUIPMENT",
            "count": 0,
            "description": [
             "Golf Equipment"
            ],
            "subcode": "0DC"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "HOCKEY EQUIPMENT",
            "count": 0,
            "description": [
             "Hockey Equipment"
            ],
            "subcode": "0F0"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKATEBOARD",
            "count": 0,
            "description": [
             "Skateboard"
            ],
            "subcode": "0IS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Ski Equipment"
            ],
            "subcode": "0DD"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "WATER SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Water Ski Equipment"
            ],
            "subcode": "0G2"
           }
          ],
          "pieces": 0
         }
        ]
       }
      ],
      "baseFareTotal": "USD224.19",
      "saleFareTotal": "USD224.19",
      "saleTaxTotal": "USD39.41",
      "saleTotal": "USD263.60",
      "passengers": {
       "kind": "qpxexpress#passengerCounts",
       "adultCount": 1
      },
      "tax": [
       {
        "kind": "qpxexpress#taxInfo",
        "id": "US_1",
        "chargeType": "GOVERNMENT",
        "code": "US",
        "country": "US",
        "salePrice": "USD16.81"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "AY",
        "chargeType": "GOVERNMENT",
        "code": "AY",
        "country": "US",
        "salePrice": "USD5.60"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "XF",
        "chargeType": "GOVERNMENT",
        "code": "XF",
        "country": "US",
        "salePrice": "USD9.00"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "ZP",
        "chargeType": "GOVERNMENT",
        "code": "ZP",
        "country": "US",
        "salePrice": "USD8.00"
       }
      ],
      "fareCalculation": "DTT UA X/CHI UA NYC 224.19HAA00AZN USD 224.19 END ZP DTW ORD XT 16.81US 8.00ZP 5.60AY 9.00XF DTW4.50 ORD4.50",
      "latestTicketingTime": "2014-09-02T23:59-04:00",
      "ptc": "ADT"
     }
    ]
   },
   {
    "kind": "qpxexpress#tripOption",
    "saleTotal": "USD263.60",
    "id": "NKqGcEHF9CAUo7UcIR3NN600G",
    "slice": [
     {
      "kind": "qpxexpress#sliceInfo",
      "duration": 343,
      "segment": [
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 81,
        "flight": {
         "carrier": "UA",
         "number": "3400"
        },
        "id": "GlodGArOPmCkEuUb",
        "cabin": "COACH",
        "bookingCode": "H",
        "bookingCodeCount": 9,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "LRM40lRXGyqWZmU+",
          "aircraft": "ERJ",
          "arrivalTime": "2014-10-30T10:51-05:00",
          "departureTime": "2014-10-30T10:30-04:00",
          "origin": "DTW",
          "destination": "ORD",
          "originTerminal": "N",
          "destinationTerminal": "2",
          "duration": 81,
          "operatingDisclosure": "OPERATED BY TRANS STATES AIRLINES DBA UNITED EXPRESS",
          "mileage": 233,
          "secure": true
         }
        ],
        "connectionDuration": 129
       },
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 133,
        "flight": {
         "carrier": "UA",
         "number": "682"
        },
        "id": "GR8DYFA1qw6WpvBT",
        "cabin": "COACH",
        "bookingCode": "H",
        "bookingCodeCount": 9,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "LNflUQtA3107J4qQ",
          "aircraft": "319",
          "arrivalTime": "2014-10-30T16:13-04:00",
          "departureTime": "2014-10-30T13:00-05:00",
          "origin": "ORD",
          "destination": "LGA",
          "originTerminal": "1",
          "destinationTerminal": "B",
          "duration": 133,
          "onTimePerformance": 60,
          "mileage": 731,
          "meal": "Food and Beverages for Purchase",
          "secure": true
         }
        ]
       }
      ]
     }
    ],
    "pricing": [
     {
      "kind": "qpxexpress#pricingInfo",
      "fare": [
       {
        "kind": "qpxexpress#fareInfo",
        "id": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "carrier": "UA",
        "origin": "DTT",
        "destination": "NYC",
        "basisCode": "HAA00AZN"
       }
      ],
      "segmentPricing": [
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "segmentId": "GR8DYFA1qw6WpvBT",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "bagDescriptor": [
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "UPTO50LB 23KG AND62LI 158LCM",
            "count": 0,
            "description": [
             "Up to 50 lb/23 kg",
             "Up to 62 li/158 lcm"
            ],
            "subcode": "0GO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "MUSICAL INSTRUMENTS",
            "count": 0,
            "subcode": "0F2"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "ARCHERY EQUIPMENT",
            "count": 0,
            "description": [
             "Archery Equipment"
            ],
            "subcode": "0FO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "BOWLING EQUIPMENT",
            "count": 0,
            "description": [
             "Bowling Equipment"
            ],
            "subcode": "0FS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "FISHING EQUIPMENT",
            "count": 0,
            "description": [
             "Fishing Equipment"
            ],
            "subcode": "0D6"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "GOLF EQUIPMENT",
            "count": 0,
            "description": [
             "Golf Equipment"
            ],
            "subcode": "0DC"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "HOCKEY EQUIPMENT",
            "count": 0,
            "description": [
             "Hockey Equipment"
            ],
            "subcode": "0F0"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKATEBOARD",
            "count": 0,
            "description": [
             "Skateboard"
            ],
            "subcode": "0IS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Ski Equipment"
            ],
            "subcode": "0DD"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "WATER SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Water Ski Equipment"
            ],
            "subcode": "0G2"
           }
          ],
          "pieces": 0
         }
        ]
       },
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "segmentId": "GlodGArOPmCkEuUb",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "bagDescriptor": [
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "UPTO50LB 23KG AND62LI 158LCM",
            "count": 0,
            "description": [
             "Up to 50 lb/23 kg",
             "Up to 62 li/158 lcm"
            ],
            "subcode": "0GO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "MUSICAL INSTRUMENTS",
            "count": 0,
            "subcode": "0F2"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "ARCHERY EQUIPMENT",
            "count": 0,
            "description": [
             "Archery Equipment"
            ],
            "subcode": "0FO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "BOWLING EQUIPMENT",
            "count": 0,
            "description": [
             "Bowling Equipment"
            ],
            "subcode": "0FS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "FISHING EQUIPMENT",
            "count": 0,
            "description": [
             "Fishing Equipment"
            ],
            "subcode": "0D6"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "GOLF EQUIPMENT",
            "count": 0,
            "description": [
             "Golf Equipment"
            ],
            "subcode": "0DC"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "HOCKEY EQUIPMENT",
            "count": 0,
            "description": [
             "Hockey Equipment"
            ],
            "subcode": "0F0"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKATEBOARD",
            "count": 0,
            "description": [
             "Skateboard"
            ],
            "subcode": "0IS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Ski Equipment"
            ],
            "subcode": "0DD"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "WATER SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Water Ski Equipment"
            ],
            "subcode": "0G2"
           }
          ],
          "pieces": 0
         }
        ]
       }
      ],
      "baseFareTotal": "USD224.19",
      "saleFareTotal": "USD224.19",
      "saleTaxTotal": "USD39.41",
      "saleTotal": "USD263.60",
      "passengers": {
       "kind": "qpxexpress#passengerCounts",
       "adultCount": 1
      },
      "tax": [
       {
        "kind": "qpxexpress#taxInfo",
        "id": "US_1",
        "chargeType": "GOVERNMENT",
        "code": "US",
        "country": "US",
        "salePrice": "USD16.81"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "AY",
        "chargeType": "GOVERNMENT",
        "code": "AY",
        "country": "US",
        "salePrice": "USD5.60"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "XF",
        "chargeType": "GOVERNMENT",
        "code": "XF",
        "country": "US",
        "salePrice": "USD9.00"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "ZP",
        "chargeType": "GOVERNMENT",
        "code": "ZP",
        "country": "US",
        "salePrice": "USD8.00"
       }
      ],
      "fareCalculation": "DTT UA X/CHI UA NYC 224.19HAA00AZN USD 224.19 END ZP DTW ORD XT 16.81US 8.00ZP 5.60AY 9.00XF DTW4.50 ORD4.50",
      "latestTicketingTime": "2014-09-02T23:59-04:00",
      "ptc": "ADT"
     }
    ]
   },
   {
    "kind": "qpxexpress#tripOption",
    "saleTotal": "USD263.60",
    "id": "NKqGcEHF9CAUo7UcIR3NN600D",
    "slice": [
     {
      "kind": "qpxexpress#sliceInfo",
      "duration": 280,
      "segment": [
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 81,
        "flight": {
         "carrier": "UA",
         "number": "3400"
        },
        "id": "GlodGArOPmCkEuUb",
        "cabin": "COACH",
        "bookingCode": "H",
        "bookingCodeCount": 9,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "LRM40lRXGyqWZmU+",
          "aircraft": "ERJ",
          "arrivalTime": "2014-10-30T10:51-05:00",
          "departureTime": "2014-10-30T10:30-04:00",
          "origin": "DTW",
          "destination": "ORD",
          "originTerminal": "N",
          "destinationTerminal": "2",
          "duration": 81,
          "operatingDisclosure": "OPERATED BY TRANS STATES AIRLINES DBA UNITED EXPRESS",
          "mileage": 233,
          "secure": true
         }
        ],
        "connectionDuration": 69
       },
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 130,
        "flight": {
         "carrier": "UA",
         "number": "678"
        },
        "id": "Gd6DTGWcfDjahlK-",
        "cabin": "COACH",
        "bookingCode": "H",
        "bookingCodeCount": 9,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "L3zyWh5PB4Kfu6r+",
          "aircraft": "319",
          "arrivalTime": "2014-10-30T15:10-04:00",
          "departureTime": "2014-10-30T12:00-05:00",
          "origin": "ORD",
          "destination": "LGA",
          "originTerminal": "1",
          "destinationTerminal": "B",
          "duration": 130,
          "mileage": 731,
          "meal": "Food and Beverages for Purchase",
          "secure": true
         }
        ]
       }
      ]
     }
    ],
    "pricing": [
     {
      "kind": "qpxexpress#pricingInfo",
      "fare": [
       {
        "kind": "qpxexpress#fareInfo",
        "id": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "carrier": "UA",
        "origin": "DTT",
        "destination": "NYC",
        "basisCode": "HAA00AZN"
       }
      ],
      "segmentPricing": [
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "segmentId": "Gd6DTGWcfDjahlK-",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "bagDescriptor": [
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "UPTO50LB 23KG AND62LI 158LCM",
            "count": 0,
            "description": [
             "Up to 50 lb/23 kg",
             "Up to 62 li/158 lcm"
            ],
            "subcode": "0GO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "MUSICAL INSTRUMENTS",
            "count": 0,
            "subcode": "0F2"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "ARCHERY EQUIPMENT",
            "count": 0,
            "description": [
             "Archery Equipment"
            ],
            "subcode": "0FO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "BOWLING EQUIPMENT",
            "count": 0,
            "description": [
             "Bowling Equipment"
            ],
            "subcode": "0FS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "FISHING EQUIPMENT",
            "count": 0,
            "description": [
             "Fishing Equipment"
            ],
            "subcode": "0D6"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "GOLF EQUIPMENT",
            "count": 0,
            "description": [
             "Golf Equipment"
            ],
            "subcode": "0DC"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "HOCKEY EQUIPMENT",
            "count": 0,
            "description": [
             "Hockey Equipment"
            ],
            "subcode": "0F0"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKATEBOARD",
            "count": 0,
            "description": [
             "Skateboard"
            ],
            "subcode": "0IS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Ski Equipment"
            ],
            "subcode": "0DD"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "WATER SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Water Ski Equipment"
            ],
            "subcode": "0G2"
           }
          ],
          "pieces": 0
         }
        ]
       },
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "segmentId": "GlodGArOPmCkEuUb",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "bagDescriptor": [
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "UPTO50LB 23KG AND62LI 158LCM",
            "count": 0,
            "description": [
             "Up to 50 lb/23 kg",
             "Up to 62 li/158 lcm"
            ],
            "subcode": "0GO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "MUSICAL INSTRUMENTS",
            "count": 0,
            "subcode": "0F2"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "ARCHERY EQUIPMENT",
            "count": 0,
            "description": [
             "Archery Equipment"
            ],
            "subcode": "0FO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "BOWLING EQUIPMENT",
            "count": 0,
            "description": [
             "Bowling Equipment"
            ],
            "subcode": "0FS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "FISHING EQUIPMENT",
            "count": 0,
            "description": [
             "Fishing Equipment"
            ],
            "subcode": "0D6"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "GOLF EQUIPMENT",
            "count": 0,
            "description": [
             "Golf Equipment"
            ],
            "subcode": "0DC"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "HOCKEY EQUIPMENT",
            "count": 0,
            "description": [
             "Hockey Equipment"
            ],
            "subcode": "0F0"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKATEBOARD",
            "count": 0,
            "description": [
             "Skateboard"
            ],
            "subcode": "0IS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Ski Equipment"
            ],
            "subcode": "0DD"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "WATER SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Water Ski Equipment"
            ],
            "subcode": "0G2"
           }
          ],
          "pieces": 0
         }
        ]
       }
      ],
      "baseFareTotal": "USD224.19",
      "saleFareTotal": "USD224.19",
      "saleTaxTotal": "USD39.41",
      "saleTotal": "USD263.60",
      "passengers": {
       "kind": "qpxexpress#passengerCounts",
       "adultCount": 1
      },
      "tax": [
       {
        "kind": "qpxexpress#taxInfo",
        "id": "US_1",
        "chargeType": "GOVERNMENT",
        "code": "US",
        "country": "US",
        "salePrice": "USD16.81"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "AY",
        "chargeType": "GOVERNMENT",
        "code": "AY",
        "country": "US",
        "salePrice": "USD5.60"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "XF",
        "chargeType": "GOVERNMENT",
        "code": "XF",
        "country": "US",
        "salePrice": "USD9.00"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "ZP",
        "chargeType": "GOVERNMENT",
        "code": "ZP",
        "country": "US",
        "salePrice": "USD8.00"
       }
      ],
      "fareCalculation": "DTT UA X/CHI UA NYC 224.19HAA00AZN USD 224.19 END ZP DTW ORD XT 16.81US 8.00ZP 5.60AY 9.00XF DTW4.50 ORD4.50",
      "latestTicketingTime": "2014-09-02T23:59-04:00",
      "ptc": "ADT"
     }
    ]
   },
   {
    "kind": "qpxexpress#tripOption",
    "saleTotal": "USD263.60",
    "id": "NKqGcEHF9CAUo7UcIR3NN600E",
    "slice": [
     {
      "kind": "qpxexpress#sliceInfo",
      "duration": 307,
      "segment": [
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 76,
        "flight": {
         "carrier": "UA",
         "number": "3940"
        },
        "id": "Gpl47oC9t4wji6gc",
        "cabin": "COACH",
        "bookingCode": "H",
        "bookingCodeCount": 9,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "LuZ7h-+aycKi2JnW",
          "aircraft": "ERJ",
          "arrivalTime": "2014-10-30T06:17-05:00",
          "departureTime": "2014-10-30T06:01-04:00",
          "origin": "DTW",
          "destination": "ORD",
          "originTerminal": "N",
          "destinationTerminal": "2",
          "duration": 76,
          "operatingDisclosure": "OPERATED BY EXPRESSJET AIRLINES DBA UNITED EXPRESS",
          "mileage": 233,
          "secure": true
         }
        ],
        "connectionDuration": 103
       },
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 128,
        "flight": {
         "carrier": "UA",
         "number": "687"
        },
        "id": "GjiuWBBtDo6GzfVo",
        "cabin": "COACH",
        "bookingCode": "H",
        "bookingCodeCount": 9,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "L7ioWKf+BlWdQie9",
          "aircraft": "320",
          "arrivalTime": "2014-10-30T11:08-04:00",
          "departureTime": "2014-10-30T08:00-05:00",
          "origin": "ORD",
          "destination": "LGA",
          "originTerminal": "1",
          "destinationTerminal": "B",
          "duration": 128,
          "mileage": 731,
          "meal": "Food and Beverages for Purchase",
          "secure": true
         }
        ]
       }
      ]
     }
    ],
    "pricing": [
     {
      "kind": "qpxexpress#pricingInfo",
      "fare": [
       {
        "kind": "qpxexpress#fareInfo",
        "id": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "carrier": "UA",
        "origin": "DTT",
        "destination": "NYC",
        "basisCode": "HAA00AZN"
       }
      ],
      "segmentPricing": [
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "segmentId": "Gpl47oC9t4wji6gc",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "bagDescriptor": [
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "UPTO50LB 23KG AND62LI 158LCM",
            "count": 0,
            "description": [
             "Up to 50 lb/23 kg",
             "Up to 62 li/158 lcm"
            ],
            "subcode": "0GO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "MUSICAL INSTRUMENTS",
            "count": 0,
            "subcode": "0F2"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "ARCHERY EQUIPMENT",
            "count": 0,
            "description": [
             "Archery Equipment"
            ],
            "subcode": "0FO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "BOWLING EQUIPMENT",
            "count": 0,
            "description": [
             "Bowling Equipment"
            ],
            "subcode": "0FS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "FISHING EQUIPMENT",
            "count": 0,
            "description": [
             "Fishing Equipment"
            ],
            "subcode": "0D6"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "GOLF EQUIPMENT",
            "count": 0,
            "description": [
             "Golf Equipment"
            ],
            "subcode": "0DC"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "HOCKEY EQUIPMENT",
            "count": 0,
            "description": [
             "Hockey Equipment"
            ],
            "subcode": "0F0"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKATEBOARD",
            "count": 0,
            "description": [
             "Skateboard"
            ],
            "subcode": "0IS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Ski Equipment"
            ],
            "subcode": "0DD"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "WATER SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Water Ski Equipment"
            ],
            "subcode": "0G2"
           }
          ],
          "pieces": 0
         }
        ]
       },
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "segmentId": "GjiuWBBtDo6GzfVo",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "bagDescriptor": [
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "UPTO50LB 23KG AND62LI 158LCM",
            "count": 0,
            "description": [
             "Up to 50 lb/23 kg",
             "Up to 62 li/158 lcm"
            ],
            "subcode": "0GO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "MUSICAL INSTRUMENTS",
            "count": 0,
            "subcode": "0F2"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "ARCHERY EQUIPMENT",
            "count": 0,
            "description": [
             "Archery Equipment"
            ],
            "subcode": "0FO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "BOWLING EQUIPMENT",
            "count": 0,
            "description": [
             "Bowling Equipment"
            ],
            "subcode": "0FS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "FISHING EQUIPMENT",
            "count": 0,
            "description": [
             "Fishing Equipment"
            ],
            "subcode": "0D6"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "GOLF EQUIPMENT",
            "count": 0,
            "description": [
             "Golf Equipment"
            ],
            "subcode": "0DC"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "HOCKEY EQUIPMENT",
            "count": 0,
            "description": [
             "Hockey Equipment"
            ],
            "subcode": "0F0"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKATEBOARD",
            "count": 0,
            "description": [
             "Skateboard"
            ],
            "subcode": "0IS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Ski Equipment"
            ],
            "subcode": "0DD"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "WATER SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Water Ski Equipment"
            ],
            "subcode": "0G2"
           }
          ],
          "pieces": 0
         }
        ]
       }
      ],
      "baseFareTotal": "USD224.19",
      "saleFareTotal": "USD224.19",
      "saleTaxTotal": "USD39.41",
      "saleTotal": "USD263.60",
      "passengers": {
       "kind": "qpxexpress#passengerCounts",
       "adultCount": 1
      },
      "tax": [
       {
        "kind": "qpxexpress#taxInfo",
        "id": "US_1",
        "chargeType": "GOVERNMENT",
        "code": "US",
        "country": "US",
        "salePrice": "USD16.81"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "AY",
        "chargeType": "GOVERNMENT",
        "code": "AY",
        "country": "US",
        "salePrice": "USD5.60"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "XF",
        "chargeType": "GOVERNMENT",
        "code": "XF",
        "country": "US",
        "salePrice": "USD9.00"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "ZP",
        "chargeType": "GOVERNMENT",
        "code": "ZP",
        "country": "US",
        "salePrice": "USD8.00"
       }
      ],
      "fareCalculation": "DTT UA X/CHI UA NYC 224.19HAA00AZN USD 224.19 END ZP DTW ORD XT 16.81US 8.00ZP 5.60AY 9.00XF DTW4.50 ORD4.50",
      "latestTicketingTime": "2014-09-02T23:59-04:00",
      "ptc": "ADT"
     }
    ]
   },
   {
    "kind": "qpxexpress#tripOption",
    "saleTotal": "USD263.60",
    "id": "NKqGcEHF9CAUo7UcIR3NN600J",
    "slice": [
     {
      "kind": "qpxexpress#sliceInfo",
      "duration": 367,
      "segment": [
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 76,
        "flight": {
         "carrier": "UA",
         "number": "3940"
        },
        "id": "Gpl47oC9t4wji6gc",
        "cabin": "COACH",
        "bookingCode": "H",
        "bookingCodeCount": 9,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "LuZ7h-+aycKi2JnW",
          "aircraft": "ERJ",
          "arrivalTime": "2014-10-30T06:17-05:00",
          "departureTime": "2014-10-30T06:01-04:00",
          "origin": "DTW",
          "destination": "ORD",
          "originTerminal": "N",
          "destinationTerminal": "2",
          "duration": 76,
          "operatingDisclosure": "OPERATED BY EXPRESSJET AIRLINES DBA UNITED EXPRESS",
          "mileage": 233,
          "secure": true
         }
        ],
        "connectionDuration": 163
       },
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 128,
        "flight": {
         "carrier": "UA",
         "number": "674"
        },
        "id": "G7FruNEnGwGHyh7-",
        "cabin": "COACH",
        "bookingCode": "H",
        "bookingCodeCount": 9,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "L0bJuH9H58NuIwuf",
          "aircraft": "319",
          "arrivalTime": "2014-10-30T12:08-04:00",
          "departureTime": "2014-10-30T09:00-05:00",
          "origin": "ORD",
          "destination": "LGA",
          "originTerminal": "1",
          "destinationTerminal": "B",
          "duration": 128,
          "mileage": 731,
          "meal": "Food and Beverages for Purchase",
          "secure": true
         }
        ]
       }
      ]
     }
    ],
    "pricing": [
     {
      "kind": "qpxexpress#pricingInfo",
      "fare": [
       {
        "kind": "qpxexpress#fareInfo",
        "id": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "carrier": "UA",
        "origin": "DTT",
        "destination": "NYC",
        "basisCode": "HAA00AZN"
       }
      ],
      "segmentPricing": [
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "segmentId": "Gpl47oC9t4wji6gc",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "bagDescriptor": [
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "UPTO50LB 23KG AND62LI 158LCM",
            "count": 0,
            "description": [
             "Up to 50 lb/23 kg",
             "Up to 62 li/158 lcm"
            ],
            "subcode": "0GO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "MUSICAL INSTRUMENTS",
            "count": 0,
            "subcode": "0F2"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "ARCHERY EQUIPMENT",
            "count": 0,
            "description": [
             "Archery Equipment"
            ],
            "subcode": "0FO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "BOWLING EQUIPMENT",
            "count": 0,
            "description": [
             "Bowling Equipment"
            ],
            "subcode": "0FS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "FISHING EQUIPMENT",
            "count": 0,
            "description": [
             "Fishing Equipment"
            ],
            "subcode": "0D6"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "GOLF EQUIPMENT",
            "count": 0,
            "description": [
             "Golf Equipment"
            ],
            "subcode": "0DC"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "HOCKEY EQUIPMENT",
            "count": 0,
            "description": [
             "Hockey Equipment"
            ],
            "subcode": "0F0"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKATEBOARD",
            "count": 0,
            "description": [
             "Skateboard"
            ],
            "subcode": "0IS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Ski Equipment"
            ],
            "subcode": "0DD"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "WATER SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Water Ski Equipment"
            ],
            "subcode": "0G2"
           }
          ],
          "pieces": 0
         }
        ]
       },
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "segmentId": "G7FruNEnGwGHyh7-",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "bagDescriptor": [
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "UPTO50LB 23KG AND62LI 158LCM",
            "count": 0,
            "description": [
             "Up to 50 lb/23 kg",
             "Up to 62 li/158 lcm"
            ],
            "subcode": "0GO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "MUSICAL INSTRUMENTS",
            "count": 0,
            "subcode": "0F2"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "ARCHERY EQUIPMENT",
            "count": 0,
            "description": [
             "Archery Equipment"
            ],
            "subcode": "0FO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "BOWLING EQUIPMENT",
            "count": 0,
            "description": [
             "Bowling Equipment"
            ],
            "subcode": "0FS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "FISHING EQUIPMENT",
            "count": 0,
            "description": [
             "Fishing Equipment"
            ],
            "subcode": "0D6"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "GOLF EQUIPMENT",
            "count": 0,
            "description": [
             "Golf Equipment"
            ],
            "subcode": "0DC"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "HOCKEY EQUIPMENT",
            "count": 0,
            "description": [
             "Hockey Equipment"
            ],
            "subcode": "0F0"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKATEBOARD",
            "count": 0,
            "description": [
             "Skateboard"
            ],
            "subcode": "0IS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Ski Equipment"
            ],
            "subcode": "0DD"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "WATER SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Water Ski Equipment"
            ],
            "subcode": "0G2"
           }
          ],
          "pieces": 0
         }
        ]
       }
      ],
      "baseFareTotal": "USD224.19",
      "saleFareTotal": "USD224.19",
      "saleTaxTotal": "USD39.41",
      "saleTotal": "USD263.60",
      "passengers": {
       "kind": "qpxexpress#passengerCounts",
       "adultCount": 1
      },
      "tax": [
       {
        "kind": "qpxexpress#taxInfo",
        "id": "US_1",
        "chargeType": "GOVERNMENT",
        "code": "US",
        "country": "US",
        "salePrice": "USD16.81"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "AY",
        "chargeType": "GOVERNMENT",
        "code": "AY",
        "country": "US",
        "salePrice": "USD5.60"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "XF",
        "chargeType": "GOVERNMENT",
        "code": "XF",
        "country": "US",
        "salePrice": "USD9.00"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "ZP",
        "chargeType": "GOVERNMENT",
        "code": "ZP",
        "country": "US",
        "salePrice": "USD8.00"
       }
      ],
      "fareCalculation": "DTT UA X/CHI UA NYC 224.19HAA00AZN USD 224.19 END ZP DTW ORD XT 16.81US 8.00ZP 5.60AY 9.00XF DTW4.50 ORD4.50",
      "latestTicketingTime": "2014-09-02T23:59-04:00",
      "ptc": "ADT"
     }
    ]
   },
   {
    "kind": "qpxexpress#tripOption",
    "saleTotal": "USD263.60",
    "id": "NKqGcEHF9CAUo7UcIR3NN6009",
    "slice": [
     {
      "kind": "qpxexpress#sliceInfo",
      "duration": 261,
      "segment": [
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 84,
        "flight": {
         "carrier": "UA",
         "number": "3667"
        },
        "id": "Gkun3uKRK8Fxxsio",
        "cabin": "COACH",
        "bookingCode": "H",
        "bookingCodeCount": 9,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "LMRCP4gVVjTE34Fx",
          "aircraft": "CR7",
          "arrivalTime": "2014-10-30T14:15-05:00",
          "departureTime": "2014-10-30T13:51-04:00",
          "origin": "DTW",
          "destination": "ORD",
          "originTerminal": "N",
          "destinationTerminal": "2",
          "duration": 84,
          "operatingDisclosure": "OPERATED BY GOJET AIRLINES DBA UNITED EXPRESS",
          "mileage": 233,
          "secure": true
         }
        ],
        "connectionDuration": 45
       },
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 132,
        "flight": {
         "carrier": "UA",
         "number": "1646"
        },
        "id": "GatdVYRsohdeAmZM",
        "cabin": "COACH",
        "bookingCode": "H",
        "bookingCodeCount": 9,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "Lu02WzsoG4btNgDi",
          "aircraft": "73G",
          "arrivalTime": "2014-10-30T18:12-04:00",
          "departureTime": "2014-10-30T15:00-05:00",
          "origin": "ORD",
          "destination": "LGA",
          "originTerminal": "1",
          "destinationTerminal": "B",
          "duration": 132,
          "mileage": 731,
          "meal": "Food and Beverages for Purchase",
          "secure": true
         }
        ]
       }
      ]
     }
    ],
    "pricing": [
     {
      "kind": "qpxexpress#pricingInfo",
      "fare": [
       {
        "kind": "qpxexpress#fareInfo",
        "id": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "carrier": "UA",
        "origin": "DTT",
        "destination": "NYC",
        "basisCode": "HAA00AZN"
       }
      ],
      "segmentPricing": [
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "segmentId": "GatdVYRsohdeAmZM",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "bagDescriptor": [
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "UPTO50LB 23KG AND62LI 158LCM",
            "count": 0,
            "description": [
             "Up to 50 lb/23 kg",
             "Up to 62 li/158 lcm"
            ],
            "subcode": "0GO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "MUSICAL INSTRUMENTS",
            "count": 0,
            "subcode": "0F2"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "ARCHERY EQUIPMENT",
            "count": 0,
            "description": [
             "Archery Equipment"
            ],
            "subcode": "0FO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "BOWLING EQUIPMENT",
            "count": 0,
            "description": [
             "Bowling Equipment"
            ],
            "subcode": "0FS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "FISHING EQUIPMENT",
            "count": 0,
            "description": [
             "Fishing Equipment"
            ],
            "subcode": "0D6"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "GOLF EQUIPMENT",
            "count": 0,
            "description": [
             "Golf Equipment"
            ],
            "subcode": "0DC"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "HOCKEY EQUIPMENT",
            "count": 0,
            "description": [
             "Hockey Equipment"
            ],
            "subcode": "0F0"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKATEBOARD",
            "count": 0,
            "description": [
             "Skateboard"
            ],
            "subcode": "0IS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Ski Equipment"
            ],
            "subcode": "0DD"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "WATER SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Water Ski Equipment"
            ],
            "subcode": "0G2"
           }
          ],
          "pieces": 0
         }
        ]
       },
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "segmentId": "Gkun3uKRK8Fxxsio",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "bagDescriptor": [
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "UPTO50LB 23KG AND62LI 158LCM",
            "count": 0,
            "description": [
             "Up to 50 lb/23 kg",
             "Up to 62 li/158 lcm"
            ],
            "subcode": "0GO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "MUSICAL INSTRUMENTS",
            "count": 0,
            "subcode": "0F2"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "ARCHERY EQUIPMENT",
            "count": 0,
            "description": [
             "Archery Equipment"
            ],
            "subcode": "0FO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "BOWLING EQUIPMENT",
            "count": 0,
            "description": [
             "Bowling Equipment"
            ],
            "subcode": "0FS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "FISHING EQUIPMENT",
            "count": 0,
            "description": [
             "Fishing Equipment"
            ],
            "subcode": "0D6"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "GOLF EQUIPMENT",
            "count": 0,
            "description": [
             "Golf Equipment"
            ],
            "subcode": "0DC"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "HOCKEY EQUIPMENT",
            "count": 0,
            "description": [
             "Hockey Equipment"
            ],
            "subcode": "0F0"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKATEBOARD",
            "count": 0,
            "description": [
             "Skateboard"
            ],
            "subcode": "0IS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Ski Equipment"
            ],
            "subcode": "0DD"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "WATER SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Water Ski Equipment"
            ],
            "subcode": "0G2"
           }
          ],
          "pieces": 0
         }
        ]
       }
      ],
      "baseFareTotal": "USD224.19",
      "saleFareTotal": "USD224.19",
      "saleTaxTotal": "USD39.41",
      "saleTotal": "USD263.60",
      "passengers": {
       "kind": "qpxexpress#passengerCounts",
       "adultCount": 1
      },
      "tax": [
       {
        "kind": "qpxexpress#taxInfo",
        "id": "US_1",
        "chargeType": "GOVERNMENT",
        "code": "US",
        "country": "US",
        "salePrice": "USD16.81"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "AY",
        "chargeType": "GOVERNMENT",
        "code": "AY",
        "country": "US",
        "salePrice": "USD5.60"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "XF",
        "chargeType": "GOVERNMENT",
        "code": "XF",
        "country": "US",
        "salePrice": "USD9.00"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "ZP",
        "chargeType": "GOVERNMENT",
        "code": "ZP",
        "country": "US",
        "salePrice": "USD8.00"
       }
      ],
      "fareCalculation": "DTT UA X/CHI UA NYC 224.19HAA00AZN USD 224.19 END ZP DTW ORD XT 16.81US 8.00ZP 5.60AY 9.00XF DTW4.50 ORD4.50",
      "latestTicketingTime": "2014-09-02T23:59-04:00",
      "ptc": "ADT"
     }
    ]
   },
   {
    "kind": "qpxexpress#tripOption",
    "saleTotal": "USD263.60",
    "id": "NKqGcEHF9CAUo7UcIR3NN600H",
    "slice": [
     {
      "kind": "qpxexpress#sliceInfo",
      "duration": 349,
      "segment": [
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 86,
        "flight": {
         "carrier": "UA",
         "number": "3352"
        },
        "id": "GBKidj0m-S4lU2eA",
        "cabin": "COACH",
        "bookingCode": "H",
        "bookingCodeCount": 5,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "LZSVoT0cTfetROob",
          "aircraft": "ERJ",
          "arrivalTime": "2014-10-30T08:46-05:00",
          "departureTime": "2014-10-30T08:20-04:00",
          "origin": "DTW",
          "destination": "ORD",
          "originTerminal": "N",
          "destinationTerminal": "2",
          "duration": 86,
          "operatingDisclosure": "OPERATED BY TRANS STATES AIRLINES DBA UNITED EXPRESS",
          "mileage": 233,
          "secure": true
         }
        ],
        "connectionDuration": 134
       },
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 129,
        "flight": {
         "carrier": "UA",
         "number": "1420"
        },
        "id": "GKSQSk51OqLMSZTC",
        "cabin": "COACH",
        "bookingCode": "H",
        "bookingCodeCount": 5,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "LOJsTkN3V80RegFH",
          "aircraft": "73G",
          "arrivalTime": "2014-10-30T14:09-04:00",
          "departureTime": "2014-10-30T11:00-05:00",
          "origin": "ORD",
          "destination": "LGA",
          "originTerminal": "1",
          "destinationTerminal": "B",
          "duration": 129,
          "mileage": 731,
          "meal": "Food and Beverages for Purchase",
          "secure": true
         }
        ]
       }
      ]
     }
    ],
    "pricing": [
     {
      "kind": "qpxexpress#pricingInfo",
      "fare": [
       {
        "kind": "qpxexpress#fareInfo",
        "id": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "carrier": "UA",
        "origin": "DTT",
        "destination": "NYC",
        "basisCode": "HAA00AZN"
       }
      ],
      "segmentPricing": [
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "segmentId": "GBKidj0m-S4lU2eA",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "bagDescriptor": [
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "UPTO50LB 23KG AND62LI 158LCM",
            "count": 0,
            "description": [
             "Up to 50 lb/23 kg",
             "Up to 62 li/158 lcm"
            ],
            "subcode": "0GO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "MUSICAL INSTRUMENTS",
            "count": 0,
            "subcode": "0F2"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "ARCHERY EQUIPMENT",
            "count": 0,
            "description": [
             "Archery Equipment"
            ],
            "subcode": "0FO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "BOWLING EQUIPMENT",
            "count": 0,
            "description": [
             "Bowling Equipment"
            ],
            "subcode": "0FS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "FISHING EQUIPMENT",
            "count": 0,
            "description": [
             "Fishing Equipment"
            ],
            "subcode": "0D6"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "GOLF EQUIPMENT",
            "count": 0,
            "description": [
             "Golf Equipment"
            ],
            "subcode": "0DC"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "HOCKEY EQUIPMENT",
            "count": 0,
            "description": [
             "Hockey Equipment"
            ],
            "subcode": "0F0"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKATEBOARD",
            "count": 0,
            "description": [
             "Skateboard"
            ],
            "subcode": "0IS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Ski Equipment"
            ],
            "subcode": "0DD"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "WATER SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Water Ski Equipment"
            ],
            "subcode": "0G2"
           }
          ],
          "pieces": 0
         }
        ]
       },
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "segmentId": "GKSQSk51OqLMSZTC",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "bagDescriptor": [
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "UPTO50LB 23KG AND62LI 158LCM",
            "count": 0,
            "description": [
             "Up to 50 lb/23 kg",
             "Up to 62 li/158 lcm"
            ],
            "subcode": "0GO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "MUSICAL INSTRUMENTS",
            "count": 0,
            "subcode": "0F2"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "ARCHERY EQUIPMENT",
            "count": 0,
            "description": [
             "Archery Equipment"
            ],
            "subcode": "0FO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "BOWLING EQUIPMENT",
            "count": 0,
            "description": [
             "Bowling Equipment"
            ],
            "subcode": "0FS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "FISHING EQUIPMENT",
            "count": 0,
            "description": [
             "Fishing Equipment"
            ],
            "subcode": "0D6"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "GOLF EQUIPMENT",
            "count": 0,
            "description": [
             "Golf Equipment"
            ],
            "subcode": "0DC"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "HOCKEY EQUIPMENT",
            "count": 0,
            "description": [
             "Hockey Equipment"
            ],
            "subcode": "0F0"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKATEBOARD",
            "count": 0,
            "description": [
             "Skateboard"
            ],
            "subcode": "0IS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Ski Equipment"
            ],
            "subcode": "0DD"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "WATER SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Water Ski Equipment"
            ],
            "subcode": "0G2"
           }
          ],
          "pieces": 0
         }
        ]
       }
      ],
      "baseFareTotal": "USD224.19",
      "saleFareTotal": "USD224.19",
      "saleTaxTotal": "USD39.41",
      "saleTotal": "USD263.60",
      "passengers": {
       "kind": "qpxexpress#passengerCounts",
       "adultCount": 1
      },
      "tax": [
       {
        "kind": "qpxexpress#taxInfo",
        "id": "US_1",
        "chargeType": "GOVERNMENT",
        "code": "US",
        "country": "US",
        "salePrice": "USD16.81"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "AY",
        "chargeType": "GOVERNMENT",
        "code": "AY",
        "country": "US",
        "salePrice": "USD5.60"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "XF",
        "chargeType": "GOVERNMENT",
        "code": "XF",
        "country": "US",
        "salePrice": "USD9.00"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "ZP",
        "chargeType": "GOVERNMENT",
        "code": "ZP",
        "country": "US",
        "salePrice": "USD8.00"
       }
      ],
      "fareCalculation": "DTT UA X/CHI UA NYC 224.19HAA00AZN USD 224.19 END ZP DTW ORD XT 16.81US 8.00ZP 5.60AY 9.00XF DTW4.50 ORD4.50",
      "latestTicketingTime": "2014-09-02T23:59-04:00",
      "ptc": "ADT"
     }
    ]
   },
   {
    "kind": "qpxexpress#tripOption",
    "saleTotal": "USD263.60",
    "id": "NKqGcEHF9CAUo7UcIR3NN6008",
    "slice": [
     {
      "kind": "qpxexpress#sliceInfo",
      "duration": 247,
      "segment": [
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 76,
        "flight": {
         "carrier": "UA",
         "number": "3940"
        },
        "id": "Gpl47oC9t4wji6gc",
        "cabin": "COACH",
        "bookingCode": "H",
        "bookingCodeCount": 9,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "LuZ7h-+aycKi2JnW",
          "aircraft": "ERJ",
          "arrivalTime": "2014-10-30T06:17-05:00",
          "departureTime": "2014-10-30T06:01-04:00",
          "origin": "DTW",
          "destination": "ORD",
          "originTerminal": "N",
          "destinationTerminal": "2",
          "duration": 76,
          "operatingDisclosure": "OPERATED BY EXPRESSJET AIRLINES DBA UNITED EXPRESS",
          "mileage": 233,
          "secure": true
         }
        ],
        "connectionDuration": 43
       },
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 128,
        "flight": {
         "carrier": "UA",
         "number": "694"
        },
        "id": "GcAs8wM9HaA3VB92",
        "cabin": "COACH",
        "bookingCode": "H",
        "bookingCodeCount": 9,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "LIIq8CN1A9WdWVxG",
          "aircraft": "320",
          "arrivalTime": "2014-10-30T10:08-04:00",
          "departureTime": "2014-10-30T07:00-05:00",
          "origin": "ORD",
          "destination": "LGA",
          "originTerminal": "1",
          "destinationTerminal": "B",
          "duration": 128,
          "onTimePerformance": 70,
          "mileage": 731,
          "meal": "Food and Beverages for Purchase",
          "secure": true
         }
        ]
       }
      ]
     }
    ],
    "pricing": [
     {
      "kind": "qpxexpress#pricingInfo",
      "fare": [
       {
        "kind": "qpxexpress#fareInfo",
        "id": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "carrier": "UA",
        "origin": "DTT",
        "destination": "NYC",
        "basisCode": "HAA00AZN"
       }
      ],
      "segmentPricing": [
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "segmentId": "Gpl47oC9t4wji6gc",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "bagDescriptor": [
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "UPTO50LB 23KG AND62LI 158LCM",
            "count": 0,
            "description": [
             "Up to 50 lb/23 kg",
             "Up to 62 li/158 lcm"
            ],
            "subcode": "0GO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "MUSICAL INSTRUMENTS",
            "count": 0,
            "subcode": "0F2"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "ARCHERY EQUIPMENT",
            "count": 0,
            "description": [
             "Archery Equipment"
            ],
            "subcode": "0FO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "BOWLING EQUIPMENT",
            "count": 0,
            "description": [
             "Bowling Equipment"
            ],
            "subcode": "0FS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "FISHING EQUIPMENT",
            "count": 0,
            "description": [
             "Fishing Equipment"
            ],
            "subcode": "0D6"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "GOLF EQUIPMENT",
            "count": 0,
            "description": [
             "Golf Equipment"
            ],
            "subcode": "0DC"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "HOCKEY EQUIPMENT",
            "count": 0,
            "description": [
             "Hockey Equipment"
            ],
            "subcode": "0F0"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKATEBOARD",
            "count": 0,
            "description": [
             "Skateboard"
            ],
            "subcode": "0IS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Ski Equipment"
            ],
            "subcode": "0DD"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "WATER SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Water Ski Equipment"
            ],
            "subcode": "0G2"
           }
          ],
          "pieces": 0
         }
        ]
       },
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "segmentId": "GcAs8wM9HaA3VB92",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "bagDescriptor": [
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "UPTO50LB 23KG AND62LI 158LCM",
            "count": 0,
            "description": [
             "Up to 50 lb/23 kg",
             "Up to 62 li/158 lcm"
            ],
            "subcode": "0GO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "MUSICAL INSTRUMENTS",
            "count": 0,
            "subcode": "0F2"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "ARCHERY EQUIPMENT",
            "count": 0,
            "description": [
             "Archery Equipment"
            ],
            "subcode": "0FO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "BOWLING EQUIPMENT",
            "count": 0,
            "description": [
             "Bowling Equipment"
            ],
            "subcode": "0FS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "FISHING EQUIPMENT",
            "count": 0,
            "description": [
             "Fishing Equipment"
            ],
            "subcode": "0D6"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "GOLF EQUIPMENT",
            "count": 0,
            "description": [
             "Golf Equipment"
            ],
            "subcode": "0DC"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "HOCKEY EQUIPMENT",
            "count": 0,
            "description": [
             "Hockey Equipment"
            ],
            "subcode": "0F0"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKATEBOARD",
            "count": 0,
            "description": [
             "Skateboard"
            ],
            "subcode": "0IS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Ski Equipment"
            ],
            "subcode": "0DD"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "WATER SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Water Ski Equipment"
            ],
            "subcode": "0G2"
           }
          ],
          "pieces": 0
         }
        ]
       }
      ],
      "baseFareTotal": "USD224.19",
      "saleFareTotal": "USD224.19",
      "saleTaxTotal": "USD39.41",
      "saleTotal": "USD263.60",
      "passengers": {
       "kind": "qpxexpress#passengerCounts",
       "adultCount": 1
      },
      "tax": [
       {
        "kind": "qpxexpress#taxInfo",
        "id": "US_1",
        "chargeType": "GOVERNMENT",
        "code": "US",
        "country": "US",
        "salePrice": "USD16.81"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "AY",
        "chargeType": "GOVERNMENT",
        "code": "AY",
        "country": "US",
        "salePrice": "USD5.60"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "XF",
        "chargeType": "GOVERNMENT",
        "code": "XF",
        "country": "US",
        "salePrice": "USD9.00"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "ZP",
        "chargeType": "GOVERNMENT",
        "code": "ZP",
        "country": "US",
        "salePrice": "USD8.00"
       }
      ],
      "fareCalculation": "DTT UA X/CHI UA NYC 224.19HAA00AZN USD 224.19 END ZP DTW ORD XT 16.81US 8.00ZP 5.60AY 9.00XF DTW4.50 ORD4.50",
      "latestTicketingTime": "2014-09-02T23:59-04:00",
      "ptc": "ADT"
     }
    ]
   },
   {
    "kind": "qpxexpress#tripOption",
    "saleTotal": "USD263.60",
    "id": "NKqGcEHF9CAUo7UcIR3NN600A",
    "slice": [
     {
      "kind": "qpxexpress#sliceInfo",
      "duration": 272,
      "segment": [
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 82,
        "flight": {
         "carrier": "UA",
         "number": "5511"
        },
        "id": "GiSK77oPe6ox4uR+",
        "cabin": "COACH",
        "bookingCode": "H",
        "bookingCodeCount": 9,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "L9rdTYy++3femjaw",
          "aircraft": "CR7",
          "arrivalTime": "2014-10-30T19:20-05:00",
          "departureTime": "2014-10-30T18:58-04:00",
          "origin": "DTW",
          "destination": "ORD",
          "originTerminal": "N",
          "destinationTerminal": "2",
          "duration": 82,
          "operatingDisclosure": "OPERATED BY SKYWEST DBA UNITED EXPRESS",
          "mileage": 233,
          "secure": true
         }
        ],
        "connectionDuration": 63
       },
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 127,
        "flight": {
         "carrier": "UA",
         "number": "156"
        },
        "id": "GUBp+htXhDH1CRVI",
        "cabin": "COACH",
        "bookingCode": "H",
        "bookingCodeCount": 9,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "LRTL4ZaEPQ900yJv",
          "aircraft": "738",
          "arrivalTime": "2014-10-30T23:30-04:00",
          "departureTime": "2014-10-30T20:23-05:00",
          "origin": "ORD",
          "destination": "LGA",
          "originTerminal": "1",
          "destinationTerminal": "B",
          "duration": 127,
          "mileage": 731,
          "meal": "Food and Beverages for Purchase",
          "secure": true
         }
        ]
       }
      ]
     }
    ],
    "pricing": [
     {
      "kind": "qpxexpress#pricingInfo",
      "fare": [
       {
        "kind": "qpxexpress#fareInfo",
        "id": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "carrier": "UA",
        "origin": "DTT",
        "destination": "NYC",
        "basisCode": "HAA00AZN"
       }
      ],
      "segmentPricing": [
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "segmentId": "GUBp+htXhDH1CRVI",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "bagDescriptor": [
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "UPTO50LB 23KG AND62LI 158LCM",
            "count": 0,
            "description": [
             "Up to 50 lb/23 kg",
             "Up to 62 li/158 lcm"
            ],
            "subcode": "0GO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "MUSICAL INSTRUMENTS",
            "count": 0,
            "subcode": "0F2"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "ARCHERY EQUIPMENT",
            "count": 0,
            "description": [
             "Archery Equipment"
            ],
            "subcode": "0FO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "BOWLING EQUIPMENT",
            "count": 0,
            "description": [
             "Bowling Equipment"
            ],
            "subcode": "0FS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "FISHING EQUIPMENT",
            "count": 0,
            "description": [
             "Fishing Equipment"
            ],
            "subcode": "0D6"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "GOLF EQUIPMENT",
            "count": 0,
            "description": [
             "Golf Equipment"
            ],
            "subcode": "0DC"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "HOCKEY EQUIPMENT",
            "count": 0,
            "description": [
             "Hockey Equipment"
            ],
            "subcode": "0F0"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKATEBOARD",
            "count": 0,
            "description": [
             "Skateboard"
            ],
            "subcode": "0IS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Ski Equipment"
            ],
            "subcode": "0DD"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "WATER SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Water Ski Equipment"
            ],
            "subcode": "0G2"
           }
          ],
          "pieces": 0
         }
        ]
       },
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "segmentId": "GiSK77oPe6ox4uR+",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "bagDescriptor": [
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "UPTO50LB 23KG AND62LI 158LCM",
            "count": 0,
            "description": [
             "Up to 50 lb/23 kg",
             "Up to 62 li/158 lcm"
            ],
            "subcode": "0GO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "MUSICAL INSTRUMENTS",
            "count": 0,
            "subcode": "0F2"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "ARCHERY EQUIPMENT",
            "count": 0,
            "description": [
             "Archery Equipment"
            ],
            "subcode": "0FO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "BOWLING EQUIPMENT",
            "count": 0,
            "description": [
             "Bowling Equipment"
            ],
            "subcode": "0FS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "FISHING EQUIPMENT",
            "count": 0,
            "description": [
             "Fishing Equipment"
            ],
            "subcode": "0D6"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "GOLF EQUIPMENT",
            "count": 0,
            "description": [
             "Golf Equipment"
            ],
            "subcode": "0DC"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "HOCKEY EQUIPMENT",
            "count": 0,
            "description": [
             "Hockey Equipment"
            ],
            "subcode": "0F0"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKATEBOARD",
            "count": 0,
            "description": [
             "Skateboard"
            ],
            "subcode": "0IS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Ski Equipment"
            ],
            "subcode": "0DD"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "WATER SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Water Ski Equipment"
            ],
            "subcode": "0G2"
           }
          ],
          "pieces": 0
         }
        ]
       }
      ],
      "baseFareTotal": "USD224.19",
      "saleFareTotal": "USD224.19",
      "saleTaxTotal": "USD39.41",
      "saleTotal": "USD263.60",
      "passengers": {
       "kind": "qpxexpress#passengerCounts",
       "adultCount": 1
      },
      "tax": [
       {
        "kind": "qpxexpress#taxInfo",
        "id": "US_1",
        "chargeType": "GOVERNMENT",
        "code": "US",
        "country": "US",
        "salePrice": "USD16.81"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "AY",
        "chargeType": "GOVERNMENT",
        "code": "AY",
        "country": "US",
        "salePrice": "USD5.60"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "XF",
        "chargeType": "GOVERNMENT",
        "code": "XF",
        "country": "US",
        "salePrice": "USD9.00"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "ZP",
        "chargeType": "GOVERNMENT",
        "code": "ZP",
        "country": "US",
        "salePrice": "USD8.00"
       }
      ],
      "fareCalculation": "DTT UA X/CHI UA NYC 224.19HAA00AZN USD 224.19 END ZP DTW ORD XT 16.81US 8.00ZP 5.60AY 9.00XF DTW4.50 ORD4.50",
      "latestTicketingTime": "2014-09-02T23:59-04:00",
      "ptc": "ADT"
     }
    ]
   },
   {
    "kind": "qpxexpress#tripOption",
    "saleTotal": "USD263.60",
    "id": "NKqGcEHF9CAUo7UcIR3NN600I",
    "slice": [
     {
      "kind": "qpxexpress#sliceInfo",
      "duration": 350,
      "segment": [
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 81,
        "flight": {
         "carrier": "UA",
         "number": "3454"
        },
        "id": "GVT-jZ86LuzOaRih",
        "cabin": "COACH",
        "bookingCode": "H",
        "bookingCodeCount": 9,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "LYaweH9NXGrZLbfw",
          "aircraft": "E70",
          "arrivalTime": "2014-10-30T16:00-05:00",
          "departureTime": "2014-10-30T15:39-04:00",
          "origin": "DTW",
          "destination": "ORD",
          "originTerminal": "N",
          "destinationTerminal": "1",
          "duration": 81,
          "operatingDisclosure": "OPERATED BY SHUTTLE AMERICA DBA UNITED EXPRESS",
          "mileage": 233,
          "secure": true
         }
        ],
        "connectionDuration": 133
       },
       {
        "kind": "qpxexpress#segmentInfo",
        "duration": 136,
        "flight": {
         "carrier": "UA",
         "number": "1254"
        },
        "id": "GRxuR9aCfpwFt5UI",
        "cabin": "COACH",
        "bookingCode": "H",
        "bookingCodeCount": 9,
        "marriedSegmentGroup": "0",
        "leg": [
         {
          "kind": "qpxexpress#legInfo",
          "id": "LP3eX7B4m6Qd3Ew4",
          "aircraft": "738",
          "arrivalTime": "2014-10-30T21:29-04:00",
          "departureTime": "2014-10-30T18:13-05:00",
          "origin": "ORD",
          "destination": "LGA",
          "originTerminal": "1",
          "destinationTerminal": "B",
          "duration": 136,
          "onTimePerformance": 30,
          "mileage": 731,
          "meal": "Food and Beverages for Purchase",
          "secure": true
         }
        ]
       }
      ]
     }
    ],
    "pricing": [
     {
      "kind": "qpxexpress#pricingInfo",
      "fare": [
       {
        "kind": "qpxexpress#fareInfo",
        "id": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "carrier": "UA",
        "origin": "DTT",
        "destination": "NYC",
        "basisCode": "HAA00AZN"
       }
      ],
      "segmentPricing": [
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "segmentId": "GVT-jZ86LuzOaRih",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "bagDescriptor": [
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "UPTO50LB 23KG AND62LI 158LCM",
            "count": 0,
            "description": [
             "Up to 50 lb/23 kg",
             "Up to 62 li/158 lcm"
            ],
            "subcode": "0GO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "MUSICAL INSTRUMENTS",
            "count": 0,
            "subcode": "0F2"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "ARCHERY EQUIPMENT",
            "count": 0,
            "description": [
             "Archery Equipment"
            ],
            "subcode": "0FO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "BOWLING EQUIPMENT",
            "count": 0,
            "description": [
             "Bowling Equipment"
            ],
            "subcode": "0FS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "FISHING EQUIPMENT",
            "count": 0,
            "description": [
             "Fishing Equipment"
            ],
            "subcode": "0D6"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "GOLF EQUIPMENT",
            "count": 0,
            "description": [
             "Golf Equipment"
            ],
            "subcode": "0DC"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "HOCKEY EQUIPMENT",
            "count": 0,
            "description": [
             "Hockey Equipment"
            ],
            "subcode": "0F0"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKATEBOARD",
            "count": 0,
            "description": [
             "Skateboard"
            ],
            "subcode": "0IS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Ski Equipment"
            ],
            "subcode": "0DD"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "WATER SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Water Ski Equipment"
            ],
            "subcode": "0G2"
           }
          ],
          "pieces": 0
         }
        ]
       },
       {
        "kind": "qpxexpress#segmentPricing",
        "fareId": "AJN05mW0P4QJ64QNKbzJ+dBCvfYbdYqY0e6WS7N/JQU2",
        "segmentId": "GRxuR9aCfpwFt5UI",
        "freeBaggageOption": [
         {
          "kind": "qpxexpress#freeBaggageAllowance",
          "bagDescriptor": [
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "UPTO50LB 23KG AND62LI 158LCM",
            "count": 0,
            "description": [
             "Up to 50 lb/23 kg",
             "Up to 62 li/158 lcm"
            ],
            "subcode": "0GO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "MUSICAL INSTRUMENTS",
            "count": 0,
            "subcode": "0F2"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "ARCHERY EQUIPMENT",
            "count": 0,
            "description": [
             "Archery Equipment"
            ],
            "subcode": "0FO"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "BOWLING EQUIPMENT",
            "count": 0,
            "description": [
             "Bowling Equipment"
            ],
            "subcode": "0FS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "FISHING EQUIPMENT",
            "count": 0,
            "description": [
             "Fishing Equipment"
            ],
            "subcode": "0D6"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "GOLF EQUIPMENT",
            "count": 0,
            "description": [
             "Golf Equipment"
            ],
            "subcode": "0DC"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "HOCKEY EQUIPMENT",
            "count": 0,
            "description": [
             "Hockey Equipment"
            ],
            "subcode": "0F0"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKATEBOARD",
            "count": 0,
            "description": [
             "Skateboard"
            ],
            "subcode": "0IS"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Ski Equipment"
            ],
            "subcode": "0DD"
           },
           {
            "kind": "qpxexpress#bagDescriptor",
            "commercialName": "WATER SKI EQUIPMENT",
            "count": 0,
            "description": [
             "Water Ski Equipment"
            ],
            "subcode": "0G2"
           }
          ],
          "pieces": 0
         }
        ]
       }
      ],
      "baseFareTotal": "USD224.19",
      "saleFareTotal": "USD224.19",
      "saleTaxTotal": "USD39.41",
      "saleTotal": "USD263.60",
      "passengers": {
       "kind": "qpxexpress#passengerCounts",
       "adultCount": 1
      },
      "tax": [
       {
        "kind": "qpxexpress#taxInfo",
        "id": "US_1",
        "chargeType": "GOVERNMENT",
        "code": "US",
        "country": "US",
        "salePrice": "USD16.81"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "AY",
        "chargeType": "GOVERNMENT",
        "code": "AY",
        "country": "US",
        "salePrice": "USD5.60"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "XF",
        "chargeType": "GOVERNMENT",
        "code": "XF",
        "country": "US",
        "salePrice": "USD9.00"
       },
       {
        "kind": "qpxexpress#taxInfo",
        "id": "ZP",
        "chargeType": "GOVERNMENT",
        "code": "ZP",
        "country": "US",
        "salePrice": "USD8.00"
       }
      ],
      "fareCalculation": "DTT UA X/CHI UA NYC 224.19HAA00AZN USD 224.19 END ZP DTW ORD XT 16.81US 8.00ZP 5.60AY 9.00XF DTW4.50 ORD4.50",
      "latestTicketingTime": "2014-09-02T23:59-04:00",
      "ptc": "ADT"
     }
    ]
   }
  ]
 }
}

 */
public class FlightResponse {
}
