import java.util.HashMap;
import java.util.Map;

class Main{
  public static void main(String[] args){
    Map<String, String> m1=new HashMap<>();

    m1.put("ONE", "PRIME");
    m1.put("TWO", "BUMBLEBEE");
    m1.put("THREE", "MEGATRON");

    System.out.println(m1.get("THREE"));

    m1.put("THREE", "OPTIMUS");
    System.out.println(m1.get("THREE"));

    System.out.println(m1.containsKey("TWO"));
    System.out.println(m1.containsKey("ZERO"));
    
    System.out.println(m1.containsValue("PRIME"));
    System.out.println(m1.containsValue("DECEPTRONS"));

    m1.remove("THREE");

    for(Map.Entry<String, String> entry : m1.entrySet()){
      System.out.println(
        entry.getKey() + "-->" + entry.getValue()
      );
    }

  }
}