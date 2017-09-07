package animal;

class cat extends Animal{
    
    public cat(){
        super(7);
        System.out.println("a cat has been created.");
    }
    
    public void eat(){
        System.out.println("A cat is eating");
    }
    
    public void meow(){
        System.out.println("meow!");    
    }
    
    public void prance(){
        System.out.println("the cat is prancing");
    }
}
