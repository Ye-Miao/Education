package com.weike.education.widget.section;

import com.weike.education.R;

/**
 * @author ym  作者 E-mail: 15622113269@163.com
 * 描述:增加头部或者尾部
 */

public class HeadOrFooterSection extends StatelessSection {

    public ViewHolder holder;

    public HeadOrFooterSection(int headerResourceId) {
        super(headerResourceId, R.layout.layout_empty);
    }

    @Override
    public void onBindHeaderViewHolder(ViewHolder holder) {
        this.holder = holder;
    }
}
