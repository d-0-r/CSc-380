package com.eng2bsl.app;

import java.util.HashMap;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Sample {
  public static String sampleHTML = "<video id=\"video_con_signasl_1\" class=\"video-js vjs-default-skin\" controls preload=\"none\" width=\"320\" height=\"240\" poster=\"https://media.signbsl.com/img/signstationposter.jpg\" data-setup=\"{}\" rel=\"noreferrer\"><source src=\"https://media.signbsl.com/videos/bsl/signstation/reindeer.mp4\"  type=\"video/mp4\" /><p>Your browser does not support HTML5 video.</p></video><br />" +
															      "<div style=\"float:left\"><i>reindeer</i> <span style=\"color:#666; font-size:80%;\">- SignStation</span></div>" +
                            				"</div>" +
															      "<div style=\"clear:both\"><!-- --></div>" +
			                              "<p><!-- --></p>"+
                          					"<p><i>Similiar / Same:</i> <a href=\"/sign/caribou\">caribou</a>, <a href=\"/sign/greenland-caribou\">Greenland caribou</a>, <a href=\"/sign/rangifer-tarandus\">Rangifer tarandus</a></p>"+
                          					"<p><i>Categories:</i> <a href=\"/sign/deer\">deer</a>, <a href=\"/sign/cervid\">cervid</a></p>"+
                          					"<p><i>Within this category:</i> <a href=\"/sign/woodland-caribou\">woodland caribou</a>, <a href=\"/sign/barren-ground-caribou\">barren ground caribou</a></p>"+
                          					"</div>"+
                                		"</div>"+
                                	  "</div>";

  public static void main(String[] args) {
    helperFunctions helper = new helperFunctions();
    HashMap<Character, String> letters = helper.makeLettersMap();
    String[] sampleArray = helper.lettersForWord("SamplewORD", letters);
    for (int i = 0; i < "SamplewORD".length(); i++)
      System.out.println(sampleArray[i]);
    String rightURL = helper.getUrl(sampleHTML);
    System.out.println(rightURL);
  }
}
