package org;
public class Main {

    public static void main (String[] agrs){
        Plane firstPlane = new Plane("Boeing");
        Plane secondPlane = new Plane("Aerobus");

        String [] passengerName = new String[6];
        passengerName[0]="Михайло Федоров";
        passengerName[1]="Олексій Вискуб";
        passengerName[2]="Олександр Шелест";
        passengerName[3]="Олександр Борняков";
        passengerName[4]="Георгій Дубинський";
        passengerName[5]="Валерія Іонан";

        firstPlane.setPassenger("Михайло Федоров",'0');
        secondPlane.setPassenger("Валерія Іонан",'5');


        for (int i =0; i<passengerName.length;i++)
       // {System.out.println("index of '"+ passengerName[i]+"'is "+i);
             switch (passengerName[i]) {
            case "Михайло Федоров":
                System.out.println("Це Михайло Федоров");
            break;
                 case "Олексій Вискуб":
                System.out.println("Це Олексій Вискуб");
                break;
            default:System.out.println("Це хтось інший!");
        }

        String [] firstPlanePassengerSits = new String [3]
        firstPlanePassengerSits[0] = "1A";
        firstPlanePassengerSits[1] = "1B";
        firstPlanePassengerSits[2] = "1C";

        String [] secondPlanePassengerSits = new String [3]
        firstPlanePassengerSits[0] = "2A";
        firstPlanePassengerSits[1] = "2B";
        firstPlanePassengerSits[2] = "2C";
    }
}





