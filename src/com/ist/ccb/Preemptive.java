/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ist.ccb;

import com.ist.cvp.customcomp.ListTalker;
import com.ist.cvp.customcomp.WrapperAudio;
import java.util.ArrayList;

/**
 *
 * @author KEY
 */
public class Preemptive extends ListTalker {

    String language;
    String EWT;

    @Override
    protected ArrayList<WrapperAudio> setAudioList() {

        language = (String) elementAPI.getSessionData("language");

        EWT = (String) elementAPI.getSessionData("EWT");
        ArrayList<WrapperAudio> EWTList = new ArrayList<WrapperAudio>();

        EWTList.add(new WrapperAudio("CCPreemptivePart1", WrapperAudio.AudioType.STATIC, true));
        EWTList.add(new WrapperAudio(language + "_" + EWT, WrapperAudio.AudioType.NUMBER));
        EWTList.add(new WrapperAudio("CCPreemptivePart2", WrapperAudio.AudioType.STATIC, true));
        EWTList.add(new WrapperAudio("CCStayOnLine", WrapperAudio.AudioType.STATIC, true));

        return EWTList;
    }

    @Override
    protected String classNameGetter() {
        return getClass().getName();
    }

    /**
     * @param args the command line arguments
     */
}
