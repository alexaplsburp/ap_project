public class StickHero implements serializable{
    private Stick pole;
    private boolean isFlipped;
    private int score;
    private int cherries;
    private int PowerUp;
    private int positionX;

    public boolean onPillar(){
        return false;
    }

    public void flippedNTouchingPillar(boolean isFlipped, int positionX){

    }

    public void saveGame(){

    }
    public void useCherries(int cherries){

    }

    public void usePowerUp(int powerUp){

    }

    public Stick getPole() {
        return pole;
    }

    public void setPole(Stick pole) {
        this.pole = pole;
    }

    public boolean isFlipped() {
        return isFlipped;
    }

    public void setFlipped(boolean flipped) {
        isFlipped = flipped;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getCherries() {
        return cherries;
    }

    public void setCherries(int cherries) {
        this.cherries = cherries;
    }

    public int getPowerUp() {
        return PowerUp;
    }

    public void setPowerUp(int powerUp) {
        PowerUp = powerUp;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }
}
