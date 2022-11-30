/*- Purchase (id, productId, userId, quantity, cost, createdOn)
        > proximo id (unique) disponivel gerado sozinho
        > Inserir, Deletar, Atualizar, Ler Todos, Encontrar um só*/

package entities;
import java.util.Date;

public class Purchases {

private Integer id;
private Integer productId;
private Integer userID;
private Integer quantity;
private Integer cost;
private Date createdOn;

    public Purchases(Integer id, Integer productId, Integer userID, Integer quantity, Integer cost, Date createdOn) {
        this.id = id;
        this.productId = productId;
        this.userID = userID;
        this.quantity = quantity;
        this.cost = cost;
        this.createdOn = createdOn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public String toString() {
        return  id +
                "," + productId +
                "," + userID +
                "," + quantity +
                "," + cost +
                "," + createdOn;
    }
}
