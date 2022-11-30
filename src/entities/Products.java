/*- Product (id, name, description, price, quantity, createOn, updatedOn)
        > proximo id (unique) disponivel gerado sozinho
        > Inserir, Deletar, Atualizar, Ler Todos, Encontrar um só*/

package entities;
import java.util.Date;

public class Products {

    private Integer id;
    private String name;
    private Long description;
    private Integer price;
    private Integer quantity;
    private Date createdOn;
    private Date updatedOn;

    public Products(Integer id, String name, Long description, Integer price, Integer quantity, Date createdOn, Date updatedOn) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getDescription() {
        return description;
    }

    public void setDescription(Long description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        return id +
                "," + name +
                "," + description +
                "," + price +
                "," + quantity +
                "," + createdOn +
                "," + updatedOn;
    }
}
