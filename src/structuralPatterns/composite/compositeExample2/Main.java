package structuralPatterns.composite.compositeExample2;

public class Main {
    public static void main(String[] args) {

        CompositeSoldier generalCagatay= new CompositeSoldier("General1",Rank.General);

        generalCagatay.addSoldier(new PrimitiveSoldier("Albay1",Rank.Albay));

        CompositeSoldier albayNavi = new CompositeSoldier("AlbayNavi", Rank.Albay);
        CompositeSoldier teğmenZing = new CompositeSoldier("TeğmenZing",Rank.Teğmen);

        albayNavi.addSoldier(new PrimitiveSoldier("TeğmenKişi ", Rank.Teğmen));
        teğmenZing.addSoldier(new PrimitiveSoldier("AskerKişi",Rank.Asker));


        generalCagatay.addSoldier(albayNavi);
        generalCagatay.ExecuteOrder();




    }
}
