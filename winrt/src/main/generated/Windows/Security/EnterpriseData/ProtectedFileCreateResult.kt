package Windows.Security.EnterpriseData

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

@ABIMarker(ProtectedFileCreateResult.ABI::class)
@Signature("rc(Windows.Security.EnterpriseData.ProtectedFileCreateResult;{28e3ed6a-e9e7-4a03-9f53-bdb16172699b})")
@WinRTByReference(brClass = ProtectedFileCreateResult.ByReference::class)
public class ProtectedFileCreateResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IProtectedFileCreateResult.WithDefault, IWinRTObject {
  private val __2036526488_Interface: IProtectedFileCreateResult.WithDefault by lazy {
    as_2036526488()
  }


  public override val __2036526488_Ptr: JNAPointer? by lazy {
    __2036526488_Interface.__2036526488_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2036526488_Interface)

  private fun as_2036526488(): IProtectedFileCreateResult.WithDefault {
    if(pointer == NULL) {
      return(IProtectedFileCreateResult.ABI.makeIProtectedFileCreateResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProtectedFileCreateResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProtectedFileCreateResult.ABI.makeIProtectedFileCreateResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProtectedFileCreateResult> {
    public override fun getValue() = ProtectedFileCreateResult(pointer.getPointer(0))

    public fun setValue(value: ProtectedFileCreateResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProtectedFileCreateResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ProtectedFileCreateResult {
      val address = segment.toRawLongValue()
      return ProtectedFileCreateResult(Pointer(address))
    }

    public override fun toNative(obj: ProtectedFileCreateResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
