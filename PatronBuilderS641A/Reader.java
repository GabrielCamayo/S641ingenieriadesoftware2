package PatronBuilderS641A;

public class Reader {
    //Atributos
    private String element;
    private Converter converter;

    //Metodo Constructor
    public Reader(String element, Converter converter){
        this.converter = converter;
        this.element = element;
    }

    //Metodos
    public void parseInput(){
        switch (element) {
            case "LINE":
                converter.makeLine();
                break;
            case "PARAGRAPH":
                converter.makeParagraph();
                break;
            case "TABLE":
                converter.makeTable();
                break;
            default:
            System.out.println("Opcion Invalida");
                break;
        }
    }

}
