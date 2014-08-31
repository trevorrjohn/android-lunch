package com.example.api;

import java.util.List;

public class SearchRequest {
  private int maxPrice;
  private Request request;

  public SearchRequest(int maxPrice, Request request) {
    this.maxPrice = maxPrice;
    this.request = request;
  }

  public int getMaxPrice() {
    return maxPrice;
  }

  public Request getRequest() {
    return request;
  }

  public class Request {
    private List<Slice> slice;
    private Passengers passengers;

    public Request(List<Slice> slice, Passengers passengers) {
      this.slice = slice;
      this.passengers = passengers;
    }

    public class Slice {
      private String origin;
      private String destination;
      private String date;

      public Slice(String origin, String destination, String date) {
        this.origin = origin;
        this.destination = destination;
        this.date = date;
      }

      public String getOrigin() {
        return origin;
      }

      public String getDestination() {
        return destination;
      }

      public String getDate() {
        return date;
      }
    }

    public class Passengers {
      private int adultCount;

      public Passengers(int adultCount) {
        this.adultCount = adultCount;
      }

      public int getAdultCount() {
        return adultCount;
      }
    }
  }
}
