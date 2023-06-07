class human{
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}
public class demo {
    public static void main(String a[])
    {
        human hum = new human();
        hum.setAge(26);
        hum.setName("Mounika");
        // hum.name = "mounika";

        System.out.println(hum.getName()+ ":" + hum.getAge());
    }
    
}
