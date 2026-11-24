public class Reverse{
    public static void main(String[] args) {
        String a = "supercalifragilispiralidoso haha";
        String rev = "";
        int i = a.length()-1;

        while(i>=0){
            rev += a.charAt(i); 
            i--;

        }

        System.out.println(rev);


    }


}