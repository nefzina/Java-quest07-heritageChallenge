public class Hangar {

    public static void main(String[] args){
        Car myCar = new Car("Clio");
        Boat myBoat = new Boat("Titanic");

        System.out.println(myCar.doStuff());
        System.out.println(myBoat.doStuff());

    }
}
