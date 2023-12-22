package Windows.Media.Protection

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

@ABIMarker(ComponentLoadFailedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Protection.ComponentLoadFailedEventArgs;{95972e93-7746-417e-8495-f031bbc5862c})")
@WinRTByReference(brClass = ComponentLoadFailedEventArgs.ByReference::class)
public class ComponentLoadFailedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IComponentLoadFailedEventArgs.WithDefault, IWinRTObject {
  private val __1828539634_Interface: IComponentLoadFailedEventArgs.WithDefault by lazy {
    as_1828539634()
  }


  public override val __1828539634_Ptr: JNAPointer? by lazy {
    __1828539634_Interface.__1828539634_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1828539634_Interface)

  private fun as_1828539634(): IComponentLoadFailedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IComponentLoadFailedEventArgs.ABI.makeIComponentLoadFailedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IComponentLoadFailedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IComponentLoadFailedEventArgs.ABI.makeIComponentLoadFailedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ComponentLoadFailedEventArgs> {
    public override fun getValue() = ComponentLoadFailedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ComponentLoadFailedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ComponentLoadFailedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ComponentLoadFailedEventArgs {
      val address = segment.toRawLongValue()
      return ComponentLoadFailedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ComponentLoadFailedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
