package com.example.api;

import java.util.List;

public class FlightResponse {
  private Trips trips;

  public Trips getTrips() {
    return trips;
  }

  public class Trips {
    public class Data {
      public List<Airport> airport;
      public List<City> city;
      public List<Aircraft> aircraft;
      public List<Carrier> carrier;

      public List<Airport> getAirport() {
        return airport;
      }

      public List<City> getCity() {
        return city;
      }

      public List<Aircraft> getAircraft() {
        return aircraft;
      }

      public List<Carrier> getCarrier() {
        return carrier;
      }
    }
  }
}

