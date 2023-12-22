package Windows.Devices.Printers

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

@ABIMarker(Print3DDevice.ABI::class)
@Signature("rc(Windows.Devices.Printers.Print3DDevice;{041c3d19-9713-42a2-9813-7dc3337428d3})")
@WinRTByReference(brClass = Print3DDevice.ByReference::class)
public class Print3DDevice(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrint3DDevice.WithDefault, IWinRTObject {
  private val __580958528_Interface: IPrint3DDevice.WithDefault by lazy {
    as_580958528()
  }


  public override val __580958528_Ptr: JNAPointer? by lazy {
    __580958528_Interface.__580958528_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__580958528_Interface)

  private fun as_580958528(): IPrint3DDevice.WithDefault {
    if(pointer == NULL) {
      return(IPrint3DDevice.ABI.makeIPrint3DDevice(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrint3DDevice>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrint3DDevice.ABI.makeIPrint3DDevice(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Print3DDevice>
      {
    public override fun getValue() = Print3DDevice(pointer.getPointer(0))

    public fun setValue(value: Print3DDevice): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Print3DDevice, MemoryAddress> {
    public val IPrint3DDeviceStatics_Instance: IPrint3DDeviceStatics by lazy {
      createIPrint3DDeviceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPrint3DDeviceStatics(): IPrint3DDeviceStatics {
      val refiid = Guid.REFIID(IPrint3DDeviceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Printers.Print3DDevice".toHandle(),refiid,interfacePtr)
      val result = IPrint3DDeviceStatics.ABI.makeIPrint3DDeviceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Print3DDevice {
      val address = segment.toRawLongValue()
      return Print3DDevice(Pointer(address))
    }

    public override fun toNative(obj: Print3DDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FromIdAsync(deviceId: String) =
        ABI.IPrint3DDeviceStatics_Instance.FromIdAsync(deviceId)

    public fun GetDeviceSelector() = ABI.IPrint3DDeviceStatics_Instance.GetDeviceSelector()
  }
}
