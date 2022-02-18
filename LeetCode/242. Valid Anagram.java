class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        HashMap<Character, Integer> hp = new HashMap<>();
        for(int i = 0; i < s.length(); i++)
        {
            if(hp.containsKey(s.charAt(i)))
            {
                hp.put(s.charAt(i), hp.get(s.charAt(i)) + 1);
            }
            else
                hp.put(s.charAt(i), 1);
        }
            
        for(int i = 0; i < t.length(); i++)
        {
            if(!hp.containsKey(t.charAt(i)))
                return false;
            if(hp.get(t.charAt(i)) > 1)
                hp.put(t.charAt(i), hp.get(t.charAt(i)) - 1);
            else
                hp.remove(t.charAt(i));
        }
        
        if(hp.isEmpty())
            return true;
        return false;
    }
}
