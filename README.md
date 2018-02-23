# Øvelse til S.O.L.I.D.

### IOT-Smarthome Styresystem
"Klienten" ønsker at få installeret et IOT-smarthome styresystem, til at få opgraderet sit hjem på **5 punkter**: <br />
**1.** Lysregulering <br />
**2.** Varmeregulering <br />
**3.** Låse/åbne døre <br />
**4.** Slå alarm til/fra <br />
**5.** Gardinregulering <br />

### User cases
"Klienten" kan åbne og låse sin dør, samt slå alarmen til og fra, ved hjælp af sin smartphones placering indenfor rækkeviden af Smarthome controlleren. <br />
**User cases til regulering af Lås og Alarm:** <br />
**1.** Hvis "Klientens" smartphone er placeret 2 meter eller mindre fra dørens placering, vil døren blive låst op. <br />
**2.** Når "klientens" smartphone er placeret indenfor netværket perimeter, efter at døren er blevet åbnet og lukket, vil døren blive låst. <br />
**3.** Hvis "Klientens" smartphone er placeret 5 meter eller mere fra systemets/netværkets placering, vil døren låse sig selv, og alarmen vil blive slået til.  <br />

**User cases til regulering af Gardiner:** <br />
**1.** "Klienten" kan klappe 2 gange i træk, for at tænde og slukke lyset. <br />
**2.** Gardinregulering er tidsbestemt: Når klokken er 22:00, går gardinerne ned. Når klokken er 08:00, går gardinerne op. <br />
**3.** Tidsbestemmelsen af Gardinerne kan ændres manuelt af "Klienten". <br />

**Java-classes:**
Sikkerhed.java --> Dør.java og Alarm.java
Apparater.java --> Lys.java, Radiator.java og Gardin.java
