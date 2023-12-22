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

@ABIMarker(GattServiceProviderTriggerDetails.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.Background.GattServiceProviderTriggerDetails;{ae8c0625-05ff-4afb-b16a-de95f3cf0158})")
@WinRTByReference(brClass = GattServiceProviderTriggerDetails.ByReference::class)
public class GattServiceProviderTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGattServiceProviderTriggerDetails.WithDefault, IWinRTObject {
  private val __645319881_Interface: IGattServiceProviderTriggerDetails.WithDefault by lazy {
    as_645319881()
  }


  public override val __645319881_Ptr: JNAPointer? by lazy {
    __645319881_Interface.__645319881_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__645319881_Interface)

  private fun as_645319881(): IGattServiceProviderTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IGattServiceProviderTriggerDetails.ABI.makeIGattServiceProviderTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattServiceProviderTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattServiceProviderTriggerDetails.ABI.makeIGattServiceProviderTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattServiceProviderTriggerDetails> {
    public override fun getValue() = GattServiceProviderTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: GattServiceProviderTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattServiceProviderTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GattServiceProviderTriggerDetails {
      val address = segment.toRawLongValue()
      return GattServiceProviderTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: GattServiceProviderTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
