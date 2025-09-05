do_install:append() {
    echo "export XDG_SESSION_TYPE=wayland" >> ${D}${sysconfdir}/default/weston
}