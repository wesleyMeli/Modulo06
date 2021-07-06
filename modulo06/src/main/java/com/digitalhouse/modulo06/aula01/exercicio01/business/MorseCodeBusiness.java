/**
 * author : Wesley F.
 * modulo : 6
 * name : web development with spring - Desenvolvimento web com Spring
 */
package com.digitalhouse.modulo06.aula01.exercicio01.business;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class MorseCodeBusiness {
	
	private static final String MORSE_CODE = "recursos/morseCode.txt";
	private static final String MORSE_SCAPE_WORDS = "   ";
	private static final String MORSE_SCAPE_WORDS_DECODE = " ";
	private static final String MORSE_SCAPE_CHARACTER = " ";
	private static final String MORSE_SCAPE_CHARACTER_DECODE = "";
	
	public String parseCodeOrDecode(String code, boolean isCode) {
		return codeDecode(getMapMorseCodeDecode(isCode), code.toUpperCase(), isCode);
	}
	
	private Map<String, String> getMapMorseCodeDecode(boolean isCode){
		Map<String, String> mapDecode = new HashMap<String, String>();
		List<String> result = new ArrayList<String>();
		try {
			result = Files.readAllLines(Paths.get(MORSE_CODE));
		} catch (IOException e) {}
		
		int key = isCode?0:1;
		int valueKey = isCode?1:0; 
		
		for (String line : result) {
			String[] value = line.split("   ");
			mapDecode.put(value[key], value[valueKey]);
		}
		return mapDecode;
		
	}
	
	
	private String codeDecode(Map<String, String> mapDecode, String code, boolean isCode) {
		String[] codeWords = isCode?code.split(MORSE_SCAPE_WORDS_DECODE):code.split(MORSE_SCAPE_WORDS);
		String textDecode = "";
		for(int i = 0; i < codeWords.length; i++) {
			String[] codeCharacter = isCode?codeWords[i].split(MORSE_SCAPE_CHARACTER_DECODE):codeWords[i].split(MORSE_SCAPE_CHARACTER);
			String character = "";
			for(int j = 0; j < codeCharacter.length; j++) {
				character = mapDecode.get(codeCharacter[j]);
			    if(character == null) continue;
				textDecode += mapDecode.get(codeCharacter[j])+
						(isCode?MORSE_SCAPE_CHARACTER:MORSE_SCAPE_CHARACTER_DECODE);
				
			}
			if(character == null) continue;
			textDecode += isCode?"<br>":" ";
		}
		return textDecode;
	}
	
}
