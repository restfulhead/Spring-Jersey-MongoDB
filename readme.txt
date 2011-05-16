A simple example how to use the brand new Spring Data to access Mongo DB using RESTful Web Services (Jersey) all build with Maven.

For now all you can do is POST the following XML (it's close to and will be KML soon) to
http://localhost:8080/maps42/webresources/places/

<Placemark>
    <name>My Place</name>
    <description>Just a test</description>
    <styleUrl>#style3</styleUrl>
    <coordinates>-73.995575,40.721241,0.000000</coordinates>
</Placemark>

To get a list of all places do a GET on
http://localhost:8080/maps42/webresources/places/

(c) 2011 Patrick Ruhkopf (patrickruhkopf [at] gmail.com)