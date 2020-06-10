<%-- 
    Document   : addcategory
    Created on : Oct 7, 2019, 9:19:22 AM
    Author     : mrvis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
    * {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    }

    body {
    font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, "Helvetica Neue", Arial, sans-serif;
    color: #333;
    }

    table {
    text-align: left;
    line-height: 40px;
    border-collapse: separate;
    border-spacing: 0;
    border: 2px solid #ed1c40;
    width: 500px;
    margin: 50px auto;
    border-radius: .25rem;
    }

    thead tr:first-child {
    background: #ed1c40;
    color: #fff;
    border: none;
    }

    th:first-child,
    td:first-child {
    padding: 0 15px 0 20px;
    }

    th {
    font-weight: 500;
    }

    thead tr:last-child th {
    border-bottom: 3px solid #ddd;
    }

    tbody tr:hover {
    background-color: #f2f2f2;
    cursor: default;
    }

    tbody tr:last-child td {
    border: none;
    }

    tbody td {
    border-bottom: 1px solid #ddd;
    }

    td:last-child {
    text-align: right;
    padding-right: 10px;
    }

    .button {
    color: #aaa;
    cursor: pointer;
    vertical-align: middle;
    margin-top: -4px;
    }

    .edit:hover {
    color: #0a79df;
    }

    .delete:hover {
    color: #dc2a2a;
    }
    </style>
    <body>
    <h1>Hello World!</h1>
    <table>
    <thead>
    <tr>
    <th colspan="3">Atividades do projeto</th>
    </tr>
    <tr>
    <th>#</th>
    <th colspan="2">Atividade</th>
    </tr>
    </thead>
    <tbody>
    <tr>
    <td>1</td>
    <td>Atualizar página da equipe</td>
    <td>
    <i class="material-icons button edit">edit</i>
    <i class="material-icons button delete">delete</i>
    </td>
    </tr>
    <tr>
    <td>2</td>
    <td>Design da nova marca</td>
    <td>
    <i class="material-icons button edit">edit</i>
    <i class="material-icons button delete">delete</i>
    </td>
    </tr>
    <tr>
    <td>3</td><!DOCTYPE html>
    <html lang="en">
    <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap Table with Add and Delete Row Feature</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round|Open+Sans">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style type="text/css">
    body {
    color: #404E67;
    background: #F5F7FA;
            font-family: 'Open Sans', sans-serif;
    }
    .table-wrapper {
            width: 700px;
            margin: 30px auto;
    background: #fff;
    padding: 20px;	
    box-shadow: 0 1px 1px rgba(0,0,0,.05);
    }
    .table-title {
    padding-bottom: 10px;
    margin: 0 0 10px;
    }
    .table-title h2 {
    margin: 6px 0 0;
    font-size: 22px;
    }
    .table-title .add-new {
    float: right;
            height: 30px;
            font-weight: bold;
            font-size: 12px;
            text-shadow: none;
            min-width: 100px;
            border-radius: 50px;
            line-height: 13px;
    }
    .table-title .add-new i {
            margin-right: 4px;
    }
    table.table {
    table-layout: fixed;
    }
    table.table tr th, table.table tr td {
    border-color: #e9e9e9;
    }
    table.table th i {
    font-size: 13px;
    margin: 0 5px;
    cursor: pointer;
    }
    table.table th:last-child {
    width: 100px;
    }
    table.table td a {
            cursor: pointer;
    display: inline-block;
    margin: 0 5px;
            min-width: 24px;
    }    
    table.table td a.add {
    color: #27C46B;
    }
    table.table td a.edit {
    color: #FFC107;
    }
    table.table td a.delete {
    color: #E34724;
    }
    table.table td i {
    font-size: 19px;
    }
    table.table td a.add i {
    font-size: 24px;
    margin-right: -1px;
    position: relative;
    top: 3px;
    }    
    table.table .form-control {
    height: 32px;
    line-height: 32px;
    box-shadow: none;
    border-radius: 2px;
    }
    table.table .form-control.error {
            border-color: #f50000;
    }
    table.table td .add {
            display: none;
    }
    </style>
<script type="text/javascript">
$(document).ready(function(){
	$('[data-toggle="tooltip"]').tooltip();
	var actions = $("table td:last-child").html();
	// Append table with add row form on add new button click
    $(".add-new").click(function(){
		$(this).attr("disabled", "disabled");
		var index = $("table tbody tr:last-child").index();
        var row = '<tr>' +
            '<td><input type="text" class="form-control" name="name" id="name"></td>' +
            '<td><input type="text" class="form-control" name="department" id="department"></td>' +
            '<td><input type="text" class="form-control" name="phone" id="phone"></td>' +
			'<td>' + actions + '</td>' +
        '</tr>';
    	$("table").append(row);		
		$("table tbody tr").eq(index + 1).find(".add, .edit").toggle();
        $('[data-toggle="tooltip"]').tooltip();
    });
	// Add row on add button click
	$(document).on("click", ".add", function(){
		var empty = false;
		var input = $(this).parents("tr").find('input[type="text"]');
        input.each(function(){
			if(!$(this).val()){
				$(this).addClass("error");
				empty = true;
			} else{
                $(this).removeClass("error");
            }
		});
		$(this).parents("tr").find(".error").first().focus();
		if(!empty){
			input.each(function(){
				$(this).parent("td").html($(this).val());
			});			
			$(this).parents("tr").find(".add, .edit").toggle();
			$(".add-new").removeAttr("disabled");
		}		
    });
	// Edit row on edit button click
	$(document).on("click", ".edit", function(){		
        $(this).parents("tr").find("td:not(:last-child)").each(function(){
			$(this).html('<input type="text" class="form-control" value="' + $(this).text() + '">');
		});		
		$(this).parents("tr").find(".add, .edit").toggle();
		$(".add-new").attr("disabled", "disabled");
    });
	// Delete row on delete button click
	$(document).on("click", ".delete", function(){
        $(this).parents("tr").remove();
		$(".add-new").removeAttr("disabled");
    });
});
</script>
</head>
<body>
    <div class="container">
        <div class="table-wrapper">
            <div class="table-title">
                <div class="row">
                    <div class="col-sm-8"><h2>Employee <b>Details</b></h2></div>
                    <div class="col-sm-4">
                        <button type="button" class="btn btn-info add-new"><i class="fa fa-plus"></i> Add New</button>
                    </div>
                </div>
            </div>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Department</th>
                        <th>Phone</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>John Doe</td>
                        <td>Administration</td>
                        <td>(171) 555-2222</td>
                        <td>
							<a class="add" title="Add" data-toggle="tooltip"><i class="material-icons">&#xE03B;</i></a>
                            <a class="edit" title="Edit" data-toggle="tooltip"><i class="material-icons">&#xE254;</i></a>
                            <a class="delete" title="Delete" data-toggle="tooltip"><i class="material-icons">&#xE872;</i></a>
                        </td>
                    </tr>
                    <tr>
                        <td>Peter Parker</td>
                        <td>Customer Service</td>
                        <td>(313) 555-5735</td>
                        <td>
							<a class="add" title="Add" data-toggle="tooltip"><i class="material-icons">&#xE03B;</i></a>
                            <a class="edit" title="Edit" data-toggle="tooltip"><i class="material-icons">&#xE254;</i></a>
                            <a class="delete" title="Delete" data-toggle="tooltip"><i class="material-icons">&#xE872;</i></a>
                        </td>
                    </tr>
                    <tr>
                        <td>Fran Wilson</td>
                        <td>Human Resources</td>
                        <td>(503) 555-9931</td>
                        <td>
							<a class="add" title="Add" data-toggle="tooltip"><i class="material-icons">&#xE03B;</i></a>
                            <a class="edit" title="Edit" data-toggle="tooltip"><i class="material-icons">&#xE254;</i></a>
                            <a class="delete" title="Delete" data-toggle="tooltip"><i class="material-icons">&#xE872;</i></a>
                        </td>
                    </tr>      
                </tbody>
            </table>
        </div>
    </div>     
</body>
</html>                            
      <td>Encontrar desenvolvedor front-end</td>
      <td>
        <i class="material-icons button edit">edit</i>
        <i class="material-icons button delete">delete</i>
      </td>
    </tr>
  </tbody>
</table>
    </body>
</html>
