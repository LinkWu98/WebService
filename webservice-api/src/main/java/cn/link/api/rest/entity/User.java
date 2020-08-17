package cn.link.api.rest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *  基于restful风格的 webservice，客户端与服务端之间通讯可以传递xml数据、json数据
 *  @XmlRootElement 指定对象序列化为xml或json数据时根节点的名称
 *  xml:
 *       <User>
 *           <id></id>
 *           <username></username>
 *           <city></city>
 *       </User>
 *   json:
 *   {"User":  {"id":100,"username":"jack","city":"广州" }}
 *
 */
@Data
@ToString
@XmlRootElement(name = "User")
public class User {

	private Integer id;

	private String username;

	private String city;

	private List<Car> cars = new ArrayList<>();

	public User() {
	}

	public User(Integer id, String username, String city, List<Car> cars) {
		this.id = id;
		this.username = username;
		this.city = city;
		this.cars = cars;
	}
}
