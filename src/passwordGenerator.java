import java.lang.*;
import java.util.*;
class PasswordGenerator {
    public static char passgen()
    {
        int random=(int)(Math.random()*62);
        if(random <=9)
        {
            random+=48;
            return (char)(random);
        }
        else if(random<=35)
        {
            random+=55;
            return (char)(random);
        }
        else {
            random+=61;
            return (char)(random);
        }
    }
    public static void getpass(String arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of passwords you want to generate   :");
        int totalpass = sc.nextInt();
        System.out.println("enter the length of the password  you want to generate   :");
        int passlen = sc.nextInt();
        String allpass[]=new String[totalpass];
        for(int i=0;i<totalpass;i++)
        {
            String pass="";
            for(int j=0;j<passlen;j++)
            {
                pass+=passgen();
            }
            allpass[i]=pass;
        }
        getpass(allpass);
    }
}
