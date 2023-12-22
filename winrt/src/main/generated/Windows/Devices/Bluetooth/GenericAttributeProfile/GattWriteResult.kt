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

@ABIMarker(GattWriteResult.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.GenericAttributeProfile.GattWriteResult;{4991ddb1-cb2b-44f7-99fc-d29a2871dc9b})")
@WinRTByReference(brClass = GattWriteResult.ByReference::class)
public class GattWriteResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGattWriteResult.WithDefault, IWinRTObject {
  private val __440902335_Interface: IGattWriteResult.WithDefault by lazy {
    as_440902335()
  }


  public override val __440902335_Ptr: JNAPointer? by lazy {
    __440902335_Interface.__440902335_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__440902335_Interface)

  private fun as_440902335(): IGattWriteResult.WithDefault {
    if(pointer == NULL) {
      return(IGattWriteResult.ABI.makeIGattWriteResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattWriteResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattWriteResult.ABI.makeIGattWriteResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattWriteResult> {
    public override fun getValue() = GattWriteResult(pointer.getPointer(0))

    public fun setValue(value: GattWriteResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattWriteResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GattWriteResult {
      val address = segment.toRawLongValue()
      return GattWriteResult(Pointer(address))
    }

    public override fun toNative(obj: GattWriteResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
