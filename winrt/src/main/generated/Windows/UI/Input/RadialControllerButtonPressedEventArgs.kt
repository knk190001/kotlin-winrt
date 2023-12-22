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

@ABIMarker(RadialControllerButtonPressedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Input.RadialControllerButtonPressedEventArgs;{3d577eed-4cee-11e6-b535-001bdc06ab3b})")
@WinRTByReference(brClass = RadialControllerButtonPressedEventArgs.ByReference::class)
public class RadialControllerButtonPressedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRadialControllerButtonPressedEventArgs.WithDefault, IWinRTObject {
  private val __704150736_Interface: IRadialControllerButtonPressedEventArgs.WithDefault by lazy {
    as_704150736()
  }


  public override val __704150736_Ptr: JNAPointer? by lazy {
    __704150736_Interface.__704150736_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__704150736_Interface)

  private fun as_704150736(): IRadialControllerButtonPressedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRadialControllerButtonPressedEventArgs.ABI.makeIRadialControllerButtonPressedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRadialControllerButtonPressedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRadialControllerButtonPressedEventArgs.ABI.makeIRadialControllerButtonPressedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RadialControllerButtonPressedEventArgs> {
    public override fun getValue() = RadialControllerButtonPressedEventArgs(pointer.getPointer(0))

    public fun setValue(value: RadialControllerButtonPressedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RadialControllerButtonPressedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RadialControllerButtonPressedEventArgs {
      val address = segment.toRawLongValue()
      return RadialControllerButtonPressedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RadialControllerButtonPressedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
