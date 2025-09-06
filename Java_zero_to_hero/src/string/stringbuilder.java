package string;

public class stringbuilder {
    //strings are immuteable but the string bulider are muteabbel

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("tony");
        System.out.println(sb);
        // change the charecter at index 0
        sb.setCharAt(0,'p');
        System.out.println(sb);
        //we can also insert at any index
        sb.insert(0,'s');
        System.out.println(sb);
        //now we can delet the specific part of the string or a chareccter
        sb.delete(2,6);//
        //int this the last index would not delet
        System.out.println(sb);
        //append use to add some string or charecter att the end of your string
        sb.append("kede hua");
        System.out.println(sb);
        System.out.println(sb.length());
        sb.replace(0, 5, "Hi");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        //n string bulder are non synconize while string buffer is syncorised

    }
}
