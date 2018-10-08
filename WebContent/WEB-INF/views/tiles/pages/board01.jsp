<%@ page contentType="text/html; charset=UTF-8" pageEncoding="EUC-KR"%>
<script type="text/javascript">
	$(document).ready(function() {
		$.ajax ({
        	url: '/SeoroHome7/getBoardList',
    		method: 'get',
			dataType: 'json',
			success: function(data){
				 $('#boardTab').DataTable( {
				 	dom: 'Bfrtip',
				 	buttons: [
			            'csv','pdf'
			        ],
			        data: JSON.parse(data.select_boardList).record,
			    	columns: [
			    		{"data": "VIEW_COUNT"},
			    		{"data": "CREATE_USER"},
			    		{"data": "TITLE"},
			    		{"data": "CONTENT"},
			    		{"data": "CONTENT_ID"}
			    	]
			    } );
			}
    	})
	} );
</script>
Hello Seoro!!!
<table id="boardTab" class="display" style="width:100%">
	<thead>
	    <tr>
	        <th>VIEW_COUNT</th>
	        <th>CREATE_USER</th>
	        <th>TITLE</th>
	        <th>CONTENT</th>
	        <th>CONTENT_ID</th>
	    </tr>
	</thead>	
	<tfoot>
	    <tr>
	        <th>VIEW_COUNT</th>
	        <th>CREATE_USER</th>
	        <th>TITLE</th>
	        <th>CONTENT</th>
	        <th>CONTENT_ID</th>
	    </tr>
	</tfoot>
</table>