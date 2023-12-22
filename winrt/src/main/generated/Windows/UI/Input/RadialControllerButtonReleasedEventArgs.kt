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

@ABIMarker(RadialControllerButtonReleasedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Input.RadialControllerButtonReleasedEventArgs;{3d577eef-3cee-11e6-b535-001bdc06ab3b})")
@WinRTByReference(brClass = RadialControllerButtonReleasedEventArgs.ByReference::class)
public class RadialControllerButtonReleasedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRadialControllerButtonReleasedEventArgs.WithDefault, IWinRTObject {
  private val __1539614049_Interface: IRadialControllerButtonReleasedEventArgs.WithDefault by lazy {
    as_1539614049()
  }


  public override val __1539614049_Ptr: JNAPointer? by lazy {
    __1539614049_Interface.__1539614049_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1539614049_Interface)

  private fun as_1539614049(): IRadialControllerButtonReleasedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRadialControllerButtonReleasedEventArgs.ABI.makeIRadialControllerButtonReleasedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRadialControllerButtonReleasedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRadialControllerButtonReleasedEventArgs.ABI.makeIRadialControllerButtonReleasedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RadialControllerButtonReleasedEventArgs> {
    public override fun getValue() = RadialControllerButtonReleasedEventArgs(pointer.getPointer(0))

    public fun setValue(value: RadialControllerButtonReleasedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RadialControllerButtonReleasedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        RadialControllerButtonReleasedEventArgs {
      val address = segment.toRawLongValue()
      return RadialControllerButtonReleasedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RadialControllerButtonReleasedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
