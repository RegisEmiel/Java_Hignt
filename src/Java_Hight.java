import java.lang.reflect.Method;

public class Java_Hight {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> classB = Class.forName("ClassB");
        Method[] methods = classB.getMethods();
        Method[] declaredMethods = classB.getDeclaredMethods();

        System.out.println("Открытые методы класса B");
        for (Method m: methods)
            System.out.println(m.toString());

        //Показывает методы объявленные в классе ClassB
        System.out.println("Объявленные методы класса B");
        for (Method m: declaredMethods)
            System.out.println(m.toString());
    }
}
