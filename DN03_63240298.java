import java.util.Scanner;
public class DN03_63240298{

        public static void prestejPloscice(int[][] stena){
                int stPloscic = 0; 

                for(int i = 0; i < stena.length; i++){
                        for(int j = 0; j < stena[i].length; j ++){
                                if(stena[i][j] > 0){
                                        stPloscic++;
                                }
                        }
                }
                System.out.println(stPloscic);
        }

        public static int[][] zapolniSteno(int[][] stena, int k){

                int preverjenavisina = 0;
                int preverjenaDolzina = 0;

                while(k > 0){
                        for(int i = k + preverjenavisina; i <= stena.length; i+= k){
                                
                                for(int j = k + preverjenaDolzina; j <= stena[i-1].length; j+= k){

                                        stena[i-1][j-1] = k;
                                        //System.out.println(k + " " + (i-1) + " " +  (j-1) + " " + stena[i-1][j-1]);
                                        preverjenaDolzina+= k;
                                }
                                preverjenavisina += k;
                                preverjenaDolzina = 0;
                                //System.out.println("aaaaaaa");
                        }
                        k /= 2;
                }

                return stena;
        }

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                int h = sc.nextInt(); //stVrstic
                int w = sc.nextInt(); //stStolpcev
                int k = (int) Math.pow(2, sc.nextInt()); //stranicaNajvecjePloscice
                int[][] stena = new int[h][w];
                prestejPloscice(zapolniSteno(stena, k));
        }
}
