package Windows.Media.AppBroadcasting

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

@ABIMarker(AppBroadcastingStatus.ABI::class)
@Signature("rc(Windows.Media.AppBroadcasting.AppBroadcastingStatus;{1225e4df-03a1-42f8-8b80-c9228cd9cf2e})")
@WinRTByReference(brClass = AppBroadcastingStatus.ByReference::class)
public class AppBroadcastingStatus(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppBroadcastingStatus.WithDefault, IWinRTObject {
  private val __375206152_Interface: IAppBroadcastingStatus.WithDefault by lazy {
    as_375206152()
  }


  public override val __375206152_Ptr: JNAPointer? by lazy {
    __375206152_Interface.__375206152_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__375206152_Interface)

  private fun as_375206152(): IAppBroadcastingStatus.WithDefault {
    if(pointer == NULL) {
      return(IAppBroadcastingStatus.ABI.makeIAppBroadcastingStatus(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBroadcastingStatus>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBroadcastingStatus.ABI.makeIAppBroadcastingStatus(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppBroadcastingStatus> {
    public override fun getValue() = AppBroadcastingStatus(pointer.getPointer(0))

    public fun setValue(value: AppBroadcastingStatus): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBroadcastingStatus, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppBroadcastingStatus {
      val address = segment.toRawLongValue()
      return AppBroadcastingStatus(Pointer(address))
    }

    public override fun toNative(obj: AppBroadcastingStatus): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
