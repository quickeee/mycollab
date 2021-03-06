/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mycollab.common.dao;

import com.mycollab.common.domain.CustomerFeedbackExample;
import com.mycollab.common.domain.CustomerFeedbackWithBLOBs;
import com.mycollab.db.persistence.ICrudGenericDAO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface CustomerFeedbackMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    long countByExample(CustomerFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    int deleteByExample(CustomerFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    int insert(CustomerFeedbackWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    int insertSelective(CustomerFeedbackWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    List<CustomerFeedbackWithBLOBs> selectByExampleWithBLOBs(CustomerFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    CustomerFeedbackWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    int updateByExampleSelective(@Param("record") CustomerFeedbackWithBLOBs record, @Param("example") CustomerFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    int updateByExampleWithBLOBs(@Param("record") CustomerFeedbackWithBLOBs record, @Param("example") CustomerFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    int updateByPrimaryKeySelective(CustomerFeedbackWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    int updateByPrimaryKeyWithBLOBs(CustomerFeedbackWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    Integer insertAndReturnKey(CustomerFeedbackWithBLOBs value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    void massUpdateWithSession(@Param("record") CustomerFeedbackWithBLOBs record, @Param("primaryKeys") List primaryKeys);
}