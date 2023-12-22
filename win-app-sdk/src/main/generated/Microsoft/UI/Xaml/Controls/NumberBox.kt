package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.INumberBoxFactory.ABI.IID
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

@ABIMarker(NumberBox.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.NumberBox;{c18eb0e9-29fb-525d-abbc-d6b2110f542e})")
@WinRTByReference(brClass = NumberBox.ByReference::class)
public open class NumberBox(
  ptr: JNAPointer? = NULL
) : Control(ptr), INumberBox.WithDefault, IWinRTObject {
  private val __1067269083_Interface: INumberBox.WithDefault by lazy {
    as_1067269083()
  }


  public override val __1067269083_Ptr: JNAPointer? by lazy {
    __1067269083_Interface.__1067269083_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1067269083_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1067269083(): INumberBox.WithDefault {
    if(pointer == NULL) {
      return(INumberBox.ABI.makeINumberBox(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INumberBox>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INumberBox.ABI.makeINumberBox(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<NumberBox> {
    public override fun getValue() = NumberBox(pointer.getPointer(0))

    public fun setValue(value: NumberBox): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NumberBox, MemoryAddress> {
    public val INumberBoxStatics_Instance: INumberBoxStatics by lazy {
      createINumberBoxStatics()
    }


    public val INumberBoxFactory_Instance: INumberBoxFactory by lazy {
      createINumberBoxFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createINumberBoxStatics(): INumberBoxStatics {
      val refiid = Guid.REFIID(INumberBoxStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.NumberBox".toHandle(),refiid,interfacePtr)
      val result = INumberBoxStatics.ABI.makeINumberBoxStatics(interfacePtr.value)
      return result
    }

    public fun createINumberBoxFactory(): INumberBoxFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.NumberBox".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(INumberBoxFactory.ABI.makeINumberBoxFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = INumberBoxFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): NumberBox {
      val address = segment.toRawLongValue()
      return NumberBox(Pointer(address))
    }

    public override fun toNative(obj: NumberBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_MinimumProperty() = ABI.INumberBoxStatics_Instance.get_MinimumProperty()

    public fun get_MaximumProperty() = ABI.INumberBoxStatics_Instance.get_MaximumProperty()

    public fun get_ValueProperty() = ABI.INumberBoxStatics_Instance.get_ValueProperty()

    public fun get_SmallChangeProperty() = ABI.INumberBoxStatics_Instance.get_SmallChangeProperty()

    public fun get_LargeChangeProperty() = ABI.INumberBoxStatics_Instance.get_LargeChangeProperty()

    public fun get_TextProperty() = ABI.INumberBoxStatics_Instance.get_TextProperty()

    public fun get_HeaderProperty() = ABI.INumberBoxStatics_Instance.get_HeaderProperty()

    public fun get_HeaderTemplateProperty() =
        ABI.INumberBoxStatics_Instance.get_HeaderTemplateProperty()

    public fun get_PlaceholderTextProperty() =
        ABI.INumberBoxStatics_Instance.get_PlaceholderTextProperty()

    public fun get_SelectionFlyoutProperty() =
        ABI.INumberBoxStatics_Instance.get_SelectionFlyoutProperty()

    public fun get_SelectionHighlightColorProperty() =
        ABI.INumberBoxStatics_Instance.get_SelectionHighlightColorProperty()

    public fun get_TextReadingOrderProperty() =
        ABI.INumberBoxStatics_Instance.get_TextReadingOrderProperty()

    public fun get_PreventKeyboardDisplayOnProgrammaticFocusProperty() =
        ABI.INumberBoxStatics_Instance.get_PreventKeyboardDisplayOnProgrammaticFocusProperty()

    public fun get_DescriptionProperty() = ABI.INumberBoxStatics_Instance.get_DescriptionProperty()

    public fun get_ValidationModeProperty() =
        ABI.INumberBoxStatics_Instance.get_ValidationModeProperty()

    public fun get_SpinButtonPlacementModeProperty() =
        ABI.INumberBoxStatics_Instance.get_SpinButtonPlacementModeProperty()

    public fun get_IsWrapEnabledProperty() =
        ABI.INumberBoxStatics_Instance.get_IsWrapEnabledProperty()

    public fun get_AcceptsExpressionProperty() =
        ABI.INumberBoxStatics_Instance.get_AcceptsExpressionProperty()

    public fun get_NumberFormatterProperty() =
        ABI.INumberBoxStatics_Instance.get_NumberFormatterProperty()
  }
}
