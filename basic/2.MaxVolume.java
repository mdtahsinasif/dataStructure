package com.algo.practice.july.basic;

import java.util.Random;

public class MaxVolume {
	
	
	// tc = o(n^2)
	// sc = o(1)
 	public static int findMaxVolume1(int[] in){
		
		int maxvol = Integer.MIN_VALUE;
		for(int i = 0 ; i< in.length ;++ i){
			for(int j = i+1; j< in.length; ++j){
				int volume = (j-i)*Math.min(in[i], in[j]);
				 maxvol = Math.max(maxvol, volume);
				
			}
		}
		
		return maxvol;
		
	}
	
	public static int findMaxVolume2(int[]in ){
		
		int maxVol = Integer.MAX_VALUE;
		int i = 0 , j = in.length -1;
		while(i<j){
			int volume = (j - i)* Math.min(in[i], in[j]);
			maxVol = Math.max(maxVol , volume);
			
			if(in[i]<in[j])
		    ++i;
			else if (in[j] < in[i])
			--j;	
			
			else{
				++i;
				--j;
			}
		}
		return maxVol;
	}

	public static void main(String[] args) {
		int in = Integer.parseInt(args[0]);
		int[] in1 = new int[in];
		Random r = new Random();
		for(int i =0 ;i<in1.length;++i){
			in1[i] = r.nextInt(in);
		}
		int result = findMaxVolume2(in1);
		System.out.println(result);
		
	}
}
