package StringProblems;

public class Demo {
	static boolean isPerfect(int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		return sum==n;
	}
	public static void main(String[] args) {
		String s="$1$2$3$";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='0' && c<='9') {
				sum+=(c-'0');
			}	
		}
		if(isPerfect(sum)) System.out.println("perfect number");
		else System.out.println("not perfect");

	}

}
