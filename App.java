public class App{
    public static void main(String[] args) {
        DocumentGenerator HTMLDocument = new HTMLDocument(); 
        DocumentGenerator PDFDocument = new PDFDocument();
        System.out.println("Generazione di un documento HTML:");
        HTMLDocument.generateDocument();
        System.out.println("Generazione di un documento PDF:");
        PDFDocument.generateDocument();    
        
    }
}
