import java.util.ArrayList;

public class slide16 {
    public static void main(String[] args) {
        ArrayList<String> arrayListStrings = new ArrayList<>();
        arrayListStrings.add("JAVA");
        arrayListStrings.add("PHP");
        arrayListStrings.add("C#");
        arrayListStrings.add("C++");
        System.out.print("cac phan tu trong arrayListString la :");
        for (int i = 0; i < arrayListStrings.size(); i++) {
            System.out.print(arrayListStrings.get(i) + "\t");
        }
    }
}
