package lesson19;

import java.util.Arrays;

import utils.Utils;

public class Work01 {

	public static void main(String[] args) {
		int[] array = Utils.randomArray(10);
		DefaultArray array1 = new DefaultArray(array);
		// ��������� ������
		array1.print(); 
		// ��������� �� �������� ����
		System.out.println(Arrays.toString(array1.array)); 
		// ��������� �� �������� ����
		System.out.println(Arrays.toString(array)); 

		DefaultArray array2 = new DefaultArray();
		// 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
		array2.print();
		// 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
		System.out.println(Arrays.toString(array2.array)); 
		// 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
		System.out.println(Arrays.toString(array2.defaultArray)); 
	}
}
