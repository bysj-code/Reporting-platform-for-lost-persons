package com.entity.view;

import com.entity.ZhiyuanzhexiansuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 志愿者线索
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-31 15:53:23
 */
@TableName("zhiyuanzhexiansuo")
public class ZhiyuanzhexiansuoView  extends ZhiyuanzhexiansuoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhiyuanzhexiansuoView(){
	}
 
 	public ZhiyuanzhexiansuoView(ZhiyuanzhexiansuoEntity zhiyuanzhexiansuoEntity){
 	try {
			BeanUtils.copyProperties(this, zhiyuanzhexiansuoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
