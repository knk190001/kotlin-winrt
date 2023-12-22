package Windows.Devices.Bluetooth.Advertisement

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

@ABIMarker(BluetoothLEAdvertisementWatcherStoppedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementWatcherStoppedEventArgs;{dd40f84d-e7b9-43e3-9c04-0685d085fd8c})")
@WinRTByReference(brClass = BluetoothLEAdvertisementWatcherStoppedEventArgs.ByReference::class)
public class BluetoothLEAdvertisementWatcherStoppedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBluetoothLEAdvertisementWatcherStoppedEventArgs.WithDefault, IWinRTObject {
  private val __1041475048_Interface: IBluetoothLEAdvertisementWatcherStoppedEventArgs.WithDefault
      by lazy {
    as_1041475048()
  }


  public override val __1041475048_Ptr: JNAPointer? by lazy {
    __1041475048_Interface.__1041475048_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1041475048_Interface)

  private fun as_1041475048(): IBluetoothLEAdvertisementWatcherStoppedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothLEAdvertisementWatcherStoppedEventArgs.ABI.makeIBluetoothLEAdvertisementWatcherStoppedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothLEAdvertisementWatcherStoppedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothLEAdvertisementWatcherStoppedEventArgs.ABI.makeIBluetoothLEAdvertisementWatcherStoppedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BluetoothLEAdvertisementWatcherStoppedEventArgs> {
    public override fun getValue() =
        BluetoothLEAdvertisementWatcherStoppedEventArgs(pointer.getPointer(0))

    public fun setValue(value: BluetoothLEAdvertisementWatcherStoppedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BluetoothLEAdvertisementWatcherStoppedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        BluetoothLEAdvertisementWatcherStoppedEventArgs {
      val address = segment.toRawLongValue()
      return BluetoothLEAdvertisementWatcherStoppedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: BluetoothLEAdvertisementWatcherStoppedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
