package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IComboBoxFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.Primitives.Selector
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

@ABIMarker(ComboBox.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ComboBox;{c77da58b-4fd7-51e0-a431-f84658a83e9e})")
@WinRTByReference(brClass = ComboBox.ByReference::class)
public open class ComboBox(
  ptr: JNAPointer? = NULL
) : Selector(ptr), IComboBox.WithDefault, IComboBoxOverrides.WithDefault, IWinRTObject {
  private val __908208092_Interface: IComboBox.WithDefault by lazy {
    as_908208092()
  }


  private val __1689809309_Interface: IComboBoxOverrides.WithDefault by lazy {
    as_1689809309()
  }


  public override val __908208092_Ptr: JNAPointer? by lazy {
    __908208092_Interface.__908208092_Ptr
  }


  public override val __1689809309_Ptr: JNAPointer? by lazy {
    __1689809309_Interface.__1689809309_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__908208092_Interface, __1689809309_Interface)

  public constructor() : this(ABI.activate())

  private fun as_908208092(): IComboBox.WithDefault {
    if(pointer == NULL) {
      return(IComboBox.ABI.makeIComboBox(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IComboBox>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IComboBox.ABI.makeIComboBox(ref.value))
  }

  private fun as_1689809309(): IComboBoxOverrides.WithDefault {
    if(pointer == NULL) {
      return(IComboBoxOverrides.ABI.makeIComboBoxOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IComboBoxOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IComboBoxOverrides.ABI.makeIComboBoxOverrides(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ComboBox> {
    public override fun getValue() = ComboBox(pointer.getPointer(0))

    public fun setValue(value: ComboBox): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ComboBox, MemoryAddress> {
    public val IComboBoxStatics_Instance: IComboBoxStatics by lazy {
      createIComboBoxStatics()
    }


    public val IComboBoxFactory_Instance: IComboBoxFactory by lazy {
      createIComboBoxFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIComboBoxStatics(): IComboBoxStatics {
      val refiid = Guid.REFIID(IComboBoxStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ComboBox".toHandle(),refiid,interfacePtr)
      val result = IComboBoxStatics.ABI.makeIComboBoxStatics(interfacePtr.value)
      return result
    }

    public fun createIComboBoxFactory(): IComboBoxFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ComboBox".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IComboBoxFactory.ABI.makeIComboBoxFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IComboBoxFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ComboBox {
      val address = segment.toRawLongValue()
      return ComboBox(Pointer(address))
    }

    public override fun toNative(obj: ComboBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsEditableProperty() = ABI.IComboBoxStatics_Instance.get_IsEditableProperty()

    public fun get_IsDropDownOpenProperty() =
        ABI.IComboBoxStatics_Instance.get_IsDropDownOpenProperty()

    public fun get_MaxDropDownHeightProperty() =
        ABI.IComboBoxStatics_Instance.get_MaxDropDownHeightProperty()

    public fun get_HeaderProperty() = ABI.IComboBoxStatics_Instance.get_HeaderProperty()

    public fun get_HeaderTemplateProperty() =
        ABI.IComboBoxStatics_Instance.get_HeaderTemplateProperty()

    public fun get_PlaceholderTextProperty() =
        ABI.IComboBoxStatics_Instance.get_PlaceholderTextProperty()

    public fun get_LightDismissOverlayModeProperty() =
        ABI.IComboBoxStatics_Instance.get_LightDismissOverlayModeProperty()

    public fun get_IsTextSearchEnabledProperty() =
        ABI.IComboBoxStatics_Instance.get_IsTextSearchEnabledProperty()

    public fun get_SelectionChangedTriggerProperty() =
        ABI.IComboBoxStatics_Instance.get_SelectionChangedTriggerProperty()

    public fun get_PlaceholderForegroundProperty() =
        ABI.IComboBoxStatics_Instance.get_PlaceholderForegroundProperty()

    public fun get_TextProperty() = ABI.IComboBoxStatics_Instance.get_TextProperty()

    public fun get_TextBoxStyleProperty() = ABI.IComboBoxStatics_Instance.get_TextBoxStyleProperty()

    public fun get_DescriptionProperty() = ABI.IComboBoxStatics_Instance.get_DescriptionProperty()
  }
}
