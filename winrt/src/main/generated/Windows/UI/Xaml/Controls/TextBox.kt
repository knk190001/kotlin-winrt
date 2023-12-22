package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.ITextBoxFactory.ABI.IID
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

@ABIMarker(TextBox.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.TextBox;{e48f5a8b-1dff-4352-a1f4-e516514ec882})")
@WinRTByReference(brClass = TextBox.ByReference::class)
public open class TextBox(
  ptr: JNAPointer? = NULL
) : Control(ptr), ITextBox.WithDefault, ITextBox2.WithDefault, ITextBox3.WithDefault,
    ITextBox4.WithDefault, ITextBox5.WithDefault, ITextBox6.WithDefault, ITextBox7.WithDefault,
    ITextBox8.WithDefault, IWinRTObject {
  private val __2030051778_Interface: ITextBox.WithDefault by lazy {
    as_2030051778()
  }


  private val __1492904272_Interface: ITextBox2.WithDefault by lazy {
    as_1492904272()
  }


  private val __1492904271_Interface: ITextBox3.WithDefault by lazy {
    as_1492904271()
  }


  private val __1492904270_Interface: ITextBox4.WithDefault by lazy {
    as_1492904270()
  }


  private val __1492904269_Interface: ITextBox5.WithDefault by lazy {
    as_1492904269()
  }


  private val __1492904268_Interface: ITextBox6.WithDefault by lazy {
    as_1492904268()
  }


  private val __1492904267_Interface: ITextBox7.WithDefault by lazy {
    as_1492904267()
  }


  private val __1492904266_Interface: ITextBox8.WithDefault by lazy {
    as_1492904266()
  }


  public override val __2030051778_Ptr: JNAPointer? by lazy {
    __2030051778_Interface.__2030051778_Ptr
  }


  public override val __1492904272_Ptr: JNAPointer? by lazy {
    __1492904272_Interface.__1492904272_Ptr
  }


  public override val __1492904271_Ptr: JNAPointer? by lazy {
    __1492904271_Interface.__1492904271_Ptr
  }


  public override val __1492904270_Ptr: JNAPointer? by lazy {
    __1492904270_Interface.__1492904270_Ptr
  }


  public override val __1492904269_Ptr: JNAPointer? by lazy {
    __1492904269_Interface.__1492904269_Ptr
  }


  public override val __1492904268_Ptr: JNAPointer? by lazy {
    __1492904268_Interface.__1492904268_Ptr
  }


  public override val __1492904267_Ptr: JNAPointer? by lazy {
    __1492904267_Interface.__1492904267_Ptr
  }


  public override val __1492904266_Ptr: JNAPointer? by lazy {
    __1492904266_Interface.__1492904266_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2030051778_Interface, __1492904272_Interface, __1492904271_Interface,
        __1492904270_Interface, __1492904269_Interface, __1492904268_Interface,
        __1492904267_Interface, __1492904266_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2030051778(): ITextBox.WithDefault {
    if(pointer == NULL) {
      return(ITextBox.ABI.makeITextBox(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextBox>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextBox.ABI.makeITextBox(ref.value))
  }

  private fun as_1492904272(): ITextBox2.WithDefault {
    if(pointer == NULL) {
      return(ITextBox2.ABI.makeITextBox2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextBox2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextBox2.ABI.makeITextBox2(ref.value))
  }

  private fun as_1492904271(): ITextBox3.WithDefault {
    if(pointer == NULL) {
      return(ITextBox3.ABI.makeITextBox3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextBox3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextBox3.ABI.makeITextBox3(ref.value))
  }

  private fun as_1492904270(): ITextBox4.WithDefault {
    if(pointer == NULL) {
      return(ITextBox4.ABI.makeITextBox4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextBox4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextBox4.ABI.makeITextBox4(ref.value))
  }

  private fun as_1492904269(): ITextBox5.WithDefault {
    if(pointer == NULL) {
      return(ITextBox5.ABI.makeITextBox5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextBox5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextBox5.ABI.makeITextBox5(ref.value))
  }

  private fun as_1492904268(): ITextBox6.WithDefault {
    if(pointer == NULL) {
      return(ITextBox6.ABI.makeITextBox6(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextBox6>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextBox6.ABI.makeITextBox6(ref.value))
  }

  private fun as_1492904267(): ITextBox7.WithDefault {
    if(pointer == NULL) {
      return(ITextBox7.ABI.makeITextBox7(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextBox7>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextBox7.ABI.makeITextBox7(ref.value))
  }

  private fun as_1492904266(): ITextBox8.WithDefault {
    if(pointer == NULL) {
      return(ITextBox8.ABI.makeITextBox8(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextBox8>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextBox8.ABI.makeITextBox8(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<TextBox> {
    public override fun getValue() = TextBox(pointer.getPointer(0))

    public fun setValue(value: TextBox): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TextBox, MemoryAddress> {
    public val ITextBoxStatics8_Instance: ITextBoxStatics8 by lazy {
      createITextBoxStatics8()
    }


    public val ITextBoxStatics_Instance: ITextBoxStatics by lazy {
      createITextBoxStatics()
    }


    public val ITextBoxStatics5_Instance: ITextBoxStatics5 by lazy {
      createITextBoxStatics5()
    }


    public val ITextBoxStatics2_Instance: ITextBoxStatics2 by lazy {
      createITextBoxStatics2()
    }


    public val ITextBoxStatics7_Instance: ITextBoxStatics7 by lazy {
      createITextBoxStatics7()
    }


    public val ITextBoxStatics3_Instance: ITextBoxStatics3 by lazy {
      createITextBoxStatics3()
    }


    public val ITextBoxStatics6_Instance: ITextBoxStatics6 by lazy {
      createITextBoxStatics6()
    }


    public val ITextBoxFactory_Instance: ITextBoxFactory by lazy {
      createITextBoxFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITextBoxStatics8(): ITextBoxStatics8 {
      val refiid = Guid.REFIID(ITextBoxStatics8.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.TextBox".toHandle(),refiid,interfacePtr)
      val result = ITextBoxStatics8.ABI.makeITextBoxStatics8(interfacePtr.value)
      return result
    }

    public fun createITextBoxStatics(): ITextBoxStatics {
      val refiid = Guid.REFIID(ITextBoxStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.TextBox".toHandle(),refiid,interfacePtr)
      val result = ITextBoxStatics.ABI.makeITextBoxStatics(interfacePtr.value)
      return result
    }

    public fun createITextBoxStatics5(): ITextBoxStatics5 {
      val refiid = Guid.REFIID(ITextBoxStatics5.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.TextBox".toHandle(),refiid,interfacePtr)
      val result = ITextBoxStatics5.ABI.makeITextBoxStatics5(interfacePtr.value)
      return result
    }

    public fun createITextBoxStatics2(): ITextBoxStatics2 {
      val refiid = Guid.REFIID(ITextBoxStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.TextBox".toHandle(),refiid,interfacePtr)
      val result = ITextBoxStatics2.ABI.makeITextBoxStatics2(interfacePtr.value)
      return result
    }

    public fun createITextBoxStatics7(): ITextBoxStatics7 {
      val refiid = Guid.REFIID(ITextBoxStatics7.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.TextBox".toHandle(),refiid,interfacePtr)
      val result = ITextBoxStatics7.ABI.makeITextBoxStatics7(interfacePtr.value)
      return result
    }

    public fun createITextBoxStatics3(): ITextBoxStatics3 {
      val refiid = Guid.REFIID(ITextBoxStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.TextBox".toHandle(),refiid,interfacePtr)
      val result = ITextBoxStatics3.ABI.makeITextBoxStatics3(interfacePtr.value)
      return result
    }

    public fun createITextBoxStatics6(): ITextBoxStatics6 {
      val refiid = Guid.REFIID(ITextBoxStatics6.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.TextBox".toHandle(),refiid,interfacePtr)
      val result = ITextBoxStatics6.ABI.makeITextBoxStatics6(interfacePtr.value)
      return result
    }

    public fun createITextBoxFactory(): ITextBoxFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.TextBox".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITextBoxFactory.ABI.makeITextBoxFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ITextBoxFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): TextBox {
      val address = segment.toRawLongValue()
      return TextBox(Pointer(address))
    }

    public override fun toNative(obj: TextBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_CanPasteClipboardContentProperty() =
        ABI.ITextBoxStatics8_Instance.get_CanPasteClipboardContentProperty()

    public fun get_CanUndoProperty() = ABI.ITextBoxStatics8_Instance.get_CanUndoProperty()

    public fun get_CanRedoProperty() = ABI.ITextBoxStatics8_Instance.get_CanRedoProperty()

    public fun get_SelectionFlyoutProperty() =
        ABI.ITextBoxStatics8_Instance.get_SelectionFlyoutProperty()

    public fun get_ProofingMenuFlyoutProperty() =
        ABI.ITextBoxStatics8_Instance.get_ProofingMenuFlyoutProperty()

    public fun get_DescriptionProperty() = ABI.ITextBoxStatics8_Instance.get_DescriptionProperty()

    public fun get_TextProperty() = ABI.ITextBoxStatics_Instance.get_TextProperty()

    public fun get_MaxLengthProperty() = ABI.ITextBoxStatics_Instance.get_MaxLengthProperty()

    public fun get_IsReadOnlyProperty() = ABI.ITextBoxStatics_Instance.get_IsReadOnlyProperty()

    public fun get_AcceptsReturnProperty() =
        ABI.ITextBoxStatics_Instance.get_AcceptsReturnProperty()

    public fun get_TextAlignmentProperty() =
        ABI.ITextBoxStatics_Instance.get_TextAlignmentProperty()

    public fun get_TextWrappingProperty() = ABI.ITextBoxStatics_Instance.get_TextWrappingProperty()

    public fun get_IsSpellCheckEnabledProperty() =
        ABI.ITextBoxStatics_Instance.get_IsSpellCheckEnabledProperty()

    public fun get_IsTextPredictionEnabledProperty() =
        ABI.ITextBoxStatics_Instance.get_IsTextPredictionEnabledProperty()

    public fun get_InputScopeProperty() = ABI.ITextBoxStatics_Instance.get_InputScopeProperty()

    public fun get_SelectionHighlightColorWhenNotFocusedProperty() =
        ABI.ITextBoxStatics5_Instance.get_SelectionHighlightColorWhenNotFocusedProperty()

    public fun get_HeaderProperty() = ABI.ITextBoxStatics2_Instance.get_HeaderProperty()

    public fun get_HeaderTemplateProperty() =
        ABI.ITextBoxStatics2_Instance.get_HeaderTemplateProperty()

    public fun get_PlaceholderTextProperty() =
        ABI.ITextBoxStatics2_Instance.get_PlaceholderTextProperty()

    public fun get_SelectionHighlightColorProperty() =
        ABI.ITextBoxStatics2_Instance.get_SelectionHighlightColorProperty()

    public fun get_PreventKeyboardDisplayOnProgrammaticFocusProperty() =
        ABI.ITextBoxStatics2_Instance.get_PreventKeyboardDisplayOnProgrammaticFocusProperty()

    public fun get_IsColorFontEnabledProperty() =
        ABI.ITextBoxStatics2_Instance.get_IsColorFontEnabledProperty()

    public fun get_HandwritingViewProperty() =
        ABI.ITextBoxStatics7_Instance.get_HandwritingViewProperty()

    public fun get_IsHandwritingViewEnabledProperty() =
        ABI.ITextBoxStatics7_Instance.get_IsHandwritingViewEnabledProperty()

    public fun get_DesiredCandidateWindowAlignmentProperty() =
        ABI.ITextBoxStatics3_Instance.get_DesiredCandidateWindowAlignmentProperty()

    public fun get_TextReadingOrderProperty() =
        ABI.ITextBoxStatics3_Instance.get_TextReadingOrderProperty()

    public fun get_HorizontalTextAlignmentProperty() =
        ABI.ITextBoxStatics6_Instance.get_HorizontalTextAlignmentProperty()

    public fun get_CharacterCasingProperty() =
        ABI.ITextBoxStatics6_Instance.get_CharacterCasingProperty()

    public fun get_PlaceholderForegroundProperty() =
        ABI.ITextBoxStatics6_Instance.get_PlaceholderForegroundProperty()
  }
}
