
package view;


public abstract class Menu {
    protected String title;

    public Menu(String title) {
        this.title = title;
    }
    public void display() {
        System.out.println(title);
    }
    public abstract void execute();
    public void run() {
        execute();
    }
    
}