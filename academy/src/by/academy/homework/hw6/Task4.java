package by.academy.homework.hw6;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Создайте каталог(папку). Создайте в папке 100 txt файлов 
//(Например, 1.txt, 2.txt ... 100.txt). Считываем текст из 2-ого задания, 
//получаем его длинну (576 символов). Для каждого файла генерируем рандомное 
//число от 0 до 576, достаем из текста (из 2 задания) такое-же количество 
//символов (string.substring()) и сохраняем в наш файл. Создайте файл result.txt 
//и запишите туда список всех файлов и их размеры.
public class Task4 {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		// создаем каталог
		File dir = new File("task4");
		if (!dir.exists()) {
			dir.mkdir();
		}
		// создаем 100 файлов
		for (int i = 1; i < 101; i++) {
			int k = (int) (Math.random() * sb.length());
			File file = new File(dir, i + ".txt");

			// считываем файл 2 задания
			try (FileReader reader = new FileReader("Task2.txt")) {
				int c;
				while ((c = reader.read()) != -1) {
					sb.append((char) c);
				}

			} catch (IOException e) {
				System.out.println(e.getMessage());
			}

			// записываем файл
			try (FileWriter writer = new FileWriter(file)) {
				file.createNewFile();
				writer.write(sb.substring(0, k));
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}

		// запись файлов и их размеров файл
		File file = new File("result2.txt");
		try (FileWriter writer = new FileWriter(file)) {
			for (File f : dir.listFiles()) {
				writer.append(f.getName() + " " + f.length() + "\n");
			}
			System.out.println("Запись завершена");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
