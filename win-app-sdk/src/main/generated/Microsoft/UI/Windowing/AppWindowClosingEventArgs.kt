package Microsoft.UI.Windowing

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

@ABIMarker(AppWindowClosingEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Windowing.AppWindowClosingEventArgs;{0e09d90b-2261-590b-9ad1-8504991d8754})")
@WinRTByReference(brClass = AppWindowClosingEventArgs.ByReference::class)
public class AppWindowClosingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppWindowClosingEventArgs.WithDefault, IWinRTObject {
  private val __1537881406_Interface: IAppWindowClosingEventArgs.WithDefault by lazy {
    as_1537881406()
  }


  public override val __1537881406_Ptr: JNAPointer? by lazy {
    __1537881406_Interface.__1537881406_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1537881406_Interface)

  private fun as_1537881406(): IAppWindowClosingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAppWindowClosingEventArgs.ABI.makeIAppWindowClosingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppWindowClosingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppWindowClosingEventArgs.ABI.makeIAppWindowClosingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppWindowClosingEventArgs> {
    public override fun getValue() = AppWindowClosingEventArgs(pointer.getPointer(0))

    public fun setValue(value: AppWindowClosingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppWindowClosingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppWindowClosingEventArgs {
      val address = segment.toRawLongValue()
      return AppWindowClosingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AppWindowClosingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
