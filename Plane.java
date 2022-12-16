package org;

public class Plane {
    public String planeManufacturerName;

    public Plane (String manufacturerName) {
        planeManufacturerName=manufacturerName;};
    public String [] passengerNames = new String[6];


    public String[] getPassengers() {
            return passengerNames;}


        public void setPassenger (String passengerName,int passengerIndex){
           if (passengerIndex >= 0 && passengerIndex < passengerNames.length) {
                passengerNames[passengerIndex] = passengerName;
            } else{
                System.out.println("Please, enter valid index");
            }
        }
    }