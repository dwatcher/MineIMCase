package org.meim.entity;

import java.util.Date;

public class Relation extends BaseEntity {
    private Integer relationId;

    private Integer usera;

    private Integer userb;

    private Date createTime;

    public Integer getRelationId() {
        return relationId;
    }

    public void setRelationId(Integer relationId) {
        this.relationId = relationId;
    }

    public Integer getUsera() {
        return usera;
    }

    public void setUsera(Integer usera) {
        this.usera = usera;
    }

    public Integer getUserb() {
        return userb;
    }

    public void setUserb(Integer userb) {
        this.userb = userb;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", relationId=").append(relationId);
        sb.append(", usera=").append(usera);
        sb.append(", userb=").append(userb);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Relation other = (Relation) that;
        return (this.getRelationId() == null ? other.getRelationId() == null : this.getRelationId().equals(other.getRelationId()))
            && (this.getUsera() == null ? other.getUsera() == null : this.getUsera().equals(other.getUsera()))
            && (this.getUserb() == null ? other.getUserb() == null : this.getUserb().equals(other.getUserb()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRelationId() == null) ? 0 : getRelationId().hashCode());
        result = prime * result + ((getUsera() == null) ? 0 : getUsera().hashCode());
        result = prime * result + ((getUserb() == null) ? 0 : getUserb().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }
}