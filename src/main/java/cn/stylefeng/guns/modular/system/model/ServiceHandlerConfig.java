package cn.stylefeng.guns.modular.system.model;

import java.io.Serializable;
import java.util.Date;

public class ServiceHandlerConfig implements Serializable {
    private Long id;

    private String requestUrl;

    private String requestMethod;

    private String protocol;

    private String category;

    private String invoking;

    private Long asynType;

    private Long status;

    private String version;

    private Date createTime;

    private String createBy;

    private Date updateTime;

    private String updateBy;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl == null ? null : requestUrl.trim();
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod == null ? null : requestMethod.trim();
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol == null ? null : protocol.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getInvoking() {
        return invoking;
    }

    public void setInvoking(String invoking) {
        this.invoking = invoking == null ? null : invoking.trim();
    }

    public Long getAsynType() {
        return asynType;
    }

    public void setAsynType(Long asynType) {
        this.asynType = asynType;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", requestUrl=").append(requestUrl);
        sb.append(", requestMethod=").append(requestMethod);
        sb.append(", protocol=").append(protocol);
        sb.append(", category=").append(category);
        sb.append(", invoking=").append(invoking);
        sb.append(", asynType=").append(asynType);
        sb.append(", status=").append(status);
        sb.append(", version=").append(version);
        sb.append(", createTime=").append(createTime);
        sb.append(", createBy=").append(createBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}