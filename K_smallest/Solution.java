// K-smallest
//Inspired by  quickSort

import java.util.*;
class Solution{

	public int quickSort(ArrayList<Integer> arr, int k){
		int mid = arr.size()/2;
		ArrayList<Integer> leftArr = new ArrayList<>();
		ArrayList<Integer> rightArr = new ArrayList<>();

		for(int n : arr){
			if(n<arr.get(mid)) leftArr.add(n);
			if(n>arr.get(mid)) rightArr.add(n);
		}

		if(leftArr.size()==k) return arr.get(mid);
		else if(leftArr.size() > k) {


			return quickSort(leftArr,k);
		}
		else {

			return quickSort(rightArr, k-leftArr.size()-1);
		} 
	}

	public static void main(String[] args) {

		Solution s = new Solution();

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(43);
		arr.add(24);
		arr.add(25);
		arr.add(15);
		arr.add(6);
		arr.add(75);
		arr.add(57);
		arr.add(88);
		arr.add(13);

		int k = 4;
		int m =  s.quickSort(arr,k);
		System.out.println(m);
	}
}

