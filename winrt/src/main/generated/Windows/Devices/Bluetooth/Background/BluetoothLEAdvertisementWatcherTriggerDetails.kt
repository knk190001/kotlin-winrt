package Windows.Devices.Bluetooth.Background

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

@ABIMarker(BluetoothLEAdvertisementWatcherTriggerDetails.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.Background.BluetoothLEAdvertisementWatcherTriggerDetails;{a7db5ad7-2257-4e69-9784-fee645c1dce0})")
@WinRTByReference(brClass = BluetoothLEAdvertisementWatcherTriggerDetails.ByReference::class)
public class BluetoothLEAdvertisementWatcherTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBluetoothLEAdvertisementWatcherTriggerDetails.WithDefault, IWinRTObject {
  private val __1875634711_Interface: IBluetoothLEAdvertisementWatcherTriggerDetails.WithDefault by
      lazy {
    as_1875634711()
  }


  public override val __1875634711_Ptr: JNAPointer? by lazy {
    __1875634711_Interface.__1875634711_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1875634711_Interface)

  private fun as_1875634711(): IBluetoothLEAdvertisementWatcherTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothLEAdvertisementWatcherTriggerDetails.ABI.makeIBluetoothLEAdvertisementWatcherTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothLEAdvertisementWatcherTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothLEAdvertisementWatcherTriggerDetails.ABI.makeIBluetoothLEAdvertisementWatcherTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BluetoothLEAdvertisementWatcherTriggerDetails> {
    public override fun getValue() =
        BluetoothLEAdvertisementWatcherTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: BluetoothLEAdvertisementWatcherTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BluetoothLEAdvertisementWatcherTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        BluetoothLEAdvertisementWatcherTriggerDetails {
      val address = segment.toRawLongValue()
      return BluetoothLEAdvertisementWatcherTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: BluetoothLEAdvertisementWatcherTriggerDetails): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
