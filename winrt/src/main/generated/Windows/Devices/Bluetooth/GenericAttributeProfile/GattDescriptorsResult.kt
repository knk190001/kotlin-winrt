package Windows.Devices.Bluetooth.GenericAttributeProfile

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

@ABIMarker(GattDescriptorsResult.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.GenericAttributeProfile.GattDescriptorsResult;{9bc091f3-95e7-4489-8d25-ff81955a57b9})")
@WinRTByReference(brClass = GattDescriptorsResult.ByReference::class)
public class GattDescriptorsResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGattDescriptorsResult.WithDefault, IWinRTObject {
  private val __1505421510_Interface: IGattDescriptorsResult.WithDefault by lazy {
    as_1505421510()
  }


  public override val __1505421510_Ptr: JNAPointer? by lazy {
    __1505421510_Interface.__1505421510_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1505421510_Interface)

  private fun as_1505421510(): IGattDescriptorsResult.WithDefault {
    if(pointer == NULL) {
      return(IGattDescriptorsResult.ABI.makeIGattDescriptorsResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattDescriptorsResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattDescriptorsResult.ABI.makeIGattDescriptorsResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattDescriptorsResult> {
    public override fun getValue() = GattDescriptorsResult(pointer.getPointer(0))

    public fun setValue(value: GattDescriptorsResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattDescriptorsResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GattDescriptorsResult {
      val address = segment.toRawLongValue()
      return GattDescriptorsResult(Pointer(address))
    }

    public override fun toNative(obj: GattDescriptorsResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
