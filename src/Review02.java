
public class Review02 {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            //3の整数で割り切れるなら”Fizz"と表示
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0) {
                System.out.println("Fizz");
            } else if(i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

}
