package tack3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        Art art = new Art("Art",50,new Books[]{new Books(1,"Лев Толстой","01.02.2010"),
                new Books(2,"Пушкин","11.06.1992"),new Books(3,"Лермантов","1.09.1981")});
        Legal legal = new Legal();
        Technical technical = new Technical();
        int point;
        System.out.println(art);
        do {
            System.out.println("-------------Добавить-------------------");
            System.out.println("1. Добавить в худ ");
            System.out.println("2. Добавить в тех ");
            System.out.println("3. Добавить в юр ");
            System.out.println("-------------Показать-------------------");
            System.out.println("4. Показать книги худ");
            System.out.println("5. Показать книги тех ");
            System.out.println("6. Показать книги юр ");
            System.out.println("--------------------------------------");
            System.out.println("7. Показать всю информацию худ ");
            System.out.println("8. Показать всю информацию тех ");
            System.out.println("9. Показать всю информацию юр ");
            System.out.println("---------------Поиск по названию группы--------------");
            System.out.println("10. Поиск в худ по автору");
            System.out.println("11. Поиск в тех по автору");
            System.out.println("12. Поиск в юр по автору");
            System.out.println("0. Завершено");
            point = scanner.nextInt();
            switch (point){
                case 1 : art.addBook(art.getBooks());
                    break;
                case 4 : art.showAllBooks(art.getBooks());
                    break;
                case 7 : art.informationAboutOtdel(art.getBooks());
                    break;
                case 10 :
                    System.out.print("Введите имя автора: ");
                    String nameThe = scanner.next();
                    art.foundBooks(art.getBooks(),nameThe);
                    break;
                case 11:
                    System.out.println(art.countOfBooks(art.getBooks()));
                    break;
            }
            System.out.println(art);
        }while (point != 0);
    }
}



