public class ShapeFactory {
    public Shape create_shape(ShapeType type){
        switch(type){
            case CIRCLE -> {
                return new Circle();
            }
            case SQUARE -> {
                return new Square();
            }
            case TRIANGLE -> {
                return new Triangle();
            }
        }
        return null;
    }
}
public enum ShapeType {
    CIRCLE,SQUARE,TRIANGLE
}
