package com.demo.general;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class BiggerIsGreater {

	static ArrayList<String> sortedOrderedlist;
	static ArrayList<String> list;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		String[] input = new String[testCases];

		for (int i = 0; i < testCases; i++) {
			input[i] = br.readLine();
		}

		sortedOrderedlist = new ArrayList<>(testCases);

		biggerIsGreater(input).forEach(System.out::println);

	}

	private static List<String> biggerIsGreater(String[] input) {

		sortedOrderedlist = new ArrayList<>();

		for (int i = 0; i < input.length; i++) {
			sortedOrderedlist.add(biggerString(input[i]));
		}

		return sortedOrderedlist;
	}

	private static String biggerString(String string) {
		list = new ArrayList<>();
		permute(string, 0, string.length() - 1);
		SortedSet<String> set = new TreeSet<String>(list);
		if (1 == set.size())
			return "no answer";

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			if (string.equals(iterator.next()) && iterator.hasNext()) {
				return iterator.next();
			}
		}

		return "no answer";
	}

	private static void permute(String str, int l, int r) {
		if (l == r)
			list.add(str);
		else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r);
				str = swap(str, l, i);
			}
		}
	}

	public static String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

}
