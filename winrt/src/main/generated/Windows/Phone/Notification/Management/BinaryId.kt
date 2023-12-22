package Windows.Phone.Notification.Management

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

@ABIMarker(BinaryId.ABI::class)
@Signature("rc(Windows.Phone.Notification.Management.BinaryId;{4f0da531-5595-44b4-9181-ce4efa3fc168})")
@WinRTByReference(brClass = BinaryId.ByReference::class)
public class BinaryId(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBinaryId.WithDefault, IWinRTObject {
  private val __535006070_Interface: IBinaryId.WithDefault by lazy {
    as_535006070()
  }


  public override val __535006070_Ptr: JNAPointer? by lazy {
    __535006070_Interface.__535006070_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__535006070_Interface)

  private fun as_535006070(): IBinaryId.WithDefault {
    if(pointer == NULL) {
      return(IBinaryId.ABI.makeIBinaryId(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBinaryId>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBinaryId.ABI.makeIBinaryId(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<BinaryId> {
    public override fun getValue() = BinaryId(pointer.getPointer(0))

    public fun setValue(value: BinaryId): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BinaryId, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BinaryId {
      val address = segment.toRawLongValue()
      return BinaryId(Pointer(address))
    }

    public override fun toNative(obj: BinaryId): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
