import java.util.Random;

public abstract class Abstractrobot implements Attacked, Defenced{
    private int hitCount;
    public BodyPart attack(){
        BodyPart attackedBodyPart  = null;
        hitCount = new Random().nextInt(4)+1;
        if(hitCount == 1){
            attackedBodyPart = BodyPart.HEAD;
        }else if (hitCount ==2) {
            attackedBodyPart = BodyPart.CHEST;
        } else if (hitCount ==3){
                attackedBodyPart = BodyPart.ARM;
            }else{
            attackedBodyPart = BodyPart.LEG;

        }
        return attackedBodyPart;
    }
    public BodyPart defence(){
        BodyPart defencedBodyPart = null;
        hitCount = new Random().nextInt(4)+1;
        if(hitCount ==1) {
            defencedBodyPart = BodyPart.HEAD;
        }else if(hitCount ==2) {
            defencedBodyPart = BodyPart.CHEST;
        }else if (hitCount==3) {
            defencedBodyPart = BodyPart.ARM;
        }else{
            defencedBodyPart = BodyPart.LEG;

        }
        return defencedBodyPart;
    }
}
