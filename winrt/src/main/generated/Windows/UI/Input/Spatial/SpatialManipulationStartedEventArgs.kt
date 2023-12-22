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

@ABIMarker(SpatialManipulationStartedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Input.Spatial.SpatialManipulationStartedEventArgs;{a1d6bbce-42a5-377b-ada6-d28e3d384737})")
@WinRTByReference(brClass = SpatialManipulationStartedEventArgs.ByReference::class)
public class SpatialManipulationStartedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialManipulationStartedEventArgs.WithDefault, IWinRTObject {
  private val __2070588255_Interface: ISpatialManipulationStartedEventArgs.WithDefault by lazy {
    as_2070588255()
  }


  public override val __2070588255_Ptr: JNAPointer? by lazy {
    __2070588255_Interface.__2070588255_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2070588255_Interface)

  private fun as_2070588255(): ISpatialManipulationStartedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISpatialManipulationStartedEventArgs.ABI.makeISpatialManipulationStartedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialManipulationStartedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialManipulationStartedEventArgs.ABI.makeISpatialManipulationStartedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialManipulationStartedEventArgs> {
    public override fun getValue() = SpatialManipulationStartedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SpatialManipulationStartedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialManipulationStartedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpatialManipulationStartedEventArgs {
      val address = segment.toRawLongValue()
      return SpatialManipulationStartedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SpatialManipulationStartedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
