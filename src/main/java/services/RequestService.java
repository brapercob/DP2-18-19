package services;

public class RequestService {

  @Autowired
  private RequestRepository	requestRepository;


  //CRUD methods

  public Rquest create() {
    return new Request();
  }

  public RquestService() {
    super();
  }

  public void delete(final Request request) {
    Assert.notNull(request);
    Assert.isTrue(member.getId() != 0);
    this.requestRepository.delete(request);

  }

  public request save(final Request request) {
    Assert.notNull(request);
    return this.requestRepository.save(request);

  }

}
