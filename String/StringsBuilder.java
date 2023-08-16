public class StringsBuilder {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("hello");
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i;
            char frontChar =  sb.charAt(front);
            char backChar=sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back , frontChar );    
        }
        System.out.println(sb);

        //append function
        StringBuilder ab= new StringBuilder("h");
        ab.append("e");
        ab.append("l");
        ab.append("l");
        ab.append("o");
        System.out.println(ab);

        //insert function
        ab.insert(0,'p');
        System.out.println(ab);

        //length
        System.out.println(ab.length());

        //char at index
        System.out.println(ab.charAt(3));

        //delete char
        ab.delete(0,1);
        System.out.println(ab);

        //set char at index
        ab.setCharAt(0,'T');
        System.out.println(ab);

        //reverse
        StringBuilder bb=new StringBuilder("Tanisha");
        for(int i=0;i<bb.length()/2;i++){
        int front=i;
        int back=bb.length()-1-i;
        char frontChar= bb.charAt(front);
        char backChar=bb.charAt(back);
        bb.setCharAt(front,backChar);
        bb.setCharAt(back,frontChar);
        }
        System.out.println(bb);


    }
    
}
