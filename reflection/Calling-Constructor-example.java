import java.lang.reflect.Constructor;

public class Calling-Constructor-example {

    public static void main(String[] args) throws Exception {
        Person person = new Person("James");
        System.out.println(person);

        Class c1 = Class.forName("Person");
        Person person1 = (Person)c1.newInstance();
        System.out.println(person1);

        Class[] parameterTypes = {String.class};
        Constructor cons = c1.getConstructor(parameterTypes);

        Object[] initargs = {"김유신"};
        Person personLee = (Person)cons.newInstance(initargs);
        System.out.println(personLee);

        Class c2 = Class.forName("Person");
        Person person2 = (Person)c2.newInstance();
        System.out.println(person2);

        Class[] parameterTypes2 = {String.class, int.class};
        Constructor cons2 = c1.getConstructor(parameterTypes2);

        Object[] initargs2 = {"김석삼", 2};
        Person personKim = (Person)cons2.newInstance(initargs2);
        System.out.println(personKim.getName() + " " + personKim.getAge());
    }
}

class Person {
    private String name;
    private int age;

    public Person() {};

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return name;
    }
}