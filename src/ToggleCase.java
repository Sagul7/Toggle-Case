import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(toggleCase(s));
    }
    public static String toggleCase(String s)
    {
        String res= "";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            {
                res+=(char)(s.charAt(i)+32);
            }
            else
                res+=(char)(s.charAt(i)-32);
        }
        return res;
    }
}
/*
You are given a character string A having length N, consisting of only lowercase and uppercase latin letters.

You have to toggle case of each character of string A. For e.g 'A' is changed to 'a', 'e' is changed to 'E', etc.

Example Input

Input 1:

A = "Hello"
Input 2:

A = "tHiSiSaStRiNg"


Example Output

Output 1:

hELLO
Output 2:

ThIsIsAsTrInG 


 */
