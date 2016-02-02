# Opdracht

In deze repository vind je een eenvoudig Maven project. Maak een fork van deze repo, los de opdrachten hieronder op en push het resultaat naar jouw fork. We bekijken vervolgens jouw oplossing. (Heb je geen github account? Download deze repo als zip en stuur jouw resultaat naar tim.vanlaer@axxes.com)

*Let op! Je mag de klasses in de package com.axxes.java.repository niet aanpassen. Ga met de andere klasses aan de slag of voeg zelf nieuwe toe.*

### To do:

1. Maak een listener voor de `save` method van ProductRepository die het product id op de standaard output afdrukt. 
M.a.w. telkens het programma de 'save' methode aanroept, verschijnt de product id op de console.

2. Maak een service klasse met een methode `findProductsByName(String prefix)`. Zorg ervoor dat deze methode een collectie teruggeeft 
met alle producten waarvan het veld 'name' start met de opgegeven prefix (niet hoofdlettergevoelig). Sorteer de collectie op het veld `price` met het duurste product eerst.
  * Bijvoorbeeld `findProductsByName("pa")` -> `["Papier", "pasta"...]` (**Let op!** Dit voorbeeld is fictief, de aangeleverde code genereert willekeurige productnamen.)

3. Maak een nieuwe klasse `ProductId` die de identifier van een Product vertegenwoordigd. Zorg ervoor dat de klasse en zijn state robuust is.

4. Voeg aan jouw service een veld van het type `Map<ProductId, Product>` toe. Deze map zal dienst doen als eenvoudige cache.
Implementeer een methode op jouw eerder gemaakte service `getProduct(ProductId productId)` waarmee je het correcte product opzoekt in de cache met fallback naar de repository.

5. (optioneel) Refactor Product en verander het type van `id` naar `ProductId`
