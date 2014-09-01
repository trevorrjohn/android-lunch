package com.example.api;

import java.util.List;

public class TripOption {
  private String saleTotal;
  private List<Slice> slice;

  public String getSaleTotal() {
    return saleTotal;
  }

  public List<Slice> getSlice() {
    return slice;
  }

  public class Slice {
    private int duration;
    private List<Segment> segment;

    public int getDuration() {
      return duration;
    }

    public List<Segment> getSegment() {
      return segment;
    }
  }

  public class Segment {
    private int duration;
    private Flight flight;
    private List<Leg> leg;

    public int getDuration() {
      return duration;
    }

    public Flight getFlight() {
      return flight;
    }

    public List<Leg> getLeg() {
      return leg;
    }
  }

  public class Leg {
    private String aircraft;
    private String arrivalTime;
    private String departureTime;
    private String origin;
    private String destination;
    private int duration;
    private int onTimePerformance;
    private int milage;
    private int connectionDuration;

    public String getAircraft() {
      return aircraft;
    }

    public String getArrivalTime() {
      return arrivalTime;
    }

    public String getDepartureTime() {
      return departureTime;
    }

    public String getOrigin() {
      return origin;
    }

    public String getDestination() {
      return destination;
    }

    public int getDuration() {
      return duration;
    }

    public int getOnTimePerformance() {
      return onTimePerformance;
    }

    public int getMilage() {
      return milage;
    }

    public int getConnectionDuration() {
      return connectionDuration;
    }
  }

  public class Flight {
    public String carrier;
    public String number;

    public String getCarrier() {
      return carrier;
    }

    public String getNumber() {
      return number;
    }
  }
}
