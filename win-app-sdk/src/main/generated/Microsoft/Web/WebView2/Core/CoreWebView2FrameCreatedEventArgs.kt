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

@ABIMarker(CoreWebView2FrameCreatedEventArgs.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2FrameCreatedEventArgs;{527b01b8-fc6d-5543-8dce-96cdfdb32c81})")
@WinRTByReference(brClass = CoreWebView2FrameCreatedEventArgs.ByReference::class)
public class CoreWebView2FrameCreatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2FrameCreatedEventArgs.WithDefault, IWinRTObject {
  private val __260349931_Interface: ICoreWebView2FrameCreatedEventArgs.WithDefault by lazy {
    as_260349931()
  }


  public override val __260349931_Ptr: JNAPointer? by lazy {
    __260349931_Interface.__260349931_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__260349931_Interface)

  private fun as_260349931(): ICoreWebView2FrameCreatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2FrameCreatedEventArgs.ABI.makeICoreWebView2FrameCreatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2FrameCreatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2FrameCreatedEventArgs.ABI.makeICoreWebView2FrameCreatedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2FrameCreatedEventArgs> {
    public override fun getValue() = CoreWebView2FrameCreatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2FrameCreatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2FrameCreatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreWebView2FrameCreatedEventArgs {
      val address = segment.toRawLongValue()
      return CoreWebView2FrameCreatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2FrameCreatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
