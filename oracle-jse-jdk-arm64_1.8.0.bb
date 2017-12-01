PV_UPDATE = "131"
BUILD_NUMBER = "11"

require oracle-jse-jdk.inc

LIC_FILES_CHKSUM = "file://jdk1.8.0_131/COPYRIGHT;md5=3dc1bfbd5bed75d650ad0506a0df5930"

SRC_URI = "http://download.oracle.com/otn-pub/java/jdk/8u${PV_UPDATE}-b${BUILD_NUMBER}/d54c1d3a095b4ff2b6607d096fa80163/jdk-8u${PV_UPDATE}-linux-arm64-vfp-hflt.tar.gz"

SRC_URI[md5sum] = "aaa40b8adb00ee3db82d13f9c3fe27d1"
SRC_URI[sha256sum] = "8f1d59e35cbea789219f9908d666027ab9015abd8f43999d28d21b43d84c77c2"


COMPATIBLE_HOST = "(aarch64.*-linux)"

