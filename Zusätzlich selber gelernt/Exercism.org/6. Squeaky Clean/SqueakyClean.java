class SqueakyClean {
    static String clean(String identifier) {
        // Task 1 
        identifier = identifier.replace(" ", "_");
        // Task 2 and Task 3
        String[] parts = identifier.split("-");
        String provisory; 
        StringBuilder filter = new StringBuilder();
        for(int i = 0; i < parts.length; i++) {
            provisory = parts[i]
								.replace("0", "o").replace("1", "l")
								.replace("3", "e").replace("4", "a")
								.replace("5", "s").replace("7", "t");
            if(i == 0) {
                filter.append(provisory);
            } else {          filter.append(Character.toUpperCase(provisory.charAt(0))).append(provisory.substring(1));  
            }
        }
        identifier = filter.toString();
        filter.setLength(0);
    // Task 4
        char[] filtro = identifier.toCharArray();
        for(char c : filtro) {
            if(Character.isLetter(c) || c == '_') {
                filter.append(c);
            } 
        }

        identifier = filter.toString();
    
        if(identifier.length() == 1)
            identifier = identifier.toUpperCase();
        return identifier;
    }
}
