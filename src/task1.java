import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Matematik dersinize ait notunuzu giriniz lutfen");
        float math = sc.nextFloat();
        System.out.println("Fizik dersinize ait notunuzu giriniz lutfen");
        float physic = sc.nextFloat();
        System.out.println("Kimya dersinize ait notunuzu giriniz lutfen");
        float chem = sc.nextFloat();
        System.out.println("Turkce dersinize ait notunuzu giriniz lutfen");
        float trk = sc.nextFloat();
        System.out.println("Tarih dersinize ait notunuzu giriniz lutfen");
        float hstry = sc.nextFloat();
        System.out.println("Muzik dersinize ait notunuzu giriniz lutfen");
        float msc = sc.nextFloat();
        float overall = (math + physic + chem + trk + hstry + msc) / 6.0F;
        System.out.println("Not ortalamaniz= " + overall);
        boolean passed = overall > 60.0F;
        String isPassed = passed ? "Sinifi Gecti" : "Sinifta Kaldi";
        System.out.println(isPassed);

    }


}
