package com.company.data;

public class Engine {

    private String engineName;
    private float engineCapacity;
    private String engineConfiguration;
    private String engineType;
    private String driveType;
    private String gearShift;

    public Engine(String engineName, float engineCapacity, String engineConfiguration, String engineType, String driveType, String gearShift) {
        this.engineName = engineName;
        this.engineCapacity = engineCapacity;
        this.engineConfiguration = engineConfiguration;
        this.engineType = engineType;
        this.driveType = driveType;
        this.gearShift = gearShift;
    }

    public Engine(float engineCapacity, String engineConfiguration, String engineType, String driveType, String gearShift) {
        this.engineCapacity = engineCapacity;
        this.engineConfiguration = engineConfiguration;
        this.engineType = engineType;
        this.driveType = driveType;
        this.gearShift = gearShift;
    }

    public Engine(float engineCapacity, String engineConfiguration, String engineType) {
        this.engineCapacity = engineCapacity;
        this.engineConfiguration = engineConfiguration;
        this.engineType = engineType;
    }

    public String getEngineName() { return engineName; }
    public float getEngineCapacity() { return engineCapacity; }
    public String getEngineConfiguration() { return engineConfiguration; }
    public String getEngineType() { return engineType; }
    public String getDriveType() { return driveType; }
    public String getGearShift() { return gearShift; }
    public void setEngineCapacity(float engineCapacity) { this.engineCapacity = engineCapacity; }
    public void setEngineConfiguration(String engineConfiguration) { this.engineConfiguration = engineConfiguration; }
    public void setEngineType(String engineType) { this.engineType = engineType; }
    public void setDriveType(String driveType) { this.driveType = driveType; }
    public void setGearShift(String gearShift) { this.gearShift = gearShift; }

    @Override
    public String toString() {
        return "Engine {" +
         //       engineName +
                engineCapacity + " l, " +
                engineConfiguration + ", " +
                engineType + ", " +
                driveType + " drive, " +
                gearShift + " gear box}";
    }

}
