package singleton;

public enum GameEngineEnum {
    INSTANCE(100, 20);
    private int hp;
    private int exp;

    GameEngineEnum(int hp, int exp) {
        this.hp = hp;
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "GameEngineEnum{" +
                "hp=" + hp +
                ", exp=" + exp +
                '}';
    }
}
