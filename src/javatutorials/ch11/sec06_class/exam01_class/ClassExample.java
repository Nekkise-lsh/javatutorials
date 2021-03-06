package javatutorials.ch11.sec06_class.exam01_class;

/**
 * Created by Nekisse_lee on 2017. 6. 30..
 */
public class ClassExample {
    public static void main(String[] args) {
        Car car = new Car();

        Class clazz1 = car.getClass();
        System.out.println(clazz1.getName());
        System.out.println(clazz1.getSimpleName());
        System.out.println(clazz1.getPackage().getName());
        System.out.println();


        try {
            Class clazz2 = Class.forName("javatutorials.ch11.sec06_class.exam01_class.Car");
            System.out.println(clazz2.getName());
            System.out.println(clazz2.getSimpleName());
            System.out.println(clazz2.getPackage().getName());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
