package Repka;

class Person implements RepkaItem
{
    private String name;
    private String namePadezh;
    public String getNamePadezh()
    {
        return namePadezh;
    }
    Person(String name, String namePadezh)
    {
        this.name=name;
        this.namePadezh=namePadezh;
    }
    public void pull(Person person)
    {
        System.out.println(name+" за "+person.getNamePadezh());
    }
}

