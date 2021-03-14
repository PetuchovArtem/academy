package by.academy.homework.hw6;

//Прочесть информацию введеную из клавиатури и записать в созданный 
//вами txt файл, если введена "stop" строка тогда 
//закончить запись в файл.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) throws IOException {

		System.out.println("Введите текст. Для окончания ввода введите stop");
		Scanner console = new Scanner(System.in);
		File file = new File("Task1.txt");
		file.createNewFile();
		try (FileWriter writer = new FileWriter(file)) {
			boolean flag = true;
			while (flag == true) {
				String text = console.next();
				if (!"stop".equals(text)) {
					writer.write(text + " ");
				} else {
					flag = false;
					System.out.println("Ввод текста завершен");
				}
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		console.close();
	}
}