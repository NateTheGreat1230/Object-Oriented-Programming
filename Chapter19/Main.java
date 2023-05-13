import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(24);
        list.add(14);
        list.add(42);
        list.add(25);

        ArrayList<Integer> newList = removeDuplicates(list);
        System.out.print(newList);
    }
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i =0; i<5; i++){
            for (int j= i+1; j< list.size(); j++) {
                if (list.get(j) == list.get(i)) {
                    newList.add((Integer) list.get(i));
                    if (newList.contains(list.get(i))){
                        list.remove(i);
                    }
                }

            }
        }
        return list;
    }
}