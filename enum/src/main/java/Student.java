public enum Student {

    LINDA("Linda", "Female"),
    BOB("Bob", "Male"),
    SOLIDER("Solider", "Male"),
    CINDY("Cindy", "Female");

    private String name;
    private String sex;

    Student(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public boolean filterSex(String sex) {
        return (sex.equals("Female"));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
