import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class arrayMaker {
    
    String names[];
    int length;
    
    // to handle exceptions include throws
    public static void main(String[] args) throws IOException {
        // list that holds strings of a file
        List<String> listOfStrings
            = new ArrayList<String>();
       
        // load data from file
        FileReader fr = new FileReader("random.txt");
       
        // Created a string to store each character
        // to form word
        String s = new String();
        char ch;
       
        // checking for EOF
        while (fr.ready()) {
            ch = (char)fr.read();
               
            // Used to specify the delimiters
            if (ch == '\n') {
               
                // Storing each string in arraylist
                listOfStrings.add(s.toString());
               
                // clearing content in string
                s = new String();
            }
            else {
                // appending each character to string if the
                // current character is not delimiter
                s += ch;
            }
        }
        if (s.length() > 0) {
           
            // appending last line of strings to list
            listOfStrings.add(s.toString());
        }
        // storing the data in arraylist to array
        String[] array1
            = listOfStrings.toArray(new String[0]);
        
        stringsortingalgorithm sorter = new stringsortingalgorithm();
        String words[] = array1.clone();
	sorter.sort(words);

        for (String i : words) {
            System.out.print(i);
            System.out.print("\n");
        }
    }
    
    void sort(String array[]) {
        if (array == null || array.length == 0) {
            return;
        }
        this.names = array;
        this.length = array.length;
        quickSort(0, length - 1);
    }

    void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        String pivot = this.names[lowerIndex + (higherIndex - lowerIndex) / 2];

        while (i <= j) {
            while (this.names[i].compareToIgnoreCase(pivot) < 0) {
                i++;
            }

            while (this.names[j].compareToIgnoreCase(pivot) > 0) {
                j--;
            }

            if (i <= j) {
                exchangeNames(i, j);
                i++;
                j--;
            }
        }
        //call quickSort recursively
        if (lowerIndex < j) {
            quickSort(lowerIndex, j);
        }
        if (i < higherIndex) {
            quickSort(i, higherIndex);
        }
    }

    void exchangeNames(int i, int j) {
        String temp = this.names[i];
        this.names[i] = this.names[j];
        this.names[j] = temp;
    }
}
