package creationalDesignPatterns.prototypePattern;

public class Driver {
    private String name;
    private int version;

    public Driver(Builder b){
        this.name=b.name;
        this.version=b.version;
    }

    public Driver cloneObject(){
        return new Driver.Builder().setName(this.name).setVersion(this.version).build();
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
