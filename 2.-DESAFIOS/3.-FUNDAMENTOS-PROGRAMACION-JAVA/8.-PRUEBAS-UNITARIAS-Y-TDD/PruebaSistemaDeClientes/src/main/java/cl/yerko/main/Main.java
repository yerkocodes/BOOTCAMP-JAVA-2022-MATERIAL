package cl.yerko.main;

import cl.yerko.views.Menu;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        try {
            menu.iniciarMenu();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
