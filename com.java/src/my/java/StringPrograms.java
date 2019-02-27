package my.java;

public class StringPrograms {

	void duplicateString() {
	String str ="diiyuyuhhbhgtt";
	int count =0;
	char [] ch =str.toCharArray();
	for(int i =0;i<=str.length();i++) {
		for(int j =0;j<str.length();j++) {
			if(ch[i]==ch[j]) {
				System.out.println(ch[j]);
				count++;
				break;
			}
		}}}
		
	
	void spliting() {
		String str1 ="i love you kannaiah";
		String [] sp=str1.split("\\s");
		for(String s:sp) {
			System.out.println(s);
		}
		
	}
	void swaping() {
		String str2 ="i love you kannaiah";
		String [] sp1=str2.split("\\s");
		String sr = "";
		for(String s1:sp1) {
			sr=s1+""+sr;
			System.out.println(sr);
	}}
	void revers() {
		String str4 ="i love you kannaiah";
		String [] sp3=str4.split("\\s");
		for(String s6:sp3) {
			System.out.println(s6);
		
		StringBuffer sb = new StringBuffer(s6);
		sb.reverse();
		System.out.println(sb);
		
		}
	}
	void numberSapreter() {
		String str3 ="divya123swamy";
		
		String s4=str3.replace("[^0-9]", "");
		System.out.println(s4);

	
	
	}
	public static void main(String[] args) {
	
		StringPrograms sp = new StringPrograms();
		sp.duplicateString();
		sp.numberSapreter();
		sp.swaping();
		sp.spliting();
		sp.revers();
	}

}
