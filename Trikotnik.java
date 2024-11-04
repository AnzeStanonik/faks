import java.util.Scanner;
public class Trikotnik{

   public static void vrstica(int v){
        for (int i = 1; i <= v; i++){
            for(int j = 0; j < v - i;j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * i - 1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int steviloVrstic = sc.nextInt();
        vrstica(steviloVrstic);

    }
}
