package Windows.Storage

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

@ABIMarker(SetVersionRequest.ABI::class)
@Signature("rc(Windows.Storage.SetVersionRequest;{b9c76b9b-1056-4e69-8330-162619956f9b})")
@WinRTByReference(brClass = SetVersionRequest.ByReference::class)
public class SetVersionRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISetVersionRequest.WithDefault, IWinRTObject {
  private val __39188512_Interface: ISetVersionRequest.WithDefault by lazy {
    as_39188512()
  }


  public override val __39188512_Ptr: JNAPointer? by lazy {
    __39188512_Interface.__39188512_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__39188512_Interface)

  private fun as_39188512(): ISetVersionRequest.WithDefault {
    if(pointer == NULL) {
      return(ISetVersionRequest.ABI.makeISetVersionRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISetVersionRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISetVersionRequest.ABI.makeISetVersionRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SetVersionRequest> {
    public override fun getValue() = SetVersionRequest(pointer.getPointer(0))

    public fun setValue(value: SetVersionRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SetVersionRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SetVersionRequest {
      val address = segment.toRawLongValue()
      return SetVersionRequest(Pointer(address))
    }

    public override fun toNative(obj: SetVersionRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
