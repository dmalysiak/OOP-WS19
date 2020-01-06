package solutions.exercise13.web;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.util.WebUtils;

@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(InputError.class)
    public ResponseEntity<?> handleParameterConflict(WebRequest request, Exception e) {
        HttpHeaders headers = new HttpHeaders();
        HttpStatus status = HttpStatus.NOT_ACCEPTABLE;
        return handleExceptionInternal(e, e.toString(), headers, status, request);
    }

    /*@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR, reason="General Error")
    @ExceptionHandler(InputError.class)
    public Exception handleGeneralConflict(HttpServletRequest req, Exception e) {
        return e;
    }*/

    protected ResponseEntity<?> handleExceptionInternal(Exception ex, String body, HttpHeaders headers, HttpStatus status, WebRequest request) {
        if (HttpStatus.INTERNAL_SERVER_ERROR.equals(status)) {
            request.setAttribute(WebUtils.ERROR_EXCEPTION_ATTRIBUTE, ex, WebRequest.SCOPE_REQUEST);
        }

        return new ResponseEntity<>(body, headers, status);
    }

}
