package cretionalPatterns.factory.factoryExample2;

public class Main {
    public static void main(String[] args) {

        OkumaFabrika okumaFabrika = new OkumaFabrika();
        YazmaFabrika yazmaFabrika = new YazmaFabrika();

        Okuma ylsx = okumaFabrika.okuyucu("YLSX");
        ylsx.okuma();
        Okuma ods = okumaFabrika.okuyucu("ODS");
        ods.okuma();

        Yazma json = yazmaFabrika.yazıcı("JSON");
        json.yazma();
        Yazma xml = yazmaFabrika.yazıcı("XML");
        xml.yazma();
    }
}
