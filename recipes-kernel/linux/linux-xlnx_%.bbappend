FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://0001-xilinx-dma-Disabled-userptr-streaming.patch \
    file://0002-v4l2-xilinx-Add-Allied-Vision-GenICam-for-CSI2-forma.patch \
    file://0003-v4l2-xilinx-Added-missing-raw8-mono-and-bayer-format.patch \
    file://0004-v4l2-xilinx-Fixed-first-frame-is-always-dropped.patch \
    file://0005-v4l2-xilinx-Increase-maximum-allowed-height.patch \
    file://0006-Fixed-PR-review-findings.patch \
"

