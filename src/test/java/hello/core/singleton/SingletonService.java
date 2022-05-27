package hello.core.singleton;

public class SingletonService {

    //자시자신을 내부에 private 으로 하나 static으로 가지고있어. 클래스레벨에 오랄가서 하나만 존재하게되
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {
    }
}
