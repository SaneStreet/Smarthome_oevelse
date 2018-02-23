# Øvelse til S.O.L.I.D.

### IOT-Smarthome Styresystem
"Klienten" ønsker at få installeret et IOT-smarthome styresystem, til at få opgraderet sit hjem på **5 punkter**: <br />
**1.** Lysregulering <br />
**2.** Varmeregulering <br />
**3.** Dørregulering <br />
**4.** Alarmregulering <br />
**5.** Gardinregulering <br />

### User cases
**Regulering af Lås og Alarm:** <br />
**1.** Hvis "Klientens" smartphone er placeret 2 meter eller mindre fra dørens placering, vil døren blive låst op. <br />
**2.** Når "klientens" smartphone er placeret indenfor netværket perimeter, efter at døren er blevet åbnet og lukket, vil døren blive låst. <br />
**3.** Hvis "Klientens" smartphone er placeret 5 meter eller mere fra systemets/netværkets placering, vil døren låse sig selv, og alarmen vil blive slået til.  <br />

**Regulering af Gardiner:** <br />
**1.** Gardinregulering er tidsbestemt: Når klokken er 22:00, går gardinerne ned. Når klokken er 08:00, går gardinerne op. <br />
**2.** Tidsbestemmelsen af Gardinerne kan ændres manuelt af "Klienten". <br />

**Regulering af Lys:** <br />
**1.** Når du er hjemme skal lyset tændes. <br />
**2.** Når du forlader hjemmet skal lyset slukkes. <br />
**3.** Når du står op om morgenen, skal lyset tænde roligt op. <br />
**4.** Hvis du skal se film skal lyset dæmpes. <br />

**Regulering af Radiator:** <br />
**1.** Når du er hjemme skal varmen reguleres. <br />
**2.** Når du forlader hjemmet skal varmen reguleres. <br />
**3.** Radiatoren er årstidsbestemt: Er det vinter er varmen reguleret derefter, er det sommer er varmen reguleret derefter, etc. <br />

**Java-classes:** <br />
SystemMain.java --> Launch the system <br />
TestSystemMain.java --> Test the system <br />
Sikkerhed.java --> Dør.java og Alarm.java <br />
Apparater.java --> Lys.java, Radiator.java og Gardin.java <br />
