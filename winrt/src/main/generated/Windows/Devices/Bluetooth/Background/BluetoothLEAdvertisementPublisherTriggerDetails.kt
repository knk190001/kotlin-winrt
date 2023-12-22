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

@ABIMarker(BluetoothLEAdvertisementPublisherTriggerDetails.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.Background.BluetoothLEAdvertisementPublisherTriggerDetails;{610eca86-3480-41c9-a918-7ddadf207e00})")
@WinRTByReference(brClass = BluetoothLEAdvertisementPublisherTriggerDetails.ByReference::class)
public class BluetoothLEAdvertisementPublisherTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBluetoothLEAdvertisementPublisherTriggerDetails.WithDefault,
    IBluetoothLEAdvertisementPublisherTriggerDetails2.WithDefault, IWinRTObject {
  private val __1681068393_Interface: IBluetoothLEAdvertisementPublisherTriggerDetails.WithDefault
      by lazy {
    as_1681068393()
  }


  private val __573512681_Interface: IBluetoothLEAdvertisementPublisherTriggerDetails2.WithDefault
      by lazy {
    as_573512681()
  }


  public override val __1681068393_Ptr: JNAPointer? by lazy {
    __1681068393_Interface.__1681068393_Ptr
  }


  public override val __573512681_Ptr: JNAPointer? by lazy {
    __573512681_Interface.__573512681_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1681068393_Interface, __573512681_Interface)

  private fun as_1681068393(): IBluetoothLEAdvertisementPublisherTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothLEAdvertisementPublisherTriggerDetails.ABI.makeIBluetoothLEAdvertisementPublisherTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothLEAdvertisementPublisherTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothLEAdvertisementPublisherTriggerDetails.ABI.makeIBluetoothLEAdvertisementPublisherTriggerDetails(ref.value))
  }

  private fun as_573512681(): IBluetoothLEAdvertisementPublisherTriggerDetails2.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothLEAdvertisementPublisherTriggerDetails2.ABI.makeIBluetoothLEAdvertisementPublisherTriggerDetails2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothLEAdvertisementPublisherTriggerDetails2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothLEAdvertisementPublisherTriggerDetails2.ABI.makeIBluetoothLEAdvertisementPublisherTriggerDetails2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BluetoothLEAdvertisementPublisherTriggerDetails> {
    public override fun getValue() =
        BluetoothLEAdvertisementPublisherTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: BluetoothLEAdvertisementPublisherTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BluetoothLEAdvertisementPublisherTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        BluetoothLEAdvertisementPublisherTriggerDetails {
      val address = segment.toRawLongValue()
      return BluetoothLEAdvertisementPublisherTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: BluetoothLEAdvertisementPublisherTriggerDetails):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
