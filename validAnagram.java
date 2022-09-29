public class validAnagram {
    public boolean solution(String s, String t){
        if(s.length()<0 || t.length()<0 || s.length()!=t.length()) return false;
        int[] f = new int[256];
        boolean flag=true;
        for(char ch: s.toCharArray()){
            int index = (int)ch;
            f[index]+=1;
        }
        for(char ch: t.toCharArray()){
            int index = (int)ch;
            f[index]-=1;
        }

        for(int i=0;i<f.length;i++){
            if(f[i]!=0){
                flag = false;
                break;
            } 
        }
        return flag;
    }
}
