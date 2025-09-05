SUMMARY = "Alvium bitstream loading"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://avt-load-bitstream.in"

RDEPENDS:${PN} += "bash"
#RDEPENDS:${PN} += "bash fixup-media-pipeline"

S = "${WORKDIR}"

AVT_BITSTREAM_PREFIX:zcu106 = "alvium-fmc-zcu106"
AVT_BITSTREAM_PREFIX:kria = "alvium-kria-kv260"

do_compile() {
    sed -e 's/@@AVT_BITSTREAM_PREFIX@@/${AVT_BITSTREAM_PREFIX}/' \
        "${S}/avt-load-bitstream.in" > "${B}/avt-load-bitstream"
}

do_install() {
    install -d ${D}${bindir}
    install -m 755 ${B}/avt-load-bitstream ${D}${bindir}/avt-load-bitstream
    install -d ${D}${sysconfdir}/modprobe.d
    echo "blacklist avt_csi2-3" >  ${D}${sysconfdir}/modprobe.d/blacklist.conf
    chmod 0644 ${D}${sysconfdir}/modprobe.d/blacklist.conf
}

FILES:${PN} += "${bindir}/avt-load-bitstream"
FILES:${PN} += "${sysconfdir}/modprobe.d/blacklist.conf"
