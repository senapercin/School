package game;

public class Lion extends Game implements Runnable{
	private int hp =300;
	private int attack=7;
	private int position;
	private boolean alive=true;

	public int getHp() {
		return hp;
	}

	public void setHp(int decreaseHp) {
		hp=hp - decreaseHp;
		if(hp < 0)
			setAlive(false);
		System.out.println("Zombie defeated by hero");
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack=	attack;	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
