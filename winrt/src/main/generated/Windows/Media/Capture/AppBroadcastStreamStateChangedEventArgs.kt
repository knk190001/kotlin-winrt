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

@ABIMarker(AppBroadcastStreamStateChangedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Capture.AppBroadcastStreamStateChangedEventArgs;{5108a733-d008-4a89-93be-58aed961374e})")
@WinRTByReference(brClass = AppBroadcastStreamStateChangedEventArgs.ByReference::class)
public class AppBroadcastStreamStateChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppBroadcastStreamStateChangedEventArgs.WithDefault, IWinRTObject {
  private val __1960734020_Interface: IAppBroadcastStreamStateChangedEventArgs.WithDefault by lazy {
    as_1960734020()
  }


  public override val __1960734020_Ptr: JNAPointer? by lazy {
    __1960734020_Interface.__1960734020_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1960734020_Interface)

  private fun as_1960734020(): IAppBroadcastStreamStateChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAppBroadcastStreamStateChangedEventArgs.ABI.makeIAppBroadcastStreamStateChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBroadcastStreamStateChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBroadcastStreamStateChangedEventArgs.ABI.makeIAppBroadcastStreamStateChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppBroadcastStreamStateChangedEventArgs> {
    public override fun getValue() = AppBroadcastStreamStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AppBroadcastStreamStateChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBroadcastStreamStateChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        AppBroadcastStreamStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return AppBroadcastStreamStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AppBroadcastStreamStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
