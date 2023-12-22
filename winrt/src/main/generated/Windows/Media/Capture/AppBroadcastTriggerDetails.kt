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

@ABIMarker(AppBroadcastTriggerDetails.ABI::class)
@Signature("rc(Windows.Media.Capture.AppBroadcastTriggerDetails;{deebab35-ec5e-4d8f-b1c0-5da6e8c75638})")
@WinRTByReference(brClass = AppBroadcastTriggerDetails.ByReference::class)
public class AppBroadcastTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppBroadcastTriggerDetails.WithDefault, IWinRTObject {
  private val __1989145346_Interface: IAppBroadcastTriggerDetails.WithDefault by lazy {
    as_1989145346()
  }


  public override val __1989145346_Ptr: JNAPointer? by lazy {
    __1989145346_Interface.__1989145346_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1989145346_Interface)

  private fun as_1989145346(): IAppBroadcastTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IAppBroadcastTriggerDetails.ABI.makeIAppBroadcastTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBroadcastTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBroadcastTriggerDetails.ABI.makeIAppBroadcastTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppBroadcastTriggerDetails> {
    public override fun getValue() = AppBroadcastTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: AppBroadcastTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBroadcastTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppBroadcastTriggerDetails {
      val address = segment.toRawLongValue()
      return AppBroadcastTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: AppBroadcastTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
