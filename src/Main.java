public class Main{

    public static void main(String[] args) {
        Book metro2033 = new Book("Метро 2033", "Дмитрий Глуховский", 2010);
        System.out.println("Название книги - " + metro2033.getNameBook() + ". Автор - " + metro2033.getAuthorBook() + ". Выпуск книги - " + metro2033.getReleaseBook() + " год.");

        Book massEffect = new Book("Mass Effect. Восхождение к звёздам.", "Николя Доменг", 2007);
        System.out.println("Название книги - " + massEffect.getNameBook() + ". Автор - " + massEffect.getAuthorBook() + ". Выпуск книги - " + massEffect.getReleaseBook() + " год.");
        massEffect.setReleaseBook(2020);
        System.out.println("Год выпуска книги - Mass Effect. Восхождение к звёздам. - изменён на - " + massEffect.getReleaseBook());

        Author dmitriy = new Author("Глуховский", "Дмитрий");
        System.out.println("Автор - " + dmitriy.getName() + " " + dmitriy.getLastName() + ".");

        Author nikolas = new Author("Доменг", "Николя");
        System.out.println("Автор - " + nikolas.getName() + " " + nikolas.getLastName() + ".");
    }
}
