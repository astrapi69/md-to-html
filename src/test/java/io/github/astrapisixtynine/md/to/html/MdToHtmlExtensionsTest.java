package io.github.astrapisixtynine.md.to.html;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test class for {@link MdToHtmlExtensions} that verifies the Markdown to HTML conversion
 * functionality
 */
class MdToHtmlExtensionsTest
{

	/**
	 * Test method for {@link MdToHtmlExtensions#toHtml(String)} that checks the conversion of
	 * Markdown content to HTML
	 */
	@Test
	void toHtml()
	{
		String actual;
		String expected;

		String md;
		md = """
			### Introduction

			With voice-enabled applications becoming a staple in digital interfaces, choosing the right speech library is crucial. From virtual assistants to real-time transcription, the integration of speech recognition and synthesis in Java applications can greatly enhance user interaction. In this article, we’ll review top Java speech libraries, examine recent updates, and break down each library’s core features. This analysis aims to provide a well-rounded understanding of which library best aligns with your project’s goals.

			### Table of Contents

			1. Google Cloud Speech-to-Text
			2. Sphinx4
			3. MaryTTS
			4. FreeTTS
			5. Additional Libraries
			6. Conclusion

			* * *

			### Detailed Analysis of Java Speech Libraries

			1. **Google Cloud Speech-to-Text** Google’s Speech-to-Text library offers one of the most robust solutions, boasting high accuracy thanks to machine learning advancements. Recent updates to the API have increased language support to over 125 languages and dialects. The service provides real-time transcription, word-level timestamps, and a variety of pre-trained models, allowing for specialized use cases such as call center transcriptions or media subtitling. However, this library requires a Google Cloud account, with costs dependent on usage, making it best suited for scalable, production-grade applications.
			   \s
			2. **Sphinx4** Sphinx4 is a popular choice for offline speech recognition and customization. Known for its flexibility, Sphinx4 allows developers to train custom acoustic and language models, enhancing the library’s adaptability to specific domains or accents. It supports multiple file formats and integrates well with Java applications via a native API. Updates to Sphinx4 have kept it compatible with newer Java versions, though support is primarily limited to English. Sphinx4 is ideal for applications that require offline functionality without relying on cloud services.
			   \s
			3. **MaryTTS** MaryTTS, also known as Mary Text-to-Speech, remains a powerful choice for Java-based text-to-speech applications. Supporting over ten languages, it enables output in multiple formats and offers phonetic transcription for linguistics-focused applications. MaryTTS is highly customizable, allowing developers to create new voice models and extend language support. With its active open-source community, MaryTTS has seen consistent updates, including improvements to voice quality and stability.
			   \s
			4. **FreeTTS** FreeTTS is a straightforward, Java-based text-to-speech library designed for basic synthesis needs. While it lacks the multilingual and advanced voice customization of MaryTTS, FreeTTS is easy to use and customize with features such as pitch, rate, and volume adjustments. FreeTTS is especially useful for applications needing simple speech capabilities in English without complex configurations.
			   \s
			5. **Additional Libraries** New libraries, such as **DeepSpeech**, developed by Mozilla, have gained traction for speech recognition in Java applications. DeepSpeech uses neural networks for improved accuracy and can operate offline, offering support for additional languages and accents through community-trained models. Although it requires additional setup, DeepSpeech’s offline and open-source nature make it an attractive alternative for developers seeking a high-accuracy, low-cost solution.
			   \s

			* * *

			### Conclusion

			Each of these libraries serves distinct use cases:

			* **Google Cloud Speech-to-Text** is ideal for applications needing high accuracy, real-time capabilities, and broad language support in cloud-based environments.
			* **Sphinx4** provides offline capabilities and extensive customization, making it suitable for specialized or isolated environments.
			* **MaryTTS** offers advanced text-to-speech capabilities with multilingual support, perfect for projects focusing on voice synthesis.
			* **FreeTTS** is a simpler solution for straightforward English TTS needs, with basic adjustments for pitch and volume.
			* **DeepSpeech** and other emerging libraries are pushing the boundaries of open-source speech recognition and are worth considering for modern applications needing both high accuracy and offline support.

			When choosing a library, consider factors like cloud dependence, customization requirements, and the desired level of accuracy. As speech technology evolves, keep an eye on updates, especially for open-source solutions, which are rapidly advancing in functionality and scope.

			""";

		actual = MdToHtmlExtensions.toHtml(md);
		expected = """
			<h3>Introduction</h3>
			<p>With voice-enabled applications becoming a staple in digital interfaces, choosing the right speech library is crucial. From virtual assistants to real-time transcription, the integration of speech recognition and synthesis in Java applications can greatly enhance user interaction. In this article, we’ll review top Java speech libraries, examine recent updates, and break down each library’s core features. This analysis aims to provide a well-rounded understanding of which library best aligns with your project’s goals.</p>
			<h3>Table of Contents</h3>
			<ol>
			<li>Google Cloud Speech-to-Text</li>
			<li>Sphinx4</li>
			<li>MaryTTS</li>
			<li>FreeTTS</li>
			<li>Additional Libraries</li>
			<li>Conclusion</li>
			</ol>
			<hr />
			<h3>Detailed Analysis of Java Speech Libraries</h3>
			<ol>
			<li>
			<p><strong>Google Cloud Speech-to-Text</strong> Google’s Speech-to-Text library offers one of the most robust solutions, boasting high accuracy thanks to machine learning advancements. Recent updates to the API have increased language support to over 125 languages and dialects. The service provides real-time transcription, word-level timestamps, and a variety of pre-trained models, allowing for specialized use cases such as call center transcriptions or media subtitling. However, this library requires a Google Cloud account, with costs dependent on usage, making it best suited for scalable, production-grade applications.</p>
			</li>
			<li>
			<p><strong>Sphinx4</strong> Sphinx4 is a popular choice for offline speech recognition and customization. Known for its flexibility, Sphinx4 allows developers to train custom acoustic and language models, enhancing the library’s adaptability to specific domains or accents. It supports multiple file formats and integrates well with Java applications via a native API. Updates to Sphinx4 have kept it compatible with newer Java versions, though support is primarily limited to English. Sphinx4 is ideal for applications that require offline functionality without relying on cloud services.</p>
			</li>
			<li>
			<p><strong>MaryTTS</strong> MaryTTS, also known as Mary Text-to-Speech, remains a powerful choice for Java-based text-to-speech applications. Supporting over ten languages, it enables output in multiple formats and offers phonetic transcription for linguistics-focused applications. MaryTTS is highly customizable, allowing developers to create new voice models and extend language support. With its active open-source community, MaryTTS has seen consistent updates, including improvements to voice quality and stability.</p>
			</li>
			<li>
			<p><strong>FreeTTS</strong> FreeTTS is a straightforward, Java-based text-to-speech library designed for basic synthesis needs. While it lacks the multilingual and advanced voice customization of MaryTTS, FreeTTS is easy to use and customize with features such as pitch, rate, and volume adjustments. FreeTTS is especially useful for applications needing simple speech capabilities in English without complex configurations.</p>
			</li>
			<li>
			<p><strong>Additional Libraries</strong> New libraries, such as <strong>DeepSpeech</strong>, developed by Mozilla, have gained traction for speech recognition in Java applications. DeepSpeech uses neural networks for improved accuracy and can operate offline, offering support for additional languages and accents through community-trained models. Although it requires additional setup, DeepSpeech’s offline and open-source nature make it an attractive alternative for developers seeking a high-accuracy, low-cost solution.</p>
			</li>
			</ol>
			<hr />
			<h3>Conclusion</h3>
			<p>Each of these libraries serves distinct use cases:</p>
			<ul>
			<li><strong>Google Cloud Speech-to-Text</strong> is ideal for applications needing high accuracy, real-time capabilities, and broad language support in cloud-based environments.</li>
			<li><strong>Sphinx4</strong> provides offline capabilities and extensive customization, making it suitable for specialized or isolated environments.</li>
			<li><strong>MaryTTS</strong> offers advanced text-to-speech capabilities with multilingual support, perfect for projects focusing on voice synthesis.</li>
			<li><strong>FreeTTS</strong> is a simpler solution for straightforward English TTS needs, with basic adjustments for pitch and volume.</li>
			<li><strong>DeepSpeech</strong> and other emerging libraries are pushing the boundaries of open-source speech recognition and are worth considering for modern applications needing both high accuracy and offline support.</li>
			</ul>
			<p>When choosing a library, consider factors like cloud dependence, customization requirements, and the desired level of accuracy. As speech technology evolves, keep an eye on updates, especially for open-source solutions, which are rapidly advancing in functionality and scope.</p>
			                """;
		assertEquals(expected, actual);
	}
}