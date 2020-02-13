public enum Student {

    LINDA("Linda", "Female"),
    BOB("Bob", "Male"),
    SOLIDER("Solider", "Male"),
    CINDY("Cindy", "Female");

    private String name;
    private String gender;

    Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public boolean filterGender(String gender) {
        return (gender.equals("Female"));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
