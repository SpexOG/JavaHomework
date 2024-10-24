Proiect: Carte de Rețete - Aplicație Web

Descriere

Această aplicație web permite utilizatorilor să vizualizeze o colecție de rețete și să adauge rețete noi. Aplicația este implementată folosind arhitectura MVC (Model-View-Controller) fără o componentă de persistență (fără baze de date), stocând toate informațiile în memorie.

Funcționalități principale:

Afișarea tuturor rețetelor: Utilizatorii pot vedea o listă cu toate rețetele disponibile.

Adăugarea de rețete noi: Utilizatorii pot completa un formular pentru a adăuga o nouă rețetă.

Specificațiile clasei Recipe

Clasa Recipe include următoarele atribute:

Titlu: Numele rețetei.

Ingrediente: O listă de ingrediente necesare pentru rețetă.

Descriere: O scurtă descriere a rețetei.

Pași de preparare: Un set de instrucțiuni pentru prepararea rețetei.

Timp de gătire: Timpul total necesar pentru gătit (în minute).

Interfață utilizator

Aplicația include următoarele pagini:

Pagina principală: Afișează toate rețetele.

Formular de adăugare: O pagină pentru adăugarea unei noi rețete în cartea de rețete.

Endpoints disponibile

GET /recipes: Afișează lista de rețete existente.

GET /recipe/add: Afișează formularul pentru adăugarea unei noi rețete.

POST /recipe/add: Procesează formularul și adaugă rețeta la cartea de rețete.

Cerințe de sistem

Java 11 sau o versiune mai recentă

Maven pentru gestionarea dependențelor

Spring Boot ca framework pentru dezvoltarea aplicației web

Instrucțiuni de instalare și rulare

Clonează proiectul si ruleaza aplicatia din IDE.

Accesează aplicația în browser:

Deschide browserul și accesează: http://localhost:8080/recipes pentru a vedea toate rețetele.

Accesează: http://localhost:8080/recipe/add pentru a adăuga o nouă rețetă.

Structura proiectului

Model: Clasa Recipe din src/main/java/com/temaSpring/recipe_book/models reprezintă rețetele.

Controller: Clasa RecipeController din src/main/java/com/temaSpring/recipe_book/controllers gestionează cererile HTTP.

View: Fișierele HTML sunt în src/main/resources/templates, inclusiv formularele și paginile de listare a rețetelor.

Note suplimentare

Persistența datelor: Aplicația nu utilizează o bază de date; toate rețetele sunt stocate în memorie și vor fi pierdute la oprirea aplicației.

Extensibilitate: Aplicația poate fi extinsă pentru a folosi un layer de persistență, cum ar fi o bază de date (ex. MySQL, PostgreSQL), fără a schimba structura de bază a proiectului.