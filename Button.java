public interface  Button {
    void render(); // Metodo per il rendering del bottone
    void onClick(); // Metodo per gestire il click del bottone
    
}
public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Windows button");
    }

    @Override
    public void onClick() {
        System.out.println("Windows button clicked");
    }
}
public class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering HTML button");
    }

    @Override
    public void onClick() {
        System.out.println("HTML button clicked");
    }
} 
 

public abstract class Dialog {
    abstract Button createButton(); // Factory method
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
        okButton.onClick();
    }
}
public class WindowsDialog extends Dialog {
    @Override
    Button createButton() {
        return new WindowsButton();
    }
}
public class HTMLDialog extends Dialog {
    @Override
    Button createButton() {
        return new HTMLButton();
    }
}

public class FactoryMethodExample {
    public static void main(String[] args) {
        Dialog dialog = new WindowsDialog(); // Cambia in HTMLDialog per testare l'altro tipo
        dialog.renderWindow();
    }
}