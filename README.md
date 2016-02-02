# Opdracht

*Let op! Je mag de klasses in de package com.axxes.java.repository niet aanpassen. Ga met de andere klasses aan de slag of voeg zelf nieuwe toe.*

### To do:

1. Maak een listener aan de `save` method van ProductRepository die het product id op de standaard output afdrukt. 
M.a.w. telkens het programma de 'save' methode aanroept, verschijnt de product id op de console.

2. Maak een service klasse met een methode `findProductsByName(String prefix)`. Deze methode geeft een collectie terug 
van alle producten waarvan de property 'name' start met de opgegeven prefix. 
Sorteer de collectie op prijs met het duurste product eerst.
  * Bijvoorbeeld `findProductsByName("ip")` -> `["iPad", "iPhone"...]` (**Let op!** De aangeleverde code genereert willekeurige productnamen.)

3. Maak een nieuwe klasse `ProductId` die de identifier van een Product zal bevatten. Voeg een veld van het type `Map<ProductId, Product>` dat dienst zal doen als simpele cache. 
Implementeer een methode op jouw eerder gemaakte service `getProduct(ProductId productId)` waarmee je het correcte product opzoekt in de cache met fallback naar de repository.

4. (optioneel) Refactor Product en verander het type van `id` naar `ProductId`

  