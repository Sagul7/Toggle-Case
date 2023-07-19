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

 */
