package Windows.Perception.Spatial

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

@ABIMarker(SpatialEntityRemovedEventArgs.ABI::class)
@Signature("rc(Windows.Perception.Spatial.SpatialEntityRemovedEventArgs;{91741800-536d-4e9f-abf6-415b5444d651})")
@WinRTByReference(brClass = SpatialEntityRemovedEventArgs.ByReference::class)
public class SpatialEntityRemovedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialEntityRemovedEventArgs.WithDefault, IWinRTObject {
  private val __1117299227_Interface: ISpatialEntityRemovedEventArgs.WithDefault by lazy {
    as_1117299227()
  }


  public override val __1117299227_Ptr: JNAPointer? by lazy {
    __1117299227_Interface.__1117299227_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1117299227_Interface)

  private fun as_1117299227(): ISpatialEntityRemovedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISpatialEntityRemovedEventArgs.ABI.makeISpatialEntityRemovedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialEntityRemovedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialEntityRemovedEventArgs.ABI.makeISpatialEntityRemovedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialEntityRemovedEventArgs> {
    public override fun getValue() = SpatialEntityRemovedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SpatialEntityRemovedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialEntityRemovedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpatialEntityRemovedEventArgs {
      val address = segment.toRawLongValue()
      return SpatialEntityRemovedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SpatialEntityRemovedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
