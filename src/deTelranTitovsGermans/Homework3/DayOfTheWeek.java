package deTelranTitovsGermans.Homework3;

enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

class EnumDayOfTheWeekDetector implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        if (number >= 1 && number <= 7) {
            return DayOfWeek.values()[number - 1].name();
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }
}
