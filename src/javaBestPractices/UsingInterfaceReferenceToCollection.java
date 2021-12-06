package javaBestPractices;

// bad
public class CollectionsRef {

    private HashSet<Integer> numbers;

    public ArrayList<String> getList() {

        return new ArrayList<String>();
    }

    public void setNumbers(HashSet<Integer> numbers) {
        this.numbers = numbers;
    }
}

// better
public class CollectionsRef {

    private Set<Integer> numbers;

    public List<String> getList() {
        // can return any kind of List
        return new ArrayList<String>();
    }

    public void setNumbers(Set<Integer> numbers) {
        // can accept any kind of Set
        this.numbers = numbers;
    }
}


public class UsingInterfaceReferenceToCollection {
}
