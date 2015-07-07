/**
 * Created by Nin on 07/07/2015.
 */
public class Main {
    public static void main(String[] args) {
        //construct League
        League indonesia = new League("indonesia");
        League italy = new League("italy");

        //construct division
        Division LSI = new Division("Liga super indonesia",indonesia);
        Division CD = new Division("Championship Division",indonesia);
        Division serieA = new Division("Serie A",italy);
        Division serieB = new Division("Serie B",italy);

        //construct club
        Club arema = new Club("arema",LSI,indonesia);
        Club persiram = new Club("persiram",LSI,indonesia);
        Club pelita = new Club("pelita",CD,indonesia);
        Club persebaya = new Club("persebaya",CD,indonesia);
        Club juventus = new Club("Juventus",serieA,italy);
        Club acmilan = new Club("AC Milan",serieA,italy);
        Club vicenza = new Club("Vicenza",serieB,italy);
        Club modena =new Club("Modena", serieB,italy);

        indonesia.setDaftarDivisi(LSI);
        indonesia.setDaftarDivisi(CD);
        italy.setDaftarDivisi(serieA);
        italy.setDaftarDivisi(serieB);

        LSI.setDaftarClub(arema);
        LSI.setDaftarClub(persiram);
        CD.setDaftarClub(pelita);
        CD.setDaftarClub(persebaya);
        serieA.setDaftarClub(juventus);
        serieA.setDaftarClub(acmilan);
        serieB.setDaftarClub(vicenza);
        serieB.setDaftarClub(modena);

        //1 Get daftar divisi by nama liga
        System.out.println("1. Daftar nama divisi dengan nama Liga");
        System.out.println("Daftar divisi Liga indonesia");
        indonesia.getDaftarDivisi("indonesia");
        System.out.println();

        //2 Get Daftar Klub by nama liga
        System.out.println("2. Daftar Klub dengan nama Liga" );
        System.out.println("~~~Daftar nama Klub Liga indonesia~~~");
        LSI.getDaftarClubLeague("indonesia");

        System.out.println("~~~Daftar nama Klub Liga italy~~~");
        serieA.getDaftarClubLeague("italy");
        System.out.println();


        //3 Get Daftar Klub by nama Divisi
        System.out.println("3. Daftar Klub dengan nama Divisi");
        System.out.println("Daftar nama Klub Divisi Championship Division");
        CD.getDaftarClubDivision("Championship Division");
        System.out.println("Daftar nama Klub Divisi Serie B");
        serieB.getDaftarClubDivision("Serie B");
        System.out.println();

        //4  Get Klub ini berada di divisi mana by nama Klub
        System.out.println("4. Nama Divisi berdasarkan nama Klub");
        System.out.print("Klub persiram berada di divisi :");
        persiram.getDivision("persiram");
        System.out.print("Klub Vicenza berada di divisi :");
        vicenza.getDivision("Vicenza");
        System.out.println();

        //5 Get Klub ini berada di liga apa by nama Klub
        System.out.println("5. Nama Liga berdasarkan nama Klub");
        System.out.print("Klub persebaya berada di Liga ");
        persebaya.getLeague("persebaya");
        System.out.print("Klub Modena berada di Liga ");
        modena.getLeague("Modena");




    }

}


