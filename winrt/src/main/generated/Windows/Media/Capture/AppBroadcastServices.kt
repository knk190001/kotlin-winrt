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

@ABIMarker(AppBroadcastServices.ABI::class)
@Signature("rc(Windows.Media.Capture.AppBroadcastServices;{8660b4d6-969b-4e3c-ac3a-8b042ee4ee63})")
@WinRTByReference(brClass = AppBroadcastServices.ByReference::class)
public class AppBroadcastServices(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppBroadcastServices.WithDefault, IWinRTObject {
  private val __1691631606_Interface: IAppBroadcastServices.WithDefault by lazy {
    as_1691631606()
  }


  public override val __1691631606_Ptr: JNAPointer? by lazy {
    __1691631606_Interface.__1691631606_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1691631606_Interface)

  private fun as_1691631606(): IAppBroadcastServices.WithDefault {
    if(pointer == NULL) {
      return(IAppBroadcastServices.ABI.makeIAppBroadcastServices(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBroadcastServices>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBroadcastServices.ABI.makeIAppBroadcastServices(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppBroadcastServices> {
    public override fun getValue() = AppBroadcastServices(pointer.getPointer(0))

    public fun setValue(value: AppBroadcastServices): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBroadcastServices, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppBroadcastServices {
      val address = segment.toRawLongValue()
      return AppBroadcastServices(Pointer(address))
    }

    public override fun toNative(obj: AppBroadcastServices): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
