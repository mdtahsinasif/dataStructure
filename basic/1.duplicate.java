package com.algo.practice.july.basic;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Random;

public class Duplicate {

	public static int findDuplicate1(int[] in1){
		
		
		for(int i = 0;i <in1.length; ++i ){
			for(int j =i+1 ;j <in1.length;++j){
				if(in1[i]==in1[j]) return in1[i];
			}
		}
		return -1;
		
	}
	
	public static int findDuplicate2(int[] in){
		HashSet<Integer> hset = new HashSet<Integer>();
		for(int i =0 ;i< in.length ;++i){
			if(hset.contains(in[i]))
				return in[i];
			hset.add(in[i]);
		}
		return -1;
		
	}
	
	public static int findDuplicate3(int[] in){
		
		BitSet bs = new BitSet(in.length);
		for(int i = 0; i< in.length;++i){
			if(bs.get(in[i])== true)
				return in[i];
			bs.set(in[i]);
		}
		return -1;
	}
	
	public static int findDuplicate4(int[] in){
		for(int i =0 ; i < in.length ; ++i){
			
			int ind = Math.abs(in[i]);
			if(in[ind] < 0)
				return ind;
			in[ind]*=-1;
			
			
		}
		
		return -1;
	}
	
	
	
	
	public static void main(String[] args) {
		
	//	int n = Integer.parseInt(args[0]);
		int[] in1 = {1,2,3,4,5,6,6};
		
		int res = findDuplicate4(in1);
		System.out.println(res);
		
	}
}
