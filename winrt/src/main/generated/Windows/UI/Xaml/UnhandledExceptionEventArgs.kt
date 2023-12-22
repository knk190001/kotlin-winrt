package Windows.UI.Xaml

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

@ABIMarker(UnhandledExceptionEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.UnhandledExceptionEventArgs;{7230269c-054e-4cf3-86c5-be90eb6863d5})")
@WinRTByReference(brClass = UnhandledExceptionEventArgs.ByReference::class)
public class UnhandledExceptionEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUnhandledExceptionEventArgs.WithDefault, IWinRTObject {
  private val __730954407_Interface: IUnhandledExceptionEventArgs.WithDefault by lazy {
    as_730954407()
  }


  public override val __730954407_Ptr: JNAPointer? by lazy {
    __730954407_Interface.__730954407_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__730954407_Interface)

  private fun as_730954407(): IUnhandledExceptionEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IUnhandledExceptionEventArgs.ABI.makeIUnhandledExceptionEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUnhandledExceptionEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUnhandledExceptionEventArgs.ABI.makeIUnhandledExceptionEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UnhandledExceptionEventArgs> {
    public override fun getValue() = UnhandledExceptionEventArgs(pointer.getPointer(0))

    public fun setValue(value: UnhandledExceptionEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UnhandledExceptionEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UnhandledExceptionEventArgs {
      val address = segment.toRawLongValue()
      return UnhandledExceptionEventArgs(Pointer(address))
    }

    public override fun toNative(obj: UnhandledExceptionEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
