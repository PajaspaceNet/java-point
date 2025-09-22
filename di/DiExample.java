import jakarta.inject.Inject;

class Repository {
    public String getData() {
        return "some data";
    }
}

class Service {
    private final Repository repo;

    @Inject
    public Service(Repository repo) {
        this.repo = repo;
    }

    public void process() {
        System.out.println("Processing: " + repo.getData());
    }
}
