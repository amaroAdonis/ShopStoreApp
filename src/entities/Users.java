/*- User (id, first name, last name, createOn)
        > proximo id (unique) disponivel gerado sozinho
        > Inserir, Deletar, Atualizar, Ler Todos, Encontrar um só*/

package entities;
import java.util.Date;

public class Users {

    private Integer id;
    private String firstName;
    private String lastName;
    private Date createdOn;

    public Users(Integer id, String firstName, String lastName, Date createdOn) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.createdOn = createdOn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public String toString() {
        return  id + ","
                + firstName + ","
                + lastName + ","
                + createdOn;
    }
}
