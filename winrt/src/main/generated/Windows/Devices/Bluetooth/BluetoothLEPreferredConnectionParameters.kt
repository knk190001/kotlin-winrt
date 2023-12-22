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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(BluetoothLEPreferredConnectionParameters.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.BluetoothLEPreferredConnectionParameters;{f2f44344-7372-5f7b-9b34-29c944f5a715})")
@WinRTByReference(brClass = BluetoothLEPreferredConnectionParameters.ByReference::class)
public class BluetoothLEPreferredConnectionParameters(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBluetoothLEPreferredConnectionParameters.WithDefault, IWinRTObject {
  private val __2072617465_Interface: IBluetoothLEPreferredConnectionParameters.WithDefault by
      lazy {
    as_2072617465()
  }


  public override val __2072617465_Ptr: JNAPointer? by lazy {
    __2072617465_Interface.__2072617465_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2072617465_Interface)

  private fun as_2072617465(): IBluetoothLEPreferredConnectionParameters.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothLEPreferredConnectionParameters.ABI.makeIBluetoothLEPreferredConnectionParameters(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothLEPreferredConnectionParameters>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothLEPreferredConnectionParameters.ABI.makeIBluetoothLEPreferredConnectionParameters(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BluetoothLEPreferredConnectionParameters> {
    public override fun getValue() = BluetoothLEPreferredConnectionParameters(pointer.getPointer(0))

    public fun setValue(value: BluetoothLEPreferredConnectionParameters): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BluetoothLEPreferredConnectionParameters, MemoryAddress> {
    public val IBluetoothLEPreferredConnectionParametersStatics_Instance:
        IBluetoothLEPreferredConnectionParametersStatics by lazy {
      createIBluetoothLEPreferredConnectionParametersStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBluetoothLEPreferredConnectionParametersStatics():
        IBluetoothLEPreferredConnectionParametersStatics {
      val refiid = Guid.REFIID(IBluetoothLEPreferredConnectionParametersStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.BluetoothLEPreferredConnectionParameters".toHandle(),refiid,interfacePtr)
      val result =
          IBluetoothLEPreferredConnectionParametersStatics.ABI.makeIBluetoothLEPreferredConnectionParametersStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress):
        BluetoothLEPreferredConnectionParameters {
      val address = segment.toRawLongValue()
      return BluetoothLEPreferredConnectionParameters(Pointer(address))
    }

    public override fun toNative(obj: BluetoothLEPreferredConnectionParameters): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Balanced() =
        ABI.IBluetoothLEPreferredConnectionParametersStatics_Instance.get_Balanced()

    public fun get_ThroughputOptimized() =
        ABI.IBluetoothLEPreferredConnectionParametersStatics_Instance.get_ThroughputOptimized()

    public fun get_PowerOptimized() =
        ABI.IBluetoothLEPreferredConnectionParametersStatics_Instance.get_PowerOptimized()
  }
}
