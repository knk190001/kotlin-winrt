package Windows.Networking.Proximity

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

@ABIMarker(ProximityDevice.ABI::class)
@Signature("rc(Windows.Networking.Proximity.ProximityDevice;{efa8a552-f6e1-4329-a0fc-ab6b0fd28262})")
@WinRTByReference(brClass = ProximityDevice.ByReference::class)
public class ProximityDevice(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IProximityDevice.WithDefault, IWinRTObject {
  private val __186312924_Interface: IProximityDevice.WithDefault by lazy {
    as_186312924()
  }


  public override val __186312924_Ptr: JNAPointer? by lazy {
    __186312924_Interface.__186312924_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__186312924_Interface)

  private fun as_186312924(): IProximityDevice.WithDefault {
    if(pointer == NULL) {
      return(IProximityDevice.ABI.makeIProximityDevice(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProximityDevice>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProximityDevice.ABI.makeIProximityDevice(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProximityDevice> {
    public override fun getValue() = ProximityDevice(pointer.getPointer(0))

    public fun setValue(value: ProximityDevice): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProximityDevice, MemoryAddress> {
    public val IProximityDeviceStatics_Instance: IProximityDeviceStatics by lazy {
      createIProximityDeviceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIProximityDeviceStatics(): IProximityDeviceStatics {
      val refiid = Guid.REFIID(IProximityDeviceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.Proximity.ProximityDevice".toHandle(),refiid,interfacePtr)
      val result = IProximityDeviceStatics.ABI.makeIProximityDeviceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ProximityDevice {
      val address = segment.toRawLongValue()
      return ProximityDevice(Pointer(address))
    }

    public override fun toNative(obj: ProximityDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDeviceSelector() = ABI.IProximityDeviceStatics_Instance.GetDeviceSelector()

    public fun GetDefault() = ABI.IProximityDeviceStatics_Instance.GetDefault()

    public fun FromId(deviceId: String) = ABI.IProximityDeviceStatics_Instance.FromId(deviceId)
  }
}
