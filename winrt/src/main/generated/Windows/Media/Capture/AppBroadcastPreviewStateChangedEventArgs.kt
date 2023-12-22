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

@ABIMarker(AppBroadcastPreviewStateChangedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Capture.AppBroadcastPreviewStateChangedEventArgs;{5a57f2de-8dea-4e86-90ad-03fc26b9653c})")
@WinRTByReference(brClass = AppBroadcastPreviewStateChangedEventArgs.ByReference::class)
public class AppBroadcastPreviewStateChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppBroadcastPreviewStateChangedEventArgs.WithDefault, IWinRTObject {
  private val __132036004_Interface: IAppBroadcastPreviewStateChangedEventArgs.WithDefault by lazy {
    as_132036004()
  }


  public override val __132036004_Ptr: JNAPointer? by lazy {
    __132036004_Interface.__132036004_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__132036004_Interface)

  private fun as_132036004(): IAppBroadcastPreviewStateChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAppBroadcastPreviewStateChangedEventArgs.ABI.makeIAppBroadcastPreviewStateChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBroadcastPreviewStateChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBroadcastPreviewStateChangedEventArgs.ABI.makeIAppBroadcastPreviewStateChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppBroadcastPreviewStateChangedEventArgs> {
    public override fun getValue() = AppBroadcastPreviewStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AppBroadcastPreviewStateChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBroadcastPreviewStateChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        AppBroadcastPreviewStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return AppBroadcastPreviewStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AppBroadcastPreviewStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
