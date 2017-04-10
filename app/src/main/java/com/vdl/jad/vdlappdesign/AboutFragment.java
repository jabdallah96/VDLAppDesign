package com.vdl.jad.vdlappdesign;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static android.R.attr.text;

/**
 * Created by jad on 2/13/17.
 */

public class AboutFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_about, container, false);

        TextView tv = (TextView) rootView.findViewById(R.id.about_text);

        tv.setText("Very often, brand names end up identifying to the product itself. Examples of this phenomenon are too many to list, and in Lebanon, the sentence \"Turn the radio on\", always means: \"Tune up to the Voice of Lebanon\".In fact, throughout its 42 years of existence, the Societe Moderne d'Information has always been \"THE RADIO\".\n" +
                "\n" +
                "\n" +
                "Founded in 1975, the Voice of Lebanon was then the first commercial radio to ever broadcast in Lebanon. Drawing on its tank of highly qualified personnel, it has always given the best in the fields of news, political forums, interviews, music, social issues, sketches, culture, games, and broadcast theater. Radio Voice of Lebanon is owned by an independent Lebanese shareholding company, the Societe Moderne d'Information SAL.\n" +
                "\n" +
                "\nThe Voice of Lebanon currently broadcasts on the following FM wavelengths: Beirut: 93.3 MHz. Northern Lebanon: 93.5 MHz Southern Lebanon,Beqaa,Batroun,Akkar: 93.1 MHz.\n" +
                "\n" +
                "\n" +
                "In addition to its online presence, VDL is being relayed in Canada by the Middle East Radio. In Beirut, the Voice of Lebanon retransmits live, the British Broadcasting Corporation (BBC), and Germany's International Broadcaster:Deutshe Welle (DW) through a partnership agreement with both stations.\n" +
                "\n" +
                "\n" +
                "In Lebanon we say that \"Radio Voice of Lebanon broadcast the event before it even happens!\" Enjoy surfing our site and listening to our Radio.");

        return rootView;
    }


}
