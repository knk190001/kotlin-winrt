package Windows.Devices.Bluetooth

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

@ABIMarker(BluetoothDeviceId.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.BluetoothDeviceId;{c17949af-57c1-4642-bcce-e6c06b20ae76})")
@WinRTByReference(brClass = BluetoothDeviceId.ByReference::class)
public class BluetoothDeviceId(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBluetoothDeviceId.WithDefault, IWinRTObject {
  private val __1431287576_Interface: IBluetoothDeviceId.WithDefault by lazy {
    as_1431287576()
  }


  public override val __1431287576_Ptr: JNAPointer? by lazy {
    __1431287576_Interface.__1431287576_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1431287576_Interface)

  private fun as_1431287576(): IBluetoothDeviceId.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothDeviceId.ABI.makeIBluetoothDeviceId(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothDeviceId>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothDeviceId.ABI.makeIBluetoothDeviceId(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BluetoothDeviceId> {
    public override fun getValue() = BluetoothDeviceId(pointer.getPointer(0))

    public fun setValue(value: BluetoothDeviceId): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BluetoothDeviceId, MemoryAddress> {
    public val IBluetoothDeviceIdStatics_Instance: IBluetoothDeviceIdStatics by lazy {
      createIBluetoothDeviceIdStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBluetoothDeviceIdStatics(): IBluetoothDeviceIdStatics {
      val refiid = Guid.REFIID(IBluetoothDeviceIdStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.BluetoothDeviceId".toHandle(),refiid,interfacePtr)
      val result = IBluetoothDeviceIdStatics.ABI.makeIBluetoothDeviceIdStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): BluetoothDeviceId {
      val address = segment.toRawLongValue()
      return BluetoothDeviceId(Pointer(address))
    }

    public override fun toNative(obj: BluetoothDeviceId): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FromId(deviceId: String) = ABI.IBluetoothDeviceIdStatics_Instance.FromId(deviceId)
  }
}
