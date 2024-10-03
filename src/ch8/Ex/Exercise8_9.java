package ch8.Ex;

class Exercise8_9 {
    //이해가 안된다... 어떻게 풀어야하지??
    // 복습을 통해서 다시 풀어볼 것
    public static void main(String[] args) throws Exception{
        throw new UnsupportedFunctionException("지원하지 않는 기능입니다.", 100);
    }
}

class UnsupportedFunctionException extends RuntimeException {
    private final int ERR_CODE;

    UnsupportedFunctionException(String msg, int err_code) {
        super(msg);
        ERR_CODE = err_code;
    }

    UnsupportedFunctionException(String msg) {
        this(msg,100);
    }

    public int getErrCode(){
        return ERR_CODE;
    }

    public String getMessage() {
        return "[" + getErrCode() + "]" + super.getMessage();
    }
}
