# bic_Calculator

## 1 Anlegen des Projektes  
### 1.1  Neu in IntelliJ erstellen  
1.1.1 Neues Projekt anlegen  
1.1.2 Auswahl Sprache=Java, Build system=Maven und einstellen der gewünschten Parameter (Java Version, JDK, etc.)   
1.1.3 Weiter klicken, etwaige Meldungen akzeptieren und das Project builden und ausführen

### 1.2 pom.xml und checkstyle hinzufügen
1.2.1 Erstelle pom.xml Datei gegen eine vorgegebene Austauschen, oder selbstständig die notwendigen Plugins hinzufügen
1.2.2 Da wir in unserem Projekt checkstyle benutzen, die vorgegebe Datei so im Projekt ablegen, dass es der Referenz im pom.xml entspricht

## 2 Calculator Klasse erstellen
2.0.1 Im src Ordner eine neue Klasse für den Calculator erstellen  
2.0.2 Klasse implementieren

### 2.1 Tests hinzufügen
2.1.1 Im test Ordner eine neue Klasse für die Summenrechnertest erstellen, oder den Klassennamen in Calculator.java markieren, Alt+Enter drücken und "Create Test" auswählen
2.1.2 Tests hinzufügen

[Tipps zur Namenskonvetion von Testfällen](https://medium.com/@stefanovskyi/unit-test-naming-conventions-dd9208eadbea)  
[Tests mehrmal mit verschiedenen Parametern durchführen](https://www.baeldung.com/parameterized-tests-junit-5)

### 2.2 Tests ausführen
2.2.1 Maven Menü öffnen  
2.2.2 Doppelklick auf "Test" unter Lifecycle

### 2.3 Checkstyle Ergebnisse ansehen
2.3.1 Maven Menü öffnen
2.3.2 Doppelklick auf "Site" unter Lifecyle
2.3.3 Es gibt nun einen Ordner Target, in dem sich unter "site" nun eine Projektseite befindet. In "checkstyle.html" sind die Ergebnisse sichtbar


## 3 Projekt auf Github pushen

### 3.1 Umbennen des Master Branches auf Main
``` SHELL
git checkout master
git branch -m main
```
### 3.1 Upstream Reposity einstellen
``` SHELL
git remote add origin UrlZumGitubRepository.git
git push -u -f origin main
```

### 3.2 Auschecken neuer Featurebranches, commiten und Pull Request
3.2.1 Auschecken eines neuen Branches
``` SHELL
git checkout -b feature/XY
```

3.2.2 Letzte Änderungen auf dem Feature Branch stagen und committen
``` SHELL
git add .
git commit -m "CommitMessage"
```
Siehe [Tipps fuer commit messages](https://cbea.ms/git-commit/)

3.2.3  Den Featurebranch auf github pushen
``` SHELL
git push -u origin feature/XY
```

3.2.4 Pull Request erstellen und abschließen
Wenn das Repository in Github aufgerufen wird, sollte über den Dateien nachgefragt werden, ob man einen Pull Request für den gerade gepuschten Code erstellen will.
Wenn man auf den Button klickt und dort dann auf "Create Pull Request" klickt, dann wir der Pull request erstellt.
Es finden ein paar Checks statt, und wenn man selbst ausreichende Rechte hat um den Pull request abzuschließen, kann man zuerst die Änderungen in den main Branch mergen und schlussendlich den Pull Requst abschließen.

3.2.5 Den main branch lokal aktualisieren
``` SHELL
git checkout main
git pull
```