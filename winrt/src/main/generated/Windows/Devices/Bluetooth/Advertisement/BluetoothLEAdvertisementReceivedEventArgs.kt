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

@ABIMarker(BluetoothLEAdvertisementReceivedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementReceivedEventArgs;{27987ddf-e596-41be-8d43-9e6731d4a913})")
@WinRTByReference(brClass = BluetoothLEAdvertisementReceivedEventArgs.ByReference::class)
public class BluetoothLEAdvertisementReceivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBluetoothLEAdvertisementReceivedEventArgs.WithDefault,
    IBluetoothLEAdvertisementReceivedEventArgs2.WithDefault, IWinRTObject {
  private val __553043976_Interface: IBluetoothLEAdvertisementReceivedEventArgs.WithDefault by
      lazy {
    as_553043976()
  }


  private val __35505978_Interface: IBluetoothLEAdvertisementReceivedEventArgs2.WithDefault by
      lazy {
    as_35505978()
  }


  public override val __553043976_Ptr: JNAPointer? by lazy {
    __553043976_Interface.__553043976_Ptr
  }


  public override val __35505978_Ptr: JNAPointer? by lazy {
    __35505978_Interface.__35505978_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__553043976_Interface, __35505978_Interface)

  private fun as_553043976(): IBluetoothLEAdvertisementReceivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothLEAdvertisementReceivedEventArgs.ABI.makeIBluetoothLEAdvertisementReceivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothLEAdvertisementReceivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothLEAdvertisementReceivedEventArgs.ABI.makeIBluetoothLEAdvertisementReceivedEventArgs(ref.value))
  }

  private fun as_35505978(): IBluetoothLEAdvertisementReceivedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothLEAdvertisementReceivedEventArgs2.ABI.makeIBluetoothLEAdvertisementReceivedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothLEAdvertisementReceivedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothLEAdvertisementReceivedEventArgs2.ABI.makeIBluetoothLEAdvertisementReceivedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BluetoothLEAdvertisementReceivedEventArgs> {
    public override fun getValue() =
        BluetoothLEAdvertisementReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: BluetoothLEAdvertisementReceivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BluetoothLEAdvertisementReceivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        BluetoothLEAdvertisementReceivedEventArgs {
      val address = segment.toRawLongValue()
      return BluetoothLEAdvertisementReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: BluetoothLEAdvertisementReceivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
