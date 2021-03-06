
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelWorldClockSystem {
    private List<CityClock> cityClocks = new ArrayList<>();

    public void attach(CityClock cityClock) {
        this.cityClocks.add(cityClock);
    }

    public List<CityClock> getClocks() {
        return this.cityClocks;
    }

    public static void main(String []arg) {
        HotelWorldClockSystem hwcs = new HotelWorldClockSystem();
        CityClock beijing = new CityClock(8);
        CityClock london = new CityClock(0);
        CityClock moscow = new CityClock(3);
        CityClock sydney = new CityClock(10);
        CityClock newYork = new CityClock(-5);
        int utcOffset = 8;
        PhoneClock pc = new PhoneClock(utcOffset);
        hwcs.attach(beijing);
        hwcs.attach(london);
        hwcs.attach(moscow);
        hwcs.attach(sydney);
        hwcs.attach(newYork);
        pc.setHotelWorldClockSystem(hwcs);
        System.out.print("将手机时间调整为：");
        //实例化Scanner
        Scanner scanner=new Scanner(System.in);
        //time接收输入的整形数
        int time = scanner.nextInt();
        pc.setTime(time);
        System.out.println("手机所在时区与UTC时间差为："+utcOffset);
        System.out.println("现在北京时间是： "+beijing.getTime());
        System.out.println("现在伦敦时间是： "+london.getTime());
        System.out.println("现在莫斯科时间是： "+moscow.getTime());
        System.out.println("现在悉尼时间是： "+sydney.getTime());
        System.out.println("现在纽约时间是： "+newYork.getTime());
    }
}