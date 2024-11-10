public class StringssB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("H");
        System.out.println(sb); 

        //char ar index 0
        //System.out.println(sb.charAt(0));

        //set char at index
        //sb.setCharAt(0, 's');
        //System.out.println(sb);

        //sb.insert(2, 'N');
        //System.out.println(sb);

        //delete the extra N
        //sb.delete(2, 4);
        //System.out.println(sb);

        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb.length());
    }
}
