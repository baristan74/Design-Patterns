package cretionalPatterns.factory.factoryExample1;

public class Main {
    public static void main(String[] args) {
        Fabrika fabrika = new Fabrika();
        Compressing rar = fabrika.dosyaTipi("rar");
        Compressing tar = fabrika.dosyaTipi("tar");
        Compressing zip = fabrika.dosyaTipi("zip");
        rar.compressThis();
        tar.compressThis();
        zip.compressThis();

        Compressing aaa = fabrika.dosyaTipi("aaa");
        aaa.compressThis();
    }
}
