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

@ABIMarker(BackgroundTaskProgressEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Background.BackgroundTaskProgressEventArgs;{fb1468ac-8332-4d0a-9532-03eae684da31})")
@WinRTByReference(brClass = BackgroundTaskProgressEventArgs.ByReference::class)
public class BackgroundTaskProgressEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBackgroundTaskProgressEventArgs.WithDefault, IWinRTObject {
  private val __524820666_Interface: IBackgroundTaskProgressEventArgs.WithDefault by lazy {
    as_524820666()
  }


  public override val __524820666_Ptr: JNAPointer? by lazy {
    __524820666_Interface.__524820666_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__524820666_Interface)

  private fun as_524820666(): IBackgroundTaskProgressEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundTaskProgressEventArgs.ABI.makeIBackgroundTaskProgressEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundTaskProgressEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundTaskProgressEventArgs.ABI.makeIBackgroundTaskProgressEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BackgroundTaskProgressEventArgs> {
    public override fun getValue() = BackgroundTaskProgressEventArgs(pointer.getPointer(0))

    public fun setValue(value: BackgroundTaskProgressEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BackgroundTaskProgressEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BackgroundTaskProgressEventArgs {
      val address = segment.toRawLongValue()
      return BackgroundTaskProgressEventArgs(Pointer(address))
    }

    public override fun toNative(obj: BackgroundTaskProgressEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
