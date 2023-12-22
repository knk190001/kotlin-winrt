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

@ABIMarker(WindowingEnvironmentChangedEventArgs.ABI::class)
@Signature("rc(Windows.UI.WindowManagement.WindowingEnvironmentChangedEventArgs;{4160cfc6-023d-5e9a-b431-350e67dc978a})")
@WinRTByReference(brClass = WindowingEnvironmentChangedEventArgs.ByReference::class)
public class WindowingEnvironmentChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWindowingEnvironmentChangedEventArgs.WithDefault, IWinRTObject {
  private val __888774091_Interface: IWindowingEnvironmentChangedEventArgs.WithDefault by lazy {
    as_888774091()
  }


  public override val __888774091_Ptr: JNAPointer? by lazy {
    __888774091_Interface.__888774091_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__888774091_Interface)

  private fun as_888774091(): IWindowingEnvironmentChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWindowingEnvironmentChangedEventArgs.ABI.makeIWindowingEnvironmentChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWindowingEnvironmentChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWindowingEnvironmentChangedEventArgs.ABI.makeIWindowingEnvironmentChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WindowingEnvironmentChangedEventArgs> {
    public override fun getValue() = WindowingEnvironmentChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WindowingEnvironmentChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WindowingEnvironmentChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WindowingEnvironmentChangedEventArgs {
      val address = segment.toRawLongValue()
      return WindowingEnvironmentChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WindowingEnvironmentChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
