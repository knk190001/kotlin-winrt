package Windows.Storage.Pickers.Provider

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

@ABIMarker(TargetFileRequest.ABI::class)
@Signature("rc(Windows.Storage.Pickers.Provider.TargetFileRequest;{42bd3355-7f88-478b-8e81-690b20340678})")
@WinRTByReference(brClass = TargetFileRequest.ByReference::class)
public class TargetFileRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITargetFileRequest.WithDefault, IWinRTObject {
  private val __157170833_Interface: ITargetFileRequest.WithDefault by lazy {
    as_157170833()
  }


  public override val __157170833_Ptr: JNAPointer? by lazy {
    __157170833_Interface.__157170833_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__157170833_Interface)

  private fun as_157170833(): ITargetFileRequest.WithDefault {
    if(pointer == NULL) {
      return(ITargetFileRequest.ABI.makeITargetFileRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITargetFileRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITargetFileRequest.ABI.makeITargetFileRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TargetFileRequest> {
    public override fun getValue() = TargetFileRequest(pointer.getPointer(0))

    public fun setValue(value: TargetFileRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TargetFileRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TargetFileRequest {
      val address = segment.toRawLongValue()
      return TargetFileRequest(Pointer(address))
    }

    public override fun toNative(obj: TargetFileRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
