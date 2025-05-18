package collections;
class GenericClass<T> {

    T object;

    void add(T object) {

        this.object = object;

    }

    T get() {

        return this.object;

    }

}

class Main {

    public static void main(String[] args) {

        // Pass Integer to Generic Class

        GenericClass<Integer> integerObject = new GenericClass<Integer>();

        integerObject.add(5);

        System.out.println("The Added Integer is : " + integerObject.get());

        // Pass String to Generic Class

        GenericClass<String> stringObject = new GenericClass<String>();

        stringObject.add("RahulShetty Academy");

        System.out.println("The Added String is : " + stringObject.get());

    }

}