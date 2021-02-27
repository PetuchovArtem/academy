package by.academy.classwork.lesson14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		List<HeavyBox> arrayList = new ArrayList<>();

		HeavyBox box1 = new HeavyBox(1, 2, 3, 4);
		HeavyBox box2 = new HeavyBox(1, 2, 3, 4);
		HeavyBox box3 = new HeavyBox(1, 2, 3, 4);
		HeavyBox box4 = new HeavyBox(1, 2, 3, 4);

		arrayList.add(box1);
		arrayList.add(box2);
		arrayList.add(box3);
		arrayList.add(box4);

		for (HeavyBox a : arrayList) {
			System.out.println(a);
		}
		
		// в) Изменить вес первого ящика на 1.
		arrayList.get(0).setWeight(3);
		
		// г) Удалить последний ящик.
		arrayList.remove(arrayList.size() - 1);


		// д) Получить массив содержащий ящики из коллекции тремя способами и вывести на
		// консоль.
		
		
		Object[] objectArray = arrayList.toArray();
		System.out.println(Arrays.toString(objectArray));

		// 2 вариант
//		String[] stringArray1 = new String[arrayList.size()];
//		arrayList.toArray(stringArray1);
//		System.out.println(Arrays.toString(stringArray1));

		// 3 вариант
//		String[] stringArray2 = arrayList.toArray(new String[0]);
//		System.out.println(Arrays.toString(stringArray2));
		
		

		// е) Удалить все ящики.
		arrayList.clear();

//		3.	Создать TreeSet содержащий HeavyBox. HeavyBox должен реализовать интерфейс Comparable. 
//		Распечатать содержимое с помощью for each.
		
        TreeSet<HeavyBox> treeSet = new TreeSet<HeavyBox>();
		
	}

}
