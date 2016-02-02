# Opdracht

*Let op! Je mag de klasses in de package com.axxes.java.repository niet aanpassen. Met de andere klasses mag je aan de slag. Klasses toevoegen is uiteraard geen enkel probleem.*

### To do:

1. Maak een listener aan de `save` method van ProductRepositoryImpl die het product id op de standaard output afdrukt. 
M.a.w. telkens het programma de 'save' methode aanroept, verschijnt de product id op de console.

2. Maak een service klasse met een methode `findProductsByName(String prefix)`. Deze methode geeft een collectie terug 
van alle producten waarvan de property 'name' start met de opgegeven prefix. 
Sorteer de collectie op prijs met het duurste product eerst.
  * Bijvoorbeeld findProductsByName("ip") -> ["iPad", "iPhone"...] (**Let op!** De aangeleverde code genereert willekeurige productnamen.)

3. Maak een klasse ProductId die de identifier van Product bevat. Voeg een veld van het type `Map<ProductId, Product>` dat je zal gebruiken als cache. 
Implementeer een methode op jouw eerder gemaakte service `getProduct(ProductId productId)` waarmee je het correcte product opzoekt in de cache met fallback naar de repository.

4. (optioneel) Refactor Product zodat die gebruikt maakt van ProductId ipv de huidige Long

  