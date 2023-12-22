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

@ABIMarker(AppWindowCloseRequestedEventArgs.ABI::class)
@Signature("rc(Windows.UI.WindowManagement.AppWindowCloseRequestedEventArgs;{e9ff01da-e7a2-57a8-8b5e-39c4003afdbb})")
@WinRTByReference(brClass = AppWindowCloseRequestedEventArgs.ByReference::class)
public class AppWindowCloseRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppWindowCloseRequestedEventArgs.WithDefault, IWinRTObject {
  private val __1063798185_Interface: IAppWindowCloseRequestedEventArgs.WithDefault by lazy {
    as_1063798185()
  }


  public override val __1063798185_Ptr: JNAPointer? by lazy {
    __1063798185_Interface.__1063798185_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1063798185_Interface)

  private fun as_1063798185(): IAppWindowCloseRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAppWindowCloseRequestedEventArgs.ABI.makeIAppWindowCloseRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppWindowCloseRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppWindowCloseRequestedEventArgs.ABI.makeIAppWindowCloseRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppWindowCloseRequestedEventArgs> {
    public override fun getValue() = AppWindowCloseRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AppWindowCloseRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppWindowCloseRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppWindowCloseRequestedEventArgs {
      val address = segment.toRawLongValue()
      return AppWindowCloseRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AppWindowCloseRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
