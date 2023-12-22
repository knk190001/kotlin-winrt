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

@ABIMarker(BufferProtectUnprotectResult.ABI::class)
@Signature("rc(Windows.Security.EnterpriseData.BufferProtectUnprotectResult;{47995edc-6cec-4e3a-b251-9e7485d79e7a})")
@WinRTByReference(brClass = BufferProtectUnprotectResult.ByReference::class)
public class BufferProtectUnprotectResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBufferProtectUnprotectResult.WithDefault, IWinRTObject {
  private val __1108334977_Interface: IBufferProtectUnprotectResult.WithDefault by lazy {
    as_1108334977()
  }


  public override val __1108334977_Ptr: JNAPointer? by lazy {
    __1108334977_Interface.__1108334977_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1108334977_Interface)

  private fun as_1108334977(): IBufferProtectUnprotectResult.WithDefault {
    if(pointer == NULL) {
      return(IBufferProtectUnprotectResult.ABI.makeIBufferProtectUnprotectResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBufferProtectUnprotectResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBufferProtectUnprotectResult.ABI.makeIBufferProtectUnprotectResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BufferProtectUnprotectResult> {
    public override fun getValue() = BufferProtectUnprotectResult(pointer.getPointer(0))

    public fun setValue(value: BufferProtectUnprotectResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BufferProtectUnprotectResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BufferProtectUnprotectResult {
      val address = segment.toRawLongValue()
      return BufferProtectUnprotectResult(Pointer(address))
    }

    public override fun toNative(obj: BufferProtectUnprotectResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
