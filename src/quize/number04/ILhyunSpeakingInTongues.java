package quize.number04;

public class ILhyunSpeakingInTongues{

	public String googlerese(String input){
		String output="";
		
		int inputLength=input.length();
		
		char[]inputArr=new char[inputLength];
		
		inputArr=input.toCharArray();
		
		for(int i=0; i < inputLength;i++){
			char temp=inputArr[i];
			
			if((int)temp != 32) output += translate(temp);
			else output += " ";
		}

		return output;
	}
	
	private char translate(char word){
		char[] key = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] value = new char[]{'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
		
		int index = 0;
		for(int i = 0; i < key.length; i++){
			if(key[i]== word) index = i;
		}
		
		return value[index];
	}
}
