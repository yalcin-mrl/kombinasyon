import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args){
        int n,r,topN = 1,topR= 1,topNr =1;
        double ort = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("n değeri gir: ");
        n = sc.nextInt();
        System.out.println("r değeri gir: ");
        r= sc.nextInt();
        for(int i = 1;i<=n;i++){
            topN *=i;
        }
        for(int i = 1; i<=r;i++){
            topR *= i;
        }
        for(int i = 1;i<=(n-r);i++){
            topNr *= i;
        }
        ort = (double)topN /(topR*topNr);
        System.out.println(ort);
    }
}
