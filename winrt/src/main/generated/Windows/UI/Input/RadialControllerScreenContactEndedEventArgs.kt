package Windows.UI.Input

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

@ABIMarker(RadialControllerScreenContactEndedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Input.RadialControllerScreenContactEndedEventArgs;{3d577ef2-3cee-11e6-b535-001bdc06ab3b})")
@WinRTByReference(brClass = RadialControllerScreenContactEndedEventArgs.ByReference::class)
public class RadialControllerScreenContactEndedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRadialControllerScreenContactEndedEventArgs.WithDefault, IWinRTObject {
  private val __162292360_Interface: IRadialControllerScreenContactEndedEventArgs.WithDefault by
      lazy {
    as_162292360()
  }


  public override val __162292360_Ptr: JNAPointer? by lazy {
    __162292360_Interface.__162292360_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__162292360_Interface)

  private fun as_162292360(): IRadialControllerScreenContactEndedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRadialControllerScreenContactEndedEventArgs.ABI.makeIRadialControllerScreenContactEndedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRadialControllerScreenContactEndedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRadialControllerScreenContactEndedEventArgs.ABI.makeIRadialControllerScreenContactEndedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RadialControllerScreenContactEndedEventArgs> {
    public override fun getValue() =
        RadialControllerScreenContactEndedEventArgs(pointer.getPointer(0))

    public fun setValue(value: RadialControllerScreenContactEndedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RadialControllerScreenContactEndedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        RadialControllerScreenContactEndedEventArgs {
      val address = segment.toRawLongValue()
      return RadialControllerScreenContactEndedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RadialControllerScreenContactEndedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
