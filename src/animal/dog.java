package animal;

class dog extends Animal {
    
    public dog(){
        super(15);
        System.out.println("A dog has been created.");
    }
    
    @Override
    public void eat(){
        System.out.println("A dog is eating");
    }
    
    @Override
    public void sleep(){
        System.out.println("A dog is sleeping");
 }
    
    //or public abstract eat(); to use this method we need to abstract eh dog class
    //and if there is a specific kind of dog object
    // it then implements the method.
    
    public void woof(){
        System.out.println("woof!");
    }
}
