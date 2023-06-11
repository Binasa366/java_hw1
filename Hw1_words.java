    import java.util.Scanner;
    public class Hw1_words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("reversStr(str) = " + reversStr(str));

}
     private static String reversStr(String str) {
        String[] array = str.trim().split(" ");   
        String result = "";
        int ind = array.length - 1;                     
        for (int i = 0; i < array.length/2; i++) {      
            String tmp = array[i];                      
            array[i] = array[ind];
            array[ind] = tmp;
            ind--;
        }
        for (String el: array) {                        
            result += el + " ";
        }
        return result.trim();                         
    }
}