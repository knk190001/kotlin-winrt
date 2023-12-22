package Windows.Devices.Bluetooth

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(BluetoothLEConnectionPhy.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.BluetoothLEConnectionPhy;{781e5e48-621e-5a7e-8be6-1b9561ff63c9})")
@WinRTByReference(brClass = BluetoothLEConnectionPhy.ByReference::class)
public class BluetoothLEConnectionPhy(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBluetoothLEConnectionPhy.WithDefault, IWinRTObject {
  private val __587452979_Interface: IBluetoothLEConnectionPhy.WithDefault by lazy {
    as_587452979()
  }


  public override val __587452979_Ptr: JNAPointer? by lazy {
    __587452979_Interface.__587452979_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__587452979_Interface)

  private fun as_587452979(): IBluetoothLEConnectionPhy.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothLEConnectionPhy.ABI.makeIBluetoothLEConnectionPhy(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothLEConnectionPhy>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothLEConnectionPhy.ABI.makeIBluetoothLEConnectionPhy(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BluetoothLEConnectionPhy> {
    public override fun getValue() = BluetoothLEConnectionPhy(pointer.getPointer(0))

    public fun setValue(value: BluetoothLEConnectionPhy): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BluetoothLEConnectionPhy, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BluetoothLEConnectionPhy {
      val address = segment.toRawLongValue()
      return BluetoothLEConnectionPhy(Pointer(address))
    }

    public override fun toNative(obj: BluetoothLEConnectionPhy): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
