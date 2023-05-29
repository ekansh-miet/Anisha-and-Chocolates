import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int c=1,d=1;
        for(int i=1;i<n;i++){
           if(s.charAt(i)==s.charAt(i-1)){
           c++;
           }
           else{
            c=1;
           }
           d=Math.max(d,c);
        }
        System.out.println(d);
    }
}