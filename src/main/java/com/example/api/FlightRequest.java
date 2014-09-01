package com.example.api;

import android.text.format.DateFormat;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class FlightRequest {
  public static FlightRequest newRequest(String origin, String destination, Date date,
                                         int numberOfAdults, int price, String currency,
                                         boolean refundable, int maxResults) {
    String maxPrice = currency + price;
    Passengers passengers = new Passengers(numberOfAdults);
    String formatedDate = DateFormat.format("yyyy-MM-dd", date).toString();
    List<Slice> slices = Arrays.asList(new Slice(origin, destination, formatedDate));
    Request req = new Request(slices, passengers, maxResults, refundable, maxPrice);

    return new FlightRequest(req);
  }

  public Request request;

  public FlightRequest(Request request) {
    this.request = request;
  }

  public static class Request {
    public List<Slice> slice;
    public Passengers passengers;
    public int solutions;
    public boolean refundable;
    public String maxPrice;

    public Request(List<Slice> slice, Passengers passengers,
                   int solutions, boolean refundable, String maxPrice) {
      this.slice = slice;
      this.passengers = passengers;
      this.solutions = solutions;
      this.refundable = refundable;
      this.maxPrice = maxPrice;
    }
  }

  public static class Slice {
    public String origin;
    public String destination;
    public String date;

    public Slice(String origin, String destination, String date) {
      this.origin = origin;
      this.destination = destination;
      this.date = date;
    }
  }

  public static class Passengers {
    public int adultCount;

    public Passengers(int adultCount) {
      this.adultCount = adultCount;
    }
  }
}
