package deTelranTitovsGermans.Homework3;

public class Main {
    public static void main(String[] args) {
        DayOfTheWeekDetector detectorIf = new DayOfTheWeekDetectorIfVersion();
        System.out.println(detectorIf.detectDayName(1));

        DayOfTheWeekDetector detectorSwitch = new DayOfTheWeekDetectorSwitchVersion();
        System.out.println(detectorSwitch.detectDayName(2));

        DayOfTheWeekDetector detectorArray = new DayOfTheWeekDetectorArrayVersion();
        System.out.println(detectorArray.detectDayName(3));

        DayOfTheWeekDetector detectorEnum = new EnumDayOfTheWeekDetector();
        System.out.println(detectorEnum.detectDayName(4));

        Dancer dancer = new Dancer();
        dancer.dance();

        Singer singer = new Singer();
        singer.sing();

        PopSinger popSinger = new PopSinger();
        popSinger.sing();
        popSinger.dance();
    }
}
