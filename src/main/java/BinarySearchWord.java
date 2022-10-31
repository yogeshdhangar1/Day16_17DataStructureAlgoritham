import java.util.Arrays;
import java.util.Scanner;
public class BinarySearchWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter The No Of Words You Want To add:");
        int num = sc.nextInt();
        String words[] = new String[num];
        for(i=0;i<words.length;i++){
            System.out.println("Enter:"+(i+1)+" :");
            words[i] = sc.next();
        }
        System.out.println("Enter word To search");
        String word = sc.next();
        Arrays.sort(words);
        int index= Arrays.binarySearch(words,word);
        System.out.println(word+ "="+ index);
        sc.close();
    }
}
