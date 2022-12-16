package org;

public class Main {
    private static String passengerName;

    public static void main (String[] agrs) {
        Plane plane = new Plane("Boeing");


        String[] passengerName = new String[6];
        passengerName[0] = "Михайло Федоров";
        passengerName[1] = "Олексій Вискуб";
        passengerName[2] = "Олександр Шелест";
        passengerName[3] = "Олександр Борняков";
        passengerName[4] = "Георгій Дубинський";
        passengerName[5] = "Валерія Іонан";

        plane.setPassenger("Михайло Федоров", '0');


        for (int i = 0; i < passengerName.length; i++) {
            // System.out.println(plane.getPassengerName(i));
            System.out.println("index of '" + passengerName[i] + "'is " + i);
            // switch (passengerName[i]){ case "Михайло Федоров": System.out.println("Це Михайло Федоров");break;default:System.out.println("Це не Михайло Федоров");
        }


    }
}