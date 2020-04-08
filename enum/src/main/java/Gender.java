public enum Gender {

    MALE("Male"),
    FEMALE("Female");

    Gender(String gender) {

    }

    Gender() {
    }

    public boolean filterGender(Student stu) {
        return stu.getGender().equals(this);
    }
}
