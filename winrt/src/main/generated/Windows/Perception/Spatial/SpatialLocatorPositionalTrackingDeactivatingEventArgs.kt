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

@ABIMarker(SpatialLocatorPositionalTrackingDeactivatingEventArgs.ABI::class)
@Signature("rc(Windows.Perception.Spatial.SpatialLocatorPositionalTrackingDeactivatingEventArgs;{b8a84063-e3f4-368b-9061-9ea9d1d6cc16})")
@WinRTByReference(brClass =
    SpatialLocatorPositionalTrackingDeactivatingEventArgs.ByReference::class)
public class SpatialLocatorPositionalTrackingDeactivatingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialLocatorPositionalTrackingDeactivatingEventArgs.WithDefault,
    IWinRTObject {
  private val __1937904070_Interface:
      ISpatialLocatorPositionalTrackingDeactivatingEventArgs.WithDefault by lazy {
    as_1937904070()
  }


  public override val __1937904070_Ptr: JNAPointer? by lazy {
    __1937904070_Interface.__1937904070_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1937904070_Interface)

  private fun as_1937904070(): ISpatialLocatorPositionalTrackingDeactivatingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISpatialLocatorPositionalTrackingDeactivatingEventArgs.ABI.makeISpatialLocatorPositionalTrackingDeactivatingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialLocatorPositionalTrackingDeactivatingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialLocatorPositionalTrackingDeactivatingEventArgs.ABI.makeISpatialLocatorPositionalTrackingDeactivatingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialLocatorPositionalTrackingDeactivatingEventArgs> {
    public override fun getValue() =
        SpatialLocatorPositionalTrackingDeactivatingEventArgs(pointer.getPointer(0))

    public fun setValue(value: SpatialLocatorPositionalTrackingDeactivatingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialLocatorPositionalTrackingDeactivatingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        SpatialLocatorPositionalTrackingDeactivatingEventArgs {
      val address = segment.toRawLongValue()
      return SpatialLocatorPositionalTrackingDeactivatingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SpatialLocatorPositionalTrackingDeactivatingEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
