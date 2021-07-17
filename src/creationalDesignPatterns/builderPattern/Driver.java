package creationalDesignPatterns.builderPattern;

public class Driver {
    private String name;
    private int version;

    private Driver(Builder b){
        this.name=b.name;
        this.version=b.version;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", version=" + version +
                '}';
    }

    static class Builder{
        public String name;
        public int version;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setVersion(int version) {
            this.version = version;
            return this;
        }
        public Driver build() {
            return new Driver(this);
        }
    }
}
