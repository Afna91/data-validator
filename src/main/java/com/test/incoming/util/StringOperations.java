package com.test.incoming.util;

import org.springframework.stereotype.Component;

@Component
public class StringOperations {
	public String findDuplicate(String input) {
		StringBuffer strBuffer = new StringBuffer();

		char[] inp = input.toCharArray();
		for (int i = 0; i < input.length(); i++) {
			for (int j = i + 1; j < input.length(); j++) {
				if (inp[i] == inp[j]) {
					if (!(ifCharacterExist(strBuffer.toString(), inp[j]))) {
						strBuffer.append(inp[j]);
					}

				}
			}
		}
		return strBuffer.toString();

	}

	public String removeWhiteSpace(String input) {
		StringBuffer strBuffer = new StringBuffer();
		String str = input;
		char[] inp = str.toCharArray();
		for (char ch : inp) {
			if (!(ch == ' ')) {
				strBuffer.append(ch);
			}

		}

		return strBuffer.toString();

	}

	public Boolean ifCharacterExist(String string, Character c) {

		String str = string;
		char[] inp = str.toCharArray();
		for (char ch : inp) {
			if ((ch == c)) {
				return true;
			}

		}

		return false;

	}
}
