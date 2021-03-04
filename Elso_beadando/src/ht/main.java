package ht;

import java.io.*;
import java.util.*;


public class main {
    public static List<Character> 
    convertStringToCharList(String str) 
    { 
        List<Character> chars = new ArrayList<>(); 
  
        for (char ch : str.toCharArray()) {   
            chars.add(ch); 
        } 
        return chars; 
    } 

	public static void main(String[] args) throws IOException {
		
		List<Character> abc = Arrays.asList('a', 'A', 'b', 'B', 'c', 'C', 'd', 'D', 'e', 'E', 'f', 'F', 'g', 'G',
				'h', 'H', 'i', 'I', 'j', 'J', 'k', 'K', 'l', 'L', 'm', 'M', 
				'n', 'N', 'o', 'O', 'p', 'P', 'q', 'Q', 'r', 'R', 's', 'S', 
				't', 'T', 'u', 'C', 'v', 'V', 'w', 'W', 'x', 'X', 'y', 'Y', 'z', 'Z'); 
		
		BufferedReader br = new BufferedReader(new FileReader("input\\szoveg.txt"));
		PrintWriter pw = new PrintWriter("output/titkositott.txt");
		
		String text = br.readLine();
		
		List<Character> chars = new ArrayList<>(); 
		chars = convertStringToCharList(text); 
		
		
		for (int i = 0; i < chars.size(); i++) {
			if (chars.get(i) == ' ') {
				pw.print(' ');
			}
			else {
				for (int j = 0; j < abc.size(); j++) {
					if (chars.get(i) == abc.get(j)) {
						if (j == abc.size()-2) {
							pw.print(abc.get(0));
							break;
						}
						else if (j == abc.size()-1) {
							pw.print(abc.get(1));
							break;
						}
						else {
							pw.print(abc.get(j+2));
							break;
						}
						
					}
				}
			}
		}
		pw.flush();
		pw.close();
		br.close();

	}

}
