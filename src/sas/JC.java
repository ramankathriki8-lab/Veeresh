package sas;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class JC {
	public static void main(String[] args) {

		int[] arr = { 5, 2, 9, 1, 6 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
