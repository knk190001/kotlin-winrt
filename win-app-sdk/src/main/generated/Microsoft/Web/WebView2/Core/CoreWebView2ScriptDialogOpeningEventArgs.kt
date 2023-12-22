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

@ABIMarker(CoreWebView2ScriptDialogOpeningEventArgs.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2ScriptDialogOpeningEventArgs;{a4315212-c7eb-568a-86e4-c61e31ba6cda})")
@WinRTByReference(brClass = CoreWebView2ScriptDialogOpeningEventArgs.ByReference::class)
public class CoreWebView2ScriptDialogOpeningEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2ScriptDialogOpeningEventArgs.WithDefault, IWinRTObject {
  private val __136972775_Interface: ICoreWebView2ScriptDialogOpeningEventArgs.WithDefault by lazy {
    as_136972775()
  }


  public override val __136972775_Ptr: JNAPointer? by lazy {
    __136972775_Interface.__136972775_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__136972775_Interface)

  private fun as_136972775(): ICoreWebView2ScriptDialogOpeningEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2ScriptDialogOpeningEventArgs.ABI.makeICoreWebView2ScriptDialogOpeningEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2ScriptDialogOpeningEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2ScriptDialogOpeningEventArgs.ABI.makeICoreWebView2ScriptDialogOpeningEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2ScriptDialogOpeningEventArgs> {
    public override fun getValue() = CoreWebView2ScriptDialogOpeningEventArgs(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2ScriptDialogOpeningEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2ScriptDialogOpeningEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        CoreWebView2ScriptDialogOpeningEventArgs {
      val address = segment.toRawLongValue()
      return CoreWebView2ScriptDialogOpeningEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2ScriptDialogOpeningEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
