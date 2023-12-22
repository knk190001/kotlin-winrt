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

@ABIMarker(SpatialNavigationCompletedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Input.Spatial.SpatialNavigationCompletedEventArgs;{012e80b7-af3b-42c2-9e41-baaa0e721f3a})")
@WinRTByReference(brClass = SpatialNavigationCompletedEventArgs.ByReference::class)
public class SpatialNavigationCompletedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialNavigationCompletedEventArgs.WithDefault, IWinRTObject {
  private val __1961706420_Interface: ISpatialNavigationCompletedEventArgs.WithDefault by lazy {
    as_1961706420()
  }


  public override val __1961706420_Ptr: JNAPointer? by lazy {
    __1961706420_Interface.__1961706420_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1961706420_Interface)

  private fun as_1961706420(): ISpatialNavigationCompletedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISpatialNavigationCompletedEventArgs.ABI.makeISpatialNavigationCompletedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialNavigationCompletedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialNavigationCompletedEventArgs.ABI.makeISpatialNavigationCompletedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialNavigationCompletedEventArgs> {
    public override fun getValue() = SpatialNavigationCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SpatialNavigationCompletedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialNavigationCompletedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpatialNavigationCompletedEventArgs {
      val address = segment.toRawLongValue()
      return SpatialNavigationCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SpatialNavigationCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
