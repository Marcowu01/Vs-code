import java.util.Scanner;

public class ReadData{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("lunghezza iniziale array: ");
        a = scanner.nextInt();
        int n = 0;

        int [] v = new int[a];

        for(int i =0; i<v.length; i++){
            while (scanner.nextInt() == a) {
                n++;
                v[i] = scanner.nextInt();

                if (n == v.length) {
                    
                }
            }





        }



    }








}