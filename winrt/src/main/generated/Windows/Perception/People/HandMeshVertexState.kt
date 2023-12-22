package Windows.Perception.People

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

@ABIMarker(HandMeshVertexState.ABI::class)
@Signature("rc(Windows.Perception.People.HandMeshVertexState;{046c5fef-1d8b-55de-ab2c-1cd424886d8f})")
@WinRTByReference(brClass = HandMeshVertexState.ByReference::class)
public class HandMeshVertexState(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHandMeshVertexState.WithDefault, IWinRTObject {
  private val __776448597_Interface: IHandMeshVertexState.WithDefault by lazy {
    as_776448597()
  }


  public override val __776448597_Ptr: JNAPointer? by lazy {
    __776448597_Interface.__776448597_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__776448597_Interface)

  private fun as_776448597(): IHandMeshVertexState.WithDefault {
    if(pointer == NULL) {
      return(IHandMeshVertexState.ABI.makeIHandMeshVertexState(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHandMeshVertexState>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHandMeshVertexState.ABI.makeIHandMeshVertexState(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HandMeshVertexState> {
    public override fun getValue() = HandMeshVertexState(pointer.getPointer(0))

    public fun setValue(value: HandMeshVertexState): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HandMeshVertexState, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HandMeshVertexState {
      val address = segment.toRawLongValue()
      return HandMeshVertexState(Pointer(address))
    }

    public override fun toNative(obj: HandMeshVertexState): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
