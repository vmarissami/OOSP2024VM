package task1;

public class DogFactory extends PetFactory {
    @Override
    public Pet createPet() {
        return new Dog();
    }
}
