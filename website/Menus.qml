import FlatSiteBuilder 2.0

Menus {
    Menu {
        name: "default-de"
        Menuitem {
            title: "Home"
            url: "#wrapper"
            icon: ""
        }
        Menuitem {
            title: "Situation"
            url: "#situation"
            icon: ""
        }
        Menuitem {
            title: "Lösung"
            url: "#solution"
            icon: ""
        }
        Menuitem {
            title: "Hilfe"
            url: "#help"
            icon: ""
        }
        Menuitem {
            title: "Deutsch"
            url: "#"
            icon: "assets/images/flags/de.png"
            Menuitem {
                title: "[US] English"
                url: "index.html"
                icon: "assets/images/flags/us.png"
            }
            Menuitem {
                title: "[DE] Deutsch"
                url: "#"
                icon: "assets/images/flags/de.png"
            }
        }
    }

    Menu {
        name: "default-en"
        Menuitem {
            title: "Home"
            url: "#wrapper"
            icon: ""
        }
        Menuitem {
            title: "Situation"
            url: "#situation"
            icon: ""
        }
        Menuitem {
            title: "Solution"
            url: "#solution"
            icon: ""
        }
        Menuitem {
            title: "Help"
            url: "#help"
            icon: ""
        }
        Menuitem {
            title: "English"
            url: "#"
            icon: "assets/images/flags/us.png"
            Menuitem {
                title: "[US] English"
                url: "#"
                icon: "assets/images/flags/us.png"
            }
            Menuitem {
                title: "[DE] Deutsch"
                url: "index-de.html"
                icon: "assets/images/flags/de.png"
            }
        }
    }
}
