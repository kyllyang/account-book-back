package xyz.ksevo.accountbook.util;

import xyz.ksevo.accountbook.entity.AbRecordTag;

/**
 * User: Kyll
 * Date: 2024-08-10 16:02
 */
public final class AbAssist {
    public static AbRecordTag createAbRecordTag(String recordCode, String tagCode) {
        AbRecordTag abRecordTag = new AbRecordTag();
        abRecordTag.setRecordCode(recordCode);
        abRecordTag.setTagCode(tagCode);
        return abRecordTag;
    }
}
