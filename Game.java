package game;

public abstract class Game {
private static int res=5000;
private static int movement=1;
static int position =0;
	public int getMovement() {
	return movement;
}
public void setMovement(int movement) {
	Game.movement = movement;
}
public int getPosition() {
	return position;
}
public void setPosition(int position) {
	Game.position = position;
}
	public static void main(String[] args) {
		Hero hero =new Hero();
		Zombie zombie =new Zombie();
		ZombieDog zombiedog =new ZombieDog();
		Bug bug = new Bug();
		Mutant mutant =new Mutant();
		Lion lion =new Lion();

while(res>0) {
	hero.setHp(1000);
	hero.setAttack(10);
	
	System.out.println("Hero started journey with 1000 HP!");

	
if(position==276 && hero.getHp()>0) {
	bug.setAttack(2);
	bug.setHp(50);
	int tour=1;
	hero.setHp(bug.getAttack()*tour);
	tour++;
	System.out.println("Hero defeated Bug with" +hero.getHp()+"HP remaining");
	}

if(position==489&& hero.getHp()>0) {
	bug.setAttack(2);
	bug.setHp(50);
	int tour=1;
	hero.setHp(bug.getAttack()*tour);
	tour++;
	System.out.println("Hero defeated Bug with" +hero.getHp()+"HP remaining");
	}
	
if(position==1527&& hero.getHp()>0) {
	lion.setAttack(15);
	lion.setHp(100);
	int tour=1;
	hero.setHp(lion.getAttack()*tour);
	tour++;
	System.out.println("Hero defeated Lion with" +hero.getHp()+"HP remaining");
	}
	
if(position==1681 && hero.getHp()>0) {
	zombie.setAttack(7);
	zombie.setHp(300);
	int tour=1;
	hero.setHp(zombie.getAttack()*tour);
	tour++;
	System.out.println("Hero defeated Zombie with" +hero.getHp()+"HP remaining");
	}
	
if(position==2865) {
	lion.setAttack(15);
	lion.setHp(100);
	int tour=1;
	hero.setHp(mutant.getAttack()*tour);
	tour++;
	System.out.println("Hero defeated Mutant with" +hero.getHp()+"HP remaining");
	}
	
if(position==3523) {
	zombie.setAttack(7);
	zombie.setHp(300);
	int tour=1;
	hero.setHp(zombie.getAttack()*tour);
	tour++;
	System.out.println("Hero defeated Zombie with" +hero.getHp()+"HP remaining");
	 res--;
	 position++;
}
while(res==7500 && res>0) {
	hero.setHp(500);
	hero.setAttack(9);
	position =res - movement;
	System.out.println("Hero started journey with 500 HP!");

if(position==274&& hero.getHp()>0) {
	int tour=1;
	mutant.setAttack(8);
	mutant.setHp(400);
	hero.setHp(mutant.getAttack()*tour);
	tour++;
	System.out.println("Hero defeated Mutant with" +hero.getHp()+"HP remaining");
	
}
if(position==486&& hero.getHp()>0) {
	zombiedog.setAttack(10);
	zombiedog.setHp(75);
	int tour=1;
	hero.setHp(zombiedog.getAttack()*tour);
	tour++;
	System.out.println("Hero defeated ZombieDog with" +hero.getHp()+"HP remaining");
	int decreaseHp=hero.setHp(zombiedog.getAttack()*tour);;

	}
	
if(position==1897) {
	zombie.setAttack(7);
	zombie.setHp(300);
	int tour=1;
	hero.setHp(zombie.getAttack()*tour);
	tour++;
	System.out.println("Hero defeated Zombie with" +hero.getHp()+"HP remaining");
	}
	
if(position==1687&& hero.getHp()>0) {
	zombiedog.setAttack(10);
	zombiedog.setHp(75);
	int tour=1;
	hero.setHp(zombiedog.getAttack()*tour);
	tour++;
	System.out.println("Hero defeated ZombieDog with" +hero.getHp()+"HP remaining");
	}
	
if(position==5332&& hero.getHp()>0) {
	mutant.setAttack(8);
	mutant.setHp(400);
	int tour=1;
	hero.setHp(mutant.getAttack()*tour);
	tour++;
	System.out.println("Hero defeated Mutant with" +hero.getHp()+"HP remaining");
	 res--;
	 position++;
	 }
	}
}
	}


}
