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

@ABIMarker(RadialControllerButtonHoldingEventArgs.ABI::class)
@Signature("rc(Windows.UI.Input.RadialControllerButtonHoldingEventArgs;{3d577eee-3cee-11e6-b535-001bdc06ab3b})")
@WinRTByReference(brClass = RadialControllerButtonHoldingEventArgs.ByReference::class)
public class RadialControllerButtonHoldingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRadialControllerButtonHoldingEventArgs.WithDefault, IWinRTObject {
  private val __1153458769_Interface: IRadialControllerButtonHoldingEventArgs.WithDefault by lazy {
    as_1153458769()
  }


  public override val __1153458769_Ptr: JNAPointer? by lazy {
    __1153458769_Interface.__1153458769_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1153458769_Interface)

  private fun as_1153458769(): IRadialControllerButtonHoldingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRadialControllerButtonHoldingEventArgs.ABI.makeIRadialControllerButtonHoldingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRadialControllerButtonHoldingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRadialControllerButtonHoldingEventArgs.ABI.makeIRadialControllerButtonHoldingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RadialControllerButtonHoldingEventArgs> {
    public override fun getValue() = RadialControllerButtonHoldingEventArgs(pointer.getPointer(0))

    public fun setValue(value: RadialControllerButtonHoldingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RadialControllerButtonHoldingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RadialControllerButtonHoldingEventArgs {
      val address = segment.toRawLongValue()
      return RadialControllerButtonHoldingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RadialControllerButtonHoldingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
