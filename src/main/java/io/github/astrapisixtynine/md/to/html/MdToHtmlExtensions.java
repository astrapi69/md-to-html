package io.github.astrapisixtynine.md.to.html;

import org.commonmark.node.*;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

/**
 * Utility class that provides a method for converting Markdown content to HTML
 */
public class MdToHtmlExtensions
{
	/**
	 * Converts the given Markdown content to HTML format
	 *
	 * @param markdown
	 *            the Markdown content to be converted
	 * @return the HTML representation of the given Markdown content
	 */
	public static String toHtml(String markdown)
	{
		Parser parser = Parser.builder().build();
		Node document = parser.parse(markdown);
		HtmlRenderer renderer = HtmlRenderer.builder().build();
		return renderer.render(document);
	}
}
