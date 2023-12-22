package Windows.Networking.BackgroundTransfer

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

@ABIMarker(BackgroundTransferRangesDownloadedEventArgs.ABI::class)
@Signature("rc(Windows.Networking.BackgroundTransfer.BackgroundTransferRangesDownloadedEventArgs;{3ebc7453-bf48-4a88-9248-b0c165184f5c})")
@WinRTByReference(brClass = BackgroundTransferRangesDownloadedEventArgs.ByReference::class)
public class BackgroundTransferRangesDownloadedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBackgroundTransferRangesDownloadedEventArgs.WithDefault, IWinRTObject {
  private val __1569936736_Interface: IBackgroundTransferRangesDownloadedEventArgs.WithDefault by
      lazy {
    as_1569936736()
  }


  public override val __1569936736_Ptr: JNAPointer? by lazy {
    __1569936736_Interface.__1569936736_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1569936736_Interface)

  private fun as_1569936736(): IBackgroundTransferRangesDownloadedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundTransferRangesDownloadedEventArgs.ABI.makeIBackgroundTransferRangesDownloadedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundTransferRangesDownloadedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundTransferRangesDownloadedEventArgs.ABI.makeIBackgroundTransferRangesDownloadedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BackgroundTransferRangesDownloadedEventArgs> {
    public override fun getValue() =
        BackgroundTransferRangesDownloadedEventArgs(pointer.getPointer(0))

    public fun setValue(value: BackgroundTransferRangesDownloadedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BackgroundTransferRangesDownloadedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        BackgroundTransferRangesDownloadedEventArgs {
      val address = segment.toRawLongValue()
      return BackgroundTransferRangesDownloadedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: BackgroundTransferRangesDownloadedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
