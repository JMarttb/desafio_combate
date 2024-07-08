package entities;

public class Champion {
	private String name;
	private int life;
	private int attack;
	private int armor;
	
	//private static final int BASE_DAMAGE = 1;
	
	public Champion() {
		
	}

	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}
	
	
	public String getName() {
		return name;
	}

	public int getLife() {
		return life;
	}

	public int getAttack() {
		return attack;
	}

	public void takeDamage(int damage) {
		//Math.max retorna o maior valor entre dois argumentos, 
		//nesse caso, o valor vai ser pelo menos 1
		int effectiveDamage = Math.max(1, damage - armor);
		//Caso life seja negativo, life sera settado para 0;
		life = Math.max(0, life - effectiveDamage);
	}
	
	//verificar se o campeção ainda está vivo
	public boolean isAlive() {
		return life > 0;
	}
	
	public String status() {
		if (life == 0) {
			return name
					+ ": "
					+ life
					+ " de vida (morreu)";
		}
		else {
			return name
					+ ": "
					+ life
					+ " de vida";

		}
	}
		
	}

