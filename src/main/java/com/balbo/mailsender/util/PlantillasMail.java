package com.balbo.mailsender.util;

public class PlantillasMail {

	public String plantilla1() {
		
		return "<html>\n" + 
				"    <head>\n" + 
				"        <meta charset=\"utf-8\">\n" + 
				"        <meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\n" + 
				"        <meta name=\"x-apple-disable-message-reformatting\">\n" + 
				"        <title></title>\n" + 
				"    </head>\n" + 
				"    <body style=\"margin:0;padding:0;word-spacing:normal;background-color:#1b5985;\">\n" + 
				"        <div role=\"article\" aria-roledescription=\"email\" lang=\"es\" style=\"text-size-adjust:100%;-webkit-text-size-adjust:100%;-ms-text-size-adjust:100%;background-color:#0d2c42;margin:15px;text-align: center\">\n" + 
				"            <a href=\"http://www.example.com/\" style=\"text-decoration:none;\"><img src=\"https://assets.codepen.io/210284/logo.png\" width=\"165\" alt=\"Logo\" style=\"border:none;text-decoration:none;\"></a>\n" + 
				"        </div>\n" + 
				"        <div style=\"text-align: justify; color: white; margin: 15px; padding: 15px; color:#fdc23a;background-color:#0d2c42\">\n" + 
				"            <h1 style=\"font-size: 26px; text-align: center\">Notificaciones</h1>\n" + 
				"            <p>El usuario {usuario} requiere la atención necesaria para la compra de(l) lo(s) artículo(s) señalados en la siguiente lista:</p>\n" + 
				"            <p>\n" + 
				"                Marca:\n" + 
				"                <br>\n" + 
				"                Lista:\n" + 
				"                    \n" + 
				"                <br>\n" + 
				"                Datos de contacto:\n" + 
				"                <br>\n" + 
				"                Mail:\n" + 
				"                Teléfono:\n" + 
				"            </p>\n" + 
				"            \n" + 
				"            Atención: <b>{Envío de producto, Pago realizado,Solicitud Formas de pago}</b>\n" + 
				"        </div>\n" + 
				"    </body>\n" + 
				"</html>";
	}
	
	public String plantilla2() {
		return "<!DOCTYPE html>\n" + 
				"<html lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\">\n" + 
				"<head>\n" + 
				"  <meta charset=\"utf-8\">\n" + 
				"  <meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\n" + 
				"  <meta name=\"x-apple-disable-message-reformatting\">\n" + 
				"  <title></title>\n" + 
				"  <!--[if mso]>\n" + 
				"  <style>\n" + 
				"    table {border-collapse:collapse;border-spacing:0;border:none;margin:0;}\n" + 
				"    div, td {padding:0;}\n" + 
				"    div {margin:0 !important;}\n" + 
				"  </style>\n" + 
				"  <noscript>\n" + 
				"    <xml>\n" + 
				"      <o:OfficeDocumentSettings>\n" + 
				"        <o:PixelsPerInch>96</o:PixelsPerInch>\n" + 
				"      </o:OfficeDocumentSettings>\n" + 
				"    </xml>\n" + 
				"  </noscript>\n" + 
				"  <![endif]-->\n" + 
				"  <style>\n" + 
				"    table, td, div, h1, p {\n" + 
				"      font-family: Arial, sans-serif;\n" + 
				"    }\n" + 
				"    @media screen and (max-width: 530px) {\n" + 
				"      .unsub {\n" + 
				"        display: block;\n" + 
				"        padding: 8px;\n" + 
				"        margin-top: 14px;\n" + 
				"        border-radius: 6px;\n" + 
				"        background-color: #555555;\n" + 
				"        text-decoration: none !important;\n" + 
				"        font-weight: bold;\n" + 
				"      }\n" + 
				"      .col-lge {\n" + 
				"        max-width: 100% !important;\n" + 
				"      }\n" + 
				"    }\n" + 
				"    @media screen and (min-width: 531px) {\n" + 
				"      .col-sml {\n" + 
				"        max-width: 27% !important;\n" + 
				"      }\n" + 
				"      .col-lge {\n" + 
				"        max-width: 73% !important;\n" + 
				"      }\n" + 
				"    }\n" + 
				"  </style>\n" + 
				"</head>\n" + 
				"<body style=\"margin:0;padding:0;word-spacing:normal;background-color:#939297;\">\n" + 
				"  <div role=\"article\" aria-roledescription=\"email\" lang=\"en\" style=\"text-size-adjust:100%;-webkit-text-size-adjust:100%;-ms-text-size-adjust:100%;background-color:#939297;\">\n" + 
				"    <table role=\"presentation\" style=\"width:100%;border:none;border-spacing:0;\">\n" + 
				"      <tr>\n" + 
				"        <td align=\"center\" style=\"padding:0;\">\n" + 
				"          <!--[if mso]>\n" + 
				"          <table role=\"presentation\" align=\"center\" style=\"width:600px;\">\n" + 
				"          <tr>\n" + 
				"          <td>\n" + 
				"          <![endif]-->\n" + 
				"          <table role=\"presentation\" style=\"width:94%;max-width:600px;border:none;border-spacing:0;text-align:left;font-family:Arial,sans-serif;font-size:16px;line-height:22px;color:#363636;\">\n" + 
				"            <tr>\n" + 
				"              <td style=\"padding:40px 30px 30px 30px;text-align:center;font-size:24px;font-weight:bold;\">\n" + 
				"                <a href=\"http://www.example.com/\" style=\"text-decoration:none;\"><img src=\"https://assets.codepen.io/210284/logo.png\" width=\"165\" alt=\"Logo\" style=\"width:165px;max-width:80%;height:auto;border:none;text-decoration:none;color:#ffffff;\"></a>\n" + 
				"              </td>\n" + 
				"            </tr>\n" + 
				"            <tr>\n" + 
				"              <td style=\"padding:30px;background-color:#ffffff;\">\n" + 
				"                <h1 style=\"margin-top:0;margin-bottom:16px;font-size:26px;line-height:32px;font-weight:bold;letter-spacing:-0.02em;\">Welcome to our responsive email!</h1>\n" + 
				"                <p style=\"margin:0;\">Lorem ipsum dolor sit amet, consectetur adipiscing elit. In tempus adipiscing felis, sit amet blandit ipsum volutpat sed. Morbi porttitor, <a href=\"http://www.example.com/\" style=\"color:#e50d70;text-decoration:underline;\">eget accumsan dictum</a>, nisi libero ultricies ipsum, in posuere mauris neque at erat.</p>\n" + 
				"              </td>\n" + 
				"            </tr>\n" + 
				"            <tr>\n" + 
				"              <td style=\"padding:0;font-size:24px;line-height:28px;font-weight:bold;\">\n" + 
				"                <a href=\"http://www.example.com/\" style=\"text-decoration:none;\"><img src=\"https://assets.codepen.io/210284/1200x800-2.png\" width=\"600\" alt=\"\" style=\"width:100%;height:auto;display:block;border:none;text-decoration:none;color:#363636;\"></a>\n" + 
				"              </td>\n" + 
				"            </tr>\n" + 
				"            <tr>\n" + 
				"              <td style=\"padding:35px 30px 11px 30px;font-size:0;background-color:#ffffff;border-bottom:1px solid #f0f0f5;border-color:rgba(201,201,207,.35);\">\n" + 
				"                <!--[if mso]>\n" + 
				"                <table role=\"presentation\" width=\"100%\">\n" + 
				"                <tr>\n" + 
				"                <td style=\"width:145px;\" align=\"left\" valign=\"top\">\n" + 
				"                <![endif]-->\n" + 
				"                <div class=\"col-sml\" style=\"display:inline-block;width:100%;max-width:145px;vertical-align:top;text-align:left;font-family:Arial,sans-serif;font-size:14px;color:#363636;\">\n" + 
				"                  <img src=\"https://assets.codepen.io/210284/icon.png\" width=\"115\" alt=\"\" style=\"width:115px;max-width:80%;margin-bottom:20px;\">\n" + 
				"                </div>\n" + 
				"                <!--[if mso]>\n" + 
				"                </td>\n" + 
				"                <td style=\"width:395px;padding-bottom:20px;\" valign=\"top\">\n" + 
				"                <![endif]-->\n" + 
				"                <div class=\"col-lge\" style=\"display:inline-block;width:100%;max-width:395px;vertical-align:top;padding-bottom:20px;font-family:Arial,sans-serif;font-size:16px;line-height:22px;color:#363636;\">\n" + 
				"                  <p style=\"margin-top:0;margin-bottom:12px;\">Nullam mollis sapien vel cursus fermentum. Integer porttitor augue id ligula facilisis pharetra. In eu ex et elit ultricies ornare nec ac ex. Mauris sapien massa, placerat non venenatis et, tincidunt eget leo.</p>\n" + 
				"                  <p style=\"margin-top:0;margin-bottom:18px;\">Nam non ante risus. Vestibulum vitae eleifend nisl, quis vehicula justo. Integer viverra efficitur pharetra. Nullam eget erat nibh.</p>\n" + 
				"                  <p style=\"margin:0;\"><a href=\"https://example.com/\" style=\"background: #ff3884; text-decoration: none; padding: 10px 25px; color: #ffffff; border-radius: 4px; display:inline-block; mso-padding-alt:0;text-underline-color:#ff3884\"><!--[if mso]><i style=\"letter-spacing: 25px;mso-font-width:-100%;mso-text-raise:20pt\">&nbsp;</i><![endif]--><span style=\"mso-text-raise:10pt;font-weight:bold;\">Claim yours now</span><!--[if mso]><i style=\"letter-spacing: 25px;mso-font-width:-100%\">&nbsp;</i><![endif]--></a></p>\n" + 
				"                </div>\n" + 
				"                <!--[if mso]>\n" + 
				"                </td>\n" + 
				"                </tr>\n" + 
				"                </table>\n" + 
				"                <![endif]-->\n" + 
				"              </td>\n" + 
				"            </tr>\n" + 
				"            <tr>\n" + 
				"              <td style=\"padding:30px;font-size:24px;line-height:28px;font-weight:bold;background-color:#ffffff;border-bottom:1px solid #f0f0f5;border-color:rgba(201,201,207,.35);\">\n" + 
				"                <a href=\"http://www.example.com/\" style=\"text-decoration:none;\"><img src=\"https://assets.codepen.io/210284/1200x800-1.png\" width=\"540\" alt=\"\" style=\"width:100%;height:auto;border:none;text-decoration:none;color:#363636;\"></a>\n" + 
				"              </td>\n" + 
				"            </tr>\n" + 
				"            <tr>\n" + 
				"              <td style=\"padding:30px;background-color:#ffffff;\">\n" + 
				"                <p style=\"margin:0;\">Duis sit amet accumsan nibh, varius tincidunt lectus. Quisque commodo, nulla ac feugiat cursus, arcu orci condimentum tellus, vel placerat libero sapien et libero. Suspendisse auctor vel orci nec finibus.</p>\n" + 
				"              </td>\n" + 
				"            </tr>\n" + 
				"            <tr>\n" + 
				"              <td style=\"padding:30px;text-align:center;font-size:12px;background-color:#404040;color:#cccccc;\">\n" + 
				"                <p style=\"margin:0 0 8px 0;\"><a href=\"http://www.facebook.com/\" style=\"text-decoration:none;\"><img src=\"https://assets.codepen.io/210284/facebook_1.png\" width=\"40\" height=\"40\" alt=\"f\" style=\"display:inline-block;color:#cccccc;\"></a> <a href=\"http://www.twitter.com/\" style=\"text-decoration:none;\"><img src=\"https://assets.codepen.io/210284/twitter_1.png\" width=\"40\" height=\"40\" alt=\"t\" style=\"display:inline-block;color:#cccccc;\"></a></p>\n" + 
				"                <p style=\"margin:0;font-size:14px;line-height:20px;\">&reg; Someone, Somewhere 2021<br><a class=\"unsub\" href=\"http://www.example.com/\" style=\"color:#cccccc;text-decoration:underline;\">Unsubscribe instantly</a></p>\n" + 
				"              </td>\n" + 
				"            </tr>\n" + 
				"          </table>\n" + 
				"          <!--[if mso]>\n" + 
				"          </td>\n" + 
				"          </tr>\n" + 
				"          </table>\n" + 
				"          <![endif]-->\n" + 
				"        </td>\n" + 
				"      </tr>\n" + 
				"    </table>\n" + 
				"  </div>\n" + 
				"</body>\n" + 
				"</html>";
	}
	
	public String plantillaGlamNotificaciones() {
		return "<!doctype html>\n" + 
				"<html lang=\"en\">\n" + 
				"  <head>\n" + 
				"    <!-- Required meta tags -->\n" + 
				"    <meta charset=\"utf-8\">\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" + 
				"\n" + 
				"    <!-- Bootstrap CSS -->\n" + 
				"    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n" + 
				"\n" + 
				"    <title>Hello, world!</title>\n" + 
				"  </head>\n" + 
				"  <body>\n" + 
				"      <div class=\"container-sm col-sm-9\">\n" + 
				"          <div class=\"row p-3\">\n" + 
				"            <div class=\"col\">\n" + 
				"                <div class=\"p-3 border\" style=\"background-color: #F2E6E6\">\n" + 
				"                    <img src=\"https://glamgiftscosmetics.com/wp-content/uploads/2022/02/logo_glamgifts_sin_fondo3.png\" class=\"rounded img-fluid mx-auto d-block\" alt=\"...\" width=\"250px\" height=\"250px\">\n" + 
				"                </div>\n" + 
				"            </div>\n" + 
				"          </div>\n" + 
				"          <div class=\"row p-3 justify-content-end text-end\">\n" + 
				"            <div class=\"col-6\">\n" + 
				"              <div class=\"p-3 border fs-5\" style=\"background-color: #F2E6E6\">Solicitud de pedido</div>\n" + 
				"            </div>\n" + 
				"          </div>\n" + 
				"          \n" + 
				"          <div class=\"row p-3 justify-content-center boder-0\">\n" + 
				"              <div class=\"card w-75 text-center border-start-0 border-end-0\">\n" + 
				"                  <div class=\"card-body\">\n" + 
				"                    <h5 class=\"card-title\">¡Hola Julia!</h5>\n" + 
				"                    <h6 class=\"card-subtitle mb-2 text-muted\">Hemos recibido la solicitud de tu pedido</h6>\n" + 
				"                    <h6 class=\"card-subtitle mb-2 text-muted\">Te notificaremos cuando se encuentre listo</h6>\n" + 
				"                  </div>\n" + 
				"              </div>\n" + 
				"          </div>\n" + 
				"          \n" + 
				"          <div class=\"card m-3\">\n" + 
				"              <div class=\"card-header\" style=\"background-color: #F2E6E6\">\n" + 
				"                <ul class=\"nav nav-tabs card-header-tabs\">\n" + 
				"                  <li class=\"nav-item\">\n" + 
				"                    <a class=\"nav-link active\" aria-current=\"true\" href=\"#\">Detalle del pedido:</a>\n" + 
				"                  </li>\n" + 
				"                </ul>\n" + 
				"              </div>\n" + 
				"              <div class=\"card-body\">\n" + 
				"                <h5 class=\"card-title\">Paquete: \"Glam Familiar\"</h5>\n" + 
				"                <p class=\"card-text\">Contenido:</p>\n" + 
				"                  <ul>\n" + 
				"                      <ol>Delineador</ol>\n" + 
				"                      <ol>Rimel</ol>\n" + 
				"                      <ol>Gloss</ol>\n" + 
				"                      <ol>Esponja</ol>\n" + 
				"                      <ol>Sombras de colores</ol>\n" + 
				"                  </ul>\n" + 
				"              </div>\n" + 
				"          </div>\n" + 
				"          \n" + 
				"          <div class=\"row m-3\" style=\"background-color: #F2E6E6\">\n" + 
				"            <div class=\"col text-center fw-lighter\">\n" + 
				"                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-whatsapp\" viewBox=\"0 0 16 16\">\n" + 
				"                      <path d=\"M13.601 2.326A7.854 7.854 0 0 0 7.994 0C3.627 0 .068 3.558.064 7.926c0 1.399.366 2.76 1.057 3.965L0 16l4.204-1.102a7.933 7.933 0 0 0 3.79.965h.004c4.368 0 7.926-3.558 7.93-7.93A7.898 7.898 0 0 0 13.6 2.326zM7.994 14.521a6.573 6.573 0 0 1-3.356-.92l-.24-.144-2.494.654.666-2.433-.156-.251a6.56 6.56 0 0 1-1.007-3.505c0-3.626 2.957-6.584 6.591-6.584a6.56 6.56 0 0 1 4.66 1.931 6.557 6.557 0 0 1 1.928 4.66c-.004 3.639-2.961 6.592-6.592 6.592zm3.615-4.934c-.197-.099-1.17-.578-1.353-.646-.182-.065-.315-.099-.445.099-.133.197-.513.646-.627.775-.114.133-.232.148-.43.05-.197-.1-.836-.308-1.592-.985-.59-.525-.985-1.175-1.103-1.372-.114-.198-.011-.304.088-.403.087-.088.197-.232.296-.346.1-.114.133-.198.198-.33.065-.134.034-.248-.015-.347-.05-.099-.445-1.076-.612-1.47-.16-.389-.323-.335-.445-.34-.114-.007-.247-.007-.38-.007a.729.729 0 0 0-.529.247c-.182.198-.691.677-.691 1.654 0 .977.71 1.916.81 2.049.098.133 1.394 2.132 3.383 2.992.47.205.84.326 1.129.418.475.152.904.129 1.246.08.38-.058 1.171-.48 1.338-.943.164-.464.164-.86.114-.943-.049-.084-.182-.133-.38-.232z\"/>\n" + 
				"                    </svg>\n" + 
				"                    <p>5537363944</p>\n" + 
				"            </div>\n" + 
				"            <div class=\"col text-center fw-lighter\">    \n" + 
				"                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-envelope-check-fill\" viewBox=\"0 0 16 16\">\n" + 
				"                      <path d=\"M.05 3.555A2 2 0 0 1 2 2h12a2 2 0 0 1 1.95 1.555L8 8.414.05 3.555ZM0 4.697v7.104l5.803-3.558L0 4.697ZM6.761 8.83l-6.57 4.026A2 2 0 0 0 2 14h6.256A4.493 4.493 0 0 1 8 12.5a4.49 4.49 0 0 1 1.606-3.446l-.367-.225L8 9.586l-1.239-.757ZM16 4.697v4.974A4.491 4.491 0 0 0 12.5 8a4.49 4.49 0 0 0-1.965.45l-.338-.207L16 4.697Z\"/>\n" + 
				"                      <path d=\"M16 12.5a3.5 3.5 0 1 1-7 0 3.5 3.5 0 0 1 7 0Zm-1.993-1.679a.5.5 0 0 0-.686.172l-1.17 1.95-.547-.547a.5.5 0 0 0-.708.708l.774.773a.75.75 0 0 0 1.174-.144l1.335-2.226a.5.5 0 0 0-.172-.686Z\"/>\n" + 
				"                    </svg>\n" + 
				"                    <p>contacto@glamgiftscosmetics.com</p>\n" + 
				"            </div>\n" + 
				"          </div>\n" + 
				"      </div>\n" + 
				"\n" + 
				"    <!-- Option 1: Bootstrap Bundle with Popper -->\n" + 
				"    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n" + 
				"  </body>\n" + 
				"</html>";
	}
	
	public String plantillaGlamNotificaciones2() {
		return "<!DOCTYPE html>\n" + 
				"<html lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\">\n" + 
				"<head>\n" + 
				"	<meta charset=\"UTF-8\">\n" + 
				"	<meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\n" + 
				"	<meta name=\"x-apple-disable-message-reformatting\">\n" + 
				"	<title></title>\n" + 
				"	<!--[if mso]>\n" + 
				"	<noscript>\n" + 
				"		<xml>\n" + 
				"			<o:OfficeDocumentSettings>\n" + 
				"				<o:PixelsPerInch>96</o:PixelsPerInch>\n" + 
				"			</o:OfficeDocumentSettings>\n" + 
				"		</xml>\n" + 
				"	</noscript>\n" + 
				"	<![endif]-->\n" + 
				"	<style>\n" + 
				"		table, td, div, h1, p {font-family: Arial, sans-serif;}\n" + 
				"	</style>\n" + 
				"</head>\n" + 
				"<body style=\"margin:0;padding:0;\">\n" + 
				"	<table role=\"presentation\" style=\"width:100%;border-collapse:collapse;border:0;border-spacing:0;background:#ffffff;\">\n" + 
				"		<tr>\n" + 
				"			<td align=\"center\" style=\"padding:0;\">\n" + 
				"				<table role=\"presentation\" style=\"width:602px;border-collapse:collapse;border:1px solid #cccccc;border-spacing:0;text-align:left;\">\n" + 
				"					<tr>\n" + 
				"						<td align=\"center\" style=\"padding:40px 0 30px 0;background-color: #F2E6E6\">\n" + 
				"							<img src=\"https://glamgiftscosmetics.com/wp-content/uploads/2022/02/logo_glamgifts_sin_fondo3.png\" alt=\"\" width=\"300\" style=\"height:auto;display:block;\" />\n" + 
				"						</td>\n" + 
				"					</tr>\n" + 
				"					<tr>\n" + 
				"						<td style=\"padding:36px 30px 42px 30px;\">\n" + 
				"							<table role=\"presentation\" style=\"width:100%;border-collapse:collapse;border:0;border-spacing:0;\">\n" + 
				"								<tr>\n" + 
				"									<td style=\"padding:0 0 36px 0;color:#153643; text-align: center\">\n" + 
				"                                        <h4 class=\"card-title\" style=\"font-size: 1.25rem;font-weight: 500;line-height: 1.2\">¡Hola Julia!</h4>\n" + 
				"										<p style=\"margin:0 0 12px 0;font-size:16px;line-height:24px;font-family:Arial,sans-serif;color: #6c757d!important\">Hemos recibido la solicitud de tu pedido <br>\n" + 
				"                                            Te notificaremos cuando se encuentre listo</p>\n" + 
				"									</td>\n" + 
				"								</tr>\n" + 
				"							</table>\n" + 
				"                            <table style=\"width: 100%;\">\n" + 
				"                                <tr style=\"align-content: center; text-align: center; background-color: #F2E6E6;\">\n" + 
				"                                    <td colspan=\"2\" style=\"width: 30%; padding:10px;color: #495057;border-color: #dee2e6 #dee2e6 #fff\">\n" + 
				"                                        Detalle\n" + 
				"                                    </td>\n" + 
				"                                </tr>\n" + 
				"                                <tr style=\"\">\n" + 
				"                                    <td style=\"font-family: sans-serif;font-weight: 200;font-size: 11px;\">\n" + 
				"                                        <h5>Paquete: \"Glam Familiar\"</h5>\n" + 
				"                                        <ul>\n" + 
				"                                          <li>Delineador</li>\n" + 
				"                                          <li>Rimel</li>\n" + 
				"                                          <li>Gloss</li>\n" + 
				"                                          <li>Esponja</li>\n" + 
				"                                          <li>Sombras de colores</li>\n" + 
				"                                        </ul>\n" + 
				"                                    </td>\n" + 
				"                                </tr>\n" + 
				"                            </table>\n" + 
				"						</td>\n" + 
				"					</tr>\n" + 
				"					<tr>\n" + 
				"						<td style=\"padding:5px;background:#F2E6E6;\">\n" + 
				"							<table role=\"presentation\" style=\"width:100%;border-collapse:collapse;border:0;border-spacing:0;font-size:9px;font-family:Arial,sans-serif;\">\n" + 
				"								<tr>\n" + 
				"									<td style=\"padding:0;width:50%;\" align=\"center\">\n" + 
				"										<table role=\"presentation\" style=\"border-collapse:collapse;border:0;border-spacing:0;\">\n" + 
				"                                            <tr style=\"align-content: center\">\n" + 
				"                                                <td style=\"padding:0 0 0 10px;width:50%;text-align: center\">\n" + 
				"                                                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-whatsapp\" viewBox=\"0 0 16 16\">\n" + 
				"                                                      <path d=\"M13.601 2.326A7.854 7.854 0 0 0 7.994 0C3.627 0 .068 3.558.064 7.926c0 1.399.366 2.76 1.057 3.965L0 16l4.204-1.102a7.933 7.933 0 0 0 3.79.965h.004c4.368 0 7.926-3.558 7.93-7.93A7.898 7.898 0 0 0 13.6 2.326zM7.994 14.521a6.573 6.573 0 0 1-3.356-.92l-.24-.144-2.494.654.666-2.433-.156-.251a6.56 6.56 0 0 1-1.007-3.505c0-3.626 2.957-6.584 6.591-6.584a6.56 6.56 0 0 1 4.66 1.931 6.557 6.557 0 0 1 1.928 4.66c-.004 3.639-2.961 6.592-6.592 6.592zm3.615-4.934c-.197-.099-1.17-.578-1.353-.646-.182-.065-.315-.099-.445.099-.133.197-.513.646-.627.775-.114.133-.232.148-.43.05-.197-.1-.836-.308-1.592-.985-.59-.525-.985-1.175-1.103-1.372-.114-.198-.011-.304.088-.403.087-.088.197-.232.296-.346.1-.114.133-.198.198-.33.065-.134.034-.248-.015-.347-.05-.099-.445-1.076-.612-1.47-.16-.389-.323-.335-.445-.34-.114-.007-.247-.007-.38-.007a.729.729 0 0 0-.529.247c-.182.198-.691.677-.691 1.654 0 .977.71 1.916.81 2.049.098.133 1.394 2.132 3.383 2.992.47.205.84.326 1.129.418.475.152.904.129 1.246.08.38-.058 1.171-.48 1.338-.943.164-.464.164-.86.114-.943-.049-.084-.182-.133-.38-.232z\"/>\n" + 
				"                                                    </svg>\n" + 
				"                                                </td>\n" + 
				"                                                <td style=\"padding:0 0 0 10px;width:50%;text-align: center\">\n" + 
				"                                                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-envelope-check-fill\" viewBox=\"0 0 16 16\">\n" + 
				"                                                      <path d=\"M.05 3.555A2 2 0 0 1 2 2h12a2 2 0 0 1 1.95 1.555L8 8.414.05 3.555ZM0 4.697v7.104l5.803-3.558L0 4.697ZM6.761 8.83l-6.57 4.026A2 2 0 0 0 2 14h6.256A4.493 4.493 0 0 1 8 12.5a4.49 4.49 0 0 1 1.606-3.446l-.367-.225L8 9.586l-1.239-.757ZM16 4.697v4.974A4.491 4.491 0 0 0 12.5 8a4.49 4.49 0 0 0-1.965.45l-.338-.207L16 4.697Z\"/>\n" + 
				"                                                      <path d=\"M16 12.5a3.5 3.5 0 1 1-7 0 3.5 3.5 0 0 1 7 0Zm-1.993-1.679a.5.5 0 0 0-.686.172l-1.17 1.95-.547-.547a.5.5 0 0 0-.708.708l.774.773a.75.75 0 0 0 1.174-.144l1.335-2.226a.5.5 0 0 0-.172-.686Z\"/>\n" + 
				"                                                    </svg>\n" + 
				"                                                </td>\n" + 
				"                                            </tr>\n" + 
				"                                            <tr style=\"align-content: center\">\n" + 
				"												<td style=\"padding:0 0 0 10px;width:50%;text-align: center\">\n" + 
				"                                                    \n" + 
				"                                                    5537363944\n" + 
				"												</td>\n" + 
				"												<td style=\"padding:0 0 0 10px;width:50%;text-align: center\">\n" + 
				"                                                    contacto@glamgiftscosmetics.com\n" + 
				"												</td>\n" + 
				"											</tr>\n" + 
				"                                            <tr style=\"align-content: center; text-align: center\">\n" + 
				"                                                <td colspan=\"2\" style=\"padding:10px;\">\n" + 
				"                                                    &copy; Glam Gifts&Cosmetics 2022\n" + 
				"                                                </td>\n" + 
				"                                            </tr>\n" + 
				"										</table>\n" + 
				"									</td>\n" + 
				"								</tr>\n" + 
				"							</table>\n" + 
				"						</td>\n" + 
				"					</tr>\n" + 
				"				</table>\n" + 
				"			</td>\n" + 
				"		</tr>\n" + 
				"	</table>\n" + 
				"</body>\n" + 
				"</html>";
	}
	
	public String plantillaGlamNotificaciones3() {
		return "<!DOCTYPE html>\n" + 
				"<html lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\">\n" + 
				"<head>\n" + 
				"	<meta charset=\"UTF-8\">\n" + 
				"	<meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\n" + 
				"	<meta name=\"x-apple-disable-message-reformatting\">\n" + 
				"	<title></title>\n" + 
				"	<!--[if mso]>\n" + 
				"	<noscript>\n" + 
				"		<xml>\n" + 
				"			<o:OfficeDocumentSettings>\n" + 
				"				<o:PixelsPerInch>96</o:PixelsPerInch>\n" + 
				"			</o:OfficeDocumentSettings>\n" + 
				"		</xml>\n" + 
				"	</noscript>\n" + 
				"	<![endif]-->\n" + 
				"	<style>\n" + 
				"		table, td, div, h1, p {font-family: Arial, sans-serif;}\n" + 
				"	</style>\n" + 
				"</head>\n" + 
				"<body style=\"margin:0;padding:0;\">\n" + 
				"	<table role=\"presentation\" style=\"width:100%;border-collapse:collapse;border:0;border-spacing:0;background:#ffffff;\">\n" + 
				"		<tr>\n" + 
				"			<td align=\"center\" style=\"padding:0;\">\n" + 
				"				<table role=\"presentation\" style=\"width:60%;border-collapse:collapse;border:1px solid #cccccc;border-spacing:0;text-align:left;\">\n" + 
				"					<tr>\n" + 
				"						<td align=\"center\" style=\"padding:40px 0 30px 0;background-color: #F2E6E6;font-family: fantasy;font-size: xx-large;font-weight: 900\">\n" + 
				"							Glam Gifts&Cosmetics\n" + 
				"						</td>\n" + 
				"					</tr>\n" + 
				"					<tr>\n" + 
				"						<td style=\"padding:36px 30px 42px 30px;\">\n" + 
				"							<table role=\"presentation\" style=\"width:100%;border-collapse:collapse;border:0;border-spacing:0;\">\n" + 
				"								<tr>\n" + 
				"									<td style=\"padding:0 0 36px 0;color:#153643; text-align: center\">\n" + 
				"                                        <h4 class=\"card-title\" style=\"font-size: 1.25rem;font-weight: 500;line-height: 1.2\">¡Hola Julia!</h4>\n" + 
				"										<p style=\"margin:0 0 12px 0;font-size:16px;line-height:24px;font-family:Arial,sans-serif;color: #6c757d!important\">Hemos recibido la solicitud de tu pedido <br>\n" + 
				"                                            Te notificaremos cuando se encuentre listo</p>\n" + 
				"									</td>\n" + 
				"								</tr>\n" + 
				"							</table>\n" + 
				"                            <table style=\"width: 100%;\">\n" + 
				"                                <tr style=\"align-content: center; text-align: center; background-color: #F2E6E6;\">\n" + 
				"                                    <td colspan=\"2\" style=\"width: 30%; padding:10px;color: #495057;border-color: #dee2e6 #dee2e6 #fff\">\n" + 
				"                                        Detalle\n" + 
				"                                    </td>\n" + 
				"                                </tr>\n" + 
				"                                <tr style=\"\">\n" + 
				"                                    <td style=\"font-family: sans-serif;font-weight: 200;font-size: 11px;\">\n" + 
				"                                        <h5>Paquete: \"Glam Familiar\"</h5>\n" + 
				"                                        <ul>\n" + 
				"                                          <li>Delineador</li>\n" + 
				"                                          <li>Rimel</li>\n" + 
				"                                          <li>Gloss</li>\n" + 
				"                                          <li>Esponja</li>\n" + 
				"                                          <li>Sombras de colores</li>\n" + 
				"                                        </ul>\n" + 
				"                                    </td>\n" + 
				"                                </tr>\n" + 
				"                            </table>\n" + 
				"						</td>\n" + 
				"					</tr>\n" + 
				"					<tr>\n" + 
				"						<td style=\"padding:5px;background:#F2E6E6;\">\n" + 
				"							<table role=\"presentation\" style=\"width:100%;border-collapse:collapse;border:0;border-spacing:0;font-size:9px;font-family:Arial,sans-serif;\">\n" + 
				"								<tr>\n" + 
				"									<td style=\"padding:0;width:50%;\" align=\"center\">\n" + 
				"										<table role=\"presentation\" style=\"border-collapse:collapse;border:0;border-spacing:0;\">\n" + 
				"                                            <tr style=\"align-content: center\">\n" + 
				"                                                <td style=\"padding:0 0 0 10px;width:50%;text-align: center\">\n" + 
				"                                                    WhatsApp\n" + 
				"                                                </td>\n" + 
				"                                                <td style=\"padding:0 0 0 10px;width:50%;text-align: center\">\n" + 
				"                                                    E-Mail\n" + 
				"                                                </td>\n" + 
				"                                            </tr>\n" + 
				"                                            <tr style=\"align-content: center\">\n" + 
				"												<td style=\"padding:0 0 0 10px;width:50%;text-align: center\">\n" + 
				"                                                    \n" + 
				"                                                    5537363944\n" + 
				"												</td>\n" + 
				"												<td style=\"padding:0 0 0 10px;width:50%;text-align: center\">\n" + 
				"                                                    contacto@glamgiftscosmetics.com\n" + 
				"												</td>\n" + 
				"											</tr>\n" + 
				"                                            <tr style=\"align-content: center; text-align: center\">\n" + 
				"                                                <td colspan=\"2\" style=\"padding:10px;\">\n" + 
				"                                                    &copy; Glam Gifts&Cosmetics 2022\n" + 
				"                                                </td>\n" + 
				"                                            </tr>\n" + 
				"										</table>\n" + 
				"									</td>\n" + 
				"								</tr>\n" + 
				"							</table>\n" + 
				"						</td>\n" + 
				"					</tr>\n" + 
				"				</table>\n" + 
				"			</td>\n" + 
				"		</tr>\n" + 
				"	</table>\n" + 
				"</body>\n" + 
				"</html>";
	}
}
