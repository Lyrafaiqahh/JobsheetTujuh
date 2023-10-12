import java.util.Scanner;

public class WhileKelipatan15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        int kelipatan;
        int jumlah = 0;
        int counter = 0;
        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = scan.nextInt();

        while (i <=50) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
                System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
                System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);

        } 
        i++;
    }
  }
}