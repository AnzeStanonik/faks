import java.util.Scanner;
public class Smreka{

    public static void vrstica(int stVrstice, int stTrikotnika, int steviloKrosnj){
        for(int i = 0; i < steviloKrosnj - stTrikotnika; i++){
            System.out.print(" ");
        }

        for(int i = 0; i < stTrikotnika - stVrstice; i++){
            System.out.print(" ");
        }
        
        for(int i = 0; i < (2 * stVrstice - 1); i++){
            System.out.print("*");
        }

        System.out.println();
    }

    public static void trikotnik(int stTrikotnika, int steviloKrosnj){
        for(int i = 1; i <= stTrikotnika; i++){
            vrstica(i, stTrikotnika, steviloKrosnj);
        }
    }

    public static void krosnja(int steviloKrosnj){
        for(int i = 1; i <= steviloKrosnj; i++){
            trikotnik(i, steviloKrosnj);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int steviloKrosnj = sc.nextInt();
        krosnja(steviloKrosnj);

    }
}
