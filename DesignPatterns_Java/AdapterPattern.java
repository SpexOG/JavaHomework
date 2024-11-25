package DesignPatterns_Java;

interface FileFormat {

    void convertTo(String format);
    String getContent();

}

public class AdapterPattern {

    public static void main(String[] args) {

        PDF pdf = new PDF("Acesta este un PDF!");
        Word word = new Word("Acesta este un Word!");
        PlainText plainText = new PlainText("Acesta este un Text simplu!");

        FileFormat pdfAdapter = new PDFAdapter(pdf);
        FileFormat wordAdapter = new WORDAdapter(word);
        FileFormat textAdapter = new TextAdapter(plainText);

        pdfAdapter.convertTo("word");
        wordAdapter.convertTo("text");
        textAdapter.convertTo("pdf");

        System.out.println("PDF Content: " + pdfAdapter.getContent());
        System.out.println("Word Content: " + wordAdapter.getContent());
        System.out.println("Text Content: " + textAdapter.getContent());

    }

}

class PDF{

    private String content;

    public PDF(String content){

        this.content=content;

    }

    public void convertToWord(){
        System.out.println("PDF content converted to Word");
    }

    public void convertToText(){
        System.out.println("PDF content converted to Plain Text");
    }

    public String getContent(){
        return content;
    }

}

class Word{

    private String content;

    public Word(String content){

        this.content=content;

    }

    public void convertToPDF(){
        System.out.println("Word content converted to PDF");
    }

    public void convertToText(){
        System.out.println("Word content converted to Plain Text");
    }

    public String getContent(){
        return content;
    }

}

class PlainText{

    private String content;

    public PlainText(String content){

        this.content=content;

    }

    public void convertToPDF(){
        System.out.println("Plain text content converted to PDF");
    }

    public void convertToText(){
        System.out.println("Plain text content converted to Word");
    }

    public String getContent(){
        return content;
    }

}

class PDFAdapter implements FileFormat{

    private PDF pdf;

    public PDFAdapter(PDF pdf){
        this.pdf = pdf;
    }

    @Override
    public void convertTo(String format){
        switch (format.toLowerCase()){
            case "word" -> pdf.convertToWord();
            case "text" -> pdf.convertToText();
            default -> System.out.println("Unsupported format for PDF.");
        }
    }

    @Override
    public String getContent(){
        return pdf.getContent();
    }

}

class WORDAdapter implements FileFormat{

    private Word word;

    public WORDAdapter(Word word){
        this.word = word;
    }

    @Override
    public void convertTo(String format){
        switch (format.toLowerCase()){
            case "pdf" -> word.convertToPDF();
            case "text" -> word.convertToText();
            default -> System.out.println("Unsupported format for Word.");
        }
    }

    @Override
    public String getContent(){
        return word.getContent();
    }

}

class TextAdapter implements FileFormat{

    private PlainText plainText;

    public TextAdapter(PlainText plainText){
        this.plainText = plainText;
    }

    @Override
    public void convertTo(String format){
        switch (format.toLowerCase()){
            case "pdf" -> plainText.convertToPDF();
            case "word" -> plainText.convertToText();
            default -> System.out.println("Unsupported format for Plain Text.");
        }
    }

    @Override
    public String getContent(){
        return plainText.getContent();
    }

}