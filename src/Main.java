import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b;
        double c;
        Scanner input=new Scanner(System.in);

        System.out.print("Birinci Kenarı Girin: ");
        a=input.nextInt();

        System.out.print("İkinci KEnarı Girin: ");
        b=input.nextInt();

        c=Math.sqrt((a*a) + (b*b));

        System.out.println("Hipotenüs: "+c);

    }
}
