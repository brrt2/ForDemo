package gameManagement.locale;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Language {

    private String askForFirstUserName;
    private String askForSecondUserName;
    private String askForBoardHeight;
    private String askForBoardWidth;
    private String askForNumberofAdjacentSigns;
    private String askWhoGoesFirst;
    private String whoGoesFirstError;
    private String incorrectValue;
    private String wrongName;
    private String positiveLowerOrEqualError;
    private String boardDimensionError;
    private String askIfWantsToContinueAfterDraw;
    private String askIfWantsToContinue;
    private String lostMoveMessage;
    private String askToProvideTileNumber;
    private String nowIsTurnOf;
    private String signOfPlayer;
    private String wrongValueType;
    private String hasWonThisRound;
    private String askIfwantsToPlayAnotherMatch;
    private String noneOfTheValuesSelected;
    private String thankYouForPlaying;
    private String numberOutsideTheBoard;
    private String tileTaken;


    private String askUserForBoardHeight;


    public Language(String languageSymbol) {
        String fileName = null;
        if (languageSymbol.equals("e")) fileName = "english.properties";
        else fileName = "polish.properties";
        Properties properties = new Properties();
        InputStream is = null;
        try {
            is = ClassLoader.getSystemResourceAsStream(fileName);
            // is = new FileInputStream("src/main/resources/" + fileName + ".properties");
            properties.load(is);
            askForFirstUserName = properties.getProperty("askForFirstUserName");
            askForSecondUserName = properties.getProperty("askForSecondUserName");
            askForBoardHeight = properties.getProperty("askForBoardHeight");
            askForBoardWidth = properties.getProperty("askForBoardWidth");
            askForNumberofAdjacentSigns = properties.getProperty("askForNumberofAdjacentSigns");
            askWhoGoesFirst=properties.getProperty("askWhoGoesFirst");
            whoGoesFirstError = properties.getProperty("whoGoesFirstError");
            incorrectValue = properties.getProperty("incorrectValue");
            wrongName = properties.getProperty("wrongName");
            positiveLowerOrEqualError = properties.getProperty("positiveLowerOrEqualError");
            boardDimensionError = properties.getProperty("boardDimensionError");
            askIfWantsToContinueAfterDraw = properties.getProperty("askIfWantsToContinueAfterDraw");
            askIfWantsToContinue = properties.getProperty("askIfWantsToContinue");
            lostMoveMessage = properties.getProperty("lostMoveMessage");
            askToProvideTileNumber = properties.getProperty("askToProvideTileNumber");
            nowIsTurnOf = properties.getProperty("nowIsTurnOf");
            signOfPlayer = properties.getProperty("signOfPlayer");
            wrongValueType = properties.getProperty("wrongValueType");
            hasWonThisRound = properties.getProperty("hasWonThisRound");
            askIfwantsToPlayAnotherMatch = properties.getProperty("askIfwantsToPlayAnotherMatch");
            noneOfTheValuesSelected = properties.getProperty("noneOfTheValuesSelected");
            thankYouForPlaying = properties.getProperty("thankYouForPlaying");
            numberOutsideTheBoard = properties.getProperty("numberOutsideTheBoard");
            tileTaken = properties.getProperty("tileTaken");


        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public String getAskForFirstUserName() {
        return askForFirstUserName;
    }

    public String getAskForSecondUserName() {
        return askForSecondUserName;
    }
}
