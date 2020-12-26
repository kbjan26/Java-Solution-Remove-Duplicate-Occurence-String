import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DSSamples {

    public static void main(String args[]) {

        String input = "abaaab";
        Map<Character, Integer> duplicateCount = new HashMap<>();
        for (int i = 0; i < input.length()-1; i++) {
                int j=i+1;
                if(Character.valueOf(input.charAt(i))
                        .equals(Character.valueOf(input.charAt(j)))){
                    Character key=Character.valueOf(input.charAt(i));
                    if(duplicateCount.containsKey(key)){
                        int count = duplicateCount.get(key);
                        duplicateCount.put(key,++count);
                    }else{
                        duplicateCount.put(Character.valueOf(input.charAt(i)),Integer.valueOf(1));
                    }
                }
        }
        Collection<Integer> removalCount=duplicateCount.values();
        System.out.println("Total Deletions required "+removalCount.stream().mapToInt(Integer::new).sum());
    }
}
