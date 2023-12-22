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

@ABIMarker(AppCaptureDurationGeneratedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Capture.AppCaptureDurationGeneratedEventArgs;{c1f5563b-ffa1-44c9-975f-27fbeb553b35})")
@WinRTByReference(brClass = AppCaptureDurationGeneratedEventArgs.ByReference::class)
public class AppCaptureDurationGeneratedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppCaptureDurationGeneratedEventArgs.WithDefault, IWinRTObject {
  private val __451943449_Interface: IAppCaptureDurationGeneratedEventArgs.WithDefault by lazy {
    as_451943449()
  }


  public override val __451943449_Ptr: JNAPointer? by lazy {
    __451943449_Interface.__451943449_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__451943449_Interface)

  private fun as_451943449(): IAppCaptureDurationGeneratedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAppCaptureDurationGeneratedEventArgs.ABI.makeIAppCaptureDurationGeneratedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppCaptureDurationGeneratedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppCaptureDurationGeneratedEventArgs.ABI.makeIAppCaptureDurationGeneratedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppCaptureDurationGeneratedEventArgs> {
    public override fun getValue() = AppCaptureDurationGeneratedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AppCaptureDurationGeneratedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppCaptureDurationGeneratedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppCaptureDurationGeneratedEventArgs {
      val address = segment.toRawLongValue()
      return AppCaptureDurationGeneratedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AppCaptureDurationGeneratedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
