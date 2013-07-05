package message;

import javax.persistence.*;

@Entity
@Table(name="messages")
public class Message {
	@Id
	@Column
	Integer id;
	public Integer getid(){return this.id;}
	public void setid(Integer id){this.id = id;}
	
	@Column
	Integer sendtime;
	public Integer getsendtime(){return this.sendtime;}
	public void setsendtime(Integer sendtime){this.sendtime = sendtime;}
	
	@Column(length = 256)
	String text;
	public String gettext(){return this.text;}
	public void settext(String text){this.text = text;}
	
	@Column(name = "accid")
	Integer accountid;
	public Integer getaccountid(){return this.accountid;}
	public void setaccountid(Integer accountid){this.accountid = accountid;}
	
	public Message(){};
	public Message(Integer id, Integer sendtime, String text, Integer accountid){
		this.id = id;
		this.sendtime = sendtime;
		this.text = text;
		this.accountid = accountid;
		}
}
