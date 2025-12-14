import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите вариант распределения дежурств 1 2: ");
		int a = sc.nextInt();
		
		int size_stud = 20;
		int size_day = 30;
		
		String[] name = {
			"Луньков Никита Сергеевич",	
			"Зератул",
			"Тассадар",
			"Кериган",
			"Джим Рейнор",
			"Арктур Менгск",
			"Король-лич",
			"Иллидан Ярость Бури",
			"Малфурион Ярость Бури",
			"Сильвана Ветрокрылая",
			"Громмаш Адский Крик",
			"Тралл",
			"Смертокрыл",
			"Медив",
			"Андуин",
			"Вариан Ринн",
			"Генда Икари",
			"Аянами Рей",
			"Лелуш Ламреруш",
			"Райнхард фон-Лоенграмм"
		};
		int[] day = new int[size_day];
		
		if(a == 1) {
			for(int i = 0; i < size_stud;i++) {
				day[i] = i%20;
			}
			
			
			
			
			
		}else {
			// хз на сделать рандом чтобы все были
			
			
			
		}
		
		
		
		
		System.out.print("                        |");
		for(int i = 1;i<size_day;i++) {
			System.out.printf("%1$-2",i);
		}
		System.out.println();
		for(int i = 0;i<size_stud;i++) {
			System.out.printf("%1$24s|" , name[i]);
			for(int j = 0;j<size_day;j++) {
				System.out.print(((day[j] == i)? "X" : "0")  + " |");
			}
		}


}
}
