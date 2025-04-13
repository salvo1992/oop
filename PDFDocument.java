public class PDFDocument extends DocumentGenerator {
    @Override
    protected void openDocument() {
        System.out.println("Inizio del documento PDF.");
    }

    @Override
    protected void addTitle() {
        System.out.println("Titolo del documento PDF");
    }

    @Override
    protected void addContent() {
        System.out.println("Contenuto del documento in PDF.");
    }

    @Override
    protected void closeDocument() {
        System.out.println("Fine del documento PDF.");
    }
}
