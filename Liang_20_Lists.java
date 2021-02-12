Collection<String> collection = new ArrayList<>();
collection.add("New York");
collection.add("Atlanta");
collection.add("Dallas");
collection.add("Madison");

/******************** forEach (20.3) ******************/
collection.forEach(e −> System.out.print(e.toUpperCase() + " "));
/*
forEach(
    new java.util.function.Consumer<String>() {
        public void accept(String e) {
            System.out.print(e.toUpperCase() + " ");
        }
    }
)
*/
/*
for (String element: collection)
    System.out.print(element.toUpperCase() + " "); 
*/

/* *********** ITERATOR (20.2) ******************** */
Iterator<String> iterator = collection.iterator();
while(iterator.hasNext()) {
    System.out.print(iterator.next().toUpperCase() + " ");
}

/********************20.6 The Comparator Interface*************** */