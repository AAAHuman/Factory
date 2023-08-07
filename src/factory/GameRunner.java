public class GameRunner {
    private GameConsole gameConsole;
    private String game;
    public GameRunner(String game){
        this.game = game;
        gameChecker().run();
    }
    private GameConsole gameChecker(){
        if(game.equalsIgnoreCase("MC")) return new MortalCombat();
        else if(game.equalsIgnoreCase("PM")) return new Pacman();
        else if(game.equalsIgnoreCase("SU")) return new SuperMario();
        else if(game.equalsIgnoreCase("SP")) return new SpiderMan();
        else System.out.println("Invalid input!!! But we run Mortal Combat by default"); return new MortalCombat();

    }
}
