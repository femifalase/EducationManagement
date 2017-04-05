package commons;

/**
 * Created by FEMI on 2017-04-05.
 * @author Femi Falase
 */
@ContactDetail(contactDetailType = ContactDetailType.EMAIL)
public class Email {

    private String emailDomain;
    private String emailxxxxxx;

    public Email(String emailDomain, String emailxxxxxx) {
        this.emailDomain = emailDomain;
        this.emailxxxxxx = emailxxxxxx;
    }

    public String getEmailDomain() {
        return emailDomain;
    }

    public void setEmailDomain(String emailDomain) {
        this.emailDomain = emailDomain;
    }

    public String getEmailxxxxxx() {
        return emailxxxxxx;
    }

    public void setEmailxxxxxx(String emailxxxxxx) {
        this.emailxxxxxx = emailxxxxxx;
    }

    @Override
    public String toString() {
        return  emailxxxxxx+"@"+emailDomain;

    }
}
