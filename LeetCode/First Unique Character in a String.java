//17-02-2022
//https://leetcode.com/problems/first-unique-character-in-a-string/submissions/


import java.util.*;

class Solution {
    public int firstUniqChar(String s) {
        //Hashtable<Character, Integer> hp = new Hashtable<>();
        Map<Character, Integer> hp = Collections.synchronizedMap(
  new LinkedHashMap<Character, Integer>());
        for(int i = 0; i < s.length(); i++)
        {
            if(hp.containsKey(s.charAt(i)))
            {
                Integer a = hp.get(s.charAt(i));
                a += 1;
                hp.put(s.charAt(i), a);
            }
            else
                hp.put(s.charAt(i), 1);
        }
        for (Map.Entry<Character, Integer> e : hp.entrySet())
        {
            if(e.getValue() == 1)
            {
                return s.indexOf(e.getKey());
            }
        }
        return -1;
    }
}
