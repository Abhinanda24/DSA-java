// import java.util.Collections;
// import java.util.ArrayList;
import java.util.*;

class Main{
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(13,46,24,52,20,9));
    sorting obj;
    obj=new sorting();

    System.out.println(obj.selection_sort(arr));
}
}
class sorting{
    public ArrayList<Integer> selection_sort(ArrayList<Integer> arr){
    int n=arr.size();
    for(int i=0;i<=n-2;i++){
        int min=i;
        for(int j=i+1;j<=n-1;j++){
            if(arr.get(j)<arr.get(min)){
                min=j;
            
        }
        Collections.swap(arr,i,min);
    }  
    return arr;     
    }
}
