import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        int strLeng=str.length();
        boolean flag=true;
        int i=0;
        while (i<strLeng/2 && flag==true){
            if (str.charAt(i) - str.charAt(strLeng-i-1)!=0){
                flag = false;
            }
            i++;
        }
        if (flag){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
