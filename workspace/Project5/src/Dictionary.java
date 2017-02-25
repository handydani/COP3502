import java.io.File;
import java.util.*;
public class Dictionary 
{
	//completed [x] debugged[ ]
	private ArrayList<String> dictionary = new ArrayList<>();

	public int getVocabularySize()
	{
		//returns the number of words in the loaded dictionary
		return dictionary.size();
		
	}
	public boolean loadDictionaryFromFile(String filePath)
	{
		//will load the dictionary file based on filePath passed in
		//returns true if it's successful
		File dict = new File(filePath);
		
		Scanner dictScanner = null;
		
		try {
				dictScanner = new Scanner(dict);
		} catch(Exception e){
			return false;
		}
		
		while(dictScanner.hasNext())
		{
			dictionary.add(dictScanner.next());
		}
		
		dictScanner.close();
		
		return true;
		
	}
	public boolean isWord(String word)
	{
		//returns whether or not a word is in the dictionary
		boolean exists = false;

		//check if the word has a !?. etc...
//		if (word.contains("!") || word.contains(".") || word.contains(")") || word.contains("(") || word.contains(",") || word.contains("?"))
//		{
			// word = word.replace("!","");
			// word = word.replace(".", "");
			// word = word.replace(")", "");
			// word = word.replace("(", "");
			// word = word.replace(",", "");
			// word = word.replace("?", "");
			word = word.toLowerCase();
				
		for (int i = 0; i<getVocabularySize(); i++)
		{
			exists = dictionary.get(i).equalsIgnoreCase(word);
			if(exists == true)
			{
				return exists;
			}
		}
		return exists;
		
	}
}





