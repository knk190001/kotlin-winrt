package Windows.ApplicationModel.Contacts

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

@ABIMarker(PinnedContactIdsQueryResult.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.PinnedContactIdsQueryResult;{7d9b2552-1579-4ddc-871f-a30a3aea9ba1})")
@WinRTByReference(brClass = PinnedContactIdsQueryResult.ByReference::class)
public class PinnedContactIdsQueryResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPinnedContactIdsQueryResult.WithDefault, IWinRTObject {
  private val __943818743_Interface: IPinnedContactIdsQueryResult.WithDefault by lazy {
    as_943818743()
  }


  public override val __943818743_Ptr: JNAPointer? by lazy {
    __943818743_Interface.__943818743_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__943818743_Interface)

  private fun as_943818743(): IPinnedContactIdsQueryResult.WithDefault {
    if(pointer == NULL) {
      return(IPinnedContactIdsQueryResult.ABI.makeIPinnedContactIdsQueryResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPinnedContactIdsQueryResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPinnedContactIdsQueryResult.ABI.makeIPinnedContactIdsQueryResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PinnedContactIdsQueryResult> {
    public override fun getValue() = PinnedContactIdsQueryResult(pointer.getPointer(0))

    public fun setValue(value: PinnedContactIdsQueryResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PinnedContactIdsQueryResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PinnedContactIdsQueryResult {
      val address = segment.toRawLongValue()
      return PinnedContactIdsQueryResult(Pointer(address))
    }

    public override fun toNative(obj: PinnedContactIdsQueryResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
