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

@ABIMarker(AppBroadcastPlugInStateChangedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Capture.AppBroadcastPlugInStateChangedEventArgs;{4881d0f2-abc5-4fc6-84b0-89370bb47212})")
@WinRTByReference(brClass = AppBroadcastPlugInStateChangedEventArgs.ByReference::class)
public class AppBroadcastPlugInStateChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppBroadcastPlugInStateChangedEventArgs.WithDefault, IWinRTObject {
  private val __422106935_Interface: IAppBroadcastPlugInStateChangedEventArgs.WithDefault by lazy {
    as_422106935()
  }


  public override val __422106935_Ptr: JNAPointer? by lazy {
    __422106935_Interface.__422106935_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__422106935_Interface)

  private fun as_422106935(): IAppBroadcastPlugInStateChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAppBroadcastPlugInStateChangedEventArgs.ABI.makeIAppBroadcastPlugInStateChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBroadcastPlugInStateChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBroadcastPlugInStateChangedEventArgs.ABI.makeIAppBroadcastPlugInStateChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppBroadcastPlugInStateChangedEventArgs> {
    public override fun getValue() = AppBroadcastPlugInStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AppBroadcastPlugInStateChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBroadcastPlugInStateChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        AppBroadcastPlugInStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return AppBroadcastPlugInStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AppBroadcastPlugInStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
