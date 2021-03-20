package by.academy.homework.hw7;

import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Не использовать циклы (for/while/do-while). Сгенерировать 100 рандомных 
//Long чисел в диапазоне от 0 до 100. Каждое число умножить на PI и отнять 20. 
//Отфильтровать, оставив числа меньшие 100. Отсортировать по возрастанию. 
//Пропустив первые 3 числа произвести следующие операции:
//Преобразовать лист чисел в Map (операция collect), где ключем является 
//само число а значением строка: ("Number: " + value).

public class task1 {

	public static void main(String... args) {

		Map<Double, String> map  = Stream.generate(() -> new Random().nextInt(100)).limit(100).sorted().map(m -> m * Math.PI - 20).
		filter(m -> m < 100).skip(3).distinct().collect(Collectors.toMap(m -> m, m -> "Number: " + m));
		
		System.out.println(map);
		
	}

}
