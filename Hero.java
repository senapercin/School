package game;

public class Hero extends Game implements Runnable{	
private int hp;
private int attack;
private int position=0;
private boolean alive=true;
private int movement=1;

public int getHp() {
	return hp;
}

public int setHp(int decreaseHp) {
	hp=hp - decreaseHp;
	if(hp < 0)
		setAlive(false);
	System.out.println("Hero is died");
	return decreaseHp;
}

public int getAttack() {
	return attack;
}

public void setAttack(int attack) {
	this.attack = attack;
}

public int getPosition() {
	return position;
}

public void setPosition(int position) {
	this.position = position;
}

public boolean isAlive() {
	return alive;
}

public void setAlive(boolean alive) {
	this.alive = alive;
}

public int getMovement() {
	return movement;
}

public void setMovement(int movement) {
	this.movement = movement;
}

@Override
public void run() {
	// TODO Auto-generated method stub
	
}

}