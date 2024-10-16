package TaleOfTwoBrothers.BattleSystem;

public interface Battle {
    int basic_attack(int damage);
    int skill(String skillName, int damage);
}
