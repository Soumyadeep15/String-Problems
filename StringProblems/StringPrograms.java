package StringProblems;

public class StringPrograms {
	static void stringReverse(String s){
		char[] c=s.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			System.out.print(c[i]);
		}
		System.out.println();
	}
	
	static boolean isPalindrome(String s) {
		char[] c=s.toCharArray();
		int i=0,j=c.length-1;
		while(i<=j) {
			if(c[i]!=c[j]) return false;
			i++;
			j--;
		}
		return true;
	}
	
	static void upperToLower(String s) {
		String temp="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='a' && c<='z') {
				temp+=(char)(c-32);
			}
			else if(c>='A' && c<='z') {
				temp+=(char)(c+32);
			}
			else temp+=c;
		}
		System.out.println(temp);
	}
	
	static void characterCount(String s) {
		int alphabet=0,numeric=0,specialCharacter=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='a' && c<='z') alphabet++;
			else if(c>='A' && c<='Z') alphabet++;
			else if(c>='0' && c<='9') numeric++;
			else specialCharacter++;
		}
		System.out.println(alphabet+" "+numeric+" "+specialCharacter);
	}
	
	static void removeDuplicate(String s) {
		String temp="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(temp.indexOf(c)==-1) temp+=c;
		}
		System.out.println(temp);
	}
	
	static void countVowelConsonants(String s) {
		int vowel=0,consonant=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='a' || c=='e' ||c=='i'||c=='o'||c=='u') vowel++;
			else consonant++;
		}
		System.out.println(vowel+" "+consonant);
	}
	
	static void sumOfAllNumerics(String s) {
		int sum=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='0' && c<='9') {
				sum+=(c-48);
			}
		}
		System.out.println(sum);
	}
	
	static void occurance(String s,char c) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch==c) count++;
		}
		System.out.println(count);
	}
	
	static void occurance(String s) {
		while(s.length()>0) {
			char c=s.charAt(0);
			String s1=s.replace(c+"", "");
			int count=s.length()-s1.length();
			System.out.println(c+"-"+count);
			s=s1;
		}
	}
	
	static boolean isAnagram(String s1,String s2) {
//		while(true) {
//			if(s1.length() != s2.length()) return false;
//			else if(s1.length()==0 && s2.length()==0) return true;
//			char c=s1.charAt(0);
//			s1=s1.replace(c+"", "");
//			s2=s2.replace(c+"", "");
//		}
		char[] c1=s1.toCharArray();
		char[] c2=s1.toCharArray();
		if(c1.length!=c2.length) return false;
		for(int i=0;i<c1.length;i++) {
			if(c1[i]==c2[i]) return true;
		}
		return false;
	}
	
	static void reverseWord(String s) {
		String s1="";
		String[] a=s.split(" ");
		for(int i=a.length-1;i>=0;i--) {
			s1+=a[i]+" ";
		}
		System.out.println(s1.trim());
		
	}
	
	static void sentenceReverse(String s) {
		String s1="";
		String[] a=s.split(" ");
		for(int i=0;i<a.length;i++) {
			s1+=rev(a[i])+" ";
		}
		System.out.println(s1.trim());
	}
	static String rev(String s) {
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			s1+=s.charAt(i);
		}
		return s1;
	}
	
	static boolean isPanagram(String s) {
		for(char c='a';c<='z';c++) {
			if(s.indexOf(c)==-1) return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		System.out.println(isPanagram("the quick brown fox jumps over the lazy dog"));
		sentenceReverse("java is easy");
//		System.out.println(rev("java is easy"));
	}

}
