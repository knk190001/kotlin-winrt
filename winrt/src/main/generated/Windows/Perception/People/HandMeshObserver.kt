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

@ABIMarker(HandMeshObserver.ABI::class)
@Signature("rc(Windows.Perception.People.HandMeshObserver;{85ae30cb-6fc3-55c4-a7b4-29e33896ca69})")
@WinRTByReference(brClass = HandMeshObserver.ByReference::class)
public class HandMeshObserver(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHandMeshObserver.WithDefault, IWinRTObject {
  private val __1168437554_Interface: IHandMeshObserver.WithDefault by lazy {
    as_1168437554()
  }


  public override val __1168437554_Ptr: JNAPointer? by lazy {
    __1168437554_Interface.__1168437554_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1168437554_Interface)

  private fun as_1168437554(): IHandMeshObserver.WithDefault {
    if(pointer == NULL) {
      return(IHandMeshObserver.ABI.makeIHandMeshObserver(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHandMeshObserver>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHandMeshObserver.ABI.makeIHandMeshObserver(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HandMeshObserver> {
    public override fun getValue() = HandMeshObserver(pointer.getPointer(0))

    public fun setValue(value: HandMeshObserver): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HandMeshObserver, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HandMeshObserver {
      val address = segment.toRawLongValue()
      return HandMeshObserver(Pointer(address))
    }

    public override fun toNative(obj: HandMeshObserver): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
