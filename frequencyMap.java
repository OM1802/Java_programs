import java.util.Map;
import java.util.LinkedHashMap;

class frequency{
  public static void main(String[] args){
    String[] fruits = {
            "apple",
            "banana",
            "apple",
            "orange",
            "banana",
            "apple"
        }; 

    Map<String, Integer> frequency= new LinkedHashMap<>();

    for(String fruit : fruits){
      if(frequency.containsKey(fruit)){
        frequency.put(fruit, frequency.get(fruit)+1);
      }
      else{
        frequency.put(fruit, 1);
      }
    }

    System.out.println(frequency);
  }

}

class getDefaultFrequency{
  public static void main(String[] args){
    String[] fruits = {
            "apple",
            "banana",
            "apple",
            "orange",
            "banana",
            "apple"
        }; 
    Map<String, Integer> frequency= new LinkedHashMap<>();

    for(String fruit : fruits){
      frequency.put(
        fruit, frequency.getOrDefault(fruit, 0)+1
      );
    }

    System.out.println(frequency);
  }
}

