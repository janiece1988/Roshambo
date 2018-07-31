
public class User  extends Player{
     
	public User() {
		super();
	}
	
		
	@Override
	public Roshambo generateRoshambo( String UserInput) {
		switch(UserInput) {
		case "R":
		case "r":
		   return Roshambo.ROCK;
		   
		case "P":
		case "p":
		return Roshambo.PAPER;
		
		case "S":
		case "s" :
		return Roshambo.SCISSORS;
				
		}
		return null;
	}

	@Override
	public Roshambo generateRoshambo() {
		// TODO Auto-generated method stub
		return null;
	}

}
