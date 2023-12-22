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

@ABIMarker(BluetoothLEAdvertisementPublisherStatusChangedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatusChangedEventArgs;{09c2bd9f-2dff-4b23-86ee-0d14fb94aeae})")
@WinRTByReference(brClass =
    BluetoothLEAdvertisementPublisherStatusChangedEventArgs.ByReference::class)
public class BluetoothLEAdvertisementPublisherStatusChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBluetoothLEAdvertisementPublisherStatusChangedEventArgs.WithDefault,
    IBluetoothLEAdvertisementPublisherStatusChangedEventArgs2.WithDefault, IWinRTObject {
  private val __1939814963_Interface:
      IBluetoothLEAdvertisementPublisherStatusChangedEventArgs.WithDefault by lazy {
    as_1939814963()
  }


  private val __4721759_Interface:
      IBluetoothLEAdvertisementPublisherStatusChangedEventArgs2.WithDefault by lazy {
    as_4721759()
  }


  public override val __1939814963_Ptr: JNAPointer? by lazy {
    __1939814963_Interface.__1939814963_Ptr
  }


  public override val __4721759_Ptr: JNAPointer? by lazy {
    __4721759_Interface.__4721759_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1939814963_Interface, __4721759_Interface)

  private fun as_1939814963():
      IBluetoothLEAdvertisementPublisherStatusChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothLEAdvertisementPublisherStatusChangedEventArgs.ABI.makeIBluetoothLEAdvertisementPublisherStatusChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothLEAdvertisementPublisherStatusChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothLEAdvertisementPublisherStatusChangedEventArgs.ABI.makeIBluetoothLEAdvertisementPublisherStatusChangedEventArgs(ref.value))
  }

  private fun as_4721759(): IBluetoothLEAdvertisementPublisherStatusChangedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothLEAdvertisementPublisherStatusChangedEventArgs2.ABI.makeIBluetoothLEAdvertisementPublisherStatusChangedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothLEAdvertisementPublisherStatusChangedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothLEAdvertisementPublisherStatusChangedEventArgs2.ABI.makeIBluetoothLEAdvertisementPublisherStatusChangedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BluetoothLEAdvertisementPublisherStatusChangedEventArgs> {
    public override fun getValue() =
        BluetoothLEAdvertisementPublisherStatusChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: BluetoothLEAdvertisementPublisherStatusChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BluetoothLEAdvertisementPublisherStatusChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        BluetoothLEAdvertisementPublisherStatusChangedEventArgs {
      val address = segment.toRawLongValue()
      return BluetoothLEAdvertisementPublisherStatusChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: BluetoothLEAdvertisementPublisherStatusChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
