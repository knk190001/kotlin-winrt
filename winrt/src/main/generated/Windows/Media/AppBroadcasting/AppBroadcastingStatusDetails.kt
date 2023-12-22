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

@ABIMarker(AppBroadcastingStatusDetails.ABI::class)
@Signature("rc(Windows.Media.AppBroadcasting.AppBroadcastingStatusDetails;{069dada4-b573-4e3c-8e19-1bafacd09713})")
@WinRTByReference(brClass = AppBroadcastingStatusDetails.ByReference::class)
public class AppBroadcastingStatusDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppBroadcastingStatusDetails.WithDefault, IWinRTObject {
  private val __261196758_Interface: IAppBroadcastingStatusDetails.WithDefault by lazy {
    as_261196758()
  }


  public override val __261196758_Ptr: JNAPointer? by lazy {
    __261196758_Interface.__261196758_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__261196758_Interface)

  private fun as_261196758(): IAppBroadcastingStatusDetails.WithDefault {
    if(pointer == NULL) {
      return(IAppBroadcastingStatusDetails.ABI.makeIAppBroadcastingStatusDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBroadcastingStatusDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBroadcastingStatusDetails.ABI.makeIAppBroadcastingStatusDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppBroadcastingStatusDetails> {
    public override fun getValue() = AppBroadcastingStatusDetails(pointer.getPointer(0))

    public fun setValue(value: AppBroadcastingStatusDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBroadcastingStatusDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppBroadcastingStatusDetails {
      val address = segment.toRawLongValue()
      return AppBroadcastingStatusDetails(Pointer(address))
    }

    public override fun toNative(obj: AppBroadcastingStatusDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
