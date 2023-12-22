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

@ABIMarker(ToastFailedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Notifications.ToastFailedEventArgs;{35176862-cfd4-44f8-ad64-f500fd896c3b})")
@WinRTByReference(brClass = ToastFailedEventArgs.ByReference::class)
public class ToastFailedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IToastFailedEventArgs.WithDefault, IWinRTObject {
  private val __164628003_Interface: IToastFailedEventArgs.WithDefault by lazy {
    as_164628003()
  }


  public override val __164628003_Ptr: JNAPointer? by lazy {
    __164628003_Interface.__164628003_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__164628003_Interface)

  private fun as_164628003(): IToastFailedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IToastFailedEventArgs.ABI.makeIToastFailedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToastFailedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastFailedEventArgs.ABI.makeIToastFailedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ToastFailedEventArgs> {
    public override fun getValue() = ToastFailedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ToastFailedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ToastFailedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ToastFailedEventArgs {
      val address = segment.toRawLongValue()
      return ToastFailedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ToastFailedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
