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

	<div class="container">

<section class="vh-100" style="background-color: #9A616D;">
			<div class="container py-5 h-100">
				<div
					class="row d-flex justify-content-center align-items-center h-100">
					<div class="col col-xl-10">
						<div class="card" style="border-radius: 1rem;">
							<div class="row g-0">
								<div class="col-md-6 col-lg-5 d-none d-md-block">
              <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/img4.webp"
                alt="login form" class="img-fluid"
               style="border-radius: 1rem 0 0 1rem;" />
            </div>
            <div class="col-md-6 col-lg-7 d-flex align-items-center">
			<div class="card-body p-4 p-lg-5 text-black">
                <h3 class="mb-5 text-uppercase">Student registration form</h3>


		<form action="successRegister" method="post">

			<div class="d-flex align-items-center mb-3 pb-1">
				<i class="fas fa-cubes fa-2x me-3" style="color: #ff6219;"></i>
				<span class="h1 fw-bold mb-0">Student Registration</span>
			</div>


                <div class="row">
                  <div class="col-md-6 mb-4">
                    <div class="form-outline">
                      <input type="text" id="fName" name="fName" required class="form-control form-control-lg" />
                      <label class="form-label" for="fName">First name</label>
                    </div>
                  </div>

                  <div class="col-md-6 mb-4">
                    <div class="form-outline">
                      <input type="text" id="lName" name="lName" required class="form-control form-control-lg" />
                      <label class="form-label" for="lName">Last name</label>
                    </div>
                  </div>
                </div>

               

                <div class="form-outline mb-4">
                  <input type="text" id="email" name="email" required class="form-control form-control-lg" />
                  <label class="form-label" for="email">Email ID</label>
                </div>

		 <div class="form-outline mb-4">
                  <input type="pasword" id="password" name="password" required class="form-control form-control-lg" />
                  <label class="form-label" for="password">Password</label>
                </div>

		 <div class="form-outline mb-4">
                  <input type="pasword" id="cnfmPassword" name="cnfmPassword" required class="form-control form-control-lg" />
                  <label class="form-label" for="cnfmPassword">Confirm Password</label>
                </div>


                <div class="d-flex justify-content-end pt-3">
                  <button type="reset" class="btn btn-light btn-lg" >Reset all</button>
                  <button type="submit" class="btn btn-warning btn-lg ms-2">Submit form</button>
                </div>
		</form>
		
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
</body>
</html>