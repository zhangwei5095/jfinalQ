<#include "/com/uikoo9/util/jfinal/view/common/inc.ftl"/>

<@bslist qpage=qpage>
	<@bstable>
		<thead>
			<tr>
		        <th><input type="checkbox" class="allcheck"/></th>
				<th>捐助人姓名</th>
				<th>捐助金额</th>
				<th>捐助类型</th>
				<th>捐助寄语</th>
				<th>创建时间</th>
				
				
								
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
		    <#list qpage.list?if_exists as row>
			    <tr data="id:${row.id};">
			        <td><input type="checkbox" class="onecheck"/></td>
				    <td>${(row.other_donate_name)!}</td>				    
					<td>${(row.other_donate_money)!}</td>				    
					<td>${(row.other_donate_type)!}</td>				    
					<td>${(row.other_donate_message)!}</td>				    
					<td>${(row.cdate)!}</td>				    
									    
									    
					<td>
			        	<@bsbutton size='xs' icon='pencil' class='editbtn'/>
			        	<@bsbutton size='xs' icon='remove' class='delbtn'/>
			        </td>
			    </tr>
		    </#list>
		</tbody>
	</@bstable>
</@bslist>