package builder;

public class Main {
    public static void main(String args[]){

        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.setMeat("goru").setCondiments("").setSalad("abr-jigs").setMeat("ff");

        LunchOrder lunchOrder = builder.build();
        System.out.println(lunchOrder.getMeat());


    }
}
