package soal1;

import java.util.Scanner;

public class PenyelesaianSoal1 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Input one line of words(S): ");
	String str = input.nextLine();
	str = str.replaceAll("\\s+","");
	String resultVokal = pisahVokal(str);
	String resultKonsonan = pisahKonsonan(str);
	System.out.println("Karakter Vokal: ");
	System.out.println(resultVokal);
	System.out.println("Karakter Konsonan: ");
	System.out.println(resultKonsonan.toLowerCase());
	System.out.println();
	input.close();
}

public static String pisahVokal(String str) {
	String vok="";
	String kons="";
	for(int i=0;i<str.length();i++){
		boolean check=vokal(str.charAt(i));
		if(check){
			vok=vok+str.charAt(i);
		}
		else{
			kons=kons+str.charAt(i);
		}
	}
	return vok;
}

public static String pisahKonsonan(String str) {
	String vok="";
	String kons="";
	
	for(int i=0;i<str.length();i++){
		boolean check=vokal(str.charAt(i));
		if(check){
			vok=vok+str.charAt(i);
		}
		else{
			kons=kons+str.charAt(i);
		}
	}
	return kons;
}
public static boolean vokal(char ch){
	String s="aeiouAEIOU";
	for(int i=0;i<s.length();i++){
		if(s.charAt(i)==ch){
			return true;
		}
	}
	return false;
}
}
