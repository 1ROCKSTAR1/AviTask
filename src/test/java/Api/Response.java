package Api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Response {

    private String createdAt;
    private String id;
    private String name;
    private int price;
    private int sellerId;
    private Statistics statistics;
}
