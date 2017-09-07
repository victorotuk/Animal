package animal;


abstract class Animal {

        private int age;
/*as this is private our dog will not be able 
to access this variable from outside the animal class,
so we resort to using a to get the age*/
        
        public Animal(int age){
            
            this.age = age;
            System.out.println("an animal has been created!");
        }
        
        public void sleep(){
            System.out.println("an animal is sleeping");
        }
        
        public abstract void eat();
        
        public int getAge(){
            return age;
        }
        
    public static void main(String[] args) {
        
        //Animal a = new Animal(5);//not here how an animal can be converted to a dog
        //but it cannot work the other way around
        //like dog a = new Animal();
        
       //and also if I put age inside the dog constructor it will err;
        dog d = new dog();
        cat c = new cat();
        
        d.woof();
        System.out.println(d.getAge());
        c.meow();
        
        //a.eat(); was
        d.eat();
        c.eat();
        
        d.sleep();
        c.sleep();
        
        c.prance();
        
        //what happens if ...
        //dog o = new Animal(3);
        Animal o = new dog();
        
        //casting 
        
        Object dog = new dog();
                
 }
    
}
