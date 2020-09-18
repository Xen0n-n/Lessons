package com.company;

abstract class Dogs {
    private String name;
    private String owner;
    private String breed;


    public Dogs(String name, String owner){
        this.name = name;
        this.owner = owner;

    }

    public String getBreed() {
        return "Breed is " + breed + " ";
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return "Dog's name is " + name + " ";
    }

    public String getOwner() {
        return "The owner is " + owner + " ";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void ReturnDogInfo(){
        System.out.println(getBreed() + getName() + getOwner());
    }
}
