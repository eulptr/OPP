public class Plant {

    private String name;
    private String nameLot;
    private boolean oneYear;
    private String mainLand;
    private int height;
    private boolean eatable;

    public void setName(String name) {
        this.name = name;
    }

    public void setNameLot(String nameLot) {
        this.nameLot = nameLot;
    }

    public void setOneYear(boolean oneYear) {
        this.oneYear = oneYear;
    }

    public void setMainLand(String mainLand) {
        this.mainLand = mainLand;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setEatable(boolean eatable) {
        this.eatable = eatable;
    }

    public String getName() {
        return this.name;
    }

    public String getNameLot() {
        return this.nameLot;
    }

    public boolean getOneYear() {
        return this.oneYear;
    }

    public String getMainLand() {
        return this.mainLand;
    }

    public int getHeight() {
        return this.height;
    }

    public boolean getEatable() {
        return this.eatable;
    }


    public Plant() {

    }

    public Plant(String name, String nameLot, boolean oneYear, String mainLand, int height, boolean eatable) {
        this.name = name;
        this.nameLot = nameLot;
        this.oneYear = oneYear;
        this.mainLand = mainLand;
        this.height = height;
        this.eatable = eatable;
    }

    @Override
    public String toString() {
        return this.name + " " +
                this.nameLot + " " +
                this.oneYear + " " +
                this.mainLand + " " +
                this.height + " " +
                this.eatable + " ";

    }

}