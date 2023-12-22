package Microsoft.Windows.AppNotifications

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

@ABIMarker(AppNotificationActivatedEventArgs.ABI::class)
@Signature("rc(Microsoft.Windows.AppNotifications.AppNotificationActivatedEventArgs;{7a8afaf9-31cb-51d5-82be-db6bd5878b77})")
@WinRTByReference(brClass = AppNotificationActivatedEventArgs.ByReference::class)
public class AppNotificationActivatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppNotificationActivatedEventArgs.WithDefault,
    IAppNotificationActivatedEventArgs2.WithDefault, IWinRTObject {
  private val __1077417083_Interface: IAppNotificationActivatedEventArgs.WithDefault by lazy {
    as_1077417083()
  }


  private val __959808745_Interface: IAppNotificationActivatedEventArgs2.WithDefault by lazy {
    as_959808745()
  }


  public override val __1077417083_Ptr: JNAPointer? by lazy {
    __1077417083_Interface.__1077417083_Ptr
  }


  public override val __959808745_Ptr: JNAPointer? by lazy {
    __959808745_Interface.__959808745_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1077417083_Interface, __959808745_Interface)

  private fun as_1077417083(): IAppNotificationActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAppNotificationActivatedEventArgs.ABI.makeIAppNotificationActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppNotificationActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppNotificationActivatedEventArgs.ABI.makeIAppNotificationActivatedEventArgs(ref.value))
  }

  private fun as_959808745(): IAppNotificationActivatedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IAppNotificationActivatedEventArgs2.ABI.makeIAppNotificationActivatedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppNotificationActivatedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppNotificationActivatedEventArgs2.ABI.makeIAppNotificationActivatedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppNotificationActivatedEventArgs> {
    public override fun getValue() = AppNotificationActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AppNotificationActivatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppNotificationActivatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppNotificationActivatedEventArgs {
      val address = segment.toRawLongValue()
      return AppNotificationActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AppNotificationActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
