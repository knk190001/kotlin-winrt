package Windows.Devices.Sensors

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

@ABIMarker(HingeAngleSensor.ABI::class)
@Signature("rc(Windows.Devices.Sensors.HingeAngleSensor;{e9d3be02-bfdf-437f-8c29-88c77393d309})")
@WinRTByReference(brClass = HingeAngleSensor.ByReference::class)
public class HingeAngleSensor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHingeAngleSensor.WithDefault, IWinRTObject {
  private val __1547934162_Interface: IHingeAngleSensor.WithDefault by lazy {
    as_1547934162()
  }


  public override val __1547934162_Ptr: JNAPointer? by lazy {
    __1547934162_Interface.__1547934162_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1547934162_Interface)

  private fun as_1547934162(): IHingeAngleSensor.WithDefault {
    if(pointer == NULL) {
      return(IHingeAngleSensor.ABI.makeIHingeAngleSensor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHingeAngleSensor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHingeAngleSensor.ABI.makeIHingeAngleSensor(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HingeAngleSensor> {
    public override fun getValue() = HingeAngleSensor(pointer.getPointer(0))

    public fun setValue(value: HingeAngleSensor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HingeAngleSensor, MemoryAddress> {
    public val IHingeAngleSensorStatics_Instance: IHingeAngleSensorStatics by lazy {
      createIHingeAngleSensorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHingeAngleSensorStatics(): IHingeAngleSensorStatics {
      val refiid = Guid.REFIID(IHingeAngleSensorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sensors.HingeAngleSensor".toHandle(),refiid,interfacePtr)
      val result = IHingeAngleSensorStatics.ABI.makeIHingeAngleSensorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): HingeAngleSensor {
      val address = segment.toRawLongValue()
      return HingeAngleSensor(Pointer(address))
    }

    public override fun toNative(obj: HingeAngleSensor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDeviceSelector() = ABI.IHingeAngleSensorStatics_Instance.GetDeviceSelector()

    public fun GetDefaultAsync() = ABI.IHingeAngleSensorStatics_Instance.GetDefaultAsync()

    public fun GetRelatedToAdjacentPanelsAsync(firstPanelId: String, secondPanelId: String) =
        ABI.IHingeAngleSensorStatics_Instance.GetRelatedToAdjacentPanelsAsync(firstPanelId,
        secondPanelId)

    public fun FromIdAsync(deviceId: String) =
        ABI.IHingeAngleSensorStatics_Instance.FromIdAsync(deviceId)
  }
}
