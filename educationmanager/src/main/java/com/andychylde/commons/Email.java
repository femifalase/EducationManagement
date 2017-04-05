package com.andychylde.commons;

/**
 * Created by FEMI on 2017-04-05.
 *
 * @author Femi Falase
 * @version 0.0.1
 */
@ContactDetail(contactDetailType = ContactDetailType.EMAIL)
public class Email {

    private String emailDomain;
    private String emailPrefix;

    public Email(String emailDomain, String emailPrefix) {
        this.emailDomain = emailDomain;
        this.emailPrefix = emailPrefix;
    }

    public String getEmailDomain() {
        return emailDomain;
    }

    public void setEmailDomain(String emailDomain) {
        this.emailDomain = emailDomain;
    }

    public String getemailPrefix() {
        return emailPrefix;
    }

    public void setemailPrefix(String emailPrefix) {
        this.emailPrefix = emailPrefix;
    }

    @Override
    public String toString() {
        return emailPrefix + "@" + emailDomain;

    }
}
