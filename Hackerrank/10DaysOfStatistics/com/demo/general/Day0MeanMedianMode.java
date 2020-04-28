package com.demo.general;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Day0MeanMedianMode {

	static DecimalFormat df = new DecimalFormat("#.#");
	
	private static void mean(int[] elements, int noOfElements) {
		int sum = 0;
		for(int i=0;i<noOfElements;i++) {
			sum+=elements[i];
		}
		
		
		System.out.println(df.format((double)sum/noOfElements));

	}
	
	private static void median(int[] elements, int noOfElements) {
		
		//Sort array
		elements = bubbleSort(elements, noOfElements);
		
		if(noOfElements%2==0) {
			double median = ((double)elements[noOfElements/2]+(double)elements[(noOfElements-1)/2])/2;
			System.out.println(df.format(median));
		}else {
			System.out.println(df.format((double)elements[noOfElements/2]));
		}	
		
	}

	private static void mode(int[] elements, int noOfElements) {
		SortedMap<Integer, Integer> map = new TreeMap<>(new MyComparator());
		
		//Sort array
		elements = bubbleSort(elements, noOfElements);
		
		for(int i=0;i<noOfElements;i++) {
			if(!map.containsKey(elements[i])) {
				map.put(elements[i], 1);
			}else {
				int value = map.get(elements[i]);
				map.put(elements[i], ++value);
			}
		}
		int mode = 0;
		int count = 0;
		
		Set<Entry<Integer, Integer>> set  = map.entrySet();
		Iterator<Entry<Integer, Integer>> itr = set.iterator();
		while(itr.hasNext()) {
			Entry<Integer, Integer> entry = itr.next();
			int key = entry.getKey();
			int value = entry.getValue();
			if(value>count) {
				mode = key;
				count = value;
			}
		}
		
		System.out.println(mode);
		
	}
	
	//bubbleSort
	private static int[] bubbleSort(int[] elements, int noOfElements) {
		int temp;
		for(int i=0;i<noOfElements;i++) {
			for(int j=0;j<noOfElements-1;j++) {
				if(elements[j]>elements[j+1]) {
					temp = elements[j];
					elements[j] = elements[j+1];
					elements[j+1] = temp;
				}
			}
		}
		return elements;
	}
	
	
	public static void main(String[] args) {
		FastReader fr = new FastReader();
		int noOfElements = fr.nextInt();
		int[] elements = new int[noOfElements];
		for (int i = 0; i < noOfElements; i++) {
			elements[i] = fr.nextInt();
		}
		mean(elements, noOfElements);
		median(elements, noOfElements);
		mode(elements, noOfElements);
	}


	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

}

class MyComparator implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		Integer a = (Integer) o1;
		Integer b = (Integer) o2;
		return a.compareTo(b);
	}
		
}

