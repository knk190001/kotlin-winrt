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

@ABIMarker(ScheduledToastNotificationShowingEventArgs.ABI::class)
@Signature("rc(Windows.UI.Notifications.ScheduledToastNotificationShowingEventArgs;{6173f6b4-412a-5e2c-a6ed-a0209aef9a09})")
@WinRTByReference(brClass = ScheduledToastNotificationShowingEventArgs.ByReference::class)
public class ScheduledToastNotificationShowingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IScheduledToastNotificationShowingEventArgs.WithDefault, IWinRTObject {
  private val __141609575_Interface: IScheduledToastNotificationShowingEventArgs.WithDefault by
      lazy {
    as_141609575()
  }


  public override val __141609575_Ptr: JNAPointer? by lazy {
    __141609575_Interface.__141609575_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__141609575_Interface)

  private fun as_141609575(): IScheduledToastNotificationShowingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IScheduledToastNotificationShowingEventArgs.ABI.makeIScheduledToastNotificationShowingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScheduledToastNotificationShowingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScheduledToastNotificationShowingEventArgs.ABI.makeIScheduledToastNotificationShowingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ScheduledToastNotificationShowingEventArgs> {
    public override fun getValue() =
        ScheduledToastNotificationShowingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ScheduledToastNotificationShowingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScheduledToastNotificationShowingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        ScheduledToastNotificationShowingEventArgs {
      val address = segment.toRawLongValue()
      return ScheduledToastNotificationShowingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ScheduledToastNotificationShowingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
