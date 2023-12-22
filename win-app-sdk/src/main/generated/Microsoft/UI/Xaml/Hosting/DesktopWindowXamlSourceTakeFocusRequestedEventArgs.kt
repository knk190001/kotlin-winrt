package Microsoft.UI.Xaml.Hosting

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

@ABIMarker(DesktopWindowXamlSourceTakeFocusRequestedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Hosting.DesktopWindowXamlSourceTakeFocusRequestedEventArgs;{4f5a0e2c-4ddc-5c03-939f-6f3bda560363})")
@WinRTByReference(brClass = DesktopWindowXamlSourceTakeFocusRequestedEventArgs.ByReference::class)
public class DesktopWindowXamlSourceTakeFocusRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDesktopWindowXamlSourceTakeFocusRequestedEventArgs.WithDefault, IWinRTObject
    {
  private val __186961722_Interface: IDesktopWindowXamlSourceTakeFocusRequestedEventArgs.WithDefault
      by lazy {
    as_186961722()
  }


  public override val __186961722_Ptr: JNAPointer? by lazy {
    __186961722_Interface.__186961722_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__186961722_Interface)

  private fun as_186961722(): IDesktopWindowXamlSourceTakeFocusRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDesktopWindowXamlSourceTakeFocusRequestedEventArgs.ABI.makeIDesktopWindowXamlSourceTakeFocusRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDesktopWindowXamlSourceTakeFocusRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDesktopWindowXamlSourceTakeFocusRequestedEventArgs.ABI.makeIDesktopWindowXamlSourceTakeFocusRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DesktopWindowXamlSourceTakeFocusRequestedEventArgs> {
    public override fun getValue() =
        DesktopWindowXamlSourceTakeFocusRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: DesktopWindowXamlSourceTakeFocusRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DesktopWindowXamlSourceTakeFocusRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        DesktopWindowXamlSourceTakeFocusRequestedEventArgs {
      val address = segment.toRawLongValue()
      return DesktopWindowXamlSourceTakeFocusRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DesktopWindowXamlSourceTakeFocusRequestedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
