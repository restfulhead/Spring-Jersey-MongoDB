package name.ruhkopf.patrick.maps42.kml;

import java.util.List;

public class PlacemarkDocument
{
	private String name;
	private String description;
	private List<Placemark> placemarks;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public List<Placemark> getPlacemarks()
	{
		return placemarks;
	}

	public void setPlacemarks(List<Placemark> placemark)
	{
		this.placemarks = placemark;
	}

	
}
