package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.ITimePickerFactory.ABI.IID
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
@Signature("rc(Windows.UI.Xaml.Controls.TimePicker;{e39099f2-3aff-4792-909e-2d9941ec0357})")
@WinRTByReference(brClass = TimePicker.ByReference::class)
public open class TimePicker(
  ptr: JNAPointer? = NULL
) : Control(ptr), ITimePicker.WithDefault, ITimePicker2.WithDefault, ITimePicker3.WithDefault,
    IWinRTObject {
  private val __825810217_Interface: ITimePicker.WithDefault by lazy {
    as_825810217()
  }


  private val __169687099_Interface: ITimePicker2.WithDefault by lazy {
    as_169687099()
  }


  private val __169687100_Interface: ITimePicker3.WithDefault by lazy {
    as_169687100()
  }


  public override val __825810217_Ptr: JNAPointer? by lazy {
    __825810217_Interface.__825810217_Ptr
  }


  public override val __169687099_Ptr: JNAPointer? by lazy {
    __169687099_Interface.__169687099_Ptr
  }


  public override val __169687100_Ptr: JNAPointer? by lazy {
    __169687100_Interface.__169687100_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__825810217_Interface, __169687099_Interface, __169687100_Interface)

  public constructor() : this(ABI.activate())

  private fun as_825810217(): ITimePicker.WithDefault {
    if(pointer == NULL) {
      return(ITimePicker.ABI.makeITimePicker(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITimePicker>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITimePicker.ABI.makeITimePicker(ref.value))
  }

  private fun as_169687099(): ITimePicker2.WithDefault {
    if(pointer == NULL) {
      return(ITimePicker2.ABI.makeITimePicker2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITimePicker2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITimePicker2.ABI.makeITimePicker2(ref.value))
  }

  private fun as_169687100(): ITimePicker3.WithDefault {
    if(pointer == NULL) {
      return(ITimePicker3.ABI.makeITimePicker3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITimePicker3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITimePicker3.ABI.makeITimePicker3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<TimePicker> {
    public override fun getValue() = TimePicker(pointer.getPointer(0))

    public fun setValue(value: TimePicker): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TimePicker, MemoryAddress> {
    public val ITimePickerStatics3_Instance: ITimePickerStatics3 by lazy {
      createITimePickerStatics3()
    }


    public val ITimePickerStatics2_Instance: ITimePickerStatics2 by lazy {
      createITimePickerStatics2()
    }


    public val ITimePickerStatics_Instance: ITimePickerStatics by lazy {
      createITimePickerStatics()
    }


    public val ITimePickerFactory_Instance: ITimePickerFactory by lazy {
      createITimePickerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITimePickerStatics3(): ITimePickerStatics3 {
      val refiid = Guid.REFIID(ITimePickerStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.TimePicker".toHandle(),refiid,interfacePtr)
      val result = ITimePickerStatics3.ABI.makeITimePickerStatics3(interfacePtr.value)
      return result
    }

    public fun createITimePickerStatics2(): ITimePickerStatics2 {
      val refiid = Guid.REFIID(ITimePickerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.TimePicker".toHandle(),refiid,interfacePtr)
      val result = ITimePickerStatics2.ABI.makeITimePickerStatics2(interfacePtr.value)
      return result
    }

    public fun createITimePickerStatics(): ITimePickerStatics {
      val refiid = Guid.REFIID(ITimePickerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.TimePicker".toHandle(),refiid,interfacePtr)
      val result = ITimePickerStatics.ABI.makeITimePickerStatics(interfacePtr.value)
      return result
    }

    public fun createITimePickerFactory(): ITimePickerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.TimePicker".toHandle(),refiid,factoryActivatorPtr)
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
    public fun get_SelectedTimeProperty() =
        ABI.ITimePickerStatics3_Instance.get_SelectedTimeProperty()

    public fun get_LightDismissOverlayModeProperty() =
        ABI.ITimePickerStatics2_Instance.get_LightDismissOverlayModeProperty()

    public fun get_HeaderProperty() = ABI.ITimePickerStatics_Instance.get_HeaderProperty()

    public fun get_HeaderTemplateProperty() =
        ABI.ITimePickerStatics_Instance.get_HeaderTemplateProperty()

    public fun get_ClockIdentifierProperty() =
        ABI.ITimePickerStatics_Instance.get_ClockIdentifierProperty()

    public fun get_MinuteIncrementProperty() =
        ABI.ITimePickerStatics_Instance.get_MinuteIncrementProperty()

    public fun get_TimeProperty() = ABI.ITimePickerStatics_Instance.get_TimeProperty()
  }
}
