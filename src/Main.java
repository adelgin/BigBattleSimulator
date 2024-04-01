public class Main {
    public static void main(String[] args) {
//        int mencounter = 0, womencounter = 0;
//        for (int i = 0; i < 1000000; i++){
//            PersonFabric newUser = new PersonFabric();
//            //System.out.println(newUser);
//            if (newUser.gender == Gender.MALE) {
//                mencounter++;
//                System.out.println(newUser);
//            }
//            else {
//                womencounter++;
//                System.out.println(newUser);
//            }
//        }
//        System.out.println("MEN: " + mencounter);
//        System.out.println("WOMEN " + womencounter);
//        Person solider = new PersonFabric();
        Fight fight = new Fight(10, 10);
        System.out.println(fight.scene());
    }
}