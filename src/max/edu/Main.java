package max.edu;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    ComplexLunch guest1 = new ComplexLunch("n1" , 70);
    ComplexLunch guest2 = new ComplexLunch("n2" , 90);
    ComplexLunch guest3 = new ComplexLunch("n1" , 70);
    ComplexLunch guest4 = new ComplexLunch("n1" , 70);
    ComplexLunch guest5 = new ComplexLunch("n2" , 90);
    OrderLunch guest6 = new OrderLunch("Cesar" , 60 , "Granny's soup" , 50
           , "Shawerma" , 70 , "Ecler", 50);
    OrderLunch guest7 = new OrderLunch("Vegetable" , 40 , "Cheesy soup" , 55
            , "Mashed potatoes with fish" , 75 , "Jelly", 45);
        List<IBill> bills = new ArrayList<>();
        bills.add(guest1);
        bills.add(guest2);
        bills.add(guest3);
        bills.add(guest4);
        bills.add(guest5);
        bills.add(guest6);
        bills.add(guest7);
        int sum = bills.stream().mapToInt(guest -> guest.getBill()).sum();
        int max = bills.stream().mapToInt(guest -> guest.getBill()).max().getAsInt();
        double average = bills.stream().mapToInt(guest -> guest.getBill()).average().getAsDouble();
        System.out.println(sum);
        System.out.println(average);
        System.out.println(max);
    }
}
