package br.marciusvianna.com.aps1;

public class Info {
    private String Name;
    private String Description ;
    private int Miniature;

    public Info() {
    }

    public Info(String name, String description, int miniature) {
        Name = name;
        Description = description;
        Miniature = miniature;
    }


    public String getName() {
        return Name;
    }

    public String getDescription() { return Description; }

    public int getMiniature() {
        return Miniature;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setMiniature(int miniature) {
        Miniature = miniature;
    }
}
