<%-- 
    Document   : sanpham
    Created on : 19-11-2021, 14:30:17
    Author     : Admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8" />
  <link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
  <link rel="icon" type="image/png" href="assets/img/favicon.png">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <title>
    TZEV-THANH
  </title>
  <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
  <!--     Fonts and icons     -->
  <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet" />
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" rel="stylesheet">
  <!-- CSS Files -->
  <link href="assets/css/bootstrap.min.css" rel="stylesheet" />
  <link href="assets/css/paper-dashboard.css?v=2.0.1" rel="stylesheet" />
  <!-- CSS Just for demo purpose, don't include it in your project -->
  <link href="assets/demo/demo.css" rel="stylesheet" />
</head>

<body >
  <div class="wrapper ">
    <div class="sidebar" data-color="white" data-active-color="danger">
      <div class="logo">
        <a href="https://www.creative-tim.com" class="simple-text logo-mini">
          <div class="logo-image-small">
            <img src="assets/img/logo-small.png">
          </div>
          <!-- <p>CT</p> -->
        </a>
        <a href="https://www.creative-tim.com" class="simple-text logo-normal">
          TZEV.THANH
          <!-- <div class="logo-image-big">
            <img src="../assets/img/logo-big.png">
          </div> -->
        </a>
      </div>
      <div class="sidebar-wrapper">
        <ul class="nav">
            
            
            <c:if test="${sessionScope.acc != null}">
                <c:if test="${ sessionScope.acc.phanquyen==0}">
                   <li ><a class="nav-link js-scroll-trigger" href="nhanvien"><i class="nc-icon nc-badge"></i> NHÂN VIÊN</a></li>
                </c:if>
                <c:if test="${sessionScope.acc.phanquyen==2 || sessionScope.acc.phanquyen==0}">
                   <li ><a class="nav-link js-scroll-trigger" href="hanghoa"> <i class="nc-icon nc-box-2"></i> HANG HOA</a></li>
                </c:if>
                <c:if test="${sessionScope.acc.phanquyen==1 || sessionScope.acc.phanquyen==0}">
                   <li ><a class="nav-link js-scroll-trigger " href="khachhang"><i class="nc-icon nc-single-02"></i> KHACH HANG</a></li>
                   <li ><a class="nav-link js-scroll-trigger " href="hoadon"><i class="nc-icon nc-single-copy-04"></i> HOA DON</a></li>
                   <li ><a class="nav-link js-scroll-trigger " href="congno"><i class="nc-icon nc-bank"></i> CONG NO</a></li>
                   <li ><a class="nav-link js-scroll-trigger" href="phieuthu"><i class="nc-icon nc-paper"></i> PHIEU THU</a></li>
                   <li><a class="nav-link js-scroll-trigger "  href="phieuxuat"><i class="nc-icon nc-paper"></i> PHIEU XUAT</a></li>
                </c:if>
                <c:if test="${ sessionScope.acc.phanquyen==0}">
                   <li  class="active "><a class="nav-link js-scroll-trigger " href="thongke"><i class="nc-icon nc-chart-pie-36"></i> THONG KE</a></li><br>
                </c:if>
            </c:if>  
<!--          <li> 
            <a href="./thongke.jsp">
              <i class="nc-icon nc-bank"></i>
              <p>Home</p>
            </a>
          </li>
          <li class="active ">
            <a href="./adminSanpham">
              <i class="nc-icon nc-box-2"></i>
              <p>Sản phẩm</p>
            </a>
          </li>-->
           <li class="active-pro">
            <c:if test="${sessionScope.acc == null}">
                <a class="nav-link js-scroll-trigger" href="Loginout"><i class="nc-icon nc-circle-10"></i>Đăng nhập</a>
            </c:if>
            <c:if test="${sessionScope.acc != null}">
                <a href="Loginout?action=logout"><i class="nc-icon nc-button-power"></i><p>Đăng xuất</p></a>
            </c:if>
          </li>
        </ul>
      </div>
    </div>
      
      
      
      
    <div class="main-panel">
      <!-- Navbar -->
      <nav class="navbar navbar-expand-lg navbar-absolute fixed-top navbar-transparent">
        <div class="container-fluid">
          <div class="navbar-wrapper">
            <div class="navbar-toggle">
              <button type="button" class="navbar-toggler">
                <span class="navbar-toggler-bar bar1"></span>
                <span class="navbar-toggler-bar bar2"></span>
                <span class="navbar-toggler-bar bar3"></span>
              </button>
            </div>
            <a class="navbar-brand" href="javascript:;">Thống kê</a>
            
             
          </div>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navigation" aria-controls="navigation-index" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-bar navbar-kebab"></span>
            <span class="navbar-toggler-bar navbar-kebab"></span>
            <span class="navbar-toggler-bar navbar-kebab"></span>
          </button>
          <div class="collapse navbar-collapse justify-content-end" id="navigation">
              
<!--             <form action="hoadon2?action=search" class="timkiem" method="post">
              <div class="input-group no-border">
               <input type="date" class="form-control"   name="ngaylap"  placeholder="phone" />
               <input type="text" class="form-control"   name="loaihoadon"  placeholder="loaihoadon" list="loai" />
                        <datalist id="loai">
                            <c:forEach items="${listAll}" var="o">
                                <option value="${o.maloai}">
                            </c:forEach>
                        </datalist>
               <input type="text" class="form-control"   name="mahoadon"  placeholder="mahoadon" list="ma" />
                        <datalist id="ma">
                            <c:forEach items="${listAll}" var="o">
                                <option value="${o.mahd}">
                            </c:forEach>
                        </datalist>
               <input type="submit" name="timkiem" value="tìm kiếm" class="form-control input-field" style="background-color:#3399CC;color: white;"/>

              </div>
            </form>-->


              
              
            <ul class="navbar-nav">
              
              <li class="nav-item" ${button==1 or button==2? "hidden":""}>
                <a class="nav-link btn-rotate" href="thongke2?btn=0">Thống kê bán hàng </a>
              </li>
              <li class="nav-item" ${button==0 or button==2 ? "hidden":""}>
                <a class="nav-link btn-rotate" href="thongke2?btn=1">Thống kê công nợ</a>
              </li>
              <li class="nav-item" ${button==1 or button==0 ?"hidden":""}>
                <a class="nav-link btn-rotate" href="thongke2?btn=2">Thống kê chi tiết công nợ</a>
              </li>
              <li class="nav-item" ${button==1 or button==0 or button==2 ?"":"hidden"}>
                <a class="nav-link btn-rotate" href="thongke"> Back
                    <i class="nc-icon" style="font-size: 25px;margin-left:10px;color: #FF9500;"></i>
                </a>
              </li>
              
              <li class="nav-item" ${button==1 or button==0 or button==2 ?"":"hidden"}>
                <a class="nav-link btn-rotate" href="javascript:;" data-toggle="modal" data-target="#myModaleadd">
                    <i class="nc-icon nc-zoom-split" style="font-size: 25px;margin-left:10px;color: #FF9500;"></i>
                </a>
              </li>
              
                
            </ul>
                
              
              
                
          </div>
        </div>
      </nav>
                
                
                
                
                
                
                
      <!-- End Navbar -->
      
       <div class="content"${button==null and nhatky ==null and congno==null and chitiet==null? "":"hidden"}>
        <div class="row">
          <div class="col-lg-3 col-md-6 col-sm-6">
            <div class="card card-stats">
              <div class="card-body ">
                <div class="row">
                  <div class="col-5 col-md-4">
                    <div class="icon-big text-center icon-warning">
                      <i class="nc-icon nc-globe text-warning"></i>
                    </div>
                  </div>
                  <div class="col-7 col-md-8">
                    <div class="numbers">
                      <p class="card-category">Capacity</p>
                      <p class="card-title">150GB<p>
                    </div>
                  </div>
                </div>
              </div>
              <div class="card-footer ">
                <hr>
                <div class="stats">
                  <i class="fa fa-refresh"></i>
                  Update Now
                </div>
              </div>
            </div>
          </div>
          <div class="col-lg-3 col-md-6 col-sm-6">
            <div class="card card-stats">
              <div class="card-body ">
                <div class="row">
                  <div class="col-5 col-md-4">
                    <div class="icon-big text-center icon-warning">
                      <i class="nc-icon nc-money-coins text-success"></i>
                    </div>
                  </div>
                  <div class="col-7 col-md-8">
                    <div class="numbers">
                      <p class="card-category">Revenue</p>
                      <p class="card-title">$ 1,345<p>
                    </div>
                  </div>
                </div>
              </div>
              <div class="card-footer ">
                <hr>
                <div class="stats">
                  <i class="fa fa-calendar-o"></i>
                  Last day
                </div>
              </div>
            </div>
          </div>
          <div class="col-lg-3 col-md-6 col-sm-6">
            <div class="card card-stats">
              <div class="card-body ">
                <div class="row">
                  <div class="col-5 col-md-4">
                    <div class="icon-big text-center icon-warning">
                      <i class="nc-icon nc-vector text-danger"></i>
                    </div>
                  </div>
                  <div class="col-7 col-md-8">
                    <div class="numbers">
                      <p class="card-category">Errors</p>
                      <p class="card-title">23<p>
                    </div>
                  </div>
                </div>
              </div>
              <div class="card-footer ">
                <hr>
                <div class="stats">
                  <i class="fa fa-clock-o"></i>
                  In the last hour
                </div>
              </div>
            </div>
          </div>
          <div class="col-lg-3 col-md-6 col-sm-6">
            <div class="card card-stats">
              <div class="card-body ">
                <div class="row">
                  <div class="col-5 col-md-4">
                    <div class="icon-big text-center icon-warning">
                      <i class="nc-icon nc-favourite-28 text-primary"></i>
                    </div>
                  </div>
                  <div class="col-7 col-md-8">
                    <div class="numbers">
                      <p class="card-category">Followers</p>
                      <p class="card-title">+45K<p>
                    </div>
                  </div>
                </div>
              </div>
              <div class="card-footer ">
                <hr>
                <div class="stats">
                  <i class="fa fa-refresh"></i>
                  Update now
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      
      <!--TABLE -->
      <div class="content" ${button==null and nhatky ==null and congno==null and chitiet==null? "hidden":""}>
        <div class="row">
          <div class="col-md-12">
            <div class="card">
              <div class="card-header">
                <h4 class="card-title"${button==0 or nhatky !=null? "":"hidden"}>Sổ nhật ký bán hàng </h4>
                <h4 class="card-title"${button==1 or congno !=null? "":"hidden"}>Công nợ phải từ khách hàng </h4>
                <h4 class="card-title"${button==2 or chitiet !=null?"":"hidden"}>Báo cáo công nợ chi tiết </h4>
              </div>
              <div class="card-body">
                <div class="table-responsive">
                
                    
                    
                <table ${button==0 or nhatky !=null? "":"hidden"} class="table table-striped table-hover" style="">
                    <thead>
                         <tr>
                            <th>NGAY LẬP</th>
                            <th>MÃ HÓA ĐƠN</th>
                            <th>DIỄN GIẢI</th>
                            <th>GHI NỢ</th>
                            <th>GHI CÓ</th>
                            <th>TỔNG TIỀN</th>
                        </tr>
                    </thead>
                    <tbody>
                         <c:forEach items="${nhatky}" var="o">
                            <tr>
                                <td>${o.ngaylap}</td>
                                <td>${o.mahd}</td>
                                <td>${o.tinhnang}</td>
                                <td>${o.tkco}</td>
                                <td>${o.tkno}</td>
                                <td>${o.tien}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
                <table ${button==1 or congno !=null? "":"hidden"} class="table table-striped table-hover" style="">
                    <thead>
                        <tr>
                            <th>MÃ KHÁCH HÀNG</th>
                            <th>TÊN KHÁCH HÀNG</th>
                            <th>SỐ TIỀN NỢ</th>
                            <th>SỐ TIỀN ĐÃ THANH TOÁN</th>
<!--                            <th>NỢ ĐẦU PHÁT SINH</th>
                            <th>NỢ CUỐI PHÁT SINH</th>
                            <th>NỢ ĐẦU KỲ</th>
                            <th>NỢ CUỐI KỲ</th>-->
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${congno}" var="o">
                            <tr>
                                <td>${o.makhach}</td>
                                <td>${o.tenkhach}</td>
                                <td>${o.dauno}</td>
                                <td>${o.dauco}</td>
                             </tr>
                        </c:forEach>
                    </tbody>
                </table>
                <table ${button==2 or chitiet !=null? "":"hidden"} class="table table-striped table-hover" style="">
                    <thead>
                        <tr>
                            <th>NGÀY LẬP</th>
                            <th>MÃ HÓA ĐƠN</th>
                            <th>NỘI DUNG</th>
                            <th>PHẢI THU</th>
                            <th>ĐÃ THU</th>
                            
                        </tr>
                    </thead>
                    <tbody>
                         <c:forEach items="${chitiet}" var="o">
                            <tr>
                                 
                                <td>${o.ngaylap}</td>
                                <td>${o.mahd}</td>
                                <td>${o.diengiai}</td>
                                <td>${o.phaithu}</td>
                                <td>${o.dathu}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
                    
                </div>
              </div>
            </div>
          </div>
        </div>
          
          
          
          
          
          
          
       <div ${button==0 or nhatky !=null? "":"hidden"} class="content">
        <div class="row">
          <div class="col-lg-12 col-md-12 col-sm-12">
            <div class="card card-stats">
              <div class="card-body ">
                <div class="row">
                  <div class="col-5 col-md-4">
                    <div class="icon-big text-center icon-warning">
                      <i class="nc-icon nc-money-coins text-success"></i>
                    </div>
                  </div>
                  <div class="col-7 col-md-8">
                    <div class="numbers">
                      <p class="card-category">Tổng tiền</p>
                      <p class="card-title">${sumtongtien} đ<p>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
                    
      
                    
      
</div>
 <!--END TABLE -->
            
            
            
            
                
      
      
      
      
      
      
      
 <!-- Modal -->
    <div class="modal fade" id="myModaleadd" role="dialog">
      <div class="modal-dialog modal-lg">
        <div class="modal-content">
         <div class="modal-header">
            <div class="section-txt" align=center>
              <h2>Thống kê tìm kiếm</h2>
            </div>
          </div>

          <div class="modal-body">

             <form ${button==0 or nhatky !=null? "":"hidden"} action="thongke?action=search" class="timkiem" method="post" >
                        <div class="form-group">
                                <div class="row">
                                    <div class="col-sm-12">
                                        <label>Thống kê từ ngày</label>
                                        <input type="date"   name="A"  placeholder="từ ngày" id="user-name" class="form-control"  autofocus="">
                                    </div>
                                </div>
                        </div>
                        <div class="form-group">
                                <div class="row">
                                    <div class="col-sm-12">
                                        <label>Thống kê từ ngày</label>
                                        <input type="date"   name="B"  placeholder="đến ngày" id="user-name" class="form-control"  autofocus="">
                                    </div>
                                </div>
                        </div>
                        <div class="form-group btn-submit-add">
                               <input type="submit" class="btn form-control" name="timkiem" value="search" />
                        </div>
                        
             </form>
                        
             <form ${button==1 or congno !=null? "":"hidden"} action="thongke?action=searchcongno" class="timkiem" method="post">
                        <div class="form-group">
                                <div class="row">
                                    <div class="col-sm-12">
                                        <label>Thống kê từ ngày</label>
                                        <input type="date"   name="A"  placeholder="từ ngày" id="user-name" class="form-control"  autofocus="">
                                    </div>
                                </div>
                        </div>
                        <div class="form-group">
                                <div class="row">
                                    <div class="col-sm-12">
                                        <label>Thống kê từ ngày</label>
                                        <input type="date"   name="B"  placeholder="đến ngày" id="user-name" class="form-control"  autofocus="">
                                    </div>
                                </div>
                        </div>
                        <div class="form-group btn-submit-add">
                               <input type="submit" class="btn form-control" name="timkiem" value="search" />
                        </div>
             </form>
                        
             <form ${button==2 or chitiet !=null? "":"hidden"} action="thongke?action=searchchitiet" class="timkiem" method="post">
                 
                        <div class="form-group">
                                <div class="row">
                                    <div class="col-sm-12">
                                        <label>Mã khach</label>
                                        <input type="text"   name="A"  placeholder="mã khách" list="makh" class="form-control" >
                                        <datalist id="makh">
                                            <c:forEach items="${khachhang}" var="o">
                                                <option value="${o.makh}">${o.makh}</option>
                                            </c:forEach>
                                        </datalist>
                                    </div>
                                </div>
                        </div>
                        <div class="form-group">
                                <div class="row">
                                    <div class="col-sm-12">
                                        <label>Tên khách</label>
                                        <input type="text"   name="B"  placeholder="tên khách" list="tenkh" class="form-control"  >
                                        <datalist id="tenkh">
                                           <c:forEach items="${khachhang}" var="o">
                                                <option value="${o.tenkh}">${o.tenkh}</option>
                                           </c:forEach>
                                        </datalist>
                                    </div>
                                </div>
                        </div>
                        <div class="form-group btn-submit-add">
                               <input type="submit" class="btn form-control" name="timkiem" value="search" />
                        </div>
                 
             </form>

          </div>
        </div>
      </div>
      <!-- End Modal -->
              
      
  <c:if test="${not empty txtthongbao}">
<script>
window.onload = function()
 { 
    color = 'primary';
    $.notify({
      icon: "nc-icon nc-bell-55",
      message: "${txtthongbao}"
    }, {
      type: color,
      timer: 50,
      placement: {
        from: 'top',
        align: 'left'
      }
    });
};
          
          
        </script>
</c:if>
        
<script type="text/javascript">
  function validate(evt)
{
    if(evt.keyCode!=8)
    {
        var theEvent = evt || window.event;
        var key = theEvent.keyCode || theEvent.which;
        key = String.fromCharCode(key);
        var regex = /[0-9]|\./;
        if (!regex.test(key))
        {
            theEvent.returnValue = false;
            alert('Vui lòng nhập đúng kiểu là chữ số !');
            if (theEvent.preventDefault)
                theEvent.preventDefault();
        }
      }
    }
</script>
<style>
.file-upload {
  background-color: #ffffff;
  width: 600px;
  margin: 0 auto;
  padding: 20px;
}

.file-upload-btn {
  width: 100%;
  margin: 0;
  color: #fff;
  background: #1FB264;
  border: none;
  padding: 10px;
  border-radius: 4px;
  border-bottom: 4px solid #15824B;
  transition: all .2s ease;
  outline: none;
  text-transform: uppercase;
  font-weight: 700;
}

.file-upload-btn:hover {
  background: #1AA059;
  color: #ffffff;
  transition: all .2s ease;
  cursor: pointer;
}

.file-upload-btn:active {
  border: 0;
  transition: all .2s ease;
}

.file-upload-content {
  display: none;
  text-align: center;
}

.file-upload-input {
  position: absolute;
  margin: 0;
  padding: 0;
  width: 100%;
  height: 100%;
  outline: none;
  opacity: 0;
  cursor: pointer;
}

.image-upload-wrap {
  margin-top: 20px;
  border: 4px dashed #1FB264;
  position: relative;
}

.image-dropping,
.image-upload-wrap:hover {
  background-color: #1FB264;
  border: 4px dashed #ffffff;
}

.image-title-wrap {
  padding: 0 15px 15px 15px;
  color: #222;
}

.drag-text {
  text-align: center;
}

.drag-text h3 {
  font-weight: 100;
  text-transform: uppercase;
  color: #15824B;
  padding: 60px 0;
}

.file-upload-image {
  max-height: 300px;
  max-width: 300px;
  margin: auto;
  padding: 20px;
}

.remove-image {
  width: 200px;
  margin: 0;
  color: #fff;
  background: #cd4535;
  border: none;
  padding: 10px;
  border-radius: 4px;
  border-bottom: 4px solid #b02818;
  transition: all .2s ease;
  outline: none;
  text-transform: uppercase;
  font-weight: 700;
}

.remove-image:hover {
  background: #c13b2a;
  color: #ffffff;
  transition: all .2s ease;
  cursor: pointer;
}

.remove-image:active {
  border: 0;
  transition: all .2s ease;
}
</style>                          
<script>

function readURL(input) {
  if (input.files && input.files[0]) {

    var reader = new FileReader();

    reader.onload = function(e) {
      $('.image-upload-wrap').hide();

      $('.file-upload-image').attr('src', e.target.result);
      $('.file-upload-content').show();

      $('.image-title').html(input.files[0].name);
    };

    reader.readAsDataURL(input.files[0]);

  } else {
    removeUpload();
  }
}

function removeUpload() {
  $('.file-upload-input').replaceWith($('.file-upload-input').clone());
  $('.file-upload-content').hide();
  $('.image-upload-wrap').show();
}
$('.image-upload-wrap').bind('dragover', function () {
    $('.image-upload-wrap').addClass('image-dropping');
  });
  $('.image-upload-wrap').bind('dragleave', function () {
    $('.image-upload-wrap').removeClass('image-dropping');
    
});
</script>            

      
      <footer class="footer footer-black  footer-white ">
        <div class="container-fluid">
          <div class="row">
            <nav class="footer-nav">
              <ul>
                <li><a href="https://www.creative-tim.com" target="_blank">Creative Tim</a></li>
                <li><a href="https://www.creative-tim.com/blog" target="_blank">Blog</a></li>
                <li><a href="https://www.creative-tim.com/license" target="_blank">Licenses</a></li>
              </ul>
            </nav>
            <div class="credits ml-auto">
              <span class="copyright">
                © <script>

                  document.write(new Date().getFullYear())
                </script>, made with <i class="fa fa-heart heart"></i> by Creative Tim
              </span>
            </div>
          </div>
        </div>
      </footer>
    </div>
  </div>
  <!--   Core JS Files   -->
  <script src="assets/js/core/jquery.min.js"></script>
  <script src="assets/js/core/popper.min.js"></script>
  <script src="assets/js/core/bootstrap.min.js"></script>
  <script src="assets/js/plugins/perfect-scrollbar.jquery.min.js"></script>
  <!--  Google Maps Plugin    -->
  <script src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
  <!-- Chart JS -->
  <script src="assets/js/plugins/chartjs.min.js"></script>
  <!--  Notifications Plugin    -->
  <script src="assets/js/plugins/bootstrap-notify.js"></script>
  <!-- Control Center for Now Ui Dashboard: parallax effects, scripts for the example pages etc -->
  <script src="assets/js/paper-dashboard.min.js?v=2.0.1" type="text/javascript"></script><!-- Paper Dashboard DEMO methods, don't include it in your project! -->
  <script src="assets/demo/demo.js"></script>
</body>

</html>

