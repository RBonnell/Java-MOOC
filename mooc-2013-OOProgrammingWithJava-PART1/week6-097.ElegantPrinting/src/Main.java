
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        // Write code here
        int i = array.length - 1;
        for(int num : array){
            if (num == array[i]){
                System.out.println(num);
            }
            else{
                System.out.print(num + ", ");
            }
            
        }
    }
}
