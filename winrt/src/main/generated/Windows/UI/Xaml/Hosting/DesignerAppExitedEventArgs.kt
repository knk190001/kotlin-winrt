package Windows.UI.Xaml.Hosting

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

@ABIMarker(DesignerAppExitedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Hosting.DesignerAppExitedEventArgs;{f6aac86a-0cad-410c-8f62-dc2936151c74})")
@WinRTByReference(brClass = DesignerAppExitedEventArgs.ByReference::class)
public class DesignerAppExitedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDesignerAppExitedEventArgs.WithDefault, IWinRTObject {
  private val __781100266_Interface: IDesignerAppExitedEventArgs.WithDefault by lazy {
    as_781100266()
  }


  public override val __781100266_Ptr: JNAPointer? by lazy {
    __781100266_Interface.__781100266_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__781100266_Interface)

  private fun as_781100266(): IDesignerAppExitedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDesignerAppExitedEventArgs.ABI.makeIDesignerAppExitedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDesignerAppExitedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDesignerAppExitedEventArgs.ABI.makeIDesignerAppExitedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DesignerAppExitedEventArgs> {
    public override fun getValue() = DesignerAppExitedEventArgs(pointer.getPointer(0))

    public fun setValue(value: DesignerAppExitedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DesignerAppExitedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DesignerAppExitedEventArgs {
      val address = segment.toRawLongValue()
      return DesignerAppExitedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DesignerAppExitedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
