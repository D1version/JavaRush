package com.javarush.test.level30.lesson04.home01;

//this class shows how to call other constructors using 'this'
public class ShareItem {
    

    public String description;
    public int itemId;

    public ShareItem() {
        this("Test Item", 0);
    }

    public ShareItem(String description) {
        this(description, 0);
    }

    public ShareItem(int itemId) {
        this("Test Item", itemId);
    }

    public ShareItem(String description, int itemId)
    {
        this.description = description;
        this.itemId = itemId;
    }

    @Override
    public String toString()
    {
        return "ShareItem{" +
                "description='" + description + '\'' +
                ", itemId=" + itemId +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof ShareItem)) return false;

        ShareItem shareItem = (ShareItem) o;

        if (getItemId() != shareItem.getItemId()) return false;
        return !(getDescription() != null ? !getDescription().equals(shareItem.getDescription()) : shareItem.getDescription() != null);

    }

    @Override
    public int hashCode()
    {
        int result = getDescription() != null ? getDescription().hashCode() : 0;
        result = 31 * result + getItemId();
        return result;
    }

    public String getDescription() {
        return description;
    }

    public int getItemId() {
        return itemId;
    }
}


