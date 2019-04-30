package de.telran.objects;

public class Cars {




    private String Manufacturer;
    private String Model;
    private  String Colour;
    private int ProductionDate;


    public Cars () {


    }
    public Cars (String Manufacturer,
                 String Model,
                 String Colour,
                 int ProductionDate) {

        this.Manufacturer = Manufacturer;
        this.Model = Model;
        this.Colour = Colour;
        this.ProductionDate=ProductionDate;

    }

    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    public void setModel(String Model){
        this.Model=Model;
    }


    public void setColour(String Colour) {
        this.Colour=Colour;
    }

    public void setProductionDate(int ProductionDate ){
        this.ProductionDate=ProductionDate;
    }

    public String toString() {
        return "Manufacturer:" + Manufacturer + "\n" +
                "Model:" + Model + "\n" +
                "Colour:" + Colour + "\n" +
                "Production Date:" + ProductionDate;

    }
}


