package Windows.Devices.Bluetooth

import Windows.Foundation.IClosable
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

@ABIMarker(BluetoothLEPreferredConnectionParametersRequest.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.BluetoothLEPreferredConnectionParametersRequest;{8a375276-a528-5266-b661-cce6a5ff9739})")
@WinRTByReference(brClass = BluetoothLEPreferredConnectionParametersRequest.ByReference::class)
public class BluetoothLEPreferredConnectionParametersRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBluetoothLEPreferredConnectionParametersRequest.WithDefault,
    IClosable.WithDefault, IWinRTObject {
  private val __1947954774_Interface: IBluetoothLEPreferredConnectionParametersRequest.WithDefault
      by lazy {
    as_1947954774()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1947954774_Ptr: JNAPointer? by lazy {
    __1947954774_Interface.__1947954774_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1947954774_Interface, __1260617006_Interface)

  private fun as_1947954774(): IBluetoothLEPreferredConnectionParametersRequest.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothLEPreferredConnectionParametersRequest.ABI.makeIBluetoothLEPreferredConnectionParametersRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothLEPreferredConnectionParametersRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothLEPreferredConnectionParametersRequest.ABI.makeIBluetoothLEPreferredConnectionParametersRequest(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BluetoothLEPreferredConnectionParametersRequest> {
    public override fun getValue() =
        BluetoothLEPreferredConnectionParametersRequest(pointer.getPointer(0))

    public fun setValue(value: BluetoothLEPreferredConnectionParametersRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BluetoothLEPreferredConnectionParametersRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        BluetoothLEPreferredConnectionParametersRequest {
      val address = segment.toRawLongValue()
      return BluetoothLEPreferredConnectionParametersRequest(Pointer(address))
    }

    public override fun toNative(obj: BluetoothLEPreferredConnectionParametersRequest):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
