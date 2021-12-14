import java.util.Scanner;


public class program {
    //Main function
    public static void main(String[] args)
    {
        //now i am creating an object of Scanner class
        Scanner input = new Scanner(System.in);
        //This is the way of initializing


        //for loop 3 times
        for(int i=0;i<3;i++)
        {
            System.out.print("\nEnter number: ");
            int num = input.nextInt();  //it is used to take integer input

            int end=0; //just initializing it

            if(num==7)
               end = 100;
            if(num==8)
                end = 200;
            if(num==9)
                end=300;

            int start = num; //I stored num in start

            while(start<=end)
            {
                System.out.println(start);
                start = start + num;
            }
        }
    }

}
