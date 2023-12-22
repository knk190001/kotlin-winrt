package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IRichEditBoxFactory.ABI.IID
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

@ABIMarker(RichEditBox.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.RichEditBox;{90a57a40-80b6-4fce-b1ec-e3c616284b6a})")
@WinRTByReference(brClass = RichEditBox.ByReference::class)
public open class RichEditBox(
  ptr: JNAPointer? = NULL
) : Control(ptr), IRichEditBox.WithDefault, IRichEditBox2.WithDefault, IRichEditBox3.WithDefault,
    IRichEditBox4.WithDefault, IRichEditBox5.WithDefault, IRichEditBox6.WithDefault,
    IRichEditBox7.WithDefault, IRichEditBox8.WithDefault, IWinRTObject {
  private val __13214391_Interface: IRichEditBox.WithDefault by lazy {
    as_13214391()
  }


  private val __409646071_Interface: IRichEditBox2.WithDefault by lazy {
    as_409646071()
  }


  private val __409646070_Interface: IRichEditBox3.WithDefault by lazy {
    as_409646070()
  }


  private val __409646069_Interface: IRichEditBox4.WithDefault by lazy {
    as_409646069()
  }


  private val __409646068_Interface: IRichEditBox5.WithDefault by lazy {
    as_409646068()
  }


  private val __409646067_Interface: IRichEditBox6.WithDefault by lazy {
    as_409646067()
  }


  private val __409646066_Interface: IRichEditBox7.WithDefault by lazy {
    as_409646066()
  }


  private val __409646065_Interface: IRichEditBox8.WithDefault by lazy {
    as_409646065()
  }


  public override val __13214391_Ptr: JNAPointer? by lazy {
    __13214391_Interface.__13214391_Ptr
  }


  public override val __409646071_Ptr: JNAPointer? by lazy {
    __409646071_Interface.__409646071_Ptr
  }


  public override val __409646070_Ptr: JNAPointer? by lazy {
    __409646070_Interface.__409646070_Ptr
  }


  public override val __409646069_Ptr: JNAPointer? by lazy {
    __409646069_Interface.__409646069_Ptr
  }


  public override val __409646068_Ptr: JNAPointer? by lazy {
    __409646068_Interface.__409646068_Ptr
  }


  public override val __409646067_Ptr: JNAPointer? by lazy {
    __409646067_Interface.__409646067_Ptr
  }


  public override val __409646066_Ptr: JNAPointer? by lazy {
    __409646066_Interface.__409646066_Ptr
  }


  public override val __409646065_Ptr: JNAPointer? by lazy {
    __409646065_Interface.__409646065_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__13214391_Interface, __409646071_Interface, __409646070_Interface,
        __409646069_Interface, __409646068_Interface, __409646067_Interface, __409646066_Interface,
        __409646065_Interface)

  public constructor() : this(ABI.activate())

  private fun as_13214391(): IRichEditBox.WithDefault {
    if(pointer == NULL) {
      return(IRichEditBox.ABI.makeIRichEditBox(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRichEditBox>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRichEditBox.ABI.makeIRichEditBox(ref.value))
  }

  private fun as_409646071(): IRichEditBox2.WithDefault {
    if(pointer == NULL) {
      return(IRichEditBox2.ABI.makeIRichEditBox2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRichEditBox2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRichEditBox2.ABI.makeIRichEditBox2(ref.value))
  }

  private fun as_409646070(): IRichEditBox3.WithDefault {
    if(pointer == NULL) {
      return(IRichEditBox3.ABI.makeIRichEditBox3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRichEditBox3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRichEditBox3.ABI.makeIRichEditBox3(ref.value))
  }

  private fun as_409646069(): IRichEditBox4.WithDefault {
    if(pointer == NULL) {
      return(IRichEditBox4.ABI.makeIRichEditBox4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRichEditBox4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRichEditBox4.ABI.makeIRichEditBox4(ref.value))
  }

  private fun as_409646068(): IRichEditBox5.WithDefault {
    if(pointer == NULL) {
      return(IRichEditBox5.ABI.makeIRichEditBox5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRichEditBox5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRichEditBox5.ABI.makeIRichEditBox5(ref.value))
  }

  private fun as_409646067(): IRichEditBox6.WithDefault {
    if(pointer == NULL) {
      return(IRichEditBox6.ABI.makeIRichEditBox6(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRichEditBox6>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRichEditBox6.ABI.makeIRichEditBox6(ref.value))
  }

  private fun as_409646066(): IRichEditBox7.WithDefault {
    if(pointer == NULL) {
      return(IRichEditBox7.ABI.makeIRichEditBox7(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRichEditBox7>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRichEditBox7.ABI.makeIRichEditBox7(ref.value))
  }

  private fun as_409646065(): IRichEditBox8.WithDefault {
    if(pointer == NULL) {
      return(IRichEditBox8.ABI.makeIRichEditBox8(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRichEditBox8>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRichEditBox8.ABI.makeIRichEditBox8(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<RichEditBox> {
    public override fun getValue() = RichEditBox(pointer.getPointer(0))

    public fun setValue(value: RichEditBox): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RichEditBox, MemoryAddress> {
    public val IRichEditBoxStatics3_Instance: IRichEditBoxStatics3 by lazy {
      createIRichEditBoxStatics3()
    }


    public val IRichEditBoxStatics8_Instance: IRichEditBoxStatics8 by lazy {
      createIRichEditBoxStatics8()
    }


    public val IRichEditBoxStatics6_Instance: IRichEditBoxStatics6 by lazy {
      createIRichEditBoxStatics6()
    }


    public val IRichEditBoxStatics_Instance: IRichEditBoxStatics by lazy {
      createIRichEditBoxStatics()
    }


    public val IRichEditBoxStatics4_Instance: IRichEditBoxStatics4 by lazy {
      createIRichEditBoxStatics4()
    }


    public val IRichEditBoxStatics2_Instance: IRichEditBoxStatics2 by lazy {
      createIRichEditBoxStatics2()
    }


    public val IRichEditBoxStatics7_Instance: IRichEditBoxStatics7 by lazy {
      createIRichEditBoxStatics7()
    }


    public val IRichEditBoxStatics5_Instance: IRichEditBoxStatics5 by lazy {
      createIRichEditBoxStatics5()
    }


    public val IRichEditBoxFactory_Instance: IRichEditBoxFactory by lazy {
      createIRichEditBoxFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRichEditBoxStatics3(): IRichEditBoxStatics3 {
      val refiid = Guid.REFIID(IRichEditBoxStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.RichEditBox".toHandle(),refiid,interfacePtr)
      val result = IRichEditBoxStatics3.ABI.makeIRichEditBoxStatics3(interfacePtr.value)
      return result
    }

    public fun createIRichEditBoxStatics8(): IRichEditBoxStatics8 {
      val refiid = Guid.REFIID(IRichEditBoxStatics8.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.RichEditBox".toHandle(),refiid,interfacePtr)
      val result = IRichEditBoxStatics8.ABI.makeIRichEditBoxStatics8(interfacePtr.value)
      return result
    }

    public fun createIRichEditBoxStatics6(): IRichEditBoxStatics6 {
      val refiid = Guid.REFIID(IRichEditBoxStatics6.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.RichEditBox".toHandle(),refiid,interfacePtr)
      val result = IRichEditBoxStatics6.ABI.makeIRichEditBoxStatics6(interfacePtr.value)
      return result
    }

    public fun createIRichEditBoxStatics(): IRichEditBoxStatics {
      val refiid = Guid.REFIID(IRichEditBoxStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.RichEditBox".toHandle(),refiid,interfacePtr)
      val result = IRichEditBoxStatics.ABI.makeIRichEditBoxStatics(interfacePtr.value)
      return result
    }

    public fun createIRichEditBoxStatics4(): IRichEditBoxStatics4 {
      val refiid = Guid.REFIID(IRichEditBoxStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.RichEditBox".toHandle(),refiid,interfacePtr)
      val result = IRichEditBoxStatics4.ABI.makeIRichEditBoxStatics4(interfacePtr.value)
      return result
    }

    public fun createIRichEditBoxStatics2(): IRichEditBoxStatics2 {
      val refiid = Guid.REFIID(IRichEditBoxStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.RichEditBox".toHandle(),refiid,interfacePtr)
      val result = IRichEditBoxStatics2.ABI.makeIRichEditBoxStatics2(interfacePtr.value)
      return result
    }

    public fun createIRichEditBoxStatics7(): IRichEditBoxStatics7 {
      val refiid = Guid.REFIID(IRichEditBoxStatics7.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.RichEditBox".toHandle(),refiid,interfacePtr)
      val result = IRichEditBoxStatics7.ABI.makeIRichEditBoxStatics7(interfacePtr.value)
      return result
    }

    public fun createIRichEditBoxStatics5(): IRichEditBoxStatics5 {
      val refiid = Guid.REFIID(IRichEditBoxStatics5.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.RichEditBox".toHandle(),refiid,interfacePtr)
      val result = IRichEditBoxStatics5.ABI.makeIRichEditBoxStatics5(interfacePtr.value)
      return result
    }

    public fun createIRichEditBoxFactory(): IRichEditBoxFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.RichEditBox".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRichEditBoxFactory.ABI.makeIRichEditBoxFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IRichEditBoxFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): RichEditBox {
      val address = segment.toRawLongValue()
      return RichEditBox(Pointer(address))
    }

    public override fun toNative(obj: RichEditBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_DesiredCandidateWindowAlignmentProperty() =
        ABI.IRichEditBoxStatics3_Instance.get_DesiredCandidateWindowAlignmentProperty()

    public fun get_TextReadingOrderProperty() =
        ABI.IRichEditBoxStatics3_Instance.get_TextReadingOrderProperty()

    public fun get_SelectionFlyoutProperty() =
        ABI.IRichEditBoxStatics8_Instance.get_SelectionFlyoutProperty()

    public fun get_ProofingMenuFlyoutProperty() =
        ABI.IRichEditBoxStatics8_Instance.get_ProofingMenuFlyoutProperty()

    public fun get_DescriptionProperty() =
        ABI.IRichEditBoxStatics8_Instance.get_DescriptionProperty()

    public fun get_HorizontalTextAlignmentProperty() =
        ABI.IRichEditBoxStatics6_Instance.get_HorizontalTextAlignmentProperty()

    public fun get_CharacterCasingProperty() =
        ABI.IRichEditBoxStatics6_Instance.get_CharacterCasingProperty()

    public fun get_DisabledFormattingAcceleratorsProperty() =
        ABI.IRichEditBoxStatics6_Instance.get_DisabledFormattingAcceleratorsProperty()

    public fun get_IsReadOnlyProperty() = ABI.IRichEditBoxStatics_Instance.get_IsReadOnlyProperty()

    public fun get_AcceptsReturnProperty() =
        ABI.IRichEditBoxStatics_Instance.get_AcceptsReturnProperty()

    public fun get_TextAlignmentProperty() =
        ABI.IRichEditBoxStatics_Instance.get_TextAlignmentProperty()

    public fun get_TextWrappingProperty() =
        ABI.IRichEditBoxStatics_Instance.get_TextWrappingProperty()

    public fun get_IsSpellCheckEnabledProperty() =
        ABI.IRichEditBoxStatics_Instance.get_IsSpellCheckEnabledProperty()

    public fun get_IsTextPredictionEnabledProperty() =
        ABI.IRichEditBoxStatics_Instance.get_IsTextPredictionEnabledProperty()

    public fun get_InputScopeProperty() = ABI.IRichEditBoxStatics_Instance.get_InputScopeProperty()

    public fun get_ClipboardCopyFormatProperty() =
        ABI.IRichEditBoxStatics4_Instance.get_ClipboardCopyFormatProperty()

    public fun get_HeaderProperty() = ABI.IRichEditBoxStatics2_Instance.get_HeaderProperty()

    public fun get_HeaderTemplateProperty() =
        ABI.IRichEditBoxStatics2_Instance.get_HeaderTemplateProperty()

    public fun get_PlaceholderTextProperty() =
        ABI.IRichEditBoxStatics2_Instance.get_PlaceholderTextProperty()

    public fun get_SelectionHighlightColorProperty() =
        ABI.IRichEditBoxStatics2_Instance.get_SelectionHighlightColorProperty()

    public fun get_PreventKeyboardDisplayOnProgrammaticFocusProperty() =
        ABI.IRichEditBoxStatics2_Instance.get_PreventKeyboardDisplayOnProgrammaticFocusProperty()

    public fun get_IsColorFontEnabledProperty() =
        ABI.IRichEditBoxStatics2_Instance.get_IsColorFontEnabledProperty()

    public fun get_ContentLinkForegroundColorProperty() =
        ABI.IRichEditBoxStatics7_Instance.get_ContentLinkForegroundColorProperty()

    public fun get_ContentLinkBackgroundColorProperty() =
        ABI.IRichEditBoxStatics7_Instance.get_ContentLinkBackgroundColorProperty()

    public fun get_ContentLinkProvidersProperty() =
        ABI.IRichEditBoxStatics7_Instance.get_ContentLinkProvidersProperty()

    public fun get_HandwritingViewProperty() =
        ABI.IRichEditBoxStatics7_Instance.get_HandwritingViewProperty()

    public fun get_IsHandwritingViewEnabledProperty() =
        ABI.IRichEditBoxStatics7_Instance.get_IsHandwritingViewEnabledProperty()

    public fun get_SelectionHighlightColorWhenNotFocusedProperty() =
        ABI.IRichEditBoxStatics5_Instance.get_SelectionHighlightColorWhenNotFocusedProperty()

    public fun get_MaxLengthProperty() = ABI.IRichEditBoxStatics5_Instance.get_MaxLengthProperty()
  }
}
