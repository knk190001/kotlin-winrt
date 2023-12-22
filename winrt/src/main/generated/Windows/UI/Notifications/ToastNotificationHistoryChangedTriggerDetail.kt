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

@ABIMarker(ToastNotificationHistoryChangedTriggerDetail.ABI::class)
@Signature("rc(Windows.UI.Notifications.ToastNotificationHistoryChangedTriggerDetail;{db037ffa-0068-412c-9c83-267c37f65670})")
@WinRTByReference(brClass = ToastNotificationHistoryChangedTriggerDetail.ByReference::class)
public class ToastNotificationHistoryChangedTriggerDetail(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IToastNotificationHistoryChangedTriggerDetail.WithDefault,
    IToastNotificationHistoryChangedTriggerDetail2.WithDefault, IWinRTObject {
  private val __416500967_Interface: IToastNotificationHistoryChangedTriggerDetail.WithDefault by
      lazy {
    as_416500967()
  }


  private val __26628139_Interface: IToastNotificationHistoryChangedTriggerDetail2.WithDefault by
      lazy {
    as_26628139()
  }


  public override val __416500967_Ptr: JNAPointer? by lazy {
    __416500967_Interface.__416500967_Ptr
  }


  public override val __26628139_Ptr: JNAPointer? by lazy {
    __26628139_Interface.__26628139_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__416500967_Interface, __26628139_Interface)

  private fun as_416500967(): IToastNotificationHistoryChangedTriggerDetail.WithDefault {
    if(pointer == NULL) {
      return(IToastNotificationHistoryChangedTriggerDetail.ABI.makeIToastNotificationHistoryChangedTriggerDetail(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToastNotificationHistoryChangedTriggerDetail>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastNotificationHistoryChangedTriggerDetail.ABI.makeIToastNotificationHistoryChangedTriggerDetail(ref.value))
  }

  private fun as_26628139(): IToastNotificationHistoryChangedTriggerDetail2.WithDefault {
    if(pointer == NULL) {
      return(IToastNotificationHistoryChangedTriggerDetail2.ABI.makeIToastNotificationHistoryChangedTriggerDetail2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToastNotificationHistoryChangedTriggerDetail2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastNotificationHistoryChangedTriggerDetail2.ABI.makeIToastNotificationHistoryChangedTriggerDetail2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ToastNotificationHistoryChangedTriggerDetail> {
    public override fun getValue() =
        ToastNotificationHistoryChangedTriggerDetail(pointer.getPointer(0))

    public fun setValue(value: ToastNotificationHistoryChangedTriggerDetail): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ToastNotificationHistoryChangedTriggerDetail, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        ToastNotificationHistoryChangedTriggerDetail {
      val address = segment.toRawLongValue()
      return ToastNotificationHistoryChangedTriggerDetail(Pointer(address))
    }

    public override fun toNative(obj: ToastNotificationHistoryChangedTriggerDetail): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
