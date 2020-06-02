package service;

// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value

import service.FlamesCheckService;

// Create a class called FlamesCheckService
public class FlamesCheckService {
	public char findFlames(String name1, String name2) {
		StringBuffer str1 = new StringBuffer(name1);
		StringBuffer str2 = new StringBuffer(name2);
		int len1 = str1.length();
		int len2 = str2.length();
		P: for (int i = 0; i < len1; i++)// label
		{
			char a = str1.charAt(i);

			for (int j = 0; j < len2; j++) {
				char b = str2.charAt(j);
				if (a == b) {

					str1.deleteCharAt(i);
					str2.deleteCharAt(j);
					len1 = str1.length();
					len2 = str2.length();
					i = 0;
					j = 0;

				}
			}

		}

		int len = len1 + len2;
		StringBuffer str3 = new StringBuffer("flames");
		String str4 = new String();

		P: for (int i = 0; i < 5; i++) {
			int c = -1, d = 0, p = 0;

			for (int j = 1; j <= len; j++) {
				c++;
				d++;

				if (c > str3.length() - 1) {
					char e = str3.charAt(p);
					if (d == len) {
						str3.deleteCharAt(p);

						str4 = str3.substring(p, str3.length());

						str3.delete(p, str3.length());

						str3.insert(0, str4);

						break;
					} else {
						p++;
						if (p == str3.length()) {
							p = 0;
						}
					}
				} else {
					char e = str3.charAt(c);
					if (d == len) {
						str3.deleteCharAt(c);

						str4 = str3.substring(c, str3.length());

						str3.delete(c, str3.length());

						str3.insert(0, str4);

						break;
					}

				}

			}
		}

		char result = str3.charAt(0);
		return result;

	}

}
