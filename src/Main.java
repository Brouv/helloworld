public class Main{

    public static void main(String[] args) {
        Author dmitriy = new Author("Глуховский", "Дмитрий");
        System.out.println(dmitriy);

        Author nikolas = new Author("Доменг", "Николя");
        System.out.println(nikolas);

        Book metro2033 = new Book("Метро 2033", dmitriy, 2010);
        System.out.println(metro2033);

        Book massEffect = new Book("Mass Effect. Восхождение к звёздам",nikolas, 2007);
        System.out.println(massEffect);
        massEffect.setReleaseBook(2020);
        System.out.println("Год выпуска книги - Mass Effect. Восхождение к звёздам. - изменён на - " + massEffect.getReleaseBook());


    }
}
