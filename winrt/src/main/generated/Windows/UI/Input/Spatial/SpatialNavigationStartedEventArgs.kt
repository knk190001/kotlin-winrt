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

@ABIMarker(SpatialNavigationStartedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Input.Spatial.SpatialNavigationStartedEventArgs;{754a348a-fb64-4656-8ebd-9deecaafe475})")
@WinRTByReference(brClass = SpatialNavigationStartedEventArgs.ByReference::class)
public class SpatialNavigationStartedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialNavigationStartedEventArgs.WithDefault, IWinRTObject {
  private val __1272676054_Interface: ISpatialNavigationStartedEventArgs.WithDefault by lazy {
    as_1272676054()
  }


  public override val __1272676054_Ptr: JNAPointer? by lazy {
    __1272676054_Interface.__1272676054_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1272676054_Interface)

  private fun as_1272676054(): ISpatialNavigationStartedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISpatialNavigationStartedEventArgs.ABI.makeISpatialNavigationStartedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialNavigationStartedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialNavigationStartedEventArgs.ABI.makeISpatialNavigationStartedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialNavigationStartedEventArgs> {
    public override fun getValue() = SpatialNavigationStartedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SpatialNavigationStartedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialNavigationStartedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpatialNavigationStartedEventArgs {
      val address = segment.toRawLongValue()
      return SpatialNavigationStartedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SpatialNavigationStartedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
