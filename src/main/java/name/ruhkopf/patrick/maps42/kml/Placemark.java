package name.ruhkopf.patrick.maps42.kml;

import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;

@XmlRootElement(name = "Placemark")
public class Placemark 
{
	/*
	 * <name>Epistrophy Cafe</name>
    <description><![CDATA[]]></description>
    <styleUrl>#style3</styleUrl>
    <Point>
      <coordinates>-73.995575,40.721241,0.000000</coordinates>
    </Point>
	 */
	
	private String id;

	private String name;
	private String description;
	private String coordinates;
	private String styleUrl;
	
	public Placemark() {
		super();
	}
	
	public Placemark(String name, String coordinates) {
		super();
		this.name = name;
		this.coordinates = coordinates;
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}

	public String getStyleUrl() {
		return styleUrl;
	}

	public void setStyleUrl(String styleUrl) {
		this.styleUrl = styleUrl;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).
	       append("name", name).
	       append("coordinates", coordinates).
	       toString();
	}
	
	
}
