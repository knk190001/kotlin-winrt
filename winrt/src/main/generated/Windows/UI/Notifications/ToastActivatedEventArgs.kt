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

@ABIMarker(ToastActivatedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Notifications.ToastActivatedEventArgs;{e3bf92f3-c197-436f-8265-0625824f8dac})")
@WinRTByReference(brClass = ToastActivatedEventArgs.ByReference::class)
public class ToastActivatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IToastActivatedEventArgs.WithDefault, IToastActivatedEventArgs2.WithDefault,
    IWinRTObject {
  private val __1770532899_Interface: IToastActivatedEventArgs.WithDefault by lazy {
    as_1770532899()
  }


  private val __948055029_Interface: IToastActivatedEventArgs2.WithDefault by lazy {
    as_948055029()
  }


  public override val __1770532899_Ptr: JNAPointer? by lazy {
    __1770532899_Interface.__1770532899_Ptr
  }


  public override val __948055029_Ptr: JNAPointer? by lazy {
    __948055029_Interface.__948055029_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1770532899_Interface, __948055029_Interface)

  private fun as_1770532899(): IToastActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IToastActivatedEventArgs.ABI.makeIToastActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToastActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastActivatedEventArgs.ABI.makeIToastActivatedEventArgs(ref.value))
  }

  private fun as_948055029(): IToastActivatedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IToastActivatedEventArgs2.ABI.makeIToastActivatedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToastActivatedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastActivatedEventArgs2.ABI.makeIToastActivatedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ToastActivatedEventArgs> {
    public override fun getValue() = ToastActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ToastActivatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ToastActivatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ToastActivatedEventArgs {
      val address = segment.toRawLongValue()
      return ToastActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ToastActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
