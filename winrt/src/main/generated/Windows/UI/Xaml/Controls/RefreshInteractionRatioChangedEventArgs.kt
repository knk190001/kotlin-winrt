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

@ABIMarker(RefreshInteractionRatioChangedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.RefreshInteractionRatioChangedEventArgs;{d7e47820-dc47-4b8e-bb27-7f0a83f29a07})")
@WinRTByReference(brClass = RefreshInteractionRatioChangedEventArgs.ByReference::class)
public class RefreshInteractionRatioChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRefreshInteractionRatioChangedEventArgs.WithDefault, IWinRTObject {
  private val __877119707_Interface: IRefreshInteractionRatioChangedEventArgs.WithDefault by lazy {
    as_877119707()
  }


  public override val __877119707_Ptr: JNAPointer? by lazy {
    __877119707_Interface.__877119707_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__877119707_Interface)

  private fun as_877119707(): IRefreshInteractionRatioChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRefreshInteractionRatioChangedEventArgs.ABI.makeIRefreshInteractionRatioChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRefreshInteractionRatioChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRefreshInteractionRatioChangedEventArgs.ABI.makeIRefreshInteractionRatioChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RefreshInteractionRatioChangedEventArgs> {
    public override fun getValue() = RefreshInteractionRatioChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: RefreshInteractionRatioChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RefreshInteractionRatioChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        RefreshInteractionRatioChangedEventArgs {
      val address = segment.toRawLongValue()
      return RefreshInteractionRatioChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RefreshInteractionRatioChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
