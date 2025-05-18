public class CheckPrime {
    public static void main(String[] args) {
        int number = 13;
        boolean flag=true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        if(!flag)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
