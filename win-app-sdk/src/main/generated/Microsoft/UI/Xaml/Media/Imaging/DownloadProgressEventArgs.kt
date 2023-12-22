package Microsoft.UI.Xaml.Media.Imaging

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

@ABIMarker(DownloadProgressEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Imaging.DownloadProgressEventArgs;{9a0ea80b-1a17-50d5-83f3-377738212619})")
@WinRTByReference(brClass = DownloadProgressEventArgs.ByReference::class)
public class DownloadProgressEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDownloadProgressEventArgs.WithDefault, IWinRTObject {
  private val __520567045_Interface: IDownloadProgressEventArgs.WithDefault by lazy {
    as_520567045()
  }


  public override val __520567045_Ptr: JNAPointer? by lazy {
    __520567045_Interface.__520567045_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__520567045_Interface)

  private fun as_520567045(): IDownloadProgressEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDownloadProgressEventArgs.ABI.makeIDownloadProgressEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDownloadProgressEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDownloadProgressEventArgs.ABI.makeIDownloadProgressEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DownloadProgressEventArgs> {
    public override fun getValue() = DownloadProgressEventArgs(pointer.getPointer(0))

    public fun setValue(value: DownloadProgressEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DownloadProgressEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DownloadProgressEventArgs {
      val address = segment.toRawLongValue()
      return DownloadProgressEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DownloadProgressEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
