import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Book knyga1 = new Book();
        knyga1.setTitle("Pasaku knyga");
        knyga1.setPages(328);
        knyga1.setReleaseYear(2023);

        Book knyga2 = new Book();
        knyga2.setTitle("Receptu knyga");
        knyga2.setPages(320);
        knyga2.setReleaseYear(2021);

        Book knyga3 = new Book();
        knyga3.setTitle("Pratimu knyga");
        knyga3.setPages(50);
        knyga3.setReleaseYear(2000);

        Book knyga4 = new Book("Javu laukas", 345, 2005 );
        Book knyga5 = new Book("Grybu karas", 50, 1950);
        Book knyga6 = new Book("Ketvirtoji pramones revoliucija", 300, 2014);

        ArrayList<Book>knygos = new ArrayList<>();
        knygos.add(knyga1);
        knygos.add(knyga2);
        knygos.add(knyga3);
        knygos.add(knyga4);
        knygos.add(knyga5);
        knygos.add(knyga6);
        for (int i = 0; i < knygos.size(); i++) {
            System.out.println(knygos.get(i).getTitle() + " " + knygos.get(i).getPages() + " " + knygos.get(i).getReleaseYear());
        }


        System.out.println("<Augalai>");

        Plant plant1 = new Plant();
        plant1.setName("Kukmedis");
        plant1.setNameLot("Taxus");
        plant1.setOneYear(false);
        plant1.setMainLand("Lietuva");
        plant1.setHeight(40);
        plant1.setEatable(false);

        Plant plant2 = new Plant();
        plant2.setName("Petunija");
        plant2.setNameLot("Petunia");
        plant2.setOneYear(true);
        plant2.setMainLand("Lietuva");
        plant2.setHeight(1);
        plant2.setEatable(false);

        Plant plant3 = new Plant("Juodoji pusis", "Pinus nigra", false, "Pietu Europa", 50, false);
        Plant plant4 = new Plant("Rapsas", "Brassica napus", true, "nezinoma", 1, true);

        ArrayList<Plant>augalai = new ArrayList<>();
        augalai.add(plant1);
        augalai.add(plant2);
        augalai.add(plant3);
        augalai.add(plant4);

        for (Plant augalas : augalai) {
            System.out.println(augalas);

        }












    }
}