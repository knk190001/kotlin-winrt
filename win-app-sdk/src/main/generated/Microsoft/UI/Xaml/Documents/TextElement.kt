package Microsoft.UI.Xaml.Documents

import Microsoft.UI.Xaml.DependencyObject
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(TextElement.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Documents.TextElement;{a122ba22-833f-5220-a47e-6cd507531abe})")
@WinRTByReference(brClass = TextElement.ByReference::class)
public open class TextElement(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), ITextElement.WithDefault, ITextElementOverrides.WithDefault, IWinRTObject
    {
  private val __36184302_Interface: ITextElement.WithDefault by lazy {
    as_36184302()
  }


  private val __360411957_Interface: ITextElementOverrides.WithDefault by lazy {
    as_360411957()
  }


  public override val __36184302_Ptr: JNAPointer? by lazy {
    __36184302_Interface.__36184302_Ptr
  }


  public override val __360411957_Ptr: JNAPointer? by lazy {
    __360411957_Interface.__360411957_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__36184302_Interface, __360411957_Interface)

  private fun as_36184302(): ITextElement.WithDefault {
    if(pointer == NULL) {
      return(ITextElement.ABI.makeITextElement(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextElement>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextElement.ABI.makeITextElement(ref.value))
  }

  private fun as_360411957(): ITextElementOverrides.WithDefault {
    if(pointer == NULL) {
      return(ITextElementOverrides.ABI.makeITextElementOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextElementOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextElementOverrides.ABI.makeITextElementOverrides(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<TextElement> {
    public override fun getValue() = TextElement(pointer.getPointer(0))

    public fun setValue(value: TextElement): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TextElement, MemoryAddress> {
    public val ITextElementStatics_Instance: ITextElementStatics by lazy {
      createITextElementStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITextElementStatics(): ITextElementStatics {
      val refiid = Guid.REFIID(ITextElementStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Documents.TextElement".toHandle(),refiid,interfacePtr)
      val result = ITextElementStatics.ABI.makeITextElementStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): TextElement {
      val address = segment.toRawLongValue()
      return TextElement(Pointer(address))
    }

    public override fun toNative(obj: TextElement): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_FontSizeProperty() = ABI.ITextElementStatics_Instance.get_FontSizeProperty()

    public fun get_FontFamilyProperty() = ABI.ITextElementStatics_Instance.get_FontFamilyProperty()

    public fun get_FontWeightProperty() = ABI.ITextElementStatics_Instance.get_FontWeightProperty()

    public fun get_FontStyleProperty() = ABI.ITextElementStatics_Instance.get_FontStyleProperty()

    public fun get_FontStretchProperty() =
        ABI.ITextElementStatics_Instance.get_FontStretchProperty()

    public fun get_CharacterSpacingProperty() =
        ABI.ITextElementStatics_Instance.get_CharacterSpacingProperty()

    public fun get_ForegroundProperty() = ABI.ITextElementStatics_Instance.get_ForegroundProperty()

    public fun get_LanguageProperty() = ABI.ITextElementStatics_Instance.get_LanguageProperty()

    public fun get_IsTextScaleFactorEnabledProperty() =
        ABI.ITextElementStatics_Instance.get_IsTextScaleFactorEnabledProperty()

    public fun get_TextDecorationsProperty() =
        ABI.ITextElementStatics_Instance.get_TextDecorationsProperty()

    public fun get_AllowFocusOnInteractionProperty() =
        ABI.ITextElementStatics_Instance.get_AllowFocusOnInteractionProperty()

    public fun get_AccessKeyProperty() = ABI.ITextElementStatics_Instance.get_AccessKeyProperty()

    public fun get_ExitDisplayModeOnAccessKeyInvokedProperty() =
        ABI.ITextElementStatics_Instance.get_ExitDisplayModeOnAccessKeyInvokedProperty()

    public fun get_IsAccessKeyScopeProperty() =
        ABI.ITextElementStatics_Instance.get_IsAccessKeyScopeProperty()

    public fun get_AccessKeyScopeOwnerProperty() =
        ABI.ITextElementStatics_Instance.get_AccessKeyScopeOwnerProperty()

    public fun get_KeyTipPlacementModeProperty() =
        ABI.ITextElementStatics_Instance.get_KeyTipPlacementModeProperty()

    public fun get_KeyTipHorizontalOffsetProperty() =
        ABI.ITextElementStatics_Instance.get_KeyTipHorizontalOffsetProperty()

    public fun get_KeyTipVerticalOffsetProperty() =
        ABI.ITextElementStatics_Instance.get_KeyTipVerticalOffsetProperty()
  }
}
