import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Solution {
    private static final Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        int n=scanner.nextInt();
        scanner.close();
        if ((n%2==0)&&(n>2&&n<5))
            { System.out.println("not weired");}
        if else((n%2==0)&&(n>6&&n<20))
            {System.out.println("weired");} 
        if else((n%2==0)&&(n>20))
            {System.out.println("not weired");}  
        else
        {System.out.println("weired");}
}
}