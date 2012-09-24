# Java3Week4: Practicum week 5
==============================

Gegeven is een stoplicht voorbeeld, alleen werkt dit programma niet goed. Het is de bedoeling dat indien men op ‘rood’ drukt dat het stoplicht dan op rood springt en 5 seconden later weer op groen. Maar het stoplicht zie je helemaal niet op rood springen. Bovendien luistert de applicatie 5 seconden lang niet naar events.
Doordat de event dispatch thread gaat slapen, komt de repaint event pas na vijf seconden aan bod en onmiddellijk daarna volgt er een tweede repaint event waardoor het stoplicht weer op groen springt. Bovendien reageert het programma als de event dispatch thread slaapt ook niet op events, dus ook niet op het windowclosing event.
## Requirements
* Gebruik de klasse javax.swing.Timer om ervoor te zorgen dat het stoplicht daadwerkelijk op rood springt en dat het programma, ook als het stoplicht op rood staat, blijft luisteren naar het windowclosing event.
* Voeg ook een JProgressBar toe aan het programma, die toont hoe lang het nog duurt voor het stoplicht weer op groen springt, zie voor de klasse javax.swing.JProgressBar de api documentatie. De timer dient nu telkens de JProgressBar te vernieuwen en tenslotte het stoplicht op groen te laten springen.
