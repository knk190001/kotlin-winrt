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

@ABIMarker(AppWindowClosedEventArgs.ABI::class)
@Signature("rc(Windows.UI.WindowManagement.AppWindowClosedEventArgs;{cc7df816-9520-5a06-821e-456ad8b358aa})")
@WinRTByReference(brClass = AppWindowClosedEventArgs.ByReference::class)
public class AppWindowClosedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppWindowClosedEventArgs.WithDefault, IWinRTObject {
  private val __1284663295_Interface: IAppWindowClosedEventArgs.WithDefault by lazy {
    as_1284663295()
  }


  public override val __1284663295_Ptr: JNAPointer? by lazy {
    __1284663295_Interface.__1284663295_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1284663295_Interface)

  private fun as_1284663295(): IAppWindowClosedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAppWindowClosedEventArgs.ABI.makeIAppWindowClosedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppWindowClosedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppWindowClosedEventArgs.ABI.makeIAppWindowClosedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppWindowClosedEventArgs> {
    public override fun getValue() = AppWindowClosedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AppWindowClosedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppWindowClosedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppWindowClosedEventArgs {
      val address = segment.toRawLongValue()
      return AppWindowClosedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AppWindowClosedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
