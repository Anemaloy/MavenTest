public enum StudyProfile {
    MEDICINE("Медицина"),
    ENGINEER("Инженер"),
    MANAGER("Менеджер"),
    PROGRAMMER("Программист");

    final String profileName;

    StudyProfile(String currency) {
        this.profileName = currency;
    }
}
