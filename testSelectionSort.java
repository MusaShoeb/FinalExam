package testingpackage;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class testSelectionSort {
@Test
public void test() {
testPositive();
testNegative();
testMixed();

}
public testSelectionSort() {
}
public void testPositive(){
int[] arr = new int[5]; 
arr[0] = 6;
arr[1] = 5;
arr[2] = 7;
arr[3] = 1;
arr[4] = 8;
int[] Sortedarr = new int[5];
Sortedarr[0] = 1;
Sortedarr[1] = 5;
Sortedarr[2] = 6;
Sortedarr[3] = 7;
Sortedarr[4] = 8;
SelectionSort object = new SelectionSort();
object.selectionSort(arr);
assertArrayEquals(arr,Sortedarr);
}
public void testNegative(){
	int[] arrNegative = new int[5];
	arrNegative[0] = -1;
	arrNegative[1] = -2;
	arrNegative[2] = -3;
	arrNegative[3] = -4;
	arrNegative[4] = -5;
	int[] SortedarrNegative = new int[5];
	SortedarrNegative[0] = -5;
	SortedarrNegative[1] = -4;
	SortedarrNegative[2] = -3;
	SortedarrNegative[3] = -2;
	SortedarrNegative[4] =  -1;
	SelectionSort object = new SelectionSort();
	object.selectionSort(arrNegative); 
	assertArrayEquals(arrNegative,SortedarrNegative);
}
public void testMixed(){
	int[] arrMixed = new int[5];
	arrMixed[0] = 11;
	arrMixed[1] = -7;
	arrMixed[2] = 5;
	arrMixed[3] =  4;
	arrMixed[4] = 2;
	int[] SortedarrMixed = new int[5];
	SortedarrMixed[0] = -7;
	SortedarrMixed[1] = 2;
	SortedarrMixed[2] = 4;
	SortedarrMixed[3] = 5;
	SortedarrMixed[4] = 11;
	SelectionSort object = new SelectionSort();
	object.selectionSort(arrMixed);
	assertArrayEquals(arrMixed,SortedarrMixed);
}

}
