package com.hepo.c2c.social.govern.report.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 举报任务实体类
 *
 * @author linhaibo
 */
@Data
@NoArgsConstructor
@TableName(value = "report_task")
public class ReportTask {

    public static final Integer VOTE_RESULT_UNKNOWN = -1;
    public static final Integer VOTE_RESULT_APPROVED = 1;
    public static final Integer VOTE_RESULT_UNAPPROVED = 2;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField(value = "`type`")
    private String type;

    @TableField(value = "report_user_id")
    private Integer reportUserId;

    @TableField(value = "report_content")
    private String reportContent;

    @TableField(value = "target_id")
    private Integer targetId;

    @TableField(value = "vote_result")
    private Integer voteResult;

    public static final String COL_ID = "id";

    public static final String COL_TYPE = "type";

    public static final String COL_REPORT_USER_ID = "report_user_id";

    public static final String COL_REPORT_CONTENT = "report_content";

    public static final String COL_TARGET_ID = "target_id";

    public static final String COL_VOTE_RESULT = "vote_result";
}