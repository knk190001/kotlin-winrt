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

@ABIMarker(SpatialNavigationCanceledEventArgs.ABI::class)
@Signature("rc(Windows.UI.Input.Spatial.SpatialNavigationCanceledEventArgs;{ce503edc-e8a5-46f0-92d4-3c122b35112a})")
@WinRTByReference(brClass = SpatialNavigationCanceledEventArgs.ByReference::class)
public class SpatialNavigationCanceledEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialNavigationCanceledEventArgs.WithDefault, IWinRTObject {
  private val __1031911874_Interface: ISpatialNavigationCanceledEventArgs.WithDefault by lazy {
    as_1031911874()
  }


  public override val __1031911874_Ptr: JNAPointer? by lazy {
    __1031911874_Interface.__1031911874_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1031911874_Interface)

  private fun as_1031911874(): ISpatialNavigationCanceledEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISpatialNavigationCanceledEventArgs.ABI.makeISpatialNavigationCanceledEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialNavigationCanceledEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialNavigationCanceledEventArgs.ABI.makeISpatialNavigationCanceledEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialNavigationCanceledEventArgs> {
    public override fun getValue() = SpatialNavigationCanceledEventArgs(pointer.getPointer(0))

    public fun setValue(value: SpatialNavigationCanceledEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialNavigationCanceledEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpatialNavigationCanceledEventArgs {
      val address = segment.toRawLongValue()
      return SpatialNavigationCanceledEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SpatialNavigationCanceledEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
