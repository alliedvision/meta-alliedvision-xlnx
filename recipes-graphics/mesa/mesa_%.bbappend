FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append:class-target = " file://0001-Add-zynqmp-dpsub-dri.patch "

