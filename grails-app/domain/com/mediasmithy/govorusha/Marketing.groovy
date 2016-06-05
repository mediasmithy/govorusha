package com.mediasmithy.govorusha

class Marketing {

    String source
    Boolean actual

    static constraints = {
        source(blank: false)
        actual(blank: false)
    }
}
