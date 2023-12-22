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

@ABIMarker(MseSourceBufferList.ABI::class)
@Signature("rc(Windows.Media.Core.MseSourceBufferList;{95fae8e7-a8e7-4ebf-8927-145e940ba511})")
@WinRTByReference(brClass = MseSourceBufferList.ByReference::class)
public class MseSourceBufferList(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMseSourceBufferList.WithDefault, IWinRTObject {
  private val __303002589_Interface: IMseSourceBufferList.WithDefault by lazy {
    as_303002589()
  }


  public override val __303002589_Ptr: JNAPointer? by lazy {
    __303002589_Interface.__303002589_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__303002589_Interface)

  private fun as_303002589(): IMseSourceBufferList.WithDefault {
    if(pointer == NULL) {
      return(IMseSourceBufferList.ABI.makeIMseSourceBufferList(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMseSourceBufferList>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMseSourceBufferList.ABI.makeIMseSourceBufferList(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MseSourceBufferList> {
    public override fun getValue() = MseSourceBufferList(pointer.getPointer(0))

    public fun setValue(value: MseSourceBufferList): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MseSourceBufferList, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MseSourceBufferList {
      val address = segment.toRawLongValue()
      return MseSourceBufferList(Pointer(address))
    }

    public override fun toNative(obj: MseSourceBufferList): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
