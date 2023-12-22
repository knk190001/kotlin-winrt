package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IRadioButtonsFactory.ABI.IID
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

@ABIMarker(RadioButtons.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.RadioButtons;{966daf80-ee85-5d90-b6b3-80bec9134673})")
@WinRTByReference(brClass = RadioButtons.ByReference::class)
public open class RadioButtons(
  ptr: JNAPointer? = NULL
) : Control(ptr), IRadioButtons.WithDefault, IWinRTObject {
  private val __1234779725_Interface: IRadioButtons.WithDefault by lazy {
    as_1234779725()
  }


  public override val __1234779725_Ptr: JNAPointer? by lazy {
    __1234779725_Interface.__1234779725_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1234779725_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1234779725(): IRadioButtons.WithDefault {
    if(pointer == NULL) {
      return(IRadioButtons.ABI.makeIRadioButtons(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRadioButtons>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRadioButtons.ABI.makeIRadioButtons(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<RadioButtons> {
    public override fun getValue() = RadioButtons(pointer.getPointer(0))

    public fun setValue(value: RadioButtons): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RadioButtons, MemoryAddress> {
    public val IRadioButtonsStatics_Instance: IRadioButtonsStatics by lazy {
      createIRadioButtonsStatics()
    }


    public val IRadioButtonsFactory_Instance: IRadioButtonsFactory by lazy {
      createIRadioButtonsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRadioButtonsStatics(): IRadioButtonsStatics {
      val refiid = Guid.REFIID(IRadioButtonsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.RadioButtons".toHandle(),refiid,interfacePtr)
      val result = IRadioButtonsStatics.ABI.makeIRadioButtonsStatics(interfacePtr.value)
      return result
    }

    public fun createIRadioButtonsFactory(): IRadioButtonsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.RadioButtons".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRadioButtonsFactory.ABI.makeIRadioButtonsFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IRadioButtonsFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): RadioButtons {
      val address = segment.toRawLongValue()
      return RadioButtons(Pointer(address))
    }

    public override fun toNative(obj: RadioButtons): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ItemsSourceProperty() =
        ABI.IRadioButtonsStatics_Instance.get_ItemsSourceProperty()

    public fun get_ItemsProperty() = ABI.IRadioButtonsStatics_Instance.get_ItemsProperty()

    public fun get_ItemTemplateProperty() =
        ABI.IRadioButtonsStatics_Instance.get_ItemTemplateProperty()

    public fun get_SelectedIndexProperty() =
        ABI.IRadioButtonsStatics_Instance.get_SelectedIndexProperty()

    public fun get_SelectedItemProperty() =
        ABI.IRadioButtonsStatics_Instance.get_SelectedItemProperty()

    public fun get_MaxColumnsProperty() = ABI.IRadioButtonsStatics_Instance.get_MaxColumnsProperty()

    public fun get_HeaderProperty() = ABI.IRadioButtonsStatics_Instance.get_HeaderProperty()

    public fun get_HeaderTemplateProperty() =
        ABI.IRadioButtonsStatics_Instance.get_HeaderTemplateProperty()
  }
}
