package org;

public class Plane {
    public String planeManufacturerName;

    public String[] passengerNames = new String[6];

    public Plane(String manufacturerName) {
        planeManufacturerName = manufacturerName;
    }


    public void setPassenger(String passengerName, int passengerIndex) {
        if (passengerIndex >= 0 && passengerIndex < passengerNames.length) {
            passengerNames[passengerIndex] = passengerName;
        } else {
            System.out.println("Please, enter valid index");
        }
    }


    //  public String [] getPassengerName () {return passengerNames;}

    //public String getPassenger (int index){
    //  return passengerNames ( index);}


}

