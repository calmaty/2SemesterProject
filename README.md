# Gutenberg Project 2. Semester
#Data collection:
For this project we have collected 37.595 english books from the gutenberg website.
All book is in txt format, and was collected with a server, setup with a vagrantfile given to us by Helge. A guide for the setup of the server can be seen on Helges github:  https://github.com/HelgeCPH/db_course_nosql/tree/master/book_download
 
We also manually download a zip with index of all the books on the gutenberg website, in a rdf format. 
 
A tsv with city names, id and geolocations was download from http://download.geonames.org/export/dump/cities5000.zip
We choose the file with cities that has more than 5000 inhabitants, to find as many cities in the books as possible.
 
In order to extract the data we need from the raw data, we made 3 Programs:
This 3 programs is written in c#.
 
CityTsvToCsv:
The file we extract from the cities5000.zip is a Tsv file and it has a lot of data we do not want.
So this Program reads the a Tsv file extracts the data from the given columns and put them in a csv file.
 
IndexRdfToCsv:
This Program takes all rdf(type of xml) files in a given folder, and finds the Author, title, language and book id, and addes this data to the Author, Books and Book_Authors csv files. 
 
ExtractCitiesFromeBooks:
This Program runs through all the txt files in a folder. It reads each txt line by line and finds the words starting with capital letters. It then compares the words with the city name from our cities csv, and then adds the found city´s  id in the Book_mentions_cities csv alongside the current books id. 
To run through the 37.595 books, it took around 36 hours to completed.

#Setup and Database Engines: 
We have choose to use the relational database PostgreSQL, which some of us was more use to.
Our second database is a Neo4j graph database, which we have used during this course. 
 
Our Databases and Rest API is running directly on a local Machine, with this specs:
 
OS:  Win 10 
CPU: 2.60 ghz
Ram: 8GB,  1600 Mhz
SSD: 256 GB
 
Our original plan was to make a vagrantfile that would create vm running ubuntu, and install the database, and import the csv data into them automatically, it would also download and run our Rest API. 
So that you just could start the vagrantfile and everything would be set up and running, ether on your local machine or run it on a digitalocean server.
But since we had runned into so many problems, and written a vagrantfile that work is still new to us, we simply did not have time to do so.    
 
We had also planned  to make a website that would use our API, But didn't have time for it.
 
So in our solution your will get the search result out as a Json on the api webPage. 

#Data Models:
CSV files:
Books {id, title, language }
Authors {name}
Cities {id, name, latitude, longitude}
Book_Authors {book_id, author}
Books_mentions_cities {book_id, city_id}
 
Neo4j:
Nodes:
Book {int: id, string: title, string: language }
Author {string: author}
City {int: id, String: title, float: latitude, float: longitude}
 
Relations:
Wrote   (Author)-[:Wrote]->(Book)
Mentions  (Book)-[:Mentions]->(City)
 
Indexes:
Index on Author name
Index on Book id
Index on City id
 
 
PostgreSQL:
 
Tables:
bookauthors:  foreign key (int: book_id), foreign key (varchar(255):  author)
 
books:  prim key (int: id), text: title, varchar(255): language
 
cities:  prim key (int: id) , varchar(255): name , float: latitude,  float: longitude
 
citiesinbooks:  book_id, foreign key (city_id)
 
Indexes:
Made on all id values.
 
 
We decided not to have an Authors table because it would be redundant.  We have the same data in our bookauthors table and in the future it will impact database performance when the project grows out of its proportions now.  Also not having redundant data allows us to optimize our bookauthors table better.

#Data Importation:
Since we have to import the data into to different database type, we decided to convert the data we needed into csv, which then can be imported into pretty much any database.
 
For the importation into the neo4j we initially wanted to import the data through the Neoj4 import tool, like it was show by Craig from Neo4j. Since the import would have been much fast and we would have been able to use the command lines in a vagrant file to automatically import the data to Database when run the Vagrant.
But we could not get to work and after using a significantly amount on it and the deadline closing in, we decided to import the data through the Neo4j GUI.
 
At this point it was also decided that the importation into PostgreSQL should be done through the GUI.
 
Doing the imports we had several unforeseen Errors with the csv which resulted in having to redo the csv files multiple times.  
Since with had to do the import in Neo4j GUI using cypher code, it took some time import after finally having fixed the csv files. And do to the deadline we had to stop the import of the book_mentions_cities.csv, so we only have about  500.000 relation in the database out of 11 mio relation, but we assume that it would be sufficient to demonstrate our Rest API.
 
And in the PostgreSQL we had to the foreign key setting on the book_id, since it appears that the Books.csv do not contain all the books, that the book_mentions_cities.csv has runned through, this is a quick fix since we do not have time to find a fix and redo the csv.
The course of this problem is properly do to the way the book_id is extracted from the index files and the actual books.  
Errors in csv files
 
We trying to import the Author csv we got Errror from one of the lines which stop the import.
It turn out that one of the author's name ended with , so the importer readed as it had a null value. 
Our solution was manually edit the csv file since it was only one entry that had this error.  But in further development the rdf convert should check that the author name do not end with , and if so remove it before adding the name to the csv.
 
In the Cities csv we got and error that some of the city names hade comma in them and the conversion of the city tsv to csv had issues because of some of the entries in the tsv had incorrect tab separation, which confuses the converter. 
Our solution was to update the tsv convert program to look for comma in the city name string and surround them in quotation marks, before adding them to the csv file.
 
In the Books csv we had predicted the the comma in title issue and title new line issue, but did still give an error when importing, it turn out that we did not have solved the title new line issue, we had check for /r/n in the title and removed them, but depending on which OS the specific entry had been made the new line indicator, is different.
In window it is /r/n for newline, but in Linux it is /n and for mac it´s /r.
Our solution was to simply add check for /n and /r in the rdf converts program and remove them.     
 
On like Neo4j, PostgreSQL do not see that a book title inside quotation marks is a string, so it read the single quotes in title as a breakpoint, and that result in error.
Since we did not have time to figure something, we simply remove all single quotes in the name and titles. So we could get the data imported.

#Rest API input data: works
Geolocation:   Latitude: 51.50853   Longitude: -0.12574   City name: London
 
Author: Jefferson, Thomas  Book id: 1  Book Title: The Declaration of Independence of the United States of America

#20 queries Times test

Retional Database:
Query 1:

Query 2:

Query 3:

Query 4:

Query 5:


Graph DataBase:


#Our recommendation:
We recommend that you use (graph database) Neo4j for project with larger data set like this.
Because it is faster especially in case where you would have use multiple joins.
The cypher queue is also easier to understand than a sql query with multiple joins. 
