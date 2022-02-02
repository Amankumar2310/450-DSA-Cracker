import java.util.*;
import java.io.*;
import java.lang.*;
class Reverse
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-- >0)
        {
            String str= sc.nextLine();
            System.out.println(reverse(str));
        }
    }
    static String reverse(String str)
    {
        int n=str.length();
        if(n==0)
           return "";
        else
           return(str.charAt(n-1) + reverse(str.substring(0,n-1)));
         
    }
    
}


/******************************************************** Other Method***********************************************/
// import java.util.*;
// import java.io.*;
// import java.lang.*;
// class Reverse
// {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int t=sc.nextInt();
//         sc.nextLine();
//         while(t-- >0)
//         {
//             String str= sc.nextLine();
//             System.out.println(reverse(str));
//         }
//     }
//     static String reverse(String str)
//     {
//         int n=str.length();
//         if(n==0)
//            return "";
        
//         int l=0, r=n-1;
//         char[] ch=str.toCharArray();
//         while(l<r)
//         {
//             char c=ch[l];
//             ch[l]=ch[r];
//             ch[r]=c;
//             l++;
//             r--;
//         }
//         return new String(ch);
            
//     }
    
// }
