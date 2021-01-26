Collection<String> collection = new ArrayList<>();
collection.add("New York");
collection.add("Atlanta");
collection.add("Dallas");
collection.add("Madison");
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