package java8.FunctionalInterface;

public class StudentTest
{
    public static void display()
    {
        System.out.println("Student Name: A");
        System.out.println("From static method");
    }
    public void displayNonStatic()
    {
        System.out.println("Student Name: B");
        System.out.println("From instance method");
    }

    public static void main(String[] args) {
        student st1=StudentTest::display;

        student st2=new StudentTest()::displayNonStatic;
        st2.display();
        student st3=new student() {
            @Override
            public void display()
            {
                System.out.println("Reading from anonymous");
            }
        };
        st3.display();
    }


}
