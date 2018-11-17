package game;

public class Mutant extends Game implements Runnable{
	private int hp =00;
	private int attack=8;
	private int position;
	private boolean alive=true;

	public int getHp() {
		return hp;
	}

	public void setHp(int decreaseHp) {
		hp=hp - decreaseHp;
		if(hp < 0)
			alive = false;
		System.out.println("Mutant defeated by hero");
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
