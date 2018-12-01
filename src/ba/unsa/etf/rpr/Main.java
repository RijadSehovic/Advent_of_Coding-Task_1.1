package ba.unsa.etf.rpr;



import java.util.Scanner;


public class Main {





    public static void main(String[] args){
        System.out.println("Enter numbers, you have 10 sec between two inputs, any input out of that range will give you result: ");
        Stopwatch helper=new Stopwatch();
        int x = 0;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();

            while (input.hasNext()) {
               if(helper.elapsedTime()>10) break;
               int inputInt = input.nextInt();

                x = x + inputInt;


            }



        System.out.print(x);

    }
}
