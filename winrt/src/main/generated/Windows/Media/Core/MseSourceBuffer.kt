package Windows.Media.Core

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

@ABIMarker(MseSourceBuffer.ABI::class)
@Signature("rc(Windows.Media.Core.MseSourceBuffer;{0c1aa3e3-df8d-4079-a3fe-6849184b4e2f})")
@WinRTByReference(brClass = MseSourceBuffer.ByReference::class)
public class MseSourceBuffer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMseSourceBuffer.WithDefault, IWinRTObject {
  private val __722067941_Interface: IMseSourceBuffer.WithDefault by lazy {
    as_722067941()
  }


  public override val __722067941_Ptr: JNAPointer? by lazy {
    __722067941_Interface.__722067941_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__722067941_Interface)

  private fun as_722067941(): IMseSourceBuffer.WithDefault {
    if(pointer == NULL) {
      return(IMseSourceBuffer.ABI.makeIMseSourceBuffer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMseSourceBuffer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMseSourceBuffer.ABI.makeIMseSourceBuffer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MseSourceBuffer> {
    public override fun getValue() = MseSourceBuffer(pointer.getPointer(0))

    public fun setValue(value: MseSourceBuffer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MseSourceBuffer, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MseSourceBuffer {
      val address = segment.toRawLongValue()
      return MseSourceBuffer(Pointer(address))
    }

    public override fun toNative(obj: MseSourceBuffer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
