package Microsoft.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(PasswordBox.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.PasswordBox;{6d3ccff7-aaee-5adc-8298-33300fa119da})")
@WinRTByReference(brClass = PasswordBox.ByReference::class)
public class PasswordBox(
  ptr: JNAPointer? = NULL
) : Control(ptr), IPasswordBox.WithDefault, IWinRTObject {
  private val __158785271_Interface: IPasswordBox.WithDefault by lazy {
    as_158785271()
  }


  public override val __158785271_Ptr: JNAPointer? by lazy {
    __158785271_Interface.__158785271_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__158785271_Interface)

  public constructor() : this(ABI.activate())

  private fun as_158785271(): IPasswordBox.WithDefault {
    if(pointer == NULL) {
      return(IPasswordBox.ABI.makeIPasswordBox(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPasswordBox>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPasswordBox.ABI.makeIPasswordBox(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PasswordBox> {
    public override fun getValue() = PasswordBox(pointer.getPointer(0))

    public fun setValue(value: PasswordBox): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PasswordBox, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IPasswordBoxStatics_Instance: IPasswordBoxStatics by lazy {
      createIPasswordBoxStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.PasswordBox".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIPasswordBoxStatics(): IPasswordBoxStatics {
      val refiid = Guid.REFIID(IPasswordBoxStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.PasswordBox".toHandle(),refiid,interfacePtr)
      val result = IPasswordBoxStatics.ABI.makeIPasswordBoxStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PasswordBox {
      val address = segment.toRawLongValue()
      return PasswordBox(Pointer(address))
    }

    public override fun toNative(obj: PasswordBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_PasswordProperty() = ABI.IPasswordBoxStatics_Instance.get_PasswordProperty()

    public fun get_PasswordCharProperty() =
        ABI.IPasswordBoxStatics_Instance.get_PasswordCharProperty()

    public fun get_IsPasswordRevealButtonEnabledProperty() =
        ABI.IPasswordBoxStatics_Instance.get_IsPasswordRevealButtonEnabledProperty()

    public fun get_MaxLengthProperty() = ABI.IPasswordBoxStatics_Instance.get_MaxLengthProperty()

    public fun get_HeaderProperty() = ABI.IPasswordBoxStatics_Instance.get_HeaderProperty()

    public fun get_HeaderTemplateProperty() =
        ABI.IPasswordBoxStatics_Instance.get_HeaderTemplateProperty()

    public fun get_PlaceholderTextProperty() =
        ABI.IPasswordBoxStatics_Instance.get_PlaceholderTextProperty()

    public fun get_SelectionHighlightColorProperty() =
        ABI.IPasswordBoxStatics_Instance.get_SelectionHighlightColorProperty()

    public fun get_PreventKeyboardDisplayOnProgrammaticFocusProperty() =
        ABI.IPasswordBoxStatics_Instance.get_PreventKeyboardDisplayOnProgrammaticFocusProperty()

    public fun get_PasswordRevealModeProperty() =
        ABI.IPasswordBoxStatics_Instance.get_PasswordRevealModeProperty()

    public fun get_TextReadingOrderProperty() =
        ABI.IPasswordBoxStatics_Instance.get_TextReadingOrderProperty()

    public fun get_InputScopeProperty() = ABI.IPasswordBoxStatics_Instance.get_InputScopeProperty()

    public fun get_CanPasteClipboardContentProperty() =
        ABI.IPasswordBoxStatics_Instance.get_CanPasteClipboardContentProperty()

    public fun get_SelectionFlyoutProperty() =
        ABI.IPasswordBoxStatics_Instance.get_SelectionFlyoutProperty()

    public fun get_DescriptionProperty() =
        ABI.IPasswordBoxStatics_Instance.get_DescriptionProperty()
  }
}
