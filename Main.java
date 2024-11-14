//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Gamer[] gamer = new Gamer[5];
    gamer[0] = new Gamer("Игрок.1", true);
    gamer[1] = new Gamer("Игрок.2", false);
    gamer[2] = new Gamer("Игрок.3", true);
    gamer[3] = new Gamer("Игрок.4", false);
    gamer[4] = new Gamer("Игрок.5", true);


    for (int i=0; i<=4; i++){
        if (gamer[i].getisActive() == true){  // Хочешь задать параметр это setter,
            System.out.println(gamer[i].getNickname()); // а анализировать параметр это getter!!!!!
        }
    }

}
}