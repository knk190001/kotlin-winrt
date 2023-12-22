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

@ABIMarker(CoreWebView2ControllerOptions.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2ControllerOptions;{41b69e93-cc17-5c7d-a0c8-fa21c27aadb6})")
@WinRTByReference(brClass = CoreWebView2ControllerOptions.ByReference::class)
public class CoreWebView2ControllerOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2ControllerOptions2.WithDefault,
    ICoreWebView2ControllerOptions.WithDefault, IWinRTObject {
  private val __155535433_Interface: ICoreWebView2ControllerOptions2.WithDefault by lazy {
    as_155535433()
  }


  private val __687719387_Interface: ICoreWebView2ControllerOptions.WithDefault by lazy {
    as_687719387()
  }


  public override val __155535433_Ptr: JNAPointer? by lazy {
    __155535433_Interface.__155535433_Ptr
  }


  public override val __687719387_Ptr: JNAPointer? by lazy {
    __687719387_Interface.__687719387_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__155535433_Interface, __687719387_Interface)

  private fun as_155535433(): ICoreWebView2ControllerOptions2.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2ControllerOptions2.ABI.makeICoreWebView2ControllerOptions2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2ControllerOptions2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2ControllerOptions2.ABI.makeICoreWebView2ControllerOptions2(ref.value))
  }

  private fun as_687719387(): ICoreWebView2ControllerOptions.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2ControllerOptions.ABI.makeICoreWebView2ControllerOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2ControllerOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2ControllerOptions.ABI.makeICoreWebView2ControllerOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2ControllerOptions> {
    public override fun getValue() = CoreWebView2ControllerOptions(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2ControllerOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2ControllerOptions, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreWebView2ControllerOptions {
      val address = segment.toRawLongValue()
      return CoreWebView2ControllerOptions(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2ControllerOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
