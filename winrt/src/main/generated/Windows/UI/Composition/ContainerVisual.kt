package Windows.UI.Composition

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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ContainerVisual.ABI::class)
@Signature("rc(Windows.UI.Composition.ContainerVisual;{02f6bc74-ed20-4773-afe6-d49b4a93db32})")
@WinRTByReference(brClass = ContainerVisual.ByReference::class)
public open class ContainerVisual(
  ptr: JNAPointer? = NULL
) : Visual(ptr), IContainerVisual.WithDefault, IWinRTObject {
  private val __55074381_Interface: IContainerVisual.WithDefault by lazy {
    as_55074381()
  }


  public override val __55074381_Ptr: JNAPointer? by lazy {
    __55074381_Interface.__55074381_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__55074381_Interface)

  private fun as_55074381(): IContainerVisual.WithDefault {
    if(pointer == NULL) {
      return(IContainerVisual.ABI.makeIContainerVisual(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContainerVisual>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContainerVisual.ABI.makeIContainerVisual(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContainerVisual> {
    public override fun getValue() = ContainerVisual(pointer.getPointer(0))

    public fun setValue(value: ContainerVisual): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContainerVisual, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContainerVisual {
      val address = segment.toRawLongValue()
      return ContainerVisual(Pointer(address))
    }

    public override fun toNative(obj: ContainerVisual): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
