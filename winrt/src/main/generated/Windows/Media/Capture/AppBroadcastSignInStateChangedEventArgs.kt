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

@ABIMarker(AppBroadcastSignInStateChangedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Capture.AppBroadcastSignInStateChangedEventArgs;{02b692a4-5919-4a9e-8d5e-c9bb0dd3377a})")
@WinRTByReference(brClass = AppBroadcastSignInStateChangedEventArgs.ByReference::class)
public class AppBroadcastSignInStateChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppBroadcastSignInStateChangedEventArgs.WithDefault, IWinRTObject {
  private val __916788154_Interface: IAppBroadcastSignInStateChangedEventArgs.WithDefault by lazy {
    as_916788154()
  }


  public override val __916788154_Ptr: JNAPointer? by lazy {
    __916788154_Interface.__916788154_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__916788154_Interface)

  private fun as_916788154(): IAppBroadcastSignInStateChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAppBroadcastSignInStateChangedEventArgs.ABI.makeIAppBroadcastSignInStateChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBroadcastSignInStateChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBroadcastSignInStateChangedEventArgs.ABI.makeIAppBroadcastSignInStateChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppBroadcastSignInStateChangedEventArgs> {
    public override fun getValue() = AppBroadcastSignInStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AppBroadcastSignInStateChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBroadcastSignInStateChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        AppBroadcastSignInStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return AppBroadcastSignInStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AppBroadcastSignInStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
