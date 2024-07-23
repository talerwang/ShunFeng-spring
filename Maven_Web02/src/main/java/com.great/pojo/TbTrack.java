package com.great.pojo;


public class TbTrack {

  private long trackId;
  private long packageId;
  private String location;
  private String trackStatus;
  private String time;


  public long getTrackId() {
    return trackId;
  }

  public void setTrackId(long trackId) {
    this.trackId = trackId;
  }


  public long getPackageId() {
    return packageId;
  }

  public void setPackageId(long packageId) {
    this.packageId = packageId;
  }


  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  public String getTrackStatus() {
    return trackStatus;
  }

  public void setTrackStatus(String trackStatus) {
    this.trackStatus = trackStatus;
  }


  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

}
