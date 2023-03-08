import java.util.Arrays;
public class MyHashMap {
    private final int d = 8;
    public String[] listOfEmployees = new String[d];
    public Integer[] Date = new Integer[d];
    int number = 0;
    int number1 = 0;
    public void put(String key, Integer value){
            listOfEmployees[number] = key;
            number++;
            Date[number1] = value;
            number1++;

        System.out.println(Arrays.toString(listOfEmployees));
        System.out.println(Arrays.toString(Date));
    }
    void remove(String key){
        int a = 0;
        int c = 0;
        String[] afterRemoveListOfEmployees = new String[listOfEmployees.length-1];
        Integer[] afterRemoveDate = new Integer[Date.length-1];
    for(int i = 0; i<listOfEmployees.length; i++){
        if(listOfEmployees[i].equals(key)){
            continue;}
        afterRemoveListOfEmployees[a]=listOfEmployees[i];
        a++;}
        System.out.println(Arrays.toString(afterRemoveListOfEmployees));
         for(int j = 0; j<Date.length; j++){
             if(listOfEmployees[j].equals(key)){
                 continue;}
             afterRemoveDate[c]=Date[j];
            c++;
    }
        System.out.println(Arrays.toString(afterRemoveDate));

    }
    void clear(){
        int b =0;
        for(int i = 0; i<listOfEmployees.length; i++){
            listOfEmployees[i] = null;
            Date[b+i]=null;
        }
        System.out.println(Arrays.toString(listOfEmployees));
        System.out.println(Arrays.toString(Date));
    }
    public int size(){
       return listOfEmployees.length;
    }
    void get(String key){
        Integer result = 0;
        for(int i =0; i<listOfEmployees.length; i++){
            if(listOfEmployees[i].equals(key)){
                result+=Date[i];
            }
        }
        System.out.println(result);
    }
}







