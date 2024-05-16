package Assignment2;

public class q6Animal {
    private String name;
    private String color;
    private String type;

    public q6Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    public static void main(String[] args) {
        q6Animal animal1 = new q6Animal("Dog", "Brown", "Pet");
        q6Animal animal2 = new q6Animal("Lion", "Yellow", "Wild");

        System.out.println(animal1.hashCode());
        System.out.println(animal2.hashCode());
    }
}