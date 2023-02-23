# READ ME

## Uppgift nätverk

Min uppgift är att skriva ett chatprogram som utnyttjar TCP/IP
och Sockets i Java för att kommunicera över nätverket. 
Programmet ska bestå av två delar, en server och en klient, 
och båda ska vara strukturerade enligt MVC på samma sätt som
de andra programmen jag arbetat med under kursen. 
Genom att använda MVC kan jag använda detta program som grund 
för andra typer av nätverksprogram. 
Byt view till ett schackbräde och bygg ut modellen till att 
hantera schackdrag så har jag ett online schack.

### Grundkrav

De två programmen ska ha en tydligt uppdelad struktur där 
View (GUIt) ska vara ett enkelt Swingfönster med de 
komponenter och funktioner som behövs för att lösa uppgiften. 
I Modellen ska all kod som gör något finnas. 
Viktigt är att allt som har med Sockets och 
BufferedReader/PrintWriter finns här. Controllerns 
uppgift är att sköta kommunikationen mellan View och Model.

Mitt program ska kunna:

* Ansluta en klient till en server
* Använda guit för att skicka och ta emot meddelanden.
* Programmen ska hantera skicka och ta emot simultant (samtidigt) med hjälp av trådar.

### Saker att hålla koll på

Det måste finnas ett sätt att ange ip och port för klienten 
innan socketen skapas. Fundera på var informationen ska 
komma ifrån. 
Från guit eller ska det anges innan model och view skapas.

Eftersom inkommande trafik landar i Model finns det inget 
naturligt sätt för controllern att veta när det är dags att
hämta information från modellen och presentera den i View. 
Finns det en renderingsloop som i game-of-life är detta inget
problem men annars kan ni böja lite på reglerna och tillåta
att modellen talar om för kontrollern att det finns ny
information.

Eftersom server och klient eventuellt gör olika saker behöver 
ni fundera på om det behövs olika versioner av tråden som 
lyssnar, en för klienten och en för servern. 
Best practise är att låta servern vara bara server och ha
två instanser av klienten men det är inget krav. 
Om ni öppnar upp för flera klienter blir dock detta 
nästan ett krav.

Strukturera koden med package så att ni inte blandar ihop
servern och klienten.

### Arbetsgång
Jag ska:
* ✔ Skriva ner vad ditt program ska kunna göra i din readme.md. 
* ✔ Skapa ett package för klienten och ett för servern 
* ✔ Skapa de tre klasserna för MVC i var och en av servern och klienten 
* ✔ Designa ett enkelt gui (i view.java) för servern och för klienten
* Se till att controllern kan köra igång model och view
* Skapa modellerna med enklast möjliga funktionalitet (uppkoppling och skicka och ta emot "Hej!")
* Lägg till funktionerna en efter en

#### Skriva ner vad ditt program ska kunna göra i din readme.md

Min plan är att böra med ett chatprogramm som flera kan 
koppla till. Sedan utifrån det jag har se om jag kommer 
på något coolare som jag tror att jag kan skapa utifrån
det jag redan har utan allt för mycket problem.

Den behöver ha en server som kan ta emot data och skicka 
vidare till alla klienter som är kopplade. 
En klient som kan skicka data till servern och ta emot det 
servern skickar samt visar det 

## Logbok

### Torsdag 02-09:
Idag har jag startat upp projektet och skapat alla filer
som jag kommer att behöva för projektet. 

Nästa lektion så ska designa min view. form varpå jag sedan kommer att
börja koda själva server och klienten.

### Fredag 02-10:
Idag har jag skapat en minimal view.form samt segt 
påbörjat med min server och försökt skaffa mig mer 
förståelse för hur server och klient koden fungerar och
arbetar tillsammans.

Nästa gång ska jag fortsätta vidare med server koden men
även börja på klientsidan också då server/klient koden jag
har att utgå ifrån använder sig av delar som definieras 
hos den andra. 

### Torsdag 02-16:
Idag började på att implementera en view i klienten.

Nästa gång hoppas jag på att får mer gjort på det än bara 
början.

### Fredag 02-17:
Denna lektion har jag kopplat samman min controler och view och fått den att
starta igång allting ifrån min controller

Nästa gång ska jag arbeta vidare på min faktiska model, dvs den den som faktiskt
gör något 

### Torsdag 02-23:
Model har arbetats på under denna lektion.

Nästa gång ska jag fortsätta att försöka konstruera och förstå Servern och Modeln



