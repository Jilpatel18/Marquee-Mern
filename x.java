class x{
    public static void main(String[] args){
        String s1 = "1010100";
        String s2 = "0100101";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s1.length();i++){
            sb.append((s1.charAt(i)-'0')^(s2.charAt(i)-'0'));
        }
        System.out.println(sb.toString());
    }
}