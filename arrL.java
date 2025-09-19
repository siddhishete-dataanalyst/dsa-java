
import java.util.ArrayList;

public class arrL{
    public static void main(String args[]){
        //classname objectName = new className();

        ArrayList<Integer> list =new ArrayList<>();
         ArrayList<Integer> list2 =new ArrayList<>();
          ArrayList<Integer> list3 =new ArrayList<>();

          list.add(1);//0(1)
          list.add(2);
          list.add(3);
          list.add(4);
          list.add(5);


        //   list.add(1,9);
        
          System.out.println(list.size());
       

          //print the arraylist
          for(int i=0;i<list.size(); i++){
            System.out.print(list.get(i)+"");
          }
          System.out.println();


          //get Operation -o(1)
          //int element = list.get(2);
          //syste,.out.print(element);

          //delete 
        //   list.remove(2);
        //   System.out.println(list);

        //set
        //list.set(2,10);
        //System.out.println(list);

        //contains
        //System.out.println(list.contains(1));
       //System.out.println(list.contains(11));

       
    }
}
