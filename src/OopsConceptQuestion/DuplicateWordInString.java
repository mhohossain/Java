package OopsConceptQuestion;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordInString {
	//Hey java is java best launguage is java
			//java=3
			//is=2
	public static void main(String[] args) {
		
		findDuplicateWords("Hey java is java best launguage is java");
		findDuplicateWords("Hey python is not java but best launguage is python not java");
		findDuplicateWords("hi hi hi hi");
		findDuplicateWords("100 100 200 100 200");
	}
	public static void findDuplicateWords(String inputString) {
		//Split
		String words [] = inputString.split(" ");
		//create one HashMap
		Map<String, Integer> wordcount = new HashMap<String, Integer>();
		//to cheek each word in given Array:
		for(String word: words) {
			//cheek if word is present
			if(wordcount.containsKey(word)) {
				wordcount.put(word.toLowerCase(), wordcount.get(word)+1);				
			}else {
				wordcount.put(word, 1);
			}
		}
		//extracting all the keys of map :wordcount
		Set<String> wordsInString = wordcount.keySet();
		//loop through all the words is wordcount
		for(String word: wordsInString) {
			if(wordcount.get(word)>1) {
				System.out.println(word + " : "+wordcount.get(word));
			}
		}
	}
}
