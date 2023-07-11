import java.util.ArrayList;
import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) {
        String s1="Keep";
        String s2="peek";
        //verifique if s1 and s2 is anagram
        boolean status=false;
        if(s1.length()!=s2.length()){
            status=false;
            return;
        }else {
            char[]arrayS1=s1.toLowerCase().toCharArray();
            char[]arrayS2=s2.toLowerCase().toCharArray();
            Arrays.sort(arrayS1); Arrays.sort(arrayS2);
            status=Arrays.equals(arrayS1, arrayS2);
            System.out.println(status);
        }
        ////////////////////////////////////////
        //verifiq if s1 and s2 is inversed
        boolean status2=false;
        char[]arrayS1=s1.toLowerCase().toCharArray();
        char[]arrayS2=s2.toLowerCase().toCharArray();
        System.out.println(arrayS1);
        for (int i=0; i<arrayS1.length; i++){
            for (int j=arrayS2.length; j>0; j--){
                if (arrayS1[i]==arrayS2[j-1]){
                    status2=true;
                }
            }
        }
        System.out.println(status2);

        ////////////////////////////////////
        //verifiq if char is duplicate
        System.out.println("duplicate element");
        int increment=0, indexOfElement=0, numberOfRepeats=0;
        char[]newArrayS1=s1.toLowerCase().toCharArray();
        char[]newArrayS2=s2.toLowerCase().toCharArray();
        do {
            for (int k=0;k<newArrayS1.length; k++) {
                if (newArrayS1[increment] == newArrayS1[k]) {
                    numberOfRepeats = numberOfRepeats + 1;
                }
            }
                if (numberOfRepeats>1){
                    indexOfElement=increment;
                }
            increment++;
            numberOfRepeats=0;
            }while (increment<newArrayS1.length);
        System.out.println(newArrayS1[indexOfElement]);
    }
}
