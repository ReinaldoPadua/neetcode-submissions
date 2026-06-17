class Solution {

    public String encode(List<String> strs) {
        
        StringBuilder builder = new StringBuilder();
        for(String i: strs) {
            builder.append(i.length()>0 ? i : "999x89120carapreta");
            builder.append(";");
        }
        return builder.toString();
    }

    public List<String> decode(String str) {
        if(str.length()==0) return Arrays.asList();
        
        List<String> arrayString = new ArrayList<String>();
        for(String i: str.split(";")) {
            arrayString.add(i.equals("999x89120carapreta")? "": i);
        }
        return arrayString;
    }
}
