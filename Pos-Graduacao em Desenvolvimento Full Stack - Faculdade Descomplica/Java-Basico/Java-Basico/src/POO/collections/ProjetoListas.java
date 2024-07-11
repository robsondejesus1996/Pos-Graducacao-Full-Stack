package POO.collections;

import java.util.ArrayList;

public class ProjetoListas {
    public static void main(String[] args) {
        ArrayList<String> linguagesn = new ArrayList<>();

        linguagesn.add("Java");
        linguagesn.add("C#");
        linguagesn.add("Python");
        linguagesn.add("JavaScript");

        System.out.println("ArrayList: " + linguagesn);

        String[] arr = new String[linguagesn.size()];

        linguagesn.toArray(arr);

        System.out.println("Arry: ");

        for(String item:arr){
            System.out.println(item + ", ");
        }
    }
}
