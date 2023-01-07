public class Main {
    public static void main(String[] args) {
        //Дан массив пар названий книг и авторов, необходимо привести каждую пару в строку вида: «Название книги» и Автора.

        Book book1 = new Book(" Александр ", " Сергеевич ", " Пушкин ", " Сказка о Царе Султане ");
        Book book2 = new Book(" Лев ", " Николаевич ", " Толстой ", " Война и мир ");
        System.out.println(book1);
        System.out.println(book2);


    }
}