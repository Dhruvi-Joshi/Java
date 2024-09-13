public class Strbuilder {
    
    public static void main(String[] args) {
        // string is unmutale so modifing string we use string builder
        StringBuilder sb=new StringBuilder("i like java");   //if not pass any string that its take empty string
        System.out.println(sb);
        
        sb.append(" and PHP");
        System.out.println(sb);

        sb.insert(7,"Android,");
        System.out.println(sb);

        sb.replace(2,6,"love");
        System.out.println(sb);

        sb.delete(7,15);
        System.out.println(sb);

        //Stringbuilder to string
        String st=sb.toString();
        System.out.println(st);
    }
    
}
