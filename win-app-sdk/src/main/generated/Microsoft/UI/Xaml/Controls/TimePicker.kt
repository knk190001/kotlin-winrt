package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.ITimePickerFactory.ABI.IID
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

@ABIMarker(TimePicker.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.TimePicker;{ed4baa33-c240-5934-9229-82d37b26f846})")
@WinRTByReference(brClass = TimePicker.ByReference::class)
public open class TimePicker(
  ptr: JNAPointer? = NULL
) : Control(ptr), ITimePicker.WithDefault, IWinRTObject {
  private val __184894782_Interface: ITimePicker.WithDefault by lazy {
    as_184894782()
  }


  public override val __184894782_Ptr: JNAPointer? by lazy {
    __184894782_Interface.__184894782_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__184894782_Interface)

  public constructor() : this(ABI.activate())

  private fun as_184894782(): ITimePicker.WithDefault {
    if(pointer == NULL) {
      return(ITimePicker.ABI.makeITimePicker(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITimePicker>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITimePicker.ABI.makeITimePicker(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<TimePicker> {
    public override fun getValue() = TimePicker(pointer.getPointer(0))

    public fun setValue(value: TimePicker): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TimePicker, MemoryAddress> {
    public val ITimePickerStatics_Instance: ITimePickerStatics by lazy {
      createITimePickerStatics()
    }


    public val ITimePickerFactory_Instance: ITimePickerFactory by lazy {
      createITimePickerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITimePickerStatics(): ITimePickerStatics {
      val refiid = Guid.REFIID(ITimePickerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.TimePicker".toHandle(),refiid,interfacePtr)
      val result = ITimePickerStatics.ABI.makeITimePickerStatics(interfacePtr.value)
      return result
    }

    public fun createITimePickerFactory(): ITimePickerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.TimePicker".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITimePickerFactory.ABI.makeITimePickerFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ITimePickerFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): TimePicker {
      val address = segment.toRawLongValue()
      return TimePicker(Pointer(address))
    }

    public override fun toNative(obj: TimePicker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_HeaderProperty() = ABI.ITimePickerStatics_Instance.get_HeaderProperty()

    public fun get_HeaderTemplateProperty() =
        ABI.ITimePickerStatics_Instance.get_HeaderTemplateProperty()

    public fun get_ClockIdentifierProperty() =
        ABI.ITimePickerStatics_Instance.get_ClockIdentifierProperty()

    public fun get_MinuteIncrementProperty() =
        ABI.ITimePickerStatics_Instance.get_MinuteIncrementProperty()

    public fun get_TimeProperty() = ABI.ITimePickerStatics_Instance.get_TimeProperty()

    public fun get_LightDismissOverlayModeProperty() =
        ABI.ITimePickerStatics_Instance.get_LightDismissOverlayModeProperty()

    public fun get_SelectedTimeProperty() =
        ABI.ITimePickerStatics_Instance.get_SelectedTimeProperty()
  }
}
