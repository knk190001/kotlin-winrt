package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IRichEditBoxFactory.ABI.IID
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
@Signature("rc(Microsoft.UI.Xaml.Controls.RichEditBox;{699163db-723d-5514-a8c9-2c64d99e1ea6})")
@WinRTByReference(brClass = RichEditBox.ByReference::class)
public open class RichEditBox(
  ptr: JNAPointer? = NULL
) : Control(ptr), IRichEditBox.WithDefault, IWinRTObject {
  private val __1619672386_Interface: IRichEditBox.WithDefault by lazy {
    as_1619672386()
  }


  public override val __1619672386_Ptr: JNAPointer? by lazy {
    __1619672386_Interface.__1619672386_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1619672386_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1619672386(): IRichEditBox.WithDefault {
    if(pointer == NULL) {
      return(IRichEditBox.ABI.makeIRichEditBox(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRichEditBox>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRichEditBox.ABI.makeIRichEditBox(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<RichEditBox> {
    public override fun getValue() = RichEditBox(pointer.getPointer(0))

    public fun setValue(value: RichEditBox): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RichEditBox, MemoryAddress> {
    public val IRichEditBoxStatics_Instance: IRichEditBoxStatics by lazy {
      createIRichEditBoxStatics()
    }


    public val IRichEditBoxFactory_Instance: IRichEditBoxFactory by lazy {
      createIRichEditBoxFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRichEditBoxStatics(): IRichEditBoxStatics {
      val refiid = Guid.REFIID(IRichEditBoxStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.RichEditBox".toHandle(),refiid,interfacePtr)
      val result = IRichEditBoxStatics.ABI.makeIRichEditBoxStatics(interfacePtr.value)
      return result
    }

    public fun createIRichEditBoxFactory(): IRichEditBoxFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.RichEditBox".toHandle(),refiid,factoryActivatorPtr)
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

    public fun get_HeaderProperty() = ABI.IRichEditBoxStatics_Instance.get_HeaderProperty()

    public fun get_HeaderTemplateProperty() =
        ABI.IRichEditBoxStatics_Instance.get_HeaderTemplateProperty()

    public fun get_PlaceholderTextProperty() =
        ABI.IRichEditBoxStatics_Instance.get_PlaceholderTextProperty()

    public fun get_SelectionHighlightColorProperty() =
        ABI.IRichEditBoxStatics_Instance.get_SelectionHighlightColorProperty()

    public fun get_PreventKeyboardDisplayOnProgrammaticFocusProperty() =
        ABI.IRichEditBoxStatics_Instance.get_PreventKeyboardDisplayOnProgrammaticFocusProperty()

    public fun get_IsColorFontEnabledProperty() =
        ABI.IRichEditBoxStatics_Instance.get_IsColorFontEnabledProperty()

    public fun get_SelectionHighlightColorWhenNotFocusedProperty() =
        ABI.IRichEditBoxStatics_Instance.get_SelectionHighlightColorWhenNotFocusedProperty()

    public fun get_MaxLengthProperty() = ABI.IRichEditBoxStatics_Instance.get_MaxLengthProperty()

    public fun get_HorizontalTextAlignmentProperty() =
        ABI.IRichEditBoxStatics_Instance.get_HorizontalTextAlignmentProperty()

    public fun get_CharacterCasingProperty() =
        ABI.IRichEditBoxStatics_Instance.get_CharacterCasingProperty()

    public fun get_DisabledFormattingAcceleratorsProperty() =
        ABI.IRichEditBoxStatics_Instance.get_DisabledFormattingAcceleratorsProperty()

    public fun get_SelectionFlyoutProperty() =
        ABI.IRichEditBoxStatics_Instance.get_SelectionFlyoutProperty()

    public fun get_ProofingMenuFlyoutProperty() =
        ABI.IRichEditBoxStatics_Instance.get_ProofingMenuFlyoutProperty()

    public fun get_DescriptionProperty() =
        ABI.IRichEditBoxStatics_Instance.get_DescriptionProperty()

    public fun get_DesiredCandidateWindowAlignmentProperty() =
        ABI.IRichEditBoxStatics_Instance.get_DesiredCandidateWindowAlignmentProperty()

    public fun get_TextReadingOrderProperty() =
        ABI.IRichEditBoxStatics_Instance.get_TextReadingOrderProperty()

    public fun get_ClipboardCopyFormatProperty() =
        ABI.IRichEditBoxStatics_Instance.get_ClipboardCopyFormatProperty()
  }
}
