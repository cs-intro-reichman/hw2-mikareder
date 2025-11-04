// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int num= Integer.parseInt(args[0]);
	    double pi = Math.PI;
		int count =0 ;
		double number=1;
		double sum=0;
		char sign= '+';
		while(count<num){
			
				if(sign=='-'){
					sum-=(1.0/number);
					sign='+';
				}
				else{
					sum+=(1.0/number);
					sign='-';
				}
				number+=2;
				count++;
			}
			System.out.printf("pi according to Java: %.15f\n " , pi);
			System.out.printf("pi, approximated: %.16f\n" , (sum*4));

		}
	}

