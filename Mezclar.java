import java.util.ArrayList;
import java.util.List;

public class Mezclar {

    public static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        List<Integer> listaComb = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                listaComb.add(list1.get(i++));
            } else {
                listaComb.add(list2.get(j++));
            }
        }

        while (i < list1.size()) {
            listaComb.add(list1.get(i++));
        }

        while (j < list2.size()) {
            listaComb.add(list2.get(j++));
        }

        return listaComb;
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Metodo de uso: java Mezclar.java \"lista1\" \"lista2\"");
            return;
        }

        List<Integer> list1 = parseList(args[0]);
        List<Integer> list2 = parseList(args[1]);

        List<Integer> listaComb = merge(list1, list2);

        System.out.println(listaComb);
    }

    private static List<Integer> parseList(String input) {
        List<Integer> list = new ArrayList<>();
        String[] tokens = input.split(",\\s*");

        for (String token : tokens) {
            list.add(Integer.parseInt(token));
        }

        return list;
    }
}
