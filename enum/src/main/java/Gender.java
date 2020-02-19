public enum Gender {

    MALE,
    FEMALE;

    public boolean filterGender(Student stu) {
        return stu.getGender().equals(this);
    }
}
