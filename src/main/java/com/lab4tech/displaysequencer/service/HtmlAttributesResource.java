package com.lab4tech.displaysequencer.service;


/*
 * SERVICE CLASS : Inventory of available Html Tags and Attributes
 * 
 * Lists Hierarchy :
 * - HtmlDisplayTagsArrayList : 		<div>, <p>, <h1> ...
 * -- HtmlTagTypeArrayList :			all <div>
 * --- HtmlTagAttributesArrayList :		all attributes of a <div> tag : id= , class= , style= ...
 * ---- HtmlAttributesArrayList :		all sub-attributes of the "style=" attribute : font-size: 12pt; width: 60%; ...
 */
public class HtmlAttributesResource {
	
	private static final String COLORPICKER = "'<form:input path=\"baseTemplateUri\" class=\"color\" value=\"#cccccc\" />'";
	
	private HtmlTagAttributesArrayList htmlGlobalAttributes = null;
	
	private HtmlTagAttributesArrayList layoutClassAttributes = null;
	private HtmlTagAttributesArrayList animationClassAttributes = null;
	
	private HtmlTagAttributesArrayList styleAttributesList = null;
	
	private HtmlAttributesArrayList stylePositionAttributes = null;
	private HtmlAttributesArrayList styleDimensionAttributes = null;
	private HtmlAttributesArrayList styleAlignmentAttributes = null;
	private HtmlAttributesArrayList styleMarginAttributes = null;
	private HtmlAttributesArrayList stylePaddingtAttributes = null;
	private HtmlAttributesArrayList styleBorderAttributes = null;
	private HtmlAttributesArrayList styleFontAttributes = null;
	private HtmlAttributesArrayList styleBackgroundAttributes = null;
	
	private HtmlAttributesArrayList styleAnimationAttributes = null;
	
	
	/*
	 * No args constructor
	 */
	public HtmlAttributesResource() {
		
	}

	/*
	 * Getters & Setters : hard coded values
	 * TODO : Get from Database
	 * TODO : Color Picker
	 */
	public HtmlTagAttributesArrayList getHtmlGlobalAttributes() {
		htmlGlobalAttributes = new HtmlTagAttributesArrayList();
		
		HtmlAttributesArrayList idAttributes = new HtmlAttributesArrayList();
			idAttributes.add(new HtmlAttribute("Identifiant : ", "id=", ""));
			htmlGlobalAttributes.add(idAttributes);
		HtmlAttributesArrayList txtColorAttributes = new HtmlAttributesArrayList();
			txtColorAttributes.add(new HtmlAttribute("Couleur du texte : ", "font-color=", ""));
			// TODO : Color Picker
			htmlGlobalAttributes.add(txtColorAttributes);
		HtmlAttributesArrayList tooltipAttributes = new HtmlAttributesArrayList();
			tooltipAttributes.add(new HtmlAttribute("ToolTip : ", "title=", ""));
			htmlGlobalAttributes.add(tooltipAttributes);
		HtmlAttributesArrayList alignAttributes = new HtmlAttributesArrayList();
		alignAttributes.add(new HtmlAttribute("Alignement (center | left | right | justify) : ", "align=", ""));
			htmlGlobalAttributes.add(alignAttributes);
		
		return htmlGlobalAttributes;
	}
	
	public void setHtmlGlobalAttributes(HtmlTagAttributesArrayList htmlGlobalAttributes) {
		this.htmlGlobalAttributes = htmlGlobalAttributes;
	}

	public HtmlTagAttributesArrayList getlayoutClassAttributes() {
		layoutClassAttributes = new HtmlTagAttributesArrayList();
		
		HtmlAttributesArrayList oneColLayoutAttributes = new HtmlAttributesArrayList();
			oneColLayoutAttributes.add(new HtmlAttribute("Sur 1 colonne : ", "class=", "one column"));
			layoutClassAttributes.add(oneColLayoutAttributes);
		HtmlAttributesArrayList twoColLayoutAttributes = new HtmlAttributesArrayList();
			twoColLayoutAttributes.add(new HtmlAttribute("Sur 2 colonnes : ", "class=", "two columns"));
			layoutClassAttributes.add(twoColLayoutAttributes);
		HtmlAttributesArrayList threeColLayoutAttributes = new HtmlAttributesArrayList();
			threeColLayoutAttributes.add(new HtmlAttribute("Sur 3 colonnes : ", "class=", "three columns"));
			layoutClassAttributes.add(threeColLayoutAttributes);
		HtmlAttributesArrayList fourColLayoutAttributes = new HtmlAttributesArrayList();
			fourColLayoutAttributes.add(new HtmlAttribute("Sur 4 colonnes : ", "class=", "four columns"));
			layoutClassAttributes.add(fourColLayoutAttributes);
		HtmlAttributesArrayList fiveColLayoutAttributes = new HtmlAttributesArrayList();
			fiveColLayoutAttributes.add(new HtmlAttribute("Sur 5 colonnes : ", "class=", "five columns"));
			layoutClassAttributes.add(fiveColLayoutAttributes);
		HtmlAttributesArrayList sixColLayoutAttributes = new HtmlAttributesArrayList();
			sixColLayoutAttributes.add(new HtmlAttribute("Sur 6 colonnes : ", "class=", "six columns"));
			layoutClassAttributes.add(sixColLayoutAttributes);
		HtmlAttributesArrayList sevenColLayoutAttributes = new HtmlAttributesArrayList();
			sevenColLayoutAttributes.add(new HtmlAttribute("Sur 7 colonnes : ", "class=", "seven columns"));
			layoutClassAttributes.add(sevenColLayoutAttributes);
		HtmlAttributesArrayList eightColLayoutAttributes = new HtmlAttributesArrayList();
			eightColLayoutAttributes.add(new HtmlAttribute("Sur 8 colonnes : ", "class=", "eight columns"));
			layoutClassAttributes.add(eightColLayoutAttributes);
		HtmlAttributesArrayList nineColLayoutAttributes = new HtmlAttributesArrayList();
			nineColLayoutAttributes.add(new HtmlAttribute("Sur 9 colonnes : ", "class=", "nine columns"));
			layoutClassAttributes.add(nineColLayoutAttributes);
		HtmlAttributesArrayList tenColLayoutAttributes = new HtmlAttributesArrayList();
			tenColLayoutAttributes.add(new HtmlAttribute("Sur 10 colonnes : ", "class=", "ten columns"));
			layoutClassAttributes.add(tenColLayoutAttributes);
		HtmlAttributesArrayList elevenColLayoutAttributes = new HtmlAttributesArrayList();
			elevenColLayoutAttributes.add(new HtmlAttribute("Sur 11 colonnes : ", "class=", "eleven columns"));
			layoutClassAttributes.add(elevenColLayoutAttributes);
		HtmlAttributesArrayList twelveColLayoutAttributes = new HtmlAttributesArrayList();
			twelveColLayoutAttributes.add(new HtmlAttribute("Sur 12 colonnes : ", "class=", "twelve columns"));
			layoutClassAttributes.add(twelveColLayoutAttributes);
		HtmlAttributesArrayList thirteenColLayoutAttributes = new HtmlAttributesArrayList();
			thirteenColLayoutAttributes.add(new HtmlAttribute("Sur 13 colonnes : ", "class=", "thirteen columns"));
			layoutClassAttributes.add(thirteenColLayoutAttributes);
		HtmlAttributesArrayList fourteenColLayoutAttributes = new HtmlAttributesArrayList();
			fourteenColLayoutAttributes.add(new HtmlAttribute("Sur 14 colonnes : ", "class=", "fourteen columns"));
			layoutClassAttributes.add(fourteenColLayoutAttributes);
		HtmlAttributesArrayList fifteenColLayoutAttributes = new HtmlAttributesArrayList();
			fifteenColLayoutAttributes.add(new HtmlAttribute("Sur 15 colonnes : ", "class=", "fifteen columns"));
			layoutClassAttributes.add(fifteenColLayoutAttributes);
		HtmlAttributesArrayList sixteenColLayoutAttributes = new HtmlAttributesArrayList();
			sixteenColLayoutAttributes.add(new HtmlAttribute("Sur 16 colonnes : ", "class=", "sixteen columns"));
			layoutClassAttributes.add(sixteenColLayoutAttributes);		
		
		HtmlAttributesArrayList oneThirdColLayoutAttributes = new HtmlAttributesArrayList();
			oneThirdColLayoutAttributes.add(new HtmlAttribute("Sur 1/3 du conteneur : ", "class=", "one-third column"));
			layoutClassAttributes.add(oneThirdColLayoutAttributes);	
		HtmlAttributesArrayList twoThirdsColLayoutAttributes = new HtmlAttributesArrayList();
			twoThirdsColLayoutAttributes.add(new HtmlAttribute("Sur 2/3 du conteneur : ", "class=", "two-thirds column"));
			layoutClassAttributes.add(twoThirdsColLayoutAttributes);		
		
		return layoutClassAttributes;
	}

	public void setlayoutClassAttributes(
			HtmlTagAttributesArrayList layoutClassAttributes) {
		this.layoutClassAttributes = layoutClassAttributes;
	}

	public HtmlTagAttributesArrayList getAnimationClassAttributes() {
		animationClassAttributes = new HtmlTagAttributesArrayList();
		
		HtmlAttributesArrayList fadeInLeftAnimAttributes = new HtmlAttributesArrayList();
			fadeInLeftAnimAttributes.add(new HtmlAttribute("Effet fondu depuis la gauche : ", "class=", "animated fadeInLeftBig"));
			layoutClassAttributes.add(fadeInLeftAnimAttributes);
		HtmlAttributesArrayList fadeInRightAnimAttributes = new HtmlAttributesArrayList();
			fadeInRightAnimAttributes.add(new HtmlAttribute("Effet fondu depuis la droite : ", "class=", "animated fadeInRightBig"));
			layoutClassAttributes.add(fadeInRightAnimAttributes);
		HtmlAttributesArrayList bounceInLeftAnimAttributes = new HtmlAttributesArrayList();
			bounceInLeftAnimAttributes.add(new HtmlAttribute("Effet saut depuis la gauche : ", "class=", "animated bounceInLeft"));
			layoutClassAttributes.add(bounceInLeftAnimAttributes);
		HtmlAttributesArrayList bounceInRightAnimAttributes = new HtmlAttributesArrayList();
			bounceInRightAnimAttributes.add(new HtmlAttribute("Effet saut depuis la droite : ", "class=", "animated bounceInRight"));
			layoutClassAttributes.add(bounceInRightAnimAttributes);
		HtmlAttributesArrayList bounceInDownAnimAttributes = new HtmlAttributesArrayList();
			bounceInDownAnimAttributes.add(new HtmlAttribute("Effet rebond entrée par le haut : ", "class=", "animated bounceInDown"));
			layoutClassAttributes.add(bounceInDownAnimAttributes);
		HtmlAttributesArrayList bounceOutDownAnimAttributes = new HtmlAttributesArrayList();
			bounceOutDownAnimAttributes.add(new HtmlAttribute("Effet sortie par le bas : ", "class=", "animated bounceOutDown"));
			layoutClassAttributes.add(bounceOutDownAnimAttributes);
		HtmlAttributesArrayList rollInAnimAttributes = new HtmlAttributesArrayList();
			rollInAnimAttributes.add(new HtmlAttribute("Effet roule en entrant : ", "class=", "animated rollIn"));
			layoutClassAttributes.add(rollInAnimAttributes);
		HtmlAttributesArrayList rollOutAnimAttributes = new HtmlAttributesArrayList();
			rollOutAnimAttributes.add(new HtmlAttribute("Effet roule en sortent : ", "class=", "animated rollOut"));
			layoutClassAttributes.add(rollOutAnimAttributes);
		HtmlAttributesArrayList rotateInAnimAttributes = new HtmlAttributesArrayList();
			rotateInAnimAttributes.add(new HtmlAttribute("Effet entrée en rotation : ", "class=", "animated rotateInDownLeft"));
			layoutClassAttributes.add(rollOutAnimAttributes);
		HtmlAttributesArrayList rotateOutAnimAttributes = new HtmlAttributesArrayList();
			rotateOutAnimAttributes.add(new HtmlAttribute("Effet sortie en rotation : ", "class=", "animated rotateOutDownRight"));
			layoutClassAttributes.add(rotateOutAnimAttributes);
		HtmlAttributesArrayList tadaAnimAttributes = new HtmlAttributesArrayList();
			tadaAnimAttributes.add(new HtmlAttribute("Effet tressaillement : ", "class=", "animated tada"));
			layoutClassAttributes.add(tadaAnimAttributes);
		HtmlAttributesArrayList pulseAnimAttributes = new HtmlAttributesArrayList();
			pulseAnimAttributes.add(new HtmlAttribute("Effet pulsion : ", "class=", "animated pulse"));
			layoutClassAttributes.add(pulseAnimAttributes);
		HtmlAttributesArrayList wobbleAnimAttributes = new HtmlAttributesArrayList();
		wobbleAnimAttributes.add(new HtmlAttribute("Effet tremblement : ", "class=", "animated wobble"));
			layoutClassAttributes.add(wobbleAnimAttributes);

		return animationClassAttributes;
	}

	public void setAnimationClassAttributes(
			HtmlTagAttributesArrayList animationClassAttributes) {
		this.animationClassAttributes = animationClassAttributes;
	}
	
	public HtmlTagAttributesArrayList getStyleAttributesList() {
		styleAttributesList = new HtmlTagAttributesArrayList();
		
		styleAttributesList.setLabel("Style : ");
		styleAttributesList.setName("style=");
		styleAttributesList.add(stylePositionAttributes);
		styleAttributesList.add(styleDimensionAttributes);
		styleAttributesList.add(styleAlignmentAttributes);
		styleAttributesList.add(styleMarginAttributes);
		styleAttributesList.add(stylePaddingtAttributes);
		styleAttributesList.add(styleBorderAttributes);
		styleAttributesList.add(styleFontAttributes);
		styleAttributesList.add(styleBackgroundAttributes);
		
		return styleAttributesList;
	}

	public void setStyleAttributesList(HtmlTagAttributesArrayList styleAttributesList) {
		this.styleAttributesList = styleAttributesList;
	}

	public HtmlAttributesArrayList getStylePositionAttributes() {
		stylePositionAttributes = new HtmlAttributesArrayList();
		stylePositionAttributes.add(new HtmlAttribute("Type de positionnement : ", "position:", "relative"));
		stylePositionAttributes.add(new HtmlAttribute("Position à partir de la gauche : ", "left:", "...%"));
		stylePositionAttributes.add(new HtmlAttribute("Position à partir du haut : ", "top:", "...%"));
		return stylePositionAttributes;
	}

	public void setStylePositionAttributes(
			HtmlAttributesArrayList stylePositionAttributes) {
		this.stylePositionAttributes = stylePositionAttributes;
	}

	public HtmlAttributesArrayList getStyleDimensionAttributes() {
		styleDimensionAttributes = new HtmlAttributesArrayList();
		styleDimensionAttributes.add(new HtmlAttribute("Largeur : ", "width:", "...%"));
		styleDimensionAttributes.add(new HtmlAttribute("Hauteur : ", "height:", "...%"));
		return styleDimensionAttributes;
	}

	public void setStyleDimensionAttributes(
			HtmlAttributesArrayList styleDimensionAttributes) {
		this.styleDimensionAttributes = styleDimensionAttributes;
	}

	public HtmlAttributesArrayList getStyleAlignmentAttributes() {
		styleAlignmentAttributes = new HtmlAttributesArrayList();
		styleAlignmentAttributes.add(new HtmlAttribute("Aligné au centre : ", "align:", " center"));
		styleAlignmentAttributes.add(new HtmlAttribute("Aligné à gauche : ", "align:", " left"));
		styleAlignmentAttributes.add(new HtmlAttribute("Aligné à droite : ", "align:", " right"));
		styleAlignmentAttributes.add(new HtmlAttribute("Justifié : ", "align:", " justify"));
		return styleAlignmentAttributes;
	}

	public void setStyleAlignmentAttributes(
			HtmlAttributesArrayList styleAlignmentAttributes) {
		this.styleAlignmentAttributes = styleAlignmentAttributes;
	}

	public HtmlAttributesArrayList getStyleMarginAttributes() {
		styleMarginAttributes = new HtmlAttributesArrayList();
		styleMarginAttributes.add(new HtmlAttribute("Marges : ", "margin:", "...%"));
		styleMarginAttributes.add(new HtmlAttribute("Marge supérieure : ", "margin-top:", "...%"));
		styleMarginAttributes.add(new HtmlAttribute("Margeinférieure : ", "margin-bottom:", "...%"));
		styleMarginAttributes.add(new HtmlAttribute("Marge gauche : ", "margin-left:", "...%"));
		styleMarginAttributes.add(new HtmlAttribute("Marge droite : ", "marginright:", "...%"));
		return styleMarginAttributes;
	}

	public void setStyleMarginAttributes(
			HtmlAttributesArrayList styleMarginAttributes) {
		this.styleMarginAttributes = styleMarginAttributes;
	}

	public HtmlAttributesArrayList getStylePaddingtAttributes() {
		stylePaddingtAttributes = new HtmlAttributesArrayList();
		stylePaddingtAttributes.add(new HtmlAttribute("Rembourage : ", "padding:", "...%"));
		stylePaddingtAttributes.add(new HtmlAttribute("Rembourage supérieur : ", "padding-top:", "...%"));
		stylePaddingtAttributes.add(new HtmlAttribute("Rembourage inférieur : ", "padding-bottom:", "...%"));
		stylePaddingtAttributes.add(new HtmlAttribute("Rembourage gauche : ", "padding-left:", "...%"));
		stylePaddingtAttributes.add(new HtmlAttribute("Rembourage droite : ", "padding-right:", "...%"));
		
		return stylePaddingtAttributes;
	}

	public void setStylePaddingtAttributes(
			HtmlAttributesArrayList stylePaddingtAttributes) {
		this.stylePaddingtAttributes = stylePaddingtAttributes;
	}

	public HtmlAttributesArrayList getStyleBorderAttributes() {
		styleBorderAttributes = new HtmlAttributesArrayList();
		styleBorderAttributes.add(new HtmlAttribute("Cadre : ", "border:", "...px solid blue"));
		styleBorderAttributes.add(new HtmlAttribute("Cadre supérieur : ", "border-top:", "...px solid blue"));
		styleBorderAttributes.add(new HtmlAttribute("Cadre inférieur : ", "border-bottom:", "...px solid blue"));
		styleBorderAttributes.add(new HtmlAttribute("Cadre gauche : ", "border-left:", "...px solid blue"));
		styleBorderAttributes.add(new HtmlAttribute("Cadre droite : ", "border-right:", "...px solid blue"));
		return styleBorderAttributes;
	}

	public void setStyleBorderAttributes(
			HtmlAttributesArrayList styleBorderAttributes) {
		this.styleBorderAttributes = styleBorderAttributes;
	}

	/*
	 * TODO : Color Picker
	 */
	public HtmlAttributesArrayList getStyleFontAttributes() {
		styleFontAttributes = new HtmlAttributesArrayList();
		styleFontAttributes.add(new HtmlAttribute("Taille du texte : ", "font-size:", "...%"));
		styleFontAttributes.add(new HtmlAttribute("Texte italique : ", "font-style:", "italic"));
		styleFontAttributes.add(new HtmlAttribute("Texte gras : ", "font-weight:", "bold"));
		styleFontAttributes.add(new HtmlAttribute("Couleur du Texte : ", "font-color:", "teal")); 
		
		return styleFontAttributes;
	}

	public void setStyleFontAttributes(HtmlAttributesArrayList styleFontAttributes) {
		this.styleFontAttributes = styleFontAttributes;
	}

	public HtmlAttributesArrayList getStyleBackgroundAttributes() {
		styleBackgroundAttributes = new HtmlAttributesArrayList();
		styleBackgroundAttributes.add(new HtmlAttribute("Couleur du fond : ", "background-color:", COLORPICKER));
		styleBackgroundAttributes.add(new HtmlAttribute("Image de fond : ", "background-image:", "url"));
		styleBackgroundAttributes.add(new HtmlAttribute("Position de l'image de fond : ", "background-position:", "center"));
		styleBackgroundAttributes.add(new HtmlAttribute("Répétition de l'image de fond : ", "background-repeat:", "repeat"));
		
		return styleBackgroundAttributes;
	}

	public void setStyleBackgroundAttributes(
			HtmlAttributesArrayList styleBackgroundColorAttributes) {
		this.styleBackgroundAttributes = styleBackgroundColorAttributes;
	}

	public HtmlAttributesArrayList getStyleAnimationAttributes() {
		styleAnimationAttributes = new HtmlAttributesArrayList();
		styleAnimationAttributes.add(new HtmlAttribute("(Firefox) Durée de l'animation : ", "-moz-animation-duration:", "...s"));
		styleAnimationAttributes.add(new HtmlAttribute("(Firefox) Délai d'attente de l'animation : ", "-moz-animation-delay:", "...s"));
		return styleAnimationAttributes;
	}

	public void setStyleAnimationAttributes(
			HtmlAttributesArrayList styleAnimationAttributes) {
		this.styleAnimationAttributes = styleAnimationAttributes;
	}

	
	
	
	
	
	
	
	
	
	
	

}
