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

@ABIMarker(GattCharacteristicNotificationTriggerDetails.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.Background.GattCharacteristicNotificationTriggerDetails;{9ba03b18-0fec-436a-93b1-f46c697532a2})")
@WinRTByReference(brClass = GattCharacteristicNotificationTriggerDetails.ByReference::class)
public class GattCharacteristicNotificationTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGattCharacteristicNotificationTriggerDetails.WithDefault,
    IGattCharacteristicNotificationTriggerDetails2.WithDefault, IWinRTObject {
  private val __2118105495_Interface: IGattCharacteristicNotificationTriggerDetails.WithDefault by
      lazy {
    as_2118105495()
  }


  private val __1236760855_Interface: IGattCharacteristicNotificationTriggerDetails2.WithDefault by
      lazy {
    as_1236760855()
  }


  public override val __2118105495_Ptr: JNAPointer? by lazy {
    __2118105495_Interface.__2118105495_Ptr
  }


  public override val __1236760855_Ptr: JNAPointer? by lazy {
    __1236760855_Interface.__1236760855_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2118105495_Interface, __1236760855_Interface)

  private fun as_2118105495(): IGattCharacteristicNotificationTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IGattCharacteristicNotificationTriggerDetails.ABI.makeIGattCharacteristicNotificationTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattCharacteristicNotificationTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattCharacteristicNotificationTriggerDetails.ABI.makeIGattCharacteristicNotificationTriggerDetails(ref.value))
  }

  private fun as_1236760855(): IGattCharacteristicNotificationTriggerDetails2.WithDefault {
    if(pointer == NULL) {
      return(IGattCharacteristicNotificationTriggerDetails2.ABI.makeIGattCharacteristicNotificationTriggerDetails2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattCharacteristicNotificationTriggerDetails2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattCharacteristicNotificationTriggerDetails2.ABI.makeIGattCharacteristicNotificationTriggerDetails2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattCharacteristicNotificationTriggerDetails> {
    public override fun getValue() =
        GattCharacteristicNotificationTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: GattCharacteristicNotificationTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattCharacteristicNotificationTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        GattCharacteristicNotificationTriggerDetails {
      val address = segment.toRawLongValue()
      return GattCharacteristicNotificationTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: GattCharacteristicNotificationTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
