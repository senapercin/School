package game;

public class ZombieDog extends Game implements Runnable{
	private int hp =75;
	private int attack=10;
	private int position;
	private boolean alive=true;

	public int getHp() {
		return hp;
	}

	public void setHp(int decreaseHp) {
		hp=hp - decreaseHp;
		if(hp < 0)
			alive = false;
		System.out.println("ZombieDog defeated by hero");
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
	this.attack=	attack;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
