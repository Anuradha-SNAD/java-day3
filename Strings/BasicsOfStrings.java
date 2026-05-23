package org.snad.Strings;

public class BasicsOfStrings {
	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println(s);
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
//			System.out.print(ch+ " ");
		}
		//methods
		System.out.println("Length : "+ s.length());
		System.out.println("chatAt(0) : "+s.charAt(0));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println("Contains : "+s.contains("World"));
		System.out.println(s.startsWith("W"));
		System.out.println(s.indexOf("o"));
		System.out.println(s.substring(7));
		System.out.println("Replace :"+s.replace("Hello World", "Hi Java"));
		System.out.println(s.equals("Hi"));
		System.out.println(s.equalsIgnoreCase("s"));
		System.out.println(s.concat(" Code"));
		System.out.println(s.trim());
		System.out.println(s.isEmpty());
		
		
	}

}
