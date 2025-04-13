public abstract class DocumentGenerator {
    public final void generateDocument() {
        openDocument();
        addTitle();
        addContent();
        closeDocument();
    }
    protected abstract void openDocument();
    protected abstract void addTitle(); 
    protected abstract void addContent();
    protected abstract void closeDocument();

}


