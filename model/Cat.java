package testfinal.model;

public abstract class Cat {
    private Integer id;

    private String name;

    private Integer age;

    private Boolean gender;

    private String sonorous;

    public Cat() {
    }

    public Cat(Integer id, String name, Integer age, Boolean gender, String sonorous) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.sonorous = sonorous;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getSonorous() {
        return sonorous;
    }

    public void setSonorous(String sonorous) {
        this.sonorous = sonorous;
    }

    abstract void sonorous();

    public void showInfo(Cat cat) {
        System.out.println("Id: "+id);
        System.out.println("Name: " + name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        cat.sonorous();
        System.out.println();
    }
}
