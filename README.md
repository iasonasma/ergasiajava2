# Project 2 JAVA Database
------------------------------Our Java 2 Project--------------------------


---04/10/2018---
stef-06 -> Δημιουργία Database.java

---04/10/2018---
iasonasma -> Αλλαγές στο αρχείο Database.java που είχε πρόβλημα.
iasonasma -> Δημιουργία Field.java

---16/11/2018---
nefeli-v -> Χρήση maps αντι λίστας

---18/11/2018---
iasonasma -> διαγραφη του Field.java για επαναδημιουργια
Αλλαγη στην προσθηκη Datas μεσω HashMap
Δημιουργία CreateData.java για προσθήκη δεδομένων

---18/11/2018---
nefeli-v -> Add code to choice 4 on Database.java
            New class: DeleteData.java
           
---19/11/2018---
stef-06 -> ανανέωση database.java και δημιουργία νεας κλασης Datas με τις μεθόδους printData και fillTheData.
sindy-98 -> Add code to choice 5 on Database.java in order to change values in the data
            New class formed : ChangeData.java
---19/11/2018---
Aggeliki92 -> δημιουργία κλάσης Fields με την μέθοδο createField(). 

---20/11/2018---
iasonasma -> αλλαγη στο Delete.java για την διορθωση προβλήματος NULL

---26/11/2018---
stef-06 -> Update DeleteData.java (δημιουργία ξεχωριστών μεθόδων , έλεγχος για τα input του χρήστη (px αν υπάρχει το field που θέλει να διαγράψει) και αλλαγή των id  όταν διαγράφεται ένα id.) 
           και Update Database.java (αλλαγή στο μενού.Αν ο χρήστης δεν επιλέξει από το 1-5 τον ενημερώνει και του ζητάει να ξαναπροσπαθήσει.)

nefeli-v -> update deleteid method of DeleteData class (change counter when an ID is delete


--29/11/2018--
sindy-98 -> create new operation in class DeleteData in order to delete all the datas that existed in the database. The new method is : deleteDatabase().
sindy-98-> update the choices in DeleteData Class and changed the main menu a little bit.

---1/12/2018---
nefeli-v -> Add InputMismatchException in menu() method of Database class in case the user doesn't give an Integer
            Add InputMismatchException in DeleteData, ChangeData classes
            Update DeleteData,ChangeData, Datas, CreateData (checking if there are any data to delete/change/print, and if there are any             fields in order to add data to them)
            
 ---2/12/2018---
Aggeliki92 -> Update Database.java (ο χρήστης μπορεί να κάνει αναζάτηση δεδομένων χρησιμοποιώντας το primary key).
Aggeliki92 -> Δημιουργία κλάσης SearchDatas με την μέθοδο searchDatas() που ζητάει από τον χρήστη το primary key και επιστρέφει την αντίστοιχη πλειάδα.

---3/12/2018---
Aggeliki92 ->Διόρθωση κώδικα στην κλάση SearchDatas.


---4/12/2018---
iasonasma -> Δημιουργια κλάσης Write.java : Ο χρήστης μπορει να αποθηκεύση τη βάση του σε αρχείο και στην επόμενη χρήση μπορεί να επαναφορτώσει τη βάση του ολόκληρη.

---4/12/2018---
Aggeliki92 -> διόρθωση κλασης SearchData. 

---4/12/2018---
iasonasma -> Αλλαγη στον κωδικα Write.java για να επανεμφανιζει το μενου και αλλαγη στο Database.java για να δειχνει την επιλογη Save data.

---4/1/2019---
Aggeliki92 -> Δημιουργία κλάσης SearchValue.java με την μέθοδο searchValue(). Ο χρήστης ζητάει μια τιμή και η βάση του επιστρέφει όλες τις πλειάδες στις οποίες υπάρχει αυτή η τιμή.
Aggeliki92 -> Update Database.java (ο χρήστης μπορεί να κάνει αναζάτηση δεδομένων μέσω μιας τιμής).
Aggeliki92 -> Διόρθωση κώδικα SearchValue.java ώστε να επιστρέφει και το primary key.
