import java.util.Scanner;
public class Lesson4 {
    static Scanner scan = new Scanner(System.in);
}


class ReverseNumber{
    int num;
    int revNum;
    public void reverseNumber(){
        System.out.println("enter a number: ");
        num = Lesson4.scan.nextInt();
        while (num > 0){
            revNum = revNum * 10 + num % 10;
            num /= 10;
        }
        System.out.println(revNum);
    }
}

class Average1{
    int num;
    int count = 0;
    int sum = 0;
    public void average(){
        System.out.println("please write a number: ");
        num = Lesson4.scan.nextInt();
        while(num >= 0){
            sum += num;
            count++;
            num = Lesson4.scan.nextInt();
        }
        System.out.println(count > 0 ?  sum /(double)count : "no numbers were entered");
    }
}

class Average2{
    final int COUNT = 5;
    int sum;
    public double calculateAverage(){
        for(int i = 1; i <= COUNT; i++){
            System.out.println("enter the next number: ");
            sum += Lesson4.scan.nextInt();
        }
        return (double) sum / COUNT;
    }
}
class IsPalindrom{
    //Scanner scan = new Scanner(System.in);
    public boolean isPalindrom(){
        System.out.println("enter a string: ");
        String str = Lesson4.scan.next();
        boolean status = false;
        for (int i = 0, j = str.length() - 1; j > i; i++, j-- ){
            if (str.charAt(i) == str.charAt(j)){
                status = true;
            }
            else {
                return false;
            }
        }
        return status;
    }
}

class Password{
    final int MIN_LEN = 8;
    public boolean isValid(String str){
        if (str.length() < MIN_LEN) {
            return false;
        }
        if (str.charAt(0) < 'A' || str.charAt(0) > 'Z'){
            return false;
        }
        for (int i = 0, j = 1; j <= str.length() - 1; i++, j++ ){
          if(str.charAt(i) == str.charAt(j)){
              return false;
          }
        }
        return true;
    }

}
class Papa{
    int age;
    int salary;
}
