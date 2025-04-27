package dsapracticestart;

interface i1 {
    public void display(int a);
}

public class Dummy {
    public static void main(String[] args) {
        int x = 10;
        i1 i = (a) -> System.out.println(a);
        i.display(100);
    }

}
