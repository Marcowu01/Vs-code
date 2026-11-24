import java.util.Scanner;

// next consuma il token e non la stringa
public class InputTest{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserire prima stringa");
        String s1 = scanner.nextLine();
        System.out.println("Inserire seconda stringa");
        String s2 = scanner.nextLine();


        if (s1.equals(s2)){
            System.out.println("Stringhe uguali");
        }

        else{
            if (s1.compareTo(s2)<0) {
                System.out.println("S1 viene prima");

            }
            else{
                System.out.println("S2 viene prima");
            }




        }


            scanner.close();
    }



}