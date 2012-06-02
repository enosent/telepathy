package quize.number04;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import org.junit.Test;

import quize.number04.ILhyunSpeakingInTongues;

public class ILhyunSpeakingInTonguesTest {

	@Test
	public void googlereseTest() throws Exception {
		String input = "";
		
		ILhyunSpeakingInTongues trans = new ILhyunSpeakingInTongues();
		
		input = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
		assertThat(trans.googlerese(input), is("our language is impossible to understand"));
		
		input = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
		assertThat(trans.googlerese(input), is("there are twenty six factorial possibilities"));
		
		input = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
		assertThat(trans.googlerese(input), is("so it is okay if you want to just give up"));
	}

	@Test
	public void solvedTest() throws Exception {
		ILhyunSpeakingInTongues trans = new ILhyunSpeakingInTongues();
		
		BufferedReader in = new BufferedReader(new FileReader("/Users/enosent7/eno-java/workspace/Test/telepathy/test/quize/number04/A-small-practice.in"));
		String input;
		int n = 0;
		String output = "";
		while ((input = in.readLine()) != null) {
			if(n > 0){
				output += "Case #" + n + ": " + trans.googlerese(input) + "\n";
			}
			n++;
		}
		in.close();
		
		System.out.println(output);
		
		BufferedWriter out = new BufferedWriter(new FileWriter("/Users/enosent7/eno-java/workspace/Test/telepathy/test/quize/number04/A-small-practice.out"));
		out.write(output);
		out.close();
	}
}
