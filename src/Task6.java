import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int totalPlaces = 102;
        int seatPlaces = 60;
        int occupiedPlaces = 102;

        if (occupiedPlaces < 60) {
            System.out.println("В вагоне осталось " + (seatPlaces - occupiedPlaces) + " сидячих мест");
        }
        if (occupiedPlaces >= 60 && occupiedPlaces < totalPlaces) {
            System.out.println("В вагоне осталось " + (totalPlaces - occupiedPlaces) + " стоячих мест");
        }
        else  {
            System.out.println("В вагоне не осталось свободных мест");
        }
    }
}
