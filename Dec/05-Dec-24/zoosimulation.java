

package dec_05_24;

class animal
{
	String species;

	public animal(String species) 
	{
		super();
		this.species = species;
	}

	public String getSpecies()
	{
		return species;
	}

	public void setSpecies(String species) 
	{
		this.species = species;
	}
	public void makeSound()
	{
		System.out.println("generic animal sound");
		}

	@Override
	public String toString() {
		return "animal [species=" + species + "]";
	}
public animal reproduce()
{
	System.out.println("generic reproduction method for all animals.");
	return new animal("Unknown");
}

}
class mammal extends animal
{
boolean hasFUr;

public mammal(String species, boolean hasFUr)
{
	super(species);
	this.hasFUr = hasFUr;
}
 public  void makeSound()
{
	 System.out.println("mammals sound ");
	 }
@Override
public String toString() 
{
	return "mammal [hasFUr=" + hasFUr + "]";
}
public mammal reproduce()
{
	System.out.println("mammals give birth to live young");
	return new mammal(species,hasFUr);
}
public void nurseyoung()

{
	System.out.println("mammals nursing their  young");
}
}
 class bird  extends animal
{
	boolean canfly;

	public bird(String species, boolean canfly)
	{
		super(species);
		this.canfly = canfly;
	}
	
	public void makesound()
	{
		System.out.println("Birds sounds");
	}
	@Override
	public String toString() 
	{
		return "bird [canfly=" + canfly + "]";
	}
	public bird reproduce()
	{
		System.out.println("birds lay eggs as a means of reproduction.");
		return new bird(species,canfly);
	}
	public void buildNest()
	{
		System.out.println("birds building nests for their eggs");
	}

}
public class zoosimulation 
{
	public static void main(String[]args)
	{
		mammal m=new mammal("lion",false);
		m.reproduce();
		m.toString();
		m.makeSound();
		m.nurseyoung();
		bird b=new bird("eagle",true);
		b.reproduce();
		b.toString();
		b.makesound();
		b.buildNest();
		
	}

}
