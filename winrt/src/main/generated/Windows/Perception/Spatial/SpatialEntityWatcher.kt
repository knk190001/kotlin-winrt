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

@ABIMarker(SpatialEntityWatcher.ABI::class)
@Signature("rc(Windows.Perception.Spatial.SpatialEntityWatcher;{b3b85fa0-6d5e-4bbc-805d-5fe5b9ba1959})")
@WinRTByReference(brClass = SpatialEntityWatcher.ByReference::class)
public class SpatialEntityWatcher(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialEntityWatcher.WithDefault, IWinRTObject {
  private val __584896200_Interface: ISpatialEntityWatcher.WithDefault by lazy {
    as_584896200()
  }


  public override val __584896200_Ptr: JNAPointer? by lazy {
    __584896200_Interface.__584896200_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__584896200_Interface)

  private fun as_584896200(): ISpatialEntityWatcher.WithDefault {
    if(pointer == NULL) {
      return(ISpatialEntityWatcher.ABI.makeISpatialEntityWatcher(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialEntityWatcher>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialEntityWatcher.ABI.makeISpatialEntityWatcher(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialEntityWatcher> {
    public override fun getValue() = SpatialEntityWatcher(pointer.getPointer(0))

    public fun setValue(value: SpatialEntityWatcher): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialEntityWatcher, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpatialEntityWatcher {
      val address = segment.toRawLongValue()
      return SpatialEntityWatcher(Pointer(address))
    }

    public override fun toNative(obj: SpatialEntityWatcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
