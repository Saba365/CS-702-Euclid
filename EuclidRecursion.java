import java.util.Scanner;
public class EuclidRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner forinput=new Scanner(System.in);
		int num1 = forinput.nextInt();
        int num2 = forinput.nextInt();
        int gcdrec  = gcd(num1, num2); //resursion
        int gcdsim = gcd2(num1, num2); //while loop
        System.out.println("gcd(" + num1 + ", " + num2 + ") = " + gcdrec);
        System.out.println("gcd(" + num1 + ", " + num2 + ") = " + gcdsim);
	}
	// recursive implementation
    public static int gcd(int num1, int num2) {
        if (num2 == 0) 
        	return num1;
        else 
        	return gcd(num2, num1 % num2);

    }

    // non-recursive implementation
    public static int gcd2(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

}
