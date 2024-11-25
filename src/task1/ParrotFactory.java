package task1;

public class ParrotFactory extends PetFactory {
    @Override
    public Pet createPet() {
        return new Parrot();
    }
}
