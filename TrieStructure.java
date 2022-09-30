class TrieNode{
    TrieNode[] children;
    boolean isEndWord;
    public TrieNode(){
        this.children = new TrieNode[26];
        this.isEndWord = false;
    }
}

class TrieStructure {
    private TrieNode root;
    public TrieStructure() {
        this.root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode ws = root;
        for(int i=0;i<word.length();i++){
            char c= word.charAt(i);
            if(ws.children[c-'a']==null){
                ws.children[c-'a']= new TrieNode();
            }
            ws = ws.children[c-'a'];
        }
        ws.isEndWord = true;
    }
    
    public boolean search(String word) {
        TrieNode search_word = root;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(search_word.children[c-'a']==null) return false;
            search_word = search_word.children[c-'a'];
        }
        return search_word.isEndWord;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode ws = root;
        for(int i=0;i<prefix.length();i++){
            char c = prefix.charAt(i);
            if(ws.children[c-'a']==null) return false;
            ws = ws.children[c-'a'];
        }
        return true;
    }
}