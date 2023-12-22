package Windows.UI.WindowManagement

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

@ABIMarker(WindowingEnvironmentRemovedEventArgs.ABI::class)
@Signature("rc(Windows.UI.WindowManagement.WindowingEnvironmentRemovedEventArgs;{2e5b5473-beff-5e53-9316-7e775fe568b3})")
@WinRTByReference(brClass = WindowingEnvironmentRemovedEventArgs.ByReference::class)
public class WindowingEnvironmentRemovedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWindowingEnvironmentRemovedEventArgs.WithDefault, IWinRTObject {
  private val __1464109471_Interface: IWindowingEnvironmentRemovedEventArgs.WithDefault by lazy {
    as_1464109471()
  }


  public override val __1464109471_Ptr: JNAPointer? by lazy {
    __1464109471_Interface.__1464109471_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1464109471_Interface)

  private fun as_1464109471(): IWindowingEnvironmentRemovedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWindowingEnvironmentRemovedEventArgs.ABI.makeIWindowingEnvironmentRemovedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWindowingEnvironmentRemovedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWindowingEnvironmentRemovedEventArgs.ABI.makeIWindowingEnvironmentRemovedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WindowingEnvironmentRemovedEventArgs> {
    public override fun getValue() = WindowingEnvironmentRemovedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WindowingEnvironmentRemovedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WindowingEnvironmentRemovedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WindowingEnvironmentRemovedEventArgs {
      val address = segment.toRawLongValue()
      return WindowingEnvironmentRemovedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WindowingEnvironmentRemovedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
