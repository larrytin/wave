// ===================================================================
//
//   WARNING: GENERATED CODE! DO NOT EDIT!
//
// ===================================================================
/*
 This file generated from:

 /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp
*/

package org.waveprotocol.box.server.gxp;

import com.google.gxp.base.*;
import com.google.gxp.css.*;                                                    // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L12, C42
import com.google.gxp.html.*;                                                   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L12, C42
import com.google.gxp.js.*;                                                     // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L12, C42
import com.google.gxp.text.*;                                                   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L12, C42

public class UserRegistrationPage extends com.google.gxp.base.GxpTemplate {     // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L12, C42

  private static final String GXP$MESSAGE_SOURCE = "org.waveprotocol.box.server.gxp";

  public static void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String domain, final String message, final String responseType, final Boolean disableRegistration, final String analyticsAccount)
      throws java.io.IOException {
    final java.util.Locale gxp_locale = gxp_context.getLocale();
    gxp$out.append("<html dir=\"ltr\"><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"");   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L20, C3
    if (gxp_context.isUsingXmlSyntax()) {                                       // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L22, C3
      gxp$out.append(" /");                                                     // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L22, C3
    }
    gxp$out.append(">\n<link type=\"text/css\" rel=\"stylesheet\" href=\"/static/auth.css\"");   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L22, C3
    if (gxp_context.isUsingXmlSyntax()) {                                       // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L23, C3
      gxp$out.append(" /");                                                     // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L23, C3
    }
    gxp$out.append(">\n<title>Register a New Account - Wave in a Box</title>\n<link rel=\"shortcut icon\" href=\"/static/favicon.ico\"");   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L23, C3
    if (gxp_context.isUsingXmlSyntax()) {                                       // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L25, C3
      gxp$out.append(" /");                                                     // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L25, C3
    }
    gxp$out.append(">\n");                                                      // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L25, C3
    org.waveprotocol.box.server.gxp.AnalyticsFragment.write(gxp$out, gxp_context, analyticsAccount, org.waveprotocol.box.server.gxp.AnalyticsFragment.getDefaultError());   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L26, C3
    gxp$out.append("</head>\n<body onload=\"init()\"><table width=\"100%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" style=\"margin-top: 15px\"><tr><td valign=\"top\" style=\"padding-left: 20px; padding-right: 10px\"><img src=\"/static/logo.png\" border=\"0\" width=\"45px\" height=\"30\" align=\"left\" vspace=\"10\" alt=\"Wave in a Box logo\"");   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L21, C3
    if (gxp_context.isUsingXmlSyntax()) {                                       // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L32, C72
      gxp$out.append(" /");                                                     // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L32, C72
    }
    gxp$out.append("></td>\n<td width=\"95%\"><table width=\"100%\" align=\"right\" cellspacing=\"0\" bgcolor=\"#C3D9FF\" dir=\"ltr\"><tr><td class=\"bubble\" style=\"font-family: arial; text-align: left; font-weight: bold; padding-right: 10px;\" dir=\"ltr\"><span><b>Wave in a Box - Register a New Account</b> @");   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L32, C72
    com.google.gxp.html.HtmlAppender.INSTANCE.append(gxp$out, gxp_context, (domain));   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L42, C18
    gxp$out.append("</span></td></tr></table></td></tr></table>\n<table border=\"0\" width=\"100%\" cellpadding=\"1\" cellspacing=\"1\" style=\"margin-top: 10px; padding-left: 20px;\"><tr><td align=\"left\" style=\"height: 20px; padding-right: 10;\"><label id=\"messageLbl\" style=\"display: none;\"></label><span id=\"loginLink\" style=\"display: none;\">&nbsp;Please <a href=\"/auth/signin\">sign in</a>.</span></td></tr>\n<tr><td id=\"wiab_loginbox_td\" valign=\"top\" align=\"center\">");   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L41, C23
    if (disableRegistration == true) {                                          // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L58, C7
      gxp$out.append("Registration disabled by administrator.");                // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L58, C50
    }
    gxp$out.append("\n");                                                       // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L60, C16
    if (disableRegistration == false) {                                         // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L61, C7
      gxp$out.append("<form id=\"regForm\" name=\"regForm\" method=\"post\" action=\"\"><table align=\"left\"><tr><td><table class=\"form-noindent\" align=\"center\" cellspacing=\"5\" cellpadding=\"5\" width=\"100%\" border=\"0\"><tbody><tr><td>Username:</td>\n<td><input id=\"address\" name=\"address\" class=\"wiab le val\" tabindex=\"1\" value=\"\" type=\"text\" style=\"padding-bottom: 0px;\"");   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L62, C7
      if (gxp_context.isUsingXmlSyntax()) {                                     // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L71, C21
        gxp$out.append(" /");                                                   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L71, C21
      }
      gxp$out.append("></td></tr>\n<tr><td style=\"padding: 0px; margin: 0px\"></td>\n<td align=\"right\" style=\"color: #444444; font-size: 75%; overflow: hidden; padding-top: 0px; margin-top: 0px; vertical-align: top;\" dir=\"ltr\">@");   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L71, C21
      com.google.gxp.html.HtmlAppender.INSTANCE.append(gxp$out, gxp_context, (domain));   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L79, C30
      gxp$out.append("</td></tr>\n<tr><td><label for=\"password\">Password:</label></td>\n<td><input id=\"password\" name=\"password\" tabindex=\"2\" autocomplete=\"OFF\" type=\"password\" class=\"wiab le val\"");   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L77, C17
      if (gxp_context.isUsingXmlSyntax()) {                                     // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L83, C21
        gxp$out.append(" /");                                                   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L83, C21
      }
      gxp$out.append("></td></tr>\n<tr><td><label for=\"verifypass\">Re-enter\nPassword:</label></td>\n<td><input id=\"verifypass\" name=\"verifypass\" tabindex=\"3\" autocomplete=\"OFF\" type=\"password\" class=\"wiab le val\"");   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L83, C21
      if (gxp_context.isUsingXmlSyntax()) {                                     // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L90, C21
        gxp$out.append(" /");                                                   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L90, C21
      }
      gxp$out.append("></td></tr></tbody></table>\n<table><tbody><tr><td align=\"center\"><input class=\"wiab le button\" value=\"Cancel\" id=\"buttonStyle\" onclick=\"history.go(-1)\" tabindex=\"4\" type=\"button\"");   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L90, C21
      if (gxp_context.isUsingXmlSyntax()) {                                     // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L99, C36
        gxp$out.append(" /");                                                   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L99, C36
      }
      gxp$out.append("></td>\n<td align=\"center\"><input class=\"wiab le button\" value=\"Register\" id=\"buttonStyle\" tabindex=\"5\" type=\"button\" onclick=\"validate()\"");   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L99, C36
      if (gxp_context.isUsingXmlSyntax()) {                                     // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L102, C36
        gxp$out.append(" /");                                                   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L102, C36
      }
      gxp$out.append("></td></tr></tbody></table></td></tr></table></form>");   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L102, C36
    }
    gxp$out.append("</td></tr></table>\n<table width=\"100%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" style=\"margin-top: 10px\"><tr><td width=\"95%\"><table width=\"100%\" align=\"right\" cellspacing=\"0\" dir=\"ltr\"><tr><td class=\"bubble\" style=\"font-family: arial; text-align: left; font-weight: bold; padding-right: 10px;\" dir=\"ltr\"></td></tr></table></td></tr></table>\n<script type=\"text/javascript\">\n\tvar RESPONSE_STATUS_NONE = \"NONE\";\n\tvar RESPONSE_STATUS_FAILED = \"FAILED\";\n\tvar RESPONSE_STATUS_SUCCESS = \"SUCCESS\";\n\t\n\tvar message = ");   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L57, C7
    com.google.gxp.js.JavascriptAppender.INSTANCE.append(gxp$out, gxp_context, (message));   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L135, C16
    gxp$out.append(";\n\tvar responseType =  ");                                // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L135, C42
    com.google.gxp.js.JavascriptAppender.INSTANCE.append(gxp$out, gxp_context, (responseType));   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L136, C22
    gxp$out.append(";\n\tvar domain = ");                                       // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L136, C53
    com.google.gxp.js.JavascriptAppender.INSTANCE.append(gxp$out, gxp_context, (domain));   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L137, C15
    gxp$out.append(";\n\t\n\tfunction init() {\n\t    setFocus();\n\t    handleResponse(responseType, message);\n\t}\n\t\n\tfunction setFocus() {\n\t    document.getElementById(\"address\").focus();\n\t}\n\t\n\tfunction handleResponse(responseType,message) {\n\t    var messageLbl = document.getElementById(\"messageLbl\");\n\t    if(responseType == RESPONSE_STATUS_SUCCESS) {\n\t        messageLbl.style.display = \"inline\";\n\t        messageLbl.style.color = \"green\";\n\t        messageLbl.innerHTML = message;\n\t        document.getElementById(\"loginLink\").style.display = \"inline\";\n\t    } else if(responseType == RESPONSE_STATUS_FAILED) {\n\t        messageLbl.style.display = \"inline\";\n\t        messageLbl.style.color = \"red\";\n\t        messageLbl.innerHTML = message;\n\t    }\n\t}\n\t\n\tfunction validate() {\n\t    var address = document.getElementById(\"address\").value;\n\t    if (address.length < 1) {\n\t        message = \"Username portion of address cannot be empty\";\n\t        responseType = RESPONSE_STATUS_FAILED;\n\t        handleResponse(responseType,message);\n\t        return;\n\t    }\n\t    if (!isAlphaNumeric(address)) {\n\t        message = \"Only letters (a-z), numbers (0-9), and periods (.) are allowed in Username\";\n\t        responseType = RESPONSE_STATUS_FAILED;\n\t        handleResponse(responseType,message);\n\t        return;\n\t    }\n\t    var password = document.getElementById(\"password\").value;\n\t    var verifypass = document.getElementById(\"verifypass\").value;\n\t    if((password != null &&  verifypass != null) && (password != verifypass)) {\n\t        message = \"Password and password verification do not match!\";\n\t        responseType = RESPONSE_STATUS_FAILED;\n\t        handleResponse(responseType,message);\n\t        return;\n\t    }\n\t    document.getElementById(\"address\").value = address + \"@\" + domain;\n\t    document.getElementById(\"regForm\").submit();\n\t}\n\t\n\tfunction isAlphaNumeric(alphanumericChar) {\n\t    if(alphanumericChar.length == 0 || alphanumericChar.search(/[^a-zA-Z0-9\\.]/g) != -1 )\n\t    {\n\t        return false;\n\t    }\n\t    else\n\t        return true;\n\t}\n  </script></body></html>");   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/UserRegistrationPage.gxp: L137, C40
  }

  private static final java.util.List<String> GXP$ARGLIST = java.util.Collections.unmodifiableList(java.util.Arrays.asList("domain", "message", "responseType", "disableRegistration", "analyticsAccount"));

  /**
   * @return the names of the user defined arguments to this template.
   * This is sort of like a mapping between the positional and named
   * parameters. The first two parameters (common to all templates) are
   * not included in this list. (BTW: No, Java reflection does not
   * provide this information)
   */
  public static java.util.List<String> getArgList() {
    return GXP$ARGLIST;
  }

  private abstract static class TunnelingHtmlClosure
      extends GxpTemplate.TunnelingGxpClosure
      implements com.google.gxp.html.HtmlClosure {
  }

  public static com.google.gxp.html.HtmlClosure getGxpClosure(final String domain, final String message, final String responseType, final Boolean disableRegistration, final String analyticsAccount) {
    return new TunnelingHtmlClosure() {
      public void writeImpl(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context)
          throws java.io.IOException {
        org.waveprotocol.box.server.gxp.UserRegistrationPage.write(gxp$out, gxp_context, domain, message, responseType, disableRegistration, analyticsAccount);
      }
    };
  }

  /**
   * Interface that defines a strategy for writing this GXP
   */
  public interface Interface {
    public void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String domain, final String message, final String responseType, final Boolean disableRegistration, final String analyticsAccount)
        throws java.io.IOException;

    public com.google.gxp.html.HtmlClosure getGxpClosure(final String domain, final String message, final String responseType, final Boolean disableRegistration, final String analyticsAccount);
  }

  /**
   * Instantiable instance of this GXP
   */
  public static class Instance implements Interface {

    public Instance() {
    }

    public void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String domain, final String message, final String responseType, final Boolean disableRegistration, final String analyticsAccount)
        throws java.io.IOException {
      org.waveprotocol.box.server.gxp.UserRegistrationPage.write(gxp$out, gxp_context, domain, message, responseType, disableRegistration, analyticsAccount);
    }

    public com.google.gxp.html.HtmlClosure getGxpClosure(final String domain, final String message, final String responseType, final Boolean disableRegistration, final String analyticsAccount) {
      return new TunnelingHtmlClosure() {
        public void writeImpl(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context)
            throws java.io.IOException {
          Instance.this.write(gxp$out, gxp_context, domain, message, responseType, disableRegistration, analyticsAccount);
        }
      };
    }
  }
}

// ===================================================================
//
//   WARNING: GENERATED CODE! DO NOT EDIT!
//
// ===================================================================
