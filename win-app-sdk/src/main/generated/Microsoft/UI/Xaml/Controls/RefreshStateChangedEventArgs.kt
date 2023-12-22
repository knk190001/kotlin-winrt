package Microsoft.UI.Xaml.Controls

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

@ABIMarker(RefreshStateChangedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.RefreshStateChangedEventArgs;{7be897ce-17c4-5fdf-b441-c6ef3301e0f6})")
@WinRTByReference(brClass = RefreshStateChangedEventArgs.ByReference::class)
public class RefreshStateChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRefreshStateChangedEventArgs.WithDefault, IWinRTObject {
  private val __523156000_Interface: IRefreshStateChangedEventArgs.WithDefault by lazy {
    as_523156000()
  }


  public override val __523156000_Ptr: JNAPointer? by lazy {
    __523156000_Interface.__523156000_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__523156000_Interface)

  private fun as_523156000(): IRefreshStateChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRefreshStateChangedEventArgs.ABI.makeIRefreshStateChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRefreshStateChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRefreshStateChangedEventArgs.ABI.makeIRefreshStateChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RefreshStateChangedEventArgs> {
    public override fun getValue() = RefreshStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: RefreshStateChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RefreshStateChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RefreshStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return RefreshStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RefreshStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
