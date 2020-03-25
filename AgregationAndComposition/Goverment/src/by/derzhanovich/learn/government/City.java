package by.derzhanovich.learn.government;

public class City {
    private String name;
    private double areaOfRegion;
    private boolean isRegionalCenter;
    private String region;
    private String district;
    private boolean isCapital;

    public City(String name, boolean isRegionalCenter, Region region, District district, boolean isCapital){
        this.name = name;
        this.isRegionalCenter = isRegionalCenter;
        this.region = region.getName();
        this.district = district.getName();
        this.isCapital = isCapital;
        this.areaOfRegion = region.getArea();
    }

    public String getName() {
        return name;
    }

    public double getAreaOfRegion() {
        return areaOfRegion;
    }

    public boolean isRegionalCenter() {
        return isRegionalCenter;
    }

    public String getRegion() {
        return region;
    }

    public String getDistrict() {
        return district;
    }

    public boolean isCapital() {
        return isCapital;
    }

}
