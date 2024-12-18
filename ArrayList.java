import java.util.ArrayList;
import java.util.Collections;
class Arraylist{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        //add element in list
        list.add(9);
        list.add(7);
        list.add(5);
        System.out.println(list);
        //add element in between list
        list.add(1,1);//first index then value
        System.out.println(list);
        //get element
        int element=list.get(3);//pass the index and it will return value
        System.out.println(element);
        //delete element
        list.remove(3);
        System.out.println(list);
        //Size
        int size=list.size();
        System.out.println(size);
        //loops
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i)+" ");
        }
        //Sorting
        Collections.sort(list);
        System.out.println(list);

    }
}