package com.kmmt.resources

import dev.icerock.moko.resources.AssetResource
import dev.icerock.moko.resources.ColorResource
import dev.icerock.moko.resources.ColorResource.Single
import dev.icerock.moko.resources.ColorResource.Themed
import dev.icerock.moko.resources.FileResource
import dev.icerock.moko.resources.FontResource
import dev.icerock.moko.resources.ImageResource
import dev.icerock.moko.resources.PluralsResource
import dev.icerock.moko.resources.ResourceContainer
import dev.icerock.moko.resources.StringResource

public expect object Resources {
  public object strings : ResourceContainer<StringResource> {
    public val testString: StringResource

    public val login: StringResource

    public val kmmLogin: StringResource

    public val kmmHome: StringResource

    public val breedList: StringResource

    public val tvShows: StringResource

    public val codeChallenge: StringResource

    public val kampKitDemo: StringResource

    public val user: StringResource

    public val enterUsername: StringResource

    public val enterPassword: StringResource

    public val authenticating: StringResource

    public val loginFailed: StringResource

    public val pleaseEnterUsername: StringResource

    public val validationFailed: StringResource

    public val usernameOrPasswordIsEmpty: StringResource

    public val codeChallengeTVShowSearch: StringResource

    public val searchTVShows: StringResource
  }

  public object plurals : ResourceContainer<PluralsResource>

  public object images : ResourceContainer<ImageResource>

  public object fonts : ResourceContainer<FontResource>

  public object files : ResourceContainer<FileResource>

  public object colors : ResourceContainer<ColorResource> {
    public val backgroundLight: ColorResource.Single

    public val backgroundDark: ColorResource.Single

    public val background: ColorResource.Themed
  }

  public object assets : ResourceContainer<AssetResource>
}
