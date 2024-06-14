package aboutCellPhone;

public class CellPhone {
	
	private String  make, model,  cpuSpeed, resolution;
	private double batteryPower,pixelDensity,ram,  megaPixel, weight, thickness,screenSize, width, height, internalStorage, repairabilityIndex;
	
	
	public CellPhone (String make, String model, String cpuSpeed, double batteryPower, double pixelDensity,double ram, String resolution, double megaPixel, double weight, double thickness,double screenSize, double width, double height, double internalStorage, double repairabilityIndex )
	{
		this.make = make;
		this.model = model;
		this.cpuSpeed = cpuSpeed;
		this.batteryPower = batteryPower;
		this.pixelDensity = pixelDensity;
		this.ram= ram;
		this.resolution = resolution; 
		this.megaPixel = megaPixel;
		this.weight = weight;
		this.thickness = thickness;
		this.screenSize = screenSize;
		this.width = width;
		this.height = height;
		this.internalStorage = internalStorage;
		this.repairabilityIndex = repairabilityIndex;
		
	}
	
	private boolean isWeathersealed()
	{
		return true;
	}
	
	private boolean hasAPhysicalQwertyKeyboard()
	{
		return false;
	}
	
	private boolean canBefolded()
	{
		return false;
	}

	@Override public String toString()
	{
	 return String.format("Mobile Specificationthis: \n\t %s, \n\t %s, \n\t %s", this.make, this.model, this.cpuSpeed );

	}

}
