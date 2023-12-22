package Windows.UI.Input.Spatial

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

@ABIMarker(SpatialInteraction.ABI::class)
@Signature("rc(Windows.UI.Input.Spatial.SpatialInteraction;{fc967639-88e6-4646-9112-4344aaec9dfa})")
@WinRTByReference(brClass = SpatialInteraction.ByReference::class)
public class SpatialInteraction(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialInteraction.WithDefault, IWinRTObject {
  private val __1095027206_Interface: ISpatialInteraction.WithDefault by lazy {
    as_1095027206()
  }


  public override val __1095027206_Ptr: JNAPointer? by lazy {
    __1095027206_Interface.__1095027206_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1095027206_Interface)

  private fun as_1095027206(): ISpatialInteraction.WithDefault {
    if(pointer == NULL) {
      return(ISpatialInteraction.ABI.makeISpatialInteraction(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialInteraction>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialInteraction.ABI.makeISpatialInteraction(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialInteraction> {
    public override fun getValue() = SpatialInteraction(pointer.getPointer(0))

    public fun setValue(value: SpatialInteraction): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialInteraction, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpatialInteraction {
      val address = segment.toRawLongValue()
      return SpatialInteraction(Pointer(address))
    }

    public override fun toNative(obj: SpatialInteraction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
