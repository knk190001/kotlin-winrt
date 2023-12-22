package Windows.Phone.Notification.Management

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

@ABIMarker(AppNotificationInfo.ABI::class)
@Signature("rc(Windows.Phone.Notification.Management.AppNotificationInfo;{2157bea5-e286-45d3-9bea-f790fc216e0e})")
@WinRTByReference(brClass = AppNotificationInfo.ByReference::class)
public class AppNotificationInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppNotificationInfo.WithDefault, IWinRTObject {
  private val __101068756_Interface: IAppNotificationInfo.WithDefault by lazy {
    as_101068756()
  }


  public override val __101068756_Ptr: JNAPointer? by lazy {
    __101068756_Interface.__101068756_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__101068756_Interface)

  private fun as_101068756(): IAppNotificationInfo.WithDefault {
    if(pointer == NULL) {
      return(IAppNotificationInfo.ABI.makeIAppNotificationInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppNotificationInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppNotificationInfo.ABI.makeIAppNotificationInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppNotificationInfo> {
    public override fun getValue() = AppNotificationInfo(pointer.getPointer(0))

    public fun setValue(value: AppNotificationInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppNotificationInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppNotificationInfo {
      val address = segment.toRawLongValue()
      return AppNotificationInfo(Pointer(address))
    }

    public override fun toNative(obj: AppNotificationInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
