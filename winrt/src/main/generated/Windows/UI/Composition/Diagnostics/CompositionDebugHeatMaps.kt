package Windows.UI.Composition.Diagnostics

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

@ABIMarker(CompositionDebugHeatMaps.ABI::class)
@Signature("rc(Windows.UI.Composition.Diagnostics.CompositionDebugHeatMaps;{e49c90ac-2ff3-5805-718c-b725ee07650f})")
@WinRTByReference(brClass = CompositionDebugHeatMaps.ByReference::class)
public class CompositionDebugHeatMaps(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICompositionDebugHeatMaps.WithDefault, IWinRTObject {
  private val __354141664_Interface: ICompositionDebugHeatMaps.WithDefault by lazy {
    as_354141664()
  }


  public override val __354141664_Ptr: JNAPointer? by lazy {
    __354141664_Interface.__354141664_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__354141664_Interface)

  private fun as_354141664(): ICompositionDebugHeatMaps.WithDefault {
    if(pointer == NULL) {
      return(ICompositionDebugHeatMaps.ABI.makeICompositionDebugHeatMaps(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionDebugHeatMaps>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionDebugHeatMaps.ABI.makeICompositionDebugHeatMaps(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionDebugHeatMaps> {
    public override fun getValue() = CompositionDebugHeatMaps(pointer.getPointer(0))

    public fun setValue(value: CompositionDebugHeatMaps): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionDebugHeatMaps, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionDebugHeatMaps {
      val address = segment.toRawLongValue()
      return CompositionDebugHeatMaps(Pointer(address))
    }

    public override fun toNative(obj: CompositionDebugHeatMaps): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
