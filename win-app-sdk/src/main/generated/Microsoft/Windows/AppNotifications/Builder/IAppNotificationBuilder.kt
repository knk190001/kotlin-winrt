package Microsoft.Windows.AppNotifications.Builder

import Microsoft.Windows.AppNotifications.AppNotification
import Windows.Foundation.DateTime
import Windows.Foundation.Uri
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppNotificationBuilder.ABI::class)
@Signature("{e801d31f-ce03-505c-adec-8a02724ec9de}")
@Guid("e801d31fce03505cadec8a02724ec9de")
@WinRTInterface("e801d31fce03505cadec8a02724ec9de")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppNotificationBuilder.ByReference::class)
public interface IAppNotificationBuilder : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AddArgument(key: String?, value: String?): AppNotificationBuilder?

  @InterfaceMethod(1)
  public fun SetTimeStamp(value: DateTime?): AppNotificationBuilder?

  @InterfaceMethod(2)
  public fun SetDuration(duration: AppNotificationDuration?): AppNotificationBuilder?

  @InterfaceMethod(3)
  public fun SetScenario(value: AppNotificationScenario?): AppNotificationBuilder?

  @InterfaceMethod(4)
  public fun AddText(text: String?): AppNotificationBuilder?

  @InterfaceMethod(5)
  public fun AddText(text: String?, properties: AppNotificationTextProperties?):
      AppNotificationBuilder?

  @InterfaceMethod(6)
  public fun SetAttributionText(text: String?): AppNotificationBuilder?

  @InterfaceMethod(7)
  public fun SetAttributionText(text: String?, language: String?): AppNotificationBuilder?

  @InterfaceMethod(8)
  public fun SetInlineImage(imageUri: Uri?): AppNotificationBuilder?

  @InterfaceMethod(9)
  public fun SetInlineImage(imageUri: Uri?, imageCrop: AppNotificationImageCrop?):
      AppNotificationBuilder?

  @InterfaceMethod(10)
  public fun SetInlineImage(
    imageUri: Uri?,
    imagecrop: AppNotificationImageCrop?,
    alternateText: String?
  ): AppNotificationBuilder?

  @InterfaceMethod(11)
  public fun SetAppLogoOverride(imageUri: Uri?): AppNotificationBuilder?

  @InterfaceMethod(12)
  public fun SetAppLogoOverride(imageUri: Uri?, imageCrop: AppNotificationImageCrop?):
      AppNotificationBuilder?

  @InterfaceMethod(13)
  public fun SetAppLogoOverride(
    imageUri: Uri?,
    imageCrop: AppNotificationImageCrop?,
    alternateText: String?
  ): AppNotificationBuilder?

  @InterfaceMethod(14)
  public fun SetHeroImage(imageUri: Uri?): AppNotificationBuilder?

  @InterfaceMethod(15)
  public fun SetHeroImage(imageUri: Uri?, alternateText: String?): AppNotificationBuilder?

  @InterfaceMethod(16)
  public fun SetAudioUri(audioUri: Uri?): AppNotificationBuilder?

  @InterfaceMethod(17)
  public fun SetAudioUri(audioUri: Uri?, loop: AppNotificationAudioLooping?):
      AppNotificationBuilder?

  @InterfaceMethod(18)
  public fun SetAudioEvent(appNotificationSoundEvent: AppNotificationSoundEvent?):
      AppNotificationBuilder?

  @InterfaceMethod(19)
  public fun SetAudioEvent(appNotificationSoundEvent: AppNotificationSoundEvent?,
      loop: AppNotificationAudioLooping?): AppNotificationBuilder?

  @InterfaceMethod(20)
  public fun MuteAudio(): AppNotificationBuilder?

  @InterfaceMethod(21)
  public fun AddTextBox(id: String?): AppNotificationBuilder?

  @InterfaceMethod(22)
  public fun AddTextBox(
    id: String?,
    placeHolderText: String?,
    title: String?
  ): AppNotificationBuilder?

  @InterfaceMethod(23)
  public fun AddButton(value: AppNotificationButton?): AppNotificationBuilder?

  @InterfaceMethod(24)
  public fun AddComboBox(value: AppNotificationComboBox?): AppNotificationBuilder?

  @InterfaceMethod(25)
  public fun AddProgressBar(value: AppNotificationProgressBar?): AppNotificationBuilder?

  @InterfaceMethod(26)
  public fun BuildNotification(): AppNotification?

  @InterfaceMethod(27)
  public fun SetTag(value: String?): AppNotificationBuilder?

  @InterfaceMethod(28)
  public fun SetGroup(group: String?): AppNotificationBuilder?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppNotificationBuilder> {
    public override fun getValue() = ABI.makeIAppNotificationBuilder(pointer.getPointer(0))

    public fun setValue(value: IAppNotificationBuilder_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppNotificationBuilder {
    public val __1432407591_Ptr: Pointer?

    public val _1432407591_VtblPtr: Pointer?
      get() = __1432407591_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AddArgument(key: String?, value: String?): AppNotificationBuilder? {
      val fnPtr = _1432407591_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationBuilder>()
      val hr = fn.invokeHR(arrayOf(__1432407591_Ptr, marshalToNative(key), marshalToNative(value),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationBuilder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SetTimeStamp(value: DateTime?): AppNotificationBuilder? {
      val fnPtr = _1432407591_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationBuilder>()
      val hr = fn.invokeHR(arrayOf(__1432407591_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationBuilder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetDuration(duration: AppNotificationDuration?): AppNotificationBuilder? {
      val fnPtr = _1432407591_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationBuilder>()
      val hr = fn.invokeHR(arrayOf(__1432407591_Ptr, marshalToNative(duration), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationBuilder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun SetScenario(value: AppNotificationScenario?): AppNotificationBuilder? {
      val fnPtr = _1432407591_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationBuilder>()
      val hr = fn.invokeHR(arrayOf(__1432407591_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationBuilder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun AddText(text: String?): AppNotificationBuilder? {
      val fnPtr = _1432407591_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationBuilder>()
      val hr = fn.invokeHR(arrayOf(__1432407591_Ptr, marshalToNative(text), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationBuilder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun AddText(text: String?, properties: AppNotificationTextProperties?):
        AppNotificationBuilder? {
      val fnPtr = _1432407591_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationBuilder>()
      val hr = fn.invokeHR(arrayOf(__1432407591_Ptr, marshalToNative(text),
          marshalToNative(properties), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationBuilder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun SetAttributionText(text: String?): AppNotificationBuilder? {
      val fnPtr = _1432407591_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationBuilder>()
      val hr = fn.invokeHR(arrayOf(__1432407591_Ptr, marshalToNative(text), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationBuilder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun SetAttributionText(text: String?, language: String?):
        AppNotificationBuilder? {
      val fnPtr = _1432407591_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationBuilder>()
      val hr = fn.invokeHR(arrayOf(__1432407591_Ptr, marshalToNative(text),
          marshalToNative(language), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationBuilder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun SetInlineImage(imageUri: Uri?): AppNotificationBuilder? {
      val fnPtr = _1432407591_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationBuilder>()
      val hr = fn.invokeHR(arrayOf(__1432407591_Ptr, marshalToNative(imageUri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationBuilder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun SetInlineImage(imageUri: Uri?, imageCrop: AppNotificationImageCrop?):
        AppNotificationBuilder? {
      val fnPtr = _1432407591_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationBuilder>()
      val hr = fn.invokeHR(arrayOf(__1432407591_Ptr, marshalToNative(imageUri),
          marshalToNative(imageCrop), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationBuilder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun SetInlineImage(
      imageUri: Uri?,
      imagecrop: AppNotificationImageCrop?,
      alternateText: String?
    ): AppNotificationBuilder? {
      val fnPtr = _1432407591_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationBuilder>()
      val hr = fn.invokeHR(arrayOf(__1432407591_Ptr, marshalToNative(imageUri),
          marshalToNative(imagecrop), marshalToNative(alternateText), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationBuilder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun SetAppLogoOverride(imageUri: Uri?): AppNotificationBuilder? {
      val fnPtr = _1432407591_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationBuilder>()
      val hr = fn.invokeHR(arrayOf(__1432407591_Ptr, marshalToNative(imageUri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationBuilder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun SetAppLogoOverride(imageUri: Uri?, imageCrop: AppNotificationImageCrop?):
        AppNotificationBuilder? {
      val fnPtr = _1432407591_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationBuilder>()
      val hr = fn.invokeHR(arrayOf(__1432407591_Ptr, marshalToNative(imageUri),
          marshalToNative(imageCrop), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationBuilder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun SetAppLogoOverride(
      imageUri: Uri?,
      imageCrop: AppNotificationImageCrop?,
      alternateText: String?
    ): AppNotificationBuilder? {
      val fnPtr = _1432407591_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationBuilder>()
      val hr = fn.invokeHR(arrayOf(__1432407591_Ptr, marshalToNative(imageUri),
          marshalToNative(imageCrop), marshalToNative(alternateText), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationBuilder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun SetHeroImage(imageUri: Uri?): AppNotificationBuilder? {
      val fnPtr = _1432407591_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationBuilder>()
      val hr = fn.invokeHR(arrayOf(__1432407591_Ptr, marshalToNative(imageUri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationBuilder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun SetHeroImage(imageUri: Uri?, alternateText: String?):
        AppNotificationBuilder? {
      val fnPtr = _1432407591_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationBuilder>()
      val hr = fn.invokeHR(arrayOf(__1432407591_Ptr, marshalToNative(imageUri),
          marshalToNative(alternateText), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationBuilder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun SetAudioUri(audioUri: Uri?): AppNotificationBuilder? {
      val fnPtr = _1432407591_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationBuilder>()
      val hr = fn.invokeHR(arrayOf(__1432407591_Ptr, marshalToNative(audioUri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationBuilder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun SetAudioUri(audioUri: Uri?, loop: AppNotificationAudioLooping?):
        AppNotificationBuilder? {
      val fnPtr = _1432407591_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationBuilder>()
      val hr = fn.invokeHR(arrayOf(__1432407591_Ptr, marshalToNative(audioUri),
          marshalToNative(loop), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationBuilder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun SetAudioEvent(appNotificationSoundEvent: AppNotificationSoundEvent?):
        AppNotificationBuilder? {
      val fnPtr = _1432407591_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationBuilder>()
      val hr = fn.invokeHR(arrayOf(__1432407591_Ptr, marshalToNative(appNotificationSoundEvent),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationBuilder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun SetAudioEvent(appNotificationSoundEvent: AppNotificationSoundEvent?,
        loop: AppNotificationAudioLooping?): AppNotificationBuilder? {
      val fnPtr = _1432407591_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationBuilder>()
      val hr = fn.invokeHR(arrayOf(__1432407591_Ptr, marshalToNative(appNotificationSoundEvent),
          marshalToNative(loop), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationBuilder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun MuteAudio(): AppNotificationBuilder? {
      val fnPtr = _1432407591_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationBuilder>()
      val hr = fn.invokeHR(arrayOf(__1432407591_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationBuilder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun AddTextBox(id: String?): AppNotificationBuilder? {
      val fnPtr = _1432407591_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationBuilder>()
      val hr = fn.invokeHR(arrayOf(__1432407591_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationBuilder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun AddTextBox(
      id: String?,
      placeHolderText: String?,
      title: String?
    ): AppNotificationBuilder? {
      val fnPtr = _1432407591_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationBuilder>()
      val hr = fn.invokeHR(arrayOf(__1432407591_Ptr, marshalToNative(id),
          marshalToNative(placeHolderText), marshalToNative(title), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationBuilder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun AddButton(value: AppNotificationButton?): AppNotificationBuilder? {
      val fnPtr = _1432407591_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationBuilder>()
      val hr = fn.invokeHR(arrayOf(__1432407591_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationBuilder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun AddComboBox(value: AppNotificationComboBox?): AppNotificationBuilder? {
      val fnPtr = _1432407591_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationBuilder>()
      val hr = fn.invokeHR(arrayOf(__1432407591_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationBuilder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun AddProgressBar(value: AppNotificationProgressBar?):
        AppNotificationBuilder? {
      val fnPtr = _1432407591_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationBuilder>()
      val hr = fn.invokeHR(arrayOf(__1432407591_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationBuilder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun BuildNotification(): AppNotification? {
      val fnPtr = _1432407591_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotification>()
      val hr = fn.invokeHR(arrayOf(__1432407591_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotification>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun SetTag(value: String?): AppNotificationBuilder? {
      val fnPtr = _1432407591_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationBuilder>()
      val hr = fn.invokeHR(arrayOf(__1432407591_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationBuilder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun SetGroup(group: String?): AppNotificationBuilder? {
      val fnPtr = _1432407591_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationBuilder>()
      val hr = fn.invokeHR(arrayOf(__1432407591_Ptr, marshalToNative(group), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationBuilder>(result.getValue())
      return resultValue
    }
  }

  public class IAppNotificationBuilder_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1432407591_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppNotificationBuilder, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e801d31fce03505cadec8a02724ec9de")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppNotificationBuilder(ptr: Pointer?): WithDefault =
        IAppNotificationBuilder_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppNotificationBuilder {
      val address = segment.toRawLongValue()
      return makeIAppNotificationBuilder(Pointer(address))
    }

    public override fun toNative(obj: IAppNotificationBuilder): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1432407591_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppNotificationBuilder): Array<IAppNotificationBuilder?>
        = (elements as
        Array<IAppNotificationBuilder?>).castToImpl<IAppNotificationBuilder,IAppNotificationBuilder_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppNotificationBuilder?> =
        arrayOfNulls<IAppNotificationBuilder_Impl>(size) as Array<IAppNotificationBuilder?>
  }
}
