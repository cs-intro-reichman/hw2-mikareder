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
			int fieldWidth = 20;
			int precision = 15;
			double piApproximated = sum * 4;
			String label1 = "pi according to Java:";
			String label2 = "pi, approximated:";
			int labelWidth = Math.max(label1.length(), label2.length()) + 1;

			double epsilon = 1e-12;
			boolean isInteger = Math.abs(piApproximated - Math.round(piApproximated)) < epsilon;

			// פורמט: שם (מיישר לשמאל ברוחב labelWidth) + מספר מיישר לשמאל ברוחב fieldWidth
			System.out.printf("%-" + labelWidth + "s%-" + fieldWidth + "." + precision + "f\n", label1, pi);

			if (isInteger) {
				System.out.printf("%-" + labelWidth + "s%-" + fieldWidth + ".1f\n", label2, piApproximated);
			} else {
				System.out.printf("%-" + labelWidth + "s%-" + fieldWidth + "." + precision + "f\n", label2, piApproximated);
			}
		}
			

	}
	

