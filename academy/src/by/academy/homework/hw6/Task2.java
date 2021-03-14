package by.academy.homework.hw6;

//Создать новый файл result.txt. Программно считать файл с текстом, 
//удалить все пробелы и записать полученный текст в result.txt.
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {

	public static void main(String[] args) throws FileNotFoundException {

		// чтение из файла
		StringBuilder sb = new StringBuilder();
		File file = new File("Result.txt");
		try (FileWriter writer = new FileWriter(file); FileReader reader = new FileReader("Task2.txt")) {
			int flag;
			while ((flag = reader.read()) > -1) {
				if (' ' != ((char) flag)) {
					sb.append((char) flag);
				}
			}
			System.out.println("Файл Task2 прочтен");

			// создание и запись Result файла
			file.createNewFile();
			writer.write(sb.toString());
			System.out.println("Файл Result создан");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}