package Windows.ApplicationModel.Background

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

@ABIMarker(BackgroundTaskCompletedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Background.BackgroundTaskCompletedEventArgs;{565d25cf-f209-48f4-9967-2b184f7bfbf0})")
@WinRTByReference(brClass = BackgroundTaskCompletedEventArgs.ByReference::class)
public class BackgroundTaskCompletedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBackgroundTaskCompletedEventArgs.WithDefault, IWinRTObject {
  private val __2089873328_Interface: IBackgroundTaskCompletedEventArgs.WithDefault by lazy {
    as_2089873328()
  }


  public override val __2089873328_Ptr: JNAPointer? by lazy {
    __2089873328_Interface.__2089873328_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2089873328_Interface)

  private fun as_2089873328(): IBackgroundTaskCompletedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundTaskCompletedEventArgs.ABI.makeIBackgroundTaskCompletedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundTaskCompletedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundTaskCompletedEventArgs.ABI.makeIBackgroundTaskCompletedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BackgroundTaskCompletedEventArgs> {
    public override fun getValue() = BackgroundTaskCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: BackgroundTaskCompletedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BackgroundTaskCompletedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BackgroundTaskCompletedEventArgs {
      val address = segment.toRawLongValue()
      return BackgroundTaskCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: BackgroundTaskCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
