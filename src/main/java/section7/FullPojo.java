package section7;

public class FullPojo {
    private int myInt;
    private String myString;

    public int getMyInt() {
        return myInt;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FullPojo fullPojo = (FullPojo) o;
        return myInt == fullPojo.myInt &&
                myString.equals(fullPojo.myString);
    }

    @Override
    public String toString() {
        return "FullPojo{" +
                "myInt=" + myInt +
                ", myString='" + myString + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((myString== null) ? 0 : myString.hashCode());
        result = prime * result + myInt;

        return result;
    }
}
