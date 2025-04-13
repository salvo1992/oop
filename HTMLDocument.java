
public class HTMLDocument extends DocumentGenerator {
    @Override
    protected void openDocument() {
        System.out.println("<html>");
    }

    @Override
    protected void addTitle() {
        System.out.println("<h1>Titolo del documento</h1>");
    }

    @Override
    protected void addContent() {
        System.out.println("<p>Contenuto del documento in HTML.</p>");
    }

    @Override
    protected void closeDocument() {
        System.out.println("</html>");
    }
}
