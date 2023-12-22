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

@ABIMarker(WindowingEnvironmentAddedEventArgs.ABI::class)
@Signature("rc(Windows.UI.WindowManagement.WindowingEnvironmentAddedEventArgs;{ff2a5b7f-f183-5c66-99b2-429082069299})")
@WinRTByReference(brClass = WindowingEnvironmentAddedEventArgs.ByReference::class)
public class WindowingEnvironmentAddedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWindowingEnvironmentAddedEventArgs.WithDefault, IWinRTObject {
  private val __388216575_Interface: IWindowingEnvironmentAddedEventArgs.WithDefault by lazy {
    as_388216575()
  }


  public override val __388216575_Ptr: JNAPointer? by lazy {
    __388216575_Interface.__388216575_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__388216575_Interface)

  private fun as_388216575(): IWindowingEnvironmentAddedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWindowingEnvironmentAddedEventArgs.ABI.makeIWindowingEnvironmentAddedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWindowingEnvironmentAddedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWindowingEnvironmentAddedEventArgs.ABI.makeIWindowingEnvironmentAddedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WindowingEnvironmentAddedEventArgs> {
    public override fun getValue() = WindowingEnvironmentAddedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WindowingEnvironmentAddedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WindowingEnvironmentAddedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WindowingEnvironmentAddedEventArgs {
      val address = segment.toRawLongValue()
      return WindowingEnvironmentAddedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WindowingEnvironmentAddedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
