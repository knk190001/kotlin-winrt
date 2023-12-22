package Windows.UI.Xaml.Controls

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

@ABIMarker(RefreshRequestedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.RefreshRequestedEventArgs;{1b089f43-cfcf-4ac6-b31f-8dab6eefdd93})")
@WinRTByReference(brClass = RefreshRequestedEventArgs.ByReference::class)
public class RefreshRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRefreshRequestedEventArgs.WithDefault, IWinRTObject {
  private val __152209512_Interface: IRefreshRequestedEventArgs.WithDefault by lazy {
    as_152209512()
  }


  public override val __152209512_Ptr: JNAPointer? by lazy {
    __152209512_Interface.__152209512_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__152209512_Interface)

  private fun as_152209512(): IRefreshRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRefreshRequestedEventArgs.ABI.makeIRefreshRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRefreshRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRefreshRequestedEventArgs.ABI.makeIRefreshRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RefreshRequestedEventArgs> {
    public override fun getValue() = RefreshRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: RefreshRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RefreshRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RefreshRequestedEventArgs {
      val address = segment.toRawLongValue()
      return RefreshRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RefreshRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
