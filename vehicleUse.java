public class vehicleUse {
    public static void main(String[] args) {
        vehicle v;
        v = new car();
        System.out.println(v.isStartWithKick());
        v = new scoooter();
        System.out.println(v.isStartWithKick());
    }
}
