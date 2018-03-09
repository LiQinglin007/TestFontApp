package com.li.xiaomi.testfontapp.font;

import com.joanzapata.iconify.Icon;

/**
 * 作者：dell or Xiaomi Li
 * 时间： 2018/3/9
 * 内容：自定义字体图片库
 * 最后修改：
 */

public enum TestIcons implements Icon {
    icon_setting('\ue61b'),
    icon_xiangjiaosuliao('\ue643'),
    icon_indemnity('\ue687'),
    icon_return('\ue688'),
    icon_brain('\ue79f');

    private char character;

    TestIcons(char character) {
        this.character = character;
    }

    @Override
    public String key() {
        return name().replace('_', '-');
    }

    @Override
    public char character() {
        return character;
    }
}
