import java.util.*;;
public class letterCombos_75 {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.length()==0 || digits==null)return result;
        
        String[] mapping = {
            "0",
            "1",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
        
        lettercombos(result, digits, "", 0, mapping);
        return result;
    }
    
    public void lettercombos(List<String> result, String digits, String current, int index, String[] mapping){
        if(index==digits.length()){
            result.add(current);
            return;
        }
        String letters = mapping[digits.charAt(index) - '0'];
        for(int i=0;i<letters.length();i++){
            lettercombos(result, digits, current+letters.charAt(i), index+1, mapping);
        }
    }
}
