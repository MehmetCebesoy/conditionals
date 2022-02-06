public class Main {

    public static void main(String[] args) {
        // if: eğer
        int sayi = 25;
        if (sayi < 20) {
            System.out.println("Sayı 20 den küçüktür");
        }
        else if (sayi ==20){
        // else :böyle değilse , şartı sağlamıyorsa
        // =:atama  == : eşit midir (==, <,>bunlara operatör deniyor)
            System.out.println("Sayı 20 ye eşittir");

        }
        else{
            System.out.println("Sayı 20'den büyüktür");
        }
    }
}