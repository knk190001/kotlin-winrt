package Windows.System

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

@ABIMarker(AppMemoryUsageLimitChangingEventArgs.ABI::class)
@Signature("rc(Windows.System.AppMemoryUsageLimitChangingEventArgs;{79f86664-feca-4da5-9e40-2bc63efdc979})")
@WinRTByReference(brClass = AppMemoryUsageLimitChangingEventArgs.ByReference::class)
public class AppMemoryUsageLimitChangingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppMemoryUsageLimitChangingEventArgs.WithDefault, IWinRTObject {
  private val __1600198339_Interface: IAppMemoryUsageLimitChangingEventArgs.WithDefault by lazy {
    as_1600198339()
  }


  public override val __1600198339_Ptr: JNAPointer? by lazy {
    __1600198339_Interface.__1600198339_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1600198339_Interface)

  private fun as_1600198339(): IAppMemoryUsageLimitChangingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAppMemoryUsageLimitChangingEventArgs.ABI.makeIAppMemoryUsageLimitChangingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppMemoryUsageLimitChangingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppMemoryUsageLimitChangingEventArgs.ABI.makeIAppMemoryUsageLimitChangingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppMemoryUsageLimitChangingEventArgs> {
    public override fun getValue() = AppMemoryUsageLimitChangingEventArgs(pointer.getPointer(0))

    public fun setValue(value: AppMemoryUsageLimitChangingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppMemoryUsageLimitChangingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppMemoryUsageLimitChangingEventArgs {
      val address = segment.toRawLongValue()
      return AppMemoryUsageLimitChangingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AppMemoryUsageLimitChangingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
