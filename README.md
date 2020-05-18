#JDA Discord Bot Base [![Opened Issues](https://img.shields.io/github/issues-raw/jakuubkoo/JDABotBase?label=issues&style=flat-square)](https://github.com/jakuubkoo/JDABotBase/issues) [![Forks](https://img.shields.io/github/forks/jakuubkoo/JDABotBase?label=Fork&style=social)]() [![Last Commit](https://img.shields.io/github/last-commit/jakuubkoo/JDABotBase)]()

The base for bots who working with the JDA library.

TODO:
* Config
* Join & Leave listener

If you want you can join to my Discord Server: [![Discord Chat](https://img.shields.io/discord/711901937980801064?style=plastic)](https://discord.gg/QKcW2HS)  


## Contributing

##### 1. Fork the repository

- Click the "Fork" button at the top right hand corner of this page
- Then run `git clone https://github.com/[your github username]/JDABotBase.git`

##### 2. Import into IntelliJ

- File -> New -> Project From Existing Sources
- Select `C:\[Path To]\JDABotBase\pom.xml`
- Set "Search for projects recursively" and "Import Maven projects automatically" to true and click next
- Make sure all maven projects are ticked
- Select the correct Java SDK and go with all the default options for the next pages

##### 3. Editing

- Make any edits

##### 3. Commit

- Run `git status` to see which files you've changed
- Run `git add [file name]` for each of the files you want to submit your changes to
- Do `git commit -m "[A description of the changes]"`
- And finally `git push` to upload your changes to GitHub

##### 4. Pull Request

- Go to `https://github.com/[your github username]/JDABotBase` and click "Pull Requests" and then "New Pull Request"
- Make sure all your changes are included then submit the Pull Request.

Tutorial by superblaubeere27 thanks.

## Credits
- buffer (Idea)
- LiquidDev (Clazz loader)
- superblaubeere27 (Contributing tutorial)

## Dependencies
This project requires Java 8+. \
All dependencies are managed automatically by maven.
* Lombok
   * Version: **1.18.12**
   * [Website](https://projectlombok.org/)
* JDA
   * Version: **3.6.0_362**
   * [Website](https://github.com/DV8FromTheWorld/JDA)
* SLF4J
   * Version: **2.0.0-alpha1**
   * [Website](https://www.slf4j.org/)
* Gson (For Config System in the next update)
   * Version: **2.8.6**
   * [Website](https://github.com/google/gson)
* Reflections
   * Version: **0.9.12**
   * [Website](https://github.com/ronmamo/reflections)
