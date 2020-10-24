<%--
  Created by IntelliJ IDEA.
  User: Christian Mada-Mbari
  Date: 10/22/2020
  Time: 11:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%--<link rel="stylesheet" href="../css/todolist_card.css" />--%>
<head>

    <link href='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css'>
    <script src='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js'></script>
    <link href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.0.3/css/font-awesome.css'>
    <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
    <link href="https://cdn.materialdesignicons.com/5.4.55/css/materialdesignicons.min.css" media="all" rel="stylesheet"
          type="text/css"/>


    <script src="https://kit.fontawesome.com/b99e675b6e.js"></script>

    <link type="text/css" rel="stylesheet" href="../css/todolist_card.css">
    <script src="../../js/todolist.js" type="text/javascript"></script>
    <title>Todolist | Tasks</title>
    <link type="text/css" rel="stylesheet" href="../css/style.css">

</head>
<body>
<nav class="navbar">
    <a class="nav_todolist" href="#">Todolist</a>
    <ul class="nav">
        <li class="nav_item"><a class="nav_link" th:href="@{/admin/login}">Se déconnecter</a></li>
    </ul>
</nav>

<div class="wrapper">
    <div class="sidebar">
        <h2></h2>
        <ul>
            <li><a th:href=@{/admin/tasks}><i class="fas fa-tasks"></i>Tasks</a></li>
            <li><a th:href=@{/admin/users}><i class="fas fa-users"></i>Users</a></li>
        </ul>
    </div>
    <div class="page-content page-container" id="page-content">
        <div class="padding">
            <div class="row container d-flex justify-content-center">
                <div class="col-md-auto">
                    <div class="card px-3">
                        <div class="card-body">
                            <h4 class="card-title">Awesome Todo list</h4>
                            <div class="add-items d-flex"><input type="text" class="form-control todo-list-input"
                                                                 placeholder="What do you need to do today?">
                                <button class="btn btn-primary font-weight-bold">Add</button>
                            </div>
                            <div class="list-wrapper">
                                <ul class="d-flex flex-column-reverse todo-list">
                                    <li>
                                        <div class="form-check"><label class="form-check-label"> <input class="checkbox"
                                                                                                        type="checkbox">
                                            For what reason would it be advisable. <i class="input-helper"></i></label>
                                        </div>
                                        <i class="remove far fa-times-circle"></i>
                                    </li>
                                    <li class="completed">
                                        <div class="form-check"><label class="form-check-label"> <input class="checkbox"
                                                                                                        type="checkbox"
                                                                                                        checked=""> For
                                            what reason would it be advisable for me to think. <i
                                                    class="input-helper"></i></label></div>
                                        <i class="remove far fa-times-circle"></i>
                                    </li>
                                    <li>
                                        <div class="form-check"><label class="form-check-label"> <input class="checkbox"
                                                                                                        type="checkbox">
                                            it be advisable for me to think about business content? <i
                                                    class="input-helper"></i></label></div>
                                        <i class="remove far fa-times-circle"></i>
                                    </li>
                                    <li>
                                        <div class="form-check"><label class="form-check-label"> <input class="checkbox"
                                                                                                        type="checkbox">
                                            Print Statements all <i class="input-helper"></i></label></div>
                                        <i class="remove far fa-times-circle"></i>
                                    </li>
                                    <li class="completed">
                                        <div class="form-check"><label class="form-check-label"> <input class="checkbox"
                                                                                                        type="checkbox"
                                                                                                        checked=""> Call
                                            Rampbo <i class="input-helper"></i></label></div>
                                        <i class="remove far fa-times-circle"></i>
                                    </li>
                                    <li>
                                        <div class="form-check"><label class="form-check-label"> <input class="checkbox"
                                                                                                        type="checkbox">
                                            Print bills <i class="input-helper"></i></label></div>
                                        <i class="remove far fa-times-circle"></i>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
