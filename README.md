# FinalProject
# ITALIANO

In questo progetto troviamo il famoso gioco "Sasso Carta Forbici" reinventato con delle nuove regole, integrando anche due nuove scelte ovvero "Lizard" e "Spock" che rendono questo gioco sì più complicato ma anche più imprevedibile.
Questa versione è stata inventata dall'utente Internet Sam Kass ed è stato introdotto al grande pubblico per la prima volta dalla serie tv americana "The Big Bang Theory".
Nella serie tv il protagonista Sheldon Cooper decide di risolvere una disputa giocando a questo famoso gioco, introducendolo come la versione "Migliorata" del famoso gioco già pre-esistente.

Abbiamo sviluppato questo gioco in Java implementando una GUI con dei pulsanti che vengono associati ad ognuna delle mosse presenti nel gioco (Sasso, Carta, ecc...),
abbiamo aggiunto un sistema di statistiche ed un sistema di countdown alla fine del quale il gioco sceglie all'utente una mossa casuale e mostra il risultato della sfida contro il computer, chiamato nel nostro caso "Robot".

Per sviluppare le scelte abbiamo utilizzato una classe enum e abbiamo scritto una condizione nella classe Round che calcola il vincitore (oppure l'eventuale pareggio).
Per trovare la condizione perfetta per questo abbiamo osservato attentamente questa foto (https://upload.wikimedia.org/wikipedia/commons/b/bd/Pierre_ciseaux_feuille_l%C3%A9zard_spock.svg) e abbiamo cercato di trovare una relazione tra la posizione degli oggetti e la vittoria di uno sull'altro.
Alla fine abbiamo concluso che se l'oggetto scelto dal giocatore è uguale all'oggetto scelto (randomicamente) dal computer + 1 in modulo 5 oppure l'oggetto scelto dal giocatore è uguale all'oggetto scelto dal computer + 3 in modulo 5 allora il giocatore vince.
Quindi la condizione nell'if è: 
if(sg == (sc + 1)%5 || sg == (sc + 3)%5) --> il giocatore vince.

Questo ci ha permesso di completare il codice correttamente e di concludere il nostro progetto.

# ENGLISH

In this project we find the famous game "Sasso Carta Forbici" reinvented with new rules, also integrating two new choices: "Lizard" and "Spock" that make this game more complicated but also more unpredictable.
This version was invented by Internet user Sam Kass and was first introduced to the general public by the American TV series "The Big Bang Theory".
In the TV series the protagonist Sheldon Cooper decides to solve a dispute by playing this famous game, introducing it as the "Improved" version of the famous already existing game.

We developed this game in Java by implementing a GUI with buttons that are associated with each of the moves in the game (Sasso, Carta, etc...),
we have added a system of statistics and a countdown system at the end of which the game chooses to the user a random move and shows the result of the challenge against the computer, called in our case "Robot".

To develop the choices we used an enum class and wrote a condition in the Round class that calculates the winner (or the eventual draw).
To find the perfect condition for this we have carefully observed this photo (https///upload.wikimedia.org/wikipedia/commons/b/bd/Pierre_ciseaux_feuille_l%C3%A9zard_spock.svg) and we tried to find a relationship between the location of the objects and the victory of one over the other.
In the end we concluded that if the object chosen by the player equals the object chosen (randomly) by the computer + 1 in module 5 or the object chosen by the player equals the object chosen by the computer + 3 in module 5 then the player wins.
So the condition in the if is: 
if(sg == (sc + 1)%5 || sg== (sc + 3)%5) --> the player wins.

This allowed us to complete the code correctly and conclude our project.
