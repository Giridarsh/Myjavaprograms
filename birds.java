class animals
{
       
       String animal = "Tiger";
       String bird = "Crow";
       String fish = "Blue Whale";
       animals()
       {
           animal = "Lion";
           bird = "Pigeon";
           fish = "Shark";
        }
         public void display()
        {
	System.out.println("animal \t\t\t"+animal);
	System.out.println("bird \t\t\t"+bird);
	System.out.println("fish \t\t\t"+fish);
        }
}

class mammals extends animals
{
       String feed;
       mammals(String feed)
       {
	this.feed = feed;       
       }
       public void play()
       {
	String Animal_feeding_food = "Other animals";
	String Bird_feeding_food = "Seeds";
	String Fish_feeding_food = "Sea dirts";
	System.out.println("Animal feeding food \t"+Animal_feeding_food);
	System.out.println("Bird feeding food \t"+Bird_feeding_food);
	System.out.println("Fish feeding food \t"+Fish_feeding_food);
       }
}	

class birds
{
       static public void main(String asd[])
       {
	mammals obj = new mammals("");
	obj.display();
	obj.play();
       }
}
	







