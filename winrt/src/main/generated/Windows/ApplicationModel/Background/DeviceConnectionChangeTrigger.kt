package Windows.ApplicationModel.Background

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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(DeviceConnectionChangeTrigger.ABI::class)
@Signature("rc(Windows.ApplicationModel.Background.DeviceConnectionChangeTrigger;{90875e64-3cdd-4efb-ab1c-5b3b6a60ce34})")
@WinRTByReference(brClass = DeviceConnectionChangeTrigger.ByReference::class)
public class DeviceConnectionChangeTrigger(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDeviceConnectionChangeTrigger.WithDefault, IBackgroundTrigger.WithDefault,
    IWinRTObject {
  private val __1486454237_Interface: IDeviceConnectionChangeTrigger.WithDefault by lazy {
    as_1486454237()
  }


  private val __54213927_Interface: IBackgroundTrigger.WithDefault by lazy {
    as_54213927()
  }


  public override val __1486454237_Ptr: JNAPointer? by lazy {
    __1486454237_Interface.__1486454237_Ptr
  }


  public override val __54213927_Ptr: JNAPointer? by lazy {
    __54213927_Interface.__54213927_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1486454237_Interface, __54213927_Interface)

  private fun as_1486454237(): IDeviceConnectionChangeTrigger.WithDefault {
    if(pointer == NULL) {
      return(IDeviceConnectionChangeTrigger.ABI.makeIDeviceConnectionChangeTrigger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDeviceConnectionChangeTrigger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDeviceConnectionChangeTrigger.ABI.makeIDeviceConnectionChangeTrigger(ref.value))
  }

  private fun as_54213927(): IBackgroundTrigger.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundTrigger.ABI.makeIBackgroundTrigger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundTrigger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundTrigger.ABI.makeIBackgroundTrigger(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DeviceConnectionChangeTrigger> {
    public override fun getValue() = DeviceConnectionChangeTrigger(pointer.getPointer(0))

    public fun setValue(value: DeviceConnectionChangeTrigger): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DeviceConnectionChangeTrigger, MemoryAddress> {
    public val IDeviceConnectionChangeTriggerStatics_Instance: IDeviceConnectionChangeTriggerStatics
        by lazy {
      createIDeviceConnectionChangeTriggerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDeviceConnectionChangeTriggerStatics():
        IDeviceConnectionChangeTriggerStatics {
      val refiid = Guid.REFIID(IDeviceConnectionChangeTriggerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Background.DeviceConnectionChangeTrigger".toHandle(),refiid,interfacePtr)
      val result =
          IDeviceConnectionChangeTriggerStatics.ABI.makeIDeviceConnectionChangeTriggerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DeviceConnectionChangeTrigger {
      val address = segment.toRawLongValue()
      return DeviceConnectionChangeTrigger(Pointer(address))
    }

    public override fun toNative(obj: DeviceConnectionChangeTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FromIdAsync(deviceId: String) =
        ABI.IDeviceConnectionChangeTriggerStatics_Instance.FromIdAsync(deviceId)
  }
}
