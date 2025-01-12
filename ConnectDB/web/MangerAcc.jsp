
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Manager Account</title>
        <link rel="stylesheet"
              href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet"
              href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet"
              href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet"
              href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script
        src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script
        src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="css/manager.css" rel="stylesheet" type="text/css" />
        <style>
            img {
                width: 200px;
                height: 120px;
            }
        </style>
    <body>

        <c:if test="${sessionScope.acc.isAdmin == 1}">
            <div class="container">
                <div class="table-wrapper">
                    <div class="table-title">
                        <div class="row">
                            <div class="col-sm-6">
                                <h2>
                                    Manage <b>Account</b>
                                </h2>
                            </div>

                        </div>
                    </div>
                    <table class="table table-striped table-hover">
                        <thead>
                            <tr>

                                <th>ID</th>
                                <th>Name</th>
                                <th>isSell</th>
                                <th>isAdmin</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${listA}" var="o">
                                <tr>
                                    <td>${o.id}</td>
                                    <td>${o.user}</td>
                                    <td>${o.isSell}</td>
                                    <td>${o.isAdmin}</td>
                                    <td>
                                        <a href="loadAcc?aid=${o.id}"  class="edit" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
                                        <a  href="deleteAcc?aid=${o.id}" class="delete" data-toggle="modal"><i
                                                class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    <c:forEach begin="1" end="${endP}" var="i">
                        <a class="${tag == i?"active":""}" href="managerAcc?index=${i}">${i}</a>
                    </c:forEach>
                    <hr>
                    <a href="Home"><button type="button" class="btn btn-primary">Back to home</button>
                </div>
            </div>
        </div>
        <!-- Edit Modal HTML -->
        <div id="addAccountModal" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="addAccount" method="post">
                        <div class="modal-header">
                            <h4 class="modal-title">Add Account</h4>
                            <button type="button" class="close" data-dismiss="modal"
                                    aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">
                            <div class="form-group">
                                <label>Account Name</label> <input name="aname" type="text"
                                                                   class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Password</label> <input name="pass" type="password"
                                                               class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Is Sell</label> <input name="issell" type="text"
                                                              class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Is Admin</label> <input name="isadmin" type="text"
                                                               class="form-control" required>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal"
                                   value="Cancel"> <input type="submit"
                                   class="btn btn-success" value="Add">
                        </div>
                    </form>
                </div>
            </div>

        </div>

        <script src="js/manager.js" type="text/javascript"></script>

    </c:if>
    <c:if test="${sessionScope.acc == null}">
    <li class="nav-item">
        <a class="nav-link" href="login">Login</a>
    </li>
</c:if>
<c:if test="${sessionScope.acc.isAdmin == 0}">
    <a href="Home">Quay lại trang chủ</a>
    <h4> Bạn  không có quyền truy cập trang này</h4>
</c:if>
</body>
</html>