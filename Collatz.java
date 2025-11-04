// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int num= Integer.parseInt(args[0]);
		String mode=args[1];
		int number;
		int count;
		System.out.println("% java Collatz " + num + " " + mode);
	 	for(int i = 1; i <= num; i++){ 
             number = i;
			  count=1;
			  if(i==1 && mode.equals("v")){
				System.out.println("1 4 2 1 (4)");
				continue;
			  }
			  if (mode.equals("v")) {
                System.out.print(number);
            }

			while(number!=1){
				if(number%2==0){
					number/=2;
				}
				else{
					number=(number*3)+1;
				}
				if (mode.equals("v")) {
                    System.out.print(" " + number);
                }
				count++;
			}
			if (mode.equals("v")) {
                System.out.println(" ("+ count + ")");
            }
		}
System.out.println("Every one of the first " + num + " hailstone sequences reached 1.");	}
}
