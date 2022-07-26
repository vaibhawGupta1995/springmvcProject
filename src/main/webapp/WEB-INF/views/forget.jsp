
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale = 1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js">
	
</script>
<script src='https://kit.fontawesome.com/a076d05399.js'
	crossorigin='anonymous'></script>


</head>
<body>


<section class="vh-100 gradient-custom">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-12 col-md-8 col-lg-6 col-xl-5">
        <div class="card bg-dark text-white" style="border-radius: 1rem;">
          <div class="card-body p-5 text-center">

            <div class="mb-md-5 mt-md-4 pb-5">

              <h2 class="fw-bold mb-2 text-uppercase">Forgot Password</h2>
              <p class="text-white-50 mb-5">Please enter your email and new password!</p>
	<form action="successForgotPassword" method="post">

              <div class="form-outline form-white mb-4">
                <input type="email" id="newEmail" name="newEmail" class="form-control form-control-lg" />
                <label class="form-label" for="newEmail">Email</label>
              </div>

              <div class="form-outline form-white mb-4">
                <input type="password" id="newPswd" name="newPswd" class="form-control form-control-lg" />
                <label class="form-label" for="newPswd">Password</label>
              </div>

		<div class="form-outline form-white mb-4">
                <input type="password" id="cnfmNewPswd" name="cnfmNewPswd" class="form-control form-control-lg" />
                <label class="form-label" for="cnfmNewPswd">Confirm Password</label>
              </div>

             
              <button class="btn btn-outline-light btn-lg px-5" type="submit">Submit</button>

              <div class="d-flex justify-content-center text-center mt-4 pt-1">
                <a href="#!" class="text-white"><i class="fab fa-facebook-f fa-lg"></i></a>
                <a href="#!" class="text-white"><i class="fab fa-twitter fa-lg mx-4 px-2"></i></a>
                <a href="#!" class="text-white"><i class="fab fa-google fa-lg"></i></a>
              </div>
		</form>
            </div>
		

          </div>
        </div>
      </div>
    </div>
  </div>
</section>
</body>
</html>