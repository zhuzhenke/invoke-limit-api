package com.method.invoke;

import java.util.HashMap;

/**
 * 回调附件类
 *
 * @author zhuzhenke
 * @date 2018/03/20
 */
public class DefaultAttachment {
    protected HashMap<Object, Object> attachmentMap;

    public HashMap<Object, Object> getAttachmentMap() {
        return attachmentMap;
    }

    public void setAttachmentMap(HashMap<Object, Object> attachmentMap) {
        this.attachmentMap = attachmentMap;
    }

    public void put(Object key, Object value) {
        if (attachmentMap == null) {
            attachmentMap = new HashMap<Object, Object>();
        }
        attachmentMap.put(key, value);
    }

    public Object get(Object key) {
        if (attachmentMap == null) {
            return null;
        }
        return attachmentMap.get(key);
    }
}
