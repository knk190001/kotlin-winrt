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

@ABIMarker(ToastNotificationActionTriggerDetail.ABI::class)
@Signature("rc(Windows.UI.Notifications.ToastNotificationActionTriggerDetail;{9445135a-38f3-42f6-96aa-7955b0f03da2})")
@WinRTByReference(brClass = ToastNotificationActionTriggerDetail.ByReference::class)
public class ToastNotificationActionTriggerDetail(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IToastNotificationActionTriggerDetail.WithDefault, IWinRTObject {
  private val __1979427825_Interface: IToastNotificationActionTriggerDetail.WithDefault by lazy {
    as_1979427825()
  }


  public override val __1979427825_Ptr: JNAPointer? by lazy {
    __1979427825_Interface.__1979427825_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1979427825_Interface)

  private fun as_1979427825(): IToastNotificationActionTriggerDetail.WithDefault {
    if(pointer == NULL) {
      return(IToastNotificationActionTriggerDetail.ABI.makeIToastNotificationActionTriggerDetail(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToastNotificationActionTriggerDetail>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastNotificationActionTriggerDetail.ABI.makeIToastNotificationActionTriggerDetail(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ToastNotificationActionTriggerDetail> {
    public override fun getValue() = ToastNotificationActionTriggerDetail(pointer.getPointer(0))

    public fun setValue(value: ToastNotificationActionTriggerDetail): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ToastNotificationActionTriggerDetail, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ToastNotificationActionTriggerDetail {
      val address = segment.toRawLongValue()
      return ToastNotificationActionTriggerDetail(Pointer(address))
    }

    public override fun toNative(obj: ToastNotificationActionTriggerDetail): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
