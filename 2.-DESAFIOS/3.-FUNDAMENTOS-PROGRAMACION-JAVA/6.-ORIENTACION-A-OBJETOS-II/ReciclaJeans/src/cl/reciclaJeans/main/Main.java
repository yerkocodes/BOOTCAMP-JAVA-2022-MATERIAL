package cl.reciclaJeans.main;

import cl.reciclaJeans.views.Menu;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        try {
            menu.ejecutarMenu();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
