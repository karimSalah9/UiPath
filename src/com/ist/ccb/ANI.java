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
public class ANI extends ListTalker {

    String language;
    String ANI;

    @Override
    protected ArrayList<WrapperAudio> setAudioList() {

        language = (String) elementAPI.getSessionData("language");
        
        ANI = (String) elementAPI.getSessionData("CallbackNumber");
        ArrayList<WrapperAudio> ANIList = new ArrayList<WrapperAudio>();

        ANIList.add(new WrapperAudio("CCConfirmANIPart1", WrapperAudio.AudioType.STATIC, true));
        ANIList.add(new WrapperAudio(language + "_" + ANI, WrapperAudio.AudioType.DIGIT_BY_DIGIT));
        ANIList.add(new WrapperAudio("CCConfirmANIPart2", WrapperAudio.AudioType.STATIC, true));

        return ANIList;
    }

    @Override
    protected String classNameGetter() {
        return getClass().getName();
    }

    /**
     * @param args the command line arguments
     */
}
