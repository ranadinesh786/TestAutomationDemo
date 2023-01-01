// 4. Java Program to Find Factorial on Number
//4!=4*3*2*1
public class Main
{
    public static void main(String[] args) {
        int n1=4;
        int fact=1;
        for(int i=n1;i>0;i--)
        {
            System.out.println(i+" "+n1+" "+fact);
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
