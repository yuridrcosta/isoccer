
package isoccer;

public class President extends Employee {

    public President() {
        super(null, null, null, 0, 0,"Presidente");
    }

    public President(String name, String email, String cpf, float salary, int phone) {
        super(name,email,cpf,salary,phone,"Presidente");
    }
}
