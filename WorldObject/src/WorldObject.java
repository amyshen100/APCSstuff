import java.util.Random;
//this is the interface for Project Cowway that increases Time and gives current time
public interface WorldObject {
	public int increaseTime();
	public int currentTime();
	Farm [] farms = new Farm [1]; // assuming we are only dealing with one farm 
}
//this Farm class implements WorldObject
class Farm implements WorldObject{
	private int x;
	private int y;
	private int time;
	Object[][] objectCoordinates = new Object [x][y];
	FarmObject[] objects = new FarmObject[100];
	public int increaseTime(){
		time = time + 1;
		return time;
	}
	public int currentTime(){ //the current time in the Cowway
		time = 0;
		return time;
	}
}
class FarmObject implements WorldObject{ //this FarmObject class implements WorldObject
	private int x;
	private int y;
	private int time;
	public int increaseTime(){
		time = time + 1;
		return time;
	}
	public int currentTime(){
		time = 0;
		return time;
	}
	public void doStuffForAnHour(int hour){	
	}	
}
class Cow extends FarmObject { //this Cow class extends FarmObject
	private String name ;
	private int hungriness;
	private int age;
	private int sicknessLevel;
}
class Behavior extends Cow{ //this Behavior class extends Farm
	private int x;
	private int y;
	private int time;
	private int poisonedGrass;
	private double grass;
	public int increaseTime(){ //increment time by hours
		time = time + 1;
		return time;
	}
	public int currentTime(){ //sets initial time to zero
		time = 0;
		return time;
	}
	void traverse(){ //moves the cow between 6am and 6pm through random numbers
		if (time >= 6 && time <= 18){
			Random r = new Random();
			int a = r.nextInt(4);
			if (a == 0){
				Object cow = objectCoordinates[x+1][y];
			}
			if (a == 1){
				Object cow = objectCoordinates[x][y+1];
			}
			if (a == 2){
				Object cow = objectCoordinates[x][y-1];
			}
			if (a == 3){
				Object cow = objectCoordinates[x-1][y];
			}

		}
	public void otherTime(){
		doStuffForAnHour;
	}
	public void noGrass(){
		if (!(cow == poisonedGrass || cow == grass)){ // if the cow is not on a patch of grass
			while (time == time + 1){ //while it is within an hour, do nothing
				doStuffForAnHour();
			}
		
		}
	}
	public void grassFilledSquare(){
		if (cow == poisonedGrass){ //if there is a patch of poisoned grass where the cow is
			poisonedGrass--;
			hungriness--;
		}
	    if (cow == grass){ //if there is a patch of grass where the cow is
	    	grass--;
	    	hungriness--;
	    }
	}
	public void everyHour(){   // the change in the cow every hour
		hungriness = hungriness + 2;
		age++;
	}
	public void starvation(){ // method of cow death by hungriness level
		if (hungriness == 100 || age == 90001){
			remove();
		}
	}
	public void deathBySickness(){
		double n = 0.0001 * age * sicknessLevel ; 
		if (Math.random() < n){ //Random number up to 1 is chosen, with a ratio, this program will determine if the cow will die by sickness
			remove();
		}
		else {
			break;
		}
	}
		
}
class NocturnalCow extends Cow{ //this Nocturnal Cow class from between 6pm to 6am extends Cow
	if (time < 6 && time > 18){
		traverse(); //moves
	}
}
class FlyingCow extends Cow { //this FlyingCow class extends Cow
	while (time++){
		Random r = new Random();
		int b = r.nextInt();
		if (cow == false){
			Object cow = objectCoordinates [x+b][y+b]; //random integer shifts coordinate points
		}
	}
}
class Grass extends FarmObject{ //this Grass class extends FarmObject
	private double grass;
	while (time++){
		grass++;
		double q = 0.1*grass; 
		if (Math.random() < q){ //Random number up to 1 is chosen, with a ratio, this program will determine if grass is eaten
			Random r = new Random();
			int b = r.nextInt();
			if (cow == false){
				grass--;
			}
		}
		else {
			break;
		}
	}
    
}
class PoisonedGrass extends Grass { // this PoisonedGrass class extends Grass
	private int poisonedGrass;
	private int sickness; //level of sickness
	while (time++){
		poisonedGrass = poisonedGrass + 2;
	}
	if (poisonedGrass == cow) { //if there is a patch of poisoned grass where the cow is
		sickness++;
	}

}
