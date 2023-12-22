package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.ITextBoxFactory.ABI.IID
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
@Signature("rc(Microsoft.UI.Xaml.Controls.TextBox;{873af7c2-ab89-5d76-8dbe-3d6325669df5})")
@WinRTByReference(brClass = TextBox.ByReference::class)
public open class TextBox(
  ptr: JNAPointer? = NULL
) : Control(ptr), ITextBox.WithDefault, IWinRTObject {
  private val __927893943_Interface: ITextBox.WithDefault by lazy {
    as_927893943()
  }


  public override val __927893943_Ptr: JNAPointer? by lazy {
    __927893943_Interface.__927893943_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__927893943_Interface)

  public constructor() : this(ABI.activate())

  private fun as_927893943(): ITextBox.WithDefault {
    if(pointer == NULL) {
      return(ITextBox.ABI.makeITextBox(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextBox>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextBox.ABI.makeITextBox(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<TextBox> {
    public override fun getValue() = TextBox(pointer.getPointer(0))

    public fun setValue(value: TextBox): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TextBox, MemoryAddress> {
    public val ITextBoxStatics_Instance: ITextBoxStatics by lazy {
      createITextBoxStatics()
    }


    public val ITextBoxFactory_Instance: ITextBoxFactory by lazy {
      createITextBoxFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITextBoxStatics(): ITextBoxStatics {
      val refiid = Guid.REFIID(ITextBoxStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.TextBox".toHandle(),refiid,interfacePtr)
      val result = ITextBoxStatics.ABI.makeITextBoxStatics(interfacePtr.value)
      return result
    }

    public fun createITextBoxFactory(): ITextBoxFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.TextBox".toHandle(),refiid,factoryActivatorPtr)
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

    public fun get_HeaderProperty() = ABI.ITextBoxStatics_Instance.get_HeaderProperty()

    public fun get_HeaderTemplateProperty() =
        ABI.ITextBoxStatics_Instance.get_HeaderTemplateProperty()

    public fun get_PlaceholderTextProperty() =
        ABI.ITextBoxStatics_Instance.get_PlaceholderTextProperty()

    public fun get_SelectionHighlightColorProperty() =
        ABI.ITextBoxStatics_Instance.get_SelectionHighlightColorProperty()

    public fun get_PreventKeyboardDisplayOnProgrammaticFocusProperty() =
        ABI.ITextBoxStatics_Instance.get_PreventKeyboardDisplayOnProgrammaticFocusProperty()

    public fun get_IsColorFontEnabledProperty() =
        ABI.ITextBoxStatics_Instance.get_IsColorFontEnabledProperty()

    public fun get_SelectionHighlightColorWhenNotFocusedProperty() =
        ABI.ITextBoxStatics_Instance.get_SelectionHighlightColorWhenNotFocusedProperty()

    public fun get_HorizontalTextAlignmentProperty() =
        ABI.ITextBoxStatics_Instance.get_HorizontalTextAlignmentProperty()

    public fun get_CharacterCasingProperty() =
        ABI.ITextBoxStatics_Instance.get_CharacterCasingProperty()

    public fun get_PlaceholderForegroundProperty() =
        ABI.ITextBoxStatics_Instance.get_PlaceholderForegroundProperty()

    public fun get_CanPasteClipboardContentProperty() =
        ABI.ITextBoxStatics_Instance.get_CanPasteClipboardContentProperty()

    public fun get_CanUndoProperty() = ABI.ITextBoxStatics_Instance.get_CanUndoProperty()

    public fun get_CanRedoProperty() = ABI.ITextBoxStatics_Instance.get_CanRedoProperty()

    public fun get_SelectionFlyoutProperty() =
        ABI.ITextBoxStatics_Instance.get_SelectionFlyoutProperty()

    public fun get_ProofingMenuFlyoutProperty() =
        ABI.ITextBoxStatics_Instance.get_ProofingMenuFlyoutProperty()

    public fun get_DescriptionProperty() = ABI.ITextBoxStatics_Instance.get_DescriptionProperty()

    public fun get_DesiredCandidateWindowAlignmentProperty() =
        ABI.ITextBoxStatics_Instance.get_DesiredCandidateWindowAlignmentProperty()

    public fun get_TextReadingOrderProperty() =
        ABI.ITextBoxStatics_Instance.get_TextReadingOrderProperty()
  }
}
