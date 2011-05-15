package name.ruhkopf.patrick.maps42.kml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "placemarks")
public class Placemarks
{
	@XmlElement(name = "placemark")
	private List<Placemark> placemarks;

	public Placemarks()
	{
		super();
	}

	public Placemarks(List<Placemark> placemarks)
	{
		super();
		this.placemarks = placemarks;
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
