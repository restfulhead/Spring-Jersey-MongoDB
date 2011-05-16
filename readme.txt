A simple example how to use the brand new Spring Data to access Mongo DB using RESTful Web Services (Jersey) all build with Maven.
(c) 2011 Patrick Ruhkopf (patrickruhkopf [at] gmail.com)
---

The application allows you to POST and GET KML documents.

1) Post a new KML document (e.g. a saved map from Google Maps or Google Earth)
URL: http://localhost:8080/maps42/webresources/kmldocuments
CONTENT TYPE: application/xml
CONTENT:

<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<kml xmlns="http://www.opengis.net/kml/2.2" >
    <Placemark>
        <name>Java User Group Hessen - JUGH!</name>
        <visibility>true</visibility>
        <open>false</open>
        <description>die Java User Group Hessen [...]</description>
        <styleUrl>styles.kml#jugh_style</styleUrl>
        <Point>
            <extrude>false</extrude>
            <altitudeMode>clampToGround</altitudeMode>
            <coordinates>9.444652669565212,51.30473589438118</coordinates>
        </Point>
    </Placemark>
</kml>

Note: This currently results in an OutOfMemory exception thrown by Spring Data. Details here:
http://forum.springsource.org/showthread.php?109392-Spring-Data-MongoDB-java.lang.OutOfMemoryError-Java-heap-space&p=362522#post362522