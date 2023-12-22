package Windows.UI.Xaml.Documents

import Windows.UI.Xaml.DependencyObject
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
@Signature("rc(Windows.UI.Xaml.Documents.TextElement;{e83b0062-d776-4f92-baea-40e77d4791d5})")
@WinRTByReference(brClass = TextElement.ByReference::class)
public open class TextElement(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), ITextElement.WithDefault, ITextElement2.WithDefault,
    ITextElement3.WithDefault, ITextElement4.WithDefault, ITextElement5.WithDefault,
    ITextElementOverrides.WithDefault, IWinRTObject {
  private val __1775594009_Interface: ITextElement.WithDefault by lazy {
    as_1775594009()
  }


  private val __791160619_Interface: ITextElement2.WithDefault by lazy {
    as_791160619()
  }


  private val __791160620_Interface: ITextElement3.WithDefault by lazy {
    as_791160620()
  }


  private val __791160621_Interface: ITextElement4.WithDefault by lazy {
    as_791160621()
  }


  private val __791160622_Interface: ITextElement5.WithDefault by lazy {
    as_791160622()
  }


  private val __821074944_Interface: ITextElementOverrides.WithDefault by lazy {
    as_821074944()
  }


  public override val __1775594009_Ptr: JNAPointer? by lazy {
    __1775594009_Interface.__1775594009_Ptr
  }


  public override val __791160619_Ptr: JNAPointer? by lazy {
    __791160619_Interface.__791160619_Ptr
  }


  public override val __791160620_Ptr: JNAPointer? by lazy {
    __791160620_Interface.__791160620_Ptr
  }


  public override val __791160621_Ptr: JNAPointer? by lazy {
    __791160621_Interface.__791160621_Ptr
  }


  public override val __791160622_Ptr: JNAPointer? by lazy {
    __791160622_Interface.__791160622_Ptr
  }


  public override val __821074944_Ptr: JNAPointer? by lazy {
    __821074944_Interface.__821074944_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1775594009_Interface, __791160619_Interface, __791160620_Interface,
        __791160621_Interface, __791160622_Interface, __821074944_Interface)

  private fun as_1775594009(): ITextElement.WithDefault {
    if(pointer == NULL) {
      return(ITextElement.ABI.makeITextElement(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextElement>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextElement.ABI.makeITextElement(ref.value))
  }

  private fun as_791160619(): ITextElement2.WithDefault {
    if(pointer == NULL) {
      return(ITextElement2.ABI.makeITextElement2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextElement2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextElement2.ABI.makeITextElement2(ref.value))
  }

  private fun as_791160620(): ITextElement3.WithDefault {
    if(pointer == NULL) {
      return(ITextElement3.ABI.makeITextElement3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextElement3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextElement3.ABI.makeITextElement3(ref.value))
  }

  private fun as_791160621(): ITextElement4.WithDefault {
    if(pointer == NULL) {
      return(ITextElement4.ABI.makeITextElement4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextElement4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextElement4.ABI.makeITextElement4(ref.value))
  }

  private fun as_791160622(): ITextElement5.WithDefault {
    if(pointer == NULL) {
      return(ITextElement5.ABI.makeITextElement5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextElement5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextElement5.ABI.makeITextElement5(ref.value))
  }

  private fun as_821074944(): ITextElementOverrides.WithDefault {
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


    public val ITextElementStatics3_Instance: ITextElementStatics3 by lazy {
      createITextElementStatics3()
    }


    public val ITextElementStatics2_Instance: ITextElementStatics2 by lazy {
      createITextElementStatics2()
    }


    public val ITextElementStatics4_Instance: ITextElementStatics4 by lazy {
      createITextElementStatics4()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITextElementStatics(): ITextElementStatics {
      val refiid = Guid.REFIID(ITextElementStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Documents.TextElement".toHandle(),refiid,interfacePtr)
      val result = ITextElementStatics.ABI.makeITextElementStatics(interfacePtr.value)
      return result
    }

    public fun createITextElementStatics3(): ITextElementStatics3 {
      val refiid = Guid.REFIID(ITextElementStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Documents.TextElement".toHandle(),refiid,interfacePtr)
      val result = ITextElementStatics3.ABI.makeITextElementStatics3(interfacePtr.value)
      return result
    }

    public fun createITextElementStatics2(): ITextElementStatics2 {
      val refiid = Guid.REFIID(ITextElementStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Documents.TextElement".toHandle(),refiid,interfacePtr)
      val result = ITextElementStatics2.ABI.makeITextElementStatics2(interfacePtr.value)
      return result
    }

    public fun createITextElementStatics4(): ITextElementStatics4 {
      val refiid = Guid.REFIID(ITextElementStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Documents.TextElement".toHandle(),refiid,interfacePtr)
      val result = ITextElementStatics4.ABI.makeITextElementStatics4(interfacePtr.value)
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

    public fun get_AllowFocusOnInteractionProperty() =
        ABI.ITextElementStatics3_Instance.get_AllowFocusOnInteractionProperty()

    public fun get_AccessKeyProperty() = ABI.ITextElementStatics3_Instance.get_AccessKeyProperty()

    public fun get_ExitDisplayModeOnAccessKeyInvokedProperty() =
        ABI.ITextElementStatics3_Instance.get_ExitDisplayModeOnAccessKeyInvokedProperty()

    public fun get_IsTextScaleFactorEnabledProperty() =
        ABI.ITextElementStatics2_Instance.get_IsTextScaleFactorEnabledProperty()

    public fun get_TextDecorationsProperty() =
        ABI.ITextElementStatics4_Instance.get_TextDecorationsProperty()

    public fun get_IsAccessKeyScopeProperty() =
        ABI.ITextElementStatics4_Instance.get_IsAccessKeyScopeProperty()

    public fun get_AccessKeyScopeOwnerProperty() =
        ABI.ITextElementStatics4_Instance.get_AccessKeyScopeOwnerProperty()

    public fun get_KeyTipPlacementModeProperty() =
        ABI.ITextElementStatics4_Instance.get_KeyTipPlacementModeProperty()

    public fun get_KeyTipHorizontalOffsetProperty() =
        ABI.ITextElementStatics4_Instance.get_KeyTipHorizontalOffsetProperty()

    public fun get_KeyTipVerticalOffsetProperty() =
        ABI.ITextElementStatics4_Instance.get_KeyTipVerticalOffsetProperty()
  }
}
