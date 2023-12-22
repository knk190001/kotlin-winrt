package Windows.Media.Capture

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

@ABIMarker(AppBroadcastBackgroundService.ABI::class)
@Signature("rc(Windows.Media.Capture.AppBroadcastBackgroundService;{bad1e72a-fa94-46f9-95fc-d71511cda70b})")
@WinRTByReference(brClass = AppBroadcastBackgroundService.ByReference::class)
public class AppBroadcastBackgroundService(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppBroadcastBackgroundService.WithDefault,
    IAppBroadcastBackgroundService2.WithDefault, IWinRTObject {
  private val __870405391_Interface: IAppBroadcastBackgroundService.WithDefault by lazy {
    as_870405391()
  }


  private val __1212763395_Interface: IAppBroadcastBackgroundService2.WithDefault by lazy {
    as_1212763395()
  }


  public override val __870405391_Ptr: JNAPointer? by lazy {
    __870405391_Interface.__870405391_Ptr
  }


  public override val __1212763395_Ptr: JNAPointer? by lazy {
    __1212763395_Interface.__1212763395_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__870405391_Interface, __1212763395_Interface)

  private fun as_870405391(): IAppBroadcastBackgroundService.WithDefault {
    if(pointer == NULL) {
      return(IAppBroadcastBackgroundService.ABI.makeIAppBroadcastBackgroundService(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBroadcastBackgroundService>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBroadcastBackgroundService.ABI.makeIAppBroadcastBackgroundService(ref.value))
  }

  private fun as_1212763395(): IAppBroadcastBackgroundService2.WithDefault {
    if(pointer == NULL) {
      return(IAppBroadcastBackgroundService2.ABI.makeIAppBroadcastBackgroundService2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBroadcastBackgroundService2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBroadcastBackgroundService2.ABI.makeIAppBroadcastBackgroundService2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppBroadcastBackgroundService> {
    public override fun getValue() = AppBroadcastBackgroundService(pointer.getPointer(0))

    public fun setValue(value: AppBroadcastBackgroundService): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBroadcastBackgroundService, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppBroadcastBackgroundService {
      val address = segment.toRawLongValue()
      return AppBroadcastBackgroundService(Pointer(address))
    }

    public override fun toNative(obj: AppBroadcastBackgroundService): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
