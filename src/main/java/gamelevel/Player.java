package gamelevel;

public class Player {

    /*
    BeginnerLevel blevel;
    AdvancedLevel alevel;
    SuperLevel slevel;
    이렇게 코딩을 하면 객체지향이 아님
    일일이 해줘야하니 불편함 상승
    */

    private PlayerLevel level;
    public Player() {
        level = new BeginnerLevel();
        level.showLevelMessage();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel( PlayerLevel level ) {
        this.level = level;
        level.showLevelMessage();
    }

    public void play(int count) {
        level.go(count);

    }

}
