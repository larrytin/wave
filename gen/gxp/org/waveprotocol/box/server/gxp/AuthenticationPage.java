// ===================================================================
//
//   WARNING: GENERATED CODE! DO NOT EDIT!
//
// ===================================================================
/*
 This file generated from:

 /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp
*/

package org.waveprotocol.box.server.gxp;

import com.google.gxp.base.*;
import com.google.gxp.css.*;                                                    // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L27, C42
import com.google.gxp.html.*;                                                   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L27, C42
import com.google.gxp.js.*;                                                     // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L27, C42
import com.google.gxp.text.*;                                                   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L27, C42

public class AuthenticationPage extends com.google.gxp.base.GxpTemplate {       // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L27, C42

  private static final String GXP$MESSAGE_SOURCE = "org.waveprotocol.box.server.gxp";

  public static void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String domain, final String message, final String responseType, final String analyticsAccount)
      throws java.io.IOException {
    final java.util.Locale gxp_locale = gxp_context.getLocale();
    gxp$out.append("<html dir=\"ltr\"><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"");   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L34, C3
    if (gxp_context.isUsingXmlSyntax()) {                                       // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L36, C3
      gxp$out.append(" /");                                                     // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L36, C3
    }
    gxp$out.append(">\n<link type=\"text/css\" rel=\"stylesheet\" href=\"/static/auth.css\"");   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L36, C3
    if (gxp_context.isUsingXmlSyntax()) {                                       // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L37, C3
      gxp$out.append(" /");                                                     // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L37, C3
    }
    gxp$out.append(">\n<link rel=\"shortcut icon\" href=\"/static/favicon.ico\"");   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L37, C3
    if (gxp_context.isUsingXmlSyntax()) {                                       // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L38, C3
      gxp$out.append(" /");                                                     // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L38, C3
    }
    gxp$out.append(">\n<title>Wave in a Box login</title>\n");                  // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L38, C3
    org.waveprotocol.box.server.gxp.AnalyticsFragment.write(gxp$out, gxp_context, analyticsAccount, org.waveprotocol.box.server.gxp.AnalyticsFragment.getDefaultError());   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L40, C3
    gxp$out.append("</head>\n<body onload=\"init()\"><table width=\"100%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" style=\"margin-top: 15px\"><tr><td valign=\"top\" style=\"padding-left: 20px; padding-right: 10px\"><img src=\"/static/logo.png\" border=\"0\" width=\"45px\" height=\"30\" align=\"left\" vspace=\"10\" alt=\"Wave in a Box logo\"");   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L35, C3
    if (gxp_context.isUsingXmlSyntax()) {                                       // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L47, C7
      gxp$out.append(" /");                                                     // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L47, C7
    }
    gxp$out.append("></td>\n<td width=\"95%\" bgcolor=\"#ffffff\"><table width=\"100%\" align=\"right\" cellspacing=\"0\" dir=\"ltr\"><tr><td class=\"bubble\" style=\"font-family: arial; text-align: left; font-weight: bold; padding-right: 10px;\" dir=\"ltr\"><b>Welcome to Wave in a Box</b> @");   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L47, C7
    com.google.gxp.html.HtmlAppender.INSTANCE.append(gxp$out, gxp_context, (domain));   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L54, C57
    gxp$out.append("</td></tr></table></td></tr></table>\n<table border=\"0\" width=\"100%\" cellpadding=\"1\" cellspacing=\"1\" style=\"margin-top: 10px;\"><tr><td valign=\"top\"><table><td><div style=\"margin: 0 75px 0 25px;\"><span style=\"font-weight: bold; font-size: larger\">Apache Wave lets you communicate and collaborate in real time</span>\n<p><img src=\"/static/document.png\" class=\"icon\" alt=\"Doc pic.\"");   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L52, C11
    if (gxp_context.isUsingXmlSyntax()) {                                       // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L72, C13
      gxp$out.append(" /");                                                     // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L72, C13
    }
    gxp$out.append(">\n<b>Wave is equal parts conversation and document.</b>\nPeople can communicate and work together with richly formatted text,\ngadgets, robots and more.</p>\n<p><img src=\"/static/earth.png\" class=\"icon\" alt=\"Shared pic.\"");   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L72, C13
    if (gxp_context.isUsingXmlSyntax()) {                                       // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L78, C13
      gxp$out.append(" /");                                                     // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L78, C13
    }
    gxp$out.append(">\n<b>Wave is shared.</b> Any participant can reply anywhere in the message,\nedit the content and add participants at any point in the process.</p>\n<p><img src=\"/static/microphone.png\" class=\"icon\" style=\"padding: 0 5px; height: 29px; width: 18px\" alt=\"Microphone pic.\"");   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L78, C13
    if (gxp_context.isUsingXmlSyntax()) {                                       // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L83, C13
      gxp$out.append(" /");                                                     // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L83, C13
    }
    gxp$out.append(">\n<b>Wave is live.</b>\nWith live transmission as you type, participants on a wave can have faster\nconversations, see edits and interact with extensions in real-time.</p>\n<div><br");   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L83, C13
    if (gxp_context.isUsingXmlSyntax()) {                                       // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L90, C9
      gxp$out.append(" /");                                                     // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L90, C9
    }
    gxp$out.append(">\n<a href=\"/static/wiab_screenshot.jpg\" target=\"_blank\" title=\"Click to enlarge\"><img src=\"/static/wiab_screenshot_small.jpg\" style=\"float: right; align: right; margin: 0 25px 0 35px;\" alt=\"WIAB client.\"");   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L90, C9
    if (gxp_context.isUsingXmlSyntax()) {                                       // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L92, C11
      gxp$out.append(" /");                                                     // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L92, C11
    }
    gxp$out.append("></a>\n<p style=\"width: 60%;\"><ul><li>Apache Wave is a rich, distributed, real-time collaboration platform,\nwhich allows users to work together in new and exciting ways.</li>\n<li><a href=\"http://incubator.apache.org/wave/\" target=\"_blank\">&quot;Wave in a Box&quot; (WIAB)</a>\nproject is a stand alone wave server and rich web client that can\nserve as an Apache Wave reference implementation.</li>\n<li>This project lets developers and\nenterprise users run wave servers and host waves on their own hardware.\nAnd then share those waves with other wave servers.</li></ul></p></div></div></td></table></td>\n<td valign=\"top\" align=\"center\" style=\"padding-right: 30px\"><form id=\"wiab_loginform\" action=\"\" method=\"post\"><table class=\"form-noindent\" style=\"padding: 1;\" border=\"0\" align=\"right\"><tr><td valign=\"top\" style=\"text-align: center\" class=\"loginBox\" width=\"260px\"><table align=\"center\" border=\"0\" cellpadding=\"1\" cellspacing=\"0\" style=\"margin: auto;\"><tr><td class=\"smallfont\" colspan=\"2\" align=\"center\">Sign\nin\n<h2>Wave in a Box</h2></td></tr>\n<tr><td colspan=\"2\" align=\"center\"></td></tr>\n<tr><td><div align=\"right\"><span class=\"wiab le lbl\">Username:</span></div></td>\n<td><input type=\"text\" name=\"address\" id=\"address\" size=\"22\" value=\"\" class=\"wiab le val\"");   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L92, C11
    if (gxp_context.isUsingXmlSyntax()) {                                       // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L143, C19
      gxp$out.append(" /");                                                     // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L143, C19
    }
    gxp$out.append("></td></tr>\n<tr><td></td>\n<td align=\"right\" style=\"color: #444444; font-size: 75%; overflow: hidden; padding-top: 0px\" dir=\"ltr\">@");   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L143, C19
    com.google.gxp.html.HtmlAppender.INSTANCE.append(gxp$out, gxp_context, (domain));   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L150, C28
    gxp$out.append("</td></tr>\n<tr><td></td>\n<td align=\"right\"></td></tr>\n<tr class=\"enabled\"><td align=\"right\"><span class=\"wiab le lbl\">Password:</span></td>\n<td><input type=\"password\" name=\"password\" id=\"password\" size=\"22\" class=\"wiab le val\"");   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L148, C15
    if (gxp_context.isUsingXmlSyntax()) {                                       // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L159, C19
      gxp$out.append(" /");                                                     // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L159, C19
    }
    gxp$out.append("></td></tr>\n<tr><td></td>\n<td align=\"center\" style=\"font-size: 75%; overflow: hidden;\" width=\"40px\"><label id=\"messageLbl\" style=\"display: none;\"></label></td></tr>\n<tr><td></td>\n<td align=\"left\"><input type=\"submit\" class=\"wiab le button\" name=\"signIn\" id=\"signIn\" value=\"Sign in\"");   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L159, C19
    if (gxp_context.isUsingXmlSyntax()) {                                       // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L170, C32
      gxp$out.append(" /");                                                     // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L170, C32
    }
    gxp$out.append("></td></tr></table>\n<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"><tr><td colspan=\"2\" height=\"20\" align=\"center\" valign=\"bottom\"><div style=\"font-size: 12px; margin-left: 15px; margin-top: 5px; background-color: d3d4d6; text-align: center;\">Don&#39;t have a Wave in a Box @");   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L170, C32
    com.google.gxp.html.HtmlAppender.INSTANCE.append(gxp$out, gxp_context, (domain));   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L181, C43
    gxp$out.append("\naccount?</div>\n<div><span><a style=\"color: #0066cc; margin-left: 15px;\" href=\"/auth/register\">Register a new account</a></span></div></td></tr></table></td></tr></table></form></td></tr></table>\n<table width=\"100%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" style=\"margin-top: 10px\"><tr><td width=\"95%\" bgcolor=\"#ffffff\"><table width=\"100%\" align=\"right\" cellspacing=\"0\" bgcolor=\"#C3D9FF\" dir=\"ltr\"><tr><td class=\"bubble\" style=\"font-family: arial; text-align: left; font-weight: bold; padding-right: 10px;\" dir=\"ltr\"></td></tr></table></td></tr></table>\n<br");   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L181, C69
    if (gxp_context.isUsingXmlSyntax()) {                                       // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L211, C3
      gxp$out.append(" /");                                                     // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L211, C3
    }
    gxp$out.append(">\n<br");                                                   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L211, C3
    if (gxp_context.isUsingXmlSyntax()) {                                       // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L212, C3
      gxp$out.append(" /");                                                     // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L212, C3
    }
    gxp$out.append(">\n<script type=\"text/javascript\">\n    var RESPONSE_STATUS_NONE = \"NONE\";\n    var RESPONSE_STATUS_FAILED = \"FAILED\";\n    var RESPONSE_STATUS_SUCCESS = \"SUCCESS\";\n    \n    var message = ");   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L212, C3
    com.google.gxp.js.JavascriptAppender.INSTANCE.append(gxp$out, gxp_context, (message));   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L218, C19
    gxp$out.append(";\n    var responseType = ");                               // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L218, C45
    com.google.gxp.js.JavascriptAppender.INSTANCE.append(gxp$out, gxp_context, (responseType));   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L219, C24
    gxp$out.append(";\n    \n    function init() {\n        setFocus();\n        handleResponse(responseType, message);\n    }\n    \n    function setFocus() {\n        document.getElementById(\"address\").focus();\n    }\n    \n    function handleResponse(responseType, message) {\n        var messageLbl = document.getElementById(\"messageLbl\");\n        if (responseType == RESPONSE_STATUS_NONE) {\n            messageLbl.style.display = \"none\";\n        } else if (responseType == RESPONSE_STATUS_FAILED) {\n            messageLbl.style.display = \"inline\";\n            messageLbl.style.color = \"red\";\n            messageLbl.innerHTML = message;\n        }\n    }\n  </script></body></html>");   // /Users/retechretech/dev/tools/lib/wave/src/org/waveprotocol/box/server/gxp/AuthenticationPage.gxp: L219, C55
  }

  private static final java.util.List<String> GXP$ARGLIST = java.util.Collections.unmodifiableList(java.util.Arrays.asList("domain", "message", "responseType", "analyticsAccount"));

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

  public static com.google.gxp.html.HtmlClosure getGxpClosure(final String domain, final String message, final String responseType, final String analyticsAccount) {
    return new TunnelingHtmlClosure() {
      public void writeImpl(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context)
          throws java.io.IOException {
        org.waveprotocol.box.server.gxp.AuthenticationPage.write(gxp$out, gxp_context, domain, message, responseType, analyticsAccount);
      }
    };
  }

  /**
   * Interface that defines a strategy for writing this GXP
   */
  public interface Interface {
    public void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String domain, final String message, final String responseType, final String analyticsAccount)
        throws java.io.IOException;

    public com.google.gxp.html.HtmlClosure getGxpClosure(final String domain, final String message, final String responseType, final String analyticsAccount);
  }

  /**
   * Instantiable instance of this GXP
   */
  public static class Instance implements Interface {

    public Instance() {
    }

    public void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String domain, final String message, final String responseType, final String analyticsAccount)
        throws java.io.IOException {
      org.waveprotocol.box.server.gxp.AuthenticationPage.write(gxp$out, gxp_context, domain, message, responseType, analyticsAccount);
    }

    public com.google.gxp.html.HtmlClosure getGxpClosure(final String domain, final String message, final String responseType, final String analyticsAccount) {
      return new TunnelingHtmlClosure() {
        public void writeImpl(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context)
            throws java.io.IOException {
          Instance.this.write(gxp$out, gxp_context, domain, message, responseType, analyticsAccount);
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
