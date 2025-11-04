
public class Cheers {
        public static void main(String[] args) {
	String name=args[0];
        int output=Integer.parseInt(args[1]);
        char [] except = {'A', 'E', 'F', 'H', 'I', 'L', 'M', 'N', 'O', 'R','S', 'X'};
        int length=name.length();
        String aOrAn="";
        for(int i=0; i<length;i++){
                System.out.print("give me ");
                for(int f=0; f<except.length;f++){
                        if(name.charAt(i)==except[f]){
                                aOrAn = "an";
                                break;
                        }
                        else{
                                aOrAn="a";
                        }
                        
                        
                }
                if (aOrAn.equals("an")){
                        System.out.print("an ");
                }
                else{
                        System.out.print("a ");
                }
                System.out.print(name.charAt(i));
                System.out.println("");
        }
                System.out.println("What does that spell?");
                for(int z=0; z<output;z++){
                        System.out.println(name+ "!!!");
                }
        }
}
