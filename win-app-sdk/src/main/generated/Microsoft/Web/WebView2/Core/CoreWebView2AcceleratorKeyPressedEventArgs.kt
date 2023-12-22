package Microsoft.Web.WebView2.Core

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

@ABIMarker(CoreWebView2AcceleratorKeyPressedEventArgs.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2AcceleratorKeyPressedEventArgs;{41a56100-92a5-59d1-9e71-9222e33ae38b})")
@WinRTByReference(brClass = CoreWebView2AcceleratorKeyPressedEventArgs.ByReference::class)
public class CoreWebView2AcceleratorKeyPressedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2AcceleratorKeyPressedEventArgs.WithDefault, IWinRTObject {
  private val __1319670992_Interface: ICoreWebView2AcceleratorKeyPressedEventArgs.WithDefault by
      lazy {
    as_1319670992()
  }


  public override val __1319670992_Ptr: JNAPointer? by lazy {
    __1319670992_Interface.__1319670992_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1319670992_Interface)

  private fun as_1319670992(): ICoreWebView2AcceleratorKeyPressedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2AcceleratorKeyPressedEventArgs.ABI.makeICoreWebView2AcceleratorKeyPressedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2AcceleratorKeyPressedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2AcceleratorKeyPressedEventArgs.ABI.makeICoreWebView2AcceleratorKeyPressedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2AcceleratorKeyPressedEventArgs> {
    public override fun getValue() =
        CoreWebView2AcceleratorKeyPressedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2AcceleratorKeyPressedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2AcceleratorKeyPressedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        CoreWebView2AcceleratorKeyPressedEventArgs {
      val address = segment.toRawLongValue()
      return CoreWebView2AcceleratorKeyPressedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2AcceleratorKeyPressedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
