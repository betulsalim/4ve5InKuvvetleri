import java.util.Scanner;
public class Main {
    public  static  void main(String[] args){
        int i,sayi;

        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz: ");
        sayi = input.nextInt();
        System.out.println("Dört'ün kuvvetleri: ");
        for(i=1;i<=sayi;i*=4){
           System.out.println(i);
        }
        System.out.println("Beş'in kuvvetleri: ");
        for (i=1;i<=sayi;i*=5){
            System.out.println(i);

        }

    }
}
