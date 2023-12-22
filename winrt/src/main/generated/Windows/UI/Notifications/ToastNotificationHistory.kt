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

@ABIMarker(ToastNotificationHistory.ABI::class)
@Signature("rc(Windows.UI.Notifications.ToastNotificationHistory;{3bc3d253-2f31-4092-9129-8ad5abf067da})")
@WinRTByReference(brClass = ToastNotificationHistory.ByReference::class)
public class ToastNotificationHistory(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IToastNotificationHistory2.WithDefault, IToastNotificationHistory.WithDefault,
    IWinRTObject {
  private val __759629184_Interface: IToastNotificationHistory2.WithDefault by lazy {
    as_759629184()
  }


  private val __1271430158_Interface: IToastNotificationHistory.WithDefault by lazy {
    as_1271430158()
  }


  public override val __759629184_Ptr: JNAPointer? by lazy {
    __759629184_Interface.__759629184_Ptr
  }


  public override val __1271430158_Ptr: JNAPointer? by lazy {
    __1271430158_Interface.__1271430158_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__759629184_Interface, __1271430158_Interface)

  private fun as_759629184(): IToastNotificationHistory2.WithDefault {
    if(pointer == NULL) {
      return(IToastNotificationHistory2.ABI.makeIToastNotificationHistory2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToastNotificationHistory2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastNotificationHistory2.ABI.makeIToastNotificationHistory2(ref.value))
  }

  private fun as_1271430158(): IToastNotificationHistory.WithDefault {
    if(pointer == NULL) {
      return(IToastNotificationHistory.ABI.makeIToastNotificationHistory(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToastNotificationHistory>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastNotificationHistory.ABI.makeIToastNotificationHistory(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ToastNotificationHistory> {
    public override fun getValue() = ToastNotificationHistory(pointer.getPointer(0))

    public fun setValue(value: ToastNotificationHistory): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ToastNotificationHistory, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ToastNotificationHistory {
      val address = segment.toRawLongValue()
      return ToastNotificationHistory(Pointer(address))
    }

    public override fun toNative(obj: ToastNotificationHistory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
