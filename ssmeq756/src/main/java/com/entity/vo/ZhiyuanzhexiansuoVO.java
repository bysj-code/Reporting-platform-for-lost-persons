package com.entity.vo;

import com.entity.ZhiyuanzhexiansuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 志愿者线索
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-31 15:53:23
 */
public class ZhiyuanzhexiansuoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 线索图片
	 */
	
	private String xiansuotupian;
		
	/**
	 * 线索内容
	 */
	
	private String xiansuoneirong;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：线索图片
	 */
	 
	public void setXiansuotupian(String xiansuotupian) {
		this.xiansuotupian = xiansuotupian;
	}
	
	/**
	 * 获取：线索图片
	 */
	public String getXiansuotupian() {
		return xiansuotupian;
	}
				
	
	/**
	 * 设置：线索内容
	 */
	 
	public void setXiansuoneirong(String xiansuoneirong) {
		this.xiansuoneirong = xiansuoneirong;
	}
	
	/**
	 * 获取：线索内容
	 */
	public String getXiansuoneirong() {
		return xiansuoneirong;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
