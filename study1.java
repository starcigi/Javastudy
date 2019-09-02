public class Hero{
    String name;
    float hp;
    float armor; //护甲
    int moveSpeed; //移动速度
    public static void main(string[] args) {
        Hero garen = new Hero();
        garen,name = "盖伦";
        garen.hp = 616.28f;
        garen.armor = 27.536f;
        garen.moveSpeed = 350;

        Hero temmo = new Hero();
        temmo,name = "提莫";
        temmo.hp = 383f;
        temmo.armor = 14f;
        temmo.moveSpeed = 330;
    }
}