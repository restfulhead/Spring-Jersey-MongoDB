package name.ruhkopf.patrick.maps42.kml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import de.micromata.opengis.kml.v_2_2_0.Document;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "documents")
public class Documents
{
	@XmlElement(name = "documents")
	private List<Document> documents;

	public Documents()
	{
		super();
	}

	public Documents(List<Document> placemarks)
	{
		super();
		this.documents = placemarks;
	}

	public List<Document> getDocuments()
	{
		return documents;
	}

	public void setDocuments(List<Document> placemark)
	{
		this.documents = placemark;
	}
	
}
