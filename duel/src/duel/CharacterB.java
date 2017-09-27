package duel;

public class CharacterB implements Dueler
{
	private int hp; 
	private boolean isLoaded = false;

	public CharacterB() {
	}
	public void taunt() {
		String taunt = ("yo mama so fat");
		System.out.println(taunt);
	}
	public String getName() {
		String name = ("Carlos");
		return name;
	}
	public void setStartingHP(int hp) {
		this.hp = hp;
	}
	public int getHP() {
		return hp;
	}
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		if (d.getHP() == hp) {
			return true;
		}
		return false;
	}
	public int getAction(Object caller) {
		if(caller instanceof Duel) {
			if(Math.random() > 0.5) {
				if (isLoaded == false) {
					isLoaded = true;
					return Duel.LOADING;
				}
				else {
					isLoaded = false;
					return Duel.SHOOTING;
				}
			}else {
				return Duel.GUARDING;
			}
		}else {
			return Duel.YEAH_RIGHT;
		}
	}

	public void hit(Object caller) {
		if(caller instanceof Duel) {
			hp = hp-10;
		}
	}
}
