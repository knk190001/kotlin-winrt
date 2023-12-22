package Windows.UI.Notifications

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

@ABIMarker(ToastDismissedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Notifications.ToastDismissedEventArgs;{3f89d935-d9cb-4538-a0f0-ffe7659938f8})")
@WinRTByReference(brClass = ToastDismissedEventArgs.ByReference::class)
public class ToastDismissedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IToastDismissedEventArgs.WithDefault, IWinRTObject {
  private val __1824126971_Interface: IToastDismissedEventArgs.WithDefault by lazy {
    as_1824126971()
  }


  public override val __1824126971_Ptr: JNAPointer? by lazy {
    __1824126971_Interface.__1824126971_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1824126971_Interface)

  private fun as_1824126971(): IToastDismissedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IToastDismissedEventArgs.ABI.makeIToastDismissedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToastDismissedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastDismissedEventArgs.ABI.makeIToastDismissedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ToastDismissedEventArgs> {
    public override fun getValue() = ToastDismissedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ToastDismissedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ToastDismissedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ToastDismissedEventArgs {
      val address = segment.toRawLongValue()
      return ToastDismissedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ToastDismissedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
