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

@ABIMarker(CoreWebView2WebMessageReceivedEventArgs.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2WebMessageReceivedEventArgs;{71dc5fa0-08a0-5dea-9363-799df5021452})")
@WinRTByReference(brClass = CoreWebView2WebMessageReceivedEventArgs.ByReference::class)
public class CoreWebView2WebMessageReceivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2WebMessageReceivedEventArgs2.WithDefault,
    ICoreWebView2WebMessageReceivedEventArgs.WithDefault, IWinRTObject {
  private val __1853609622_Interface: ICoreWebView2WebMessageReceivedEventArgs2.WithDefault by
      lazy {
    as_1853609622()
  }


  private val __1187132132_Interface: ICoreWebView2WebMessageReceivedEventArgs.WithDefault by lazy {
    as_1187132132()
  }


  public override val __1853609622_Ptr: JNAPointer? by lazy {
    __1853609622_Interface.__1853609622_Ptr
  }


  public override val __1187132132_Ptr: JNAPointer? by lazy {
    __1187132132_Interface.__1187132132_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1853609622_Interface, __1187132132_Interface)

  private fun as_1853609622(): ICoreWebView2WebMessageReceivedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2WebMessageReceivedEventArgs2.ABI.makeICoreWebView2WebMessageReceivedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2WebMessageReceivedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2WebMessageReceivedEventArgs2.ABI.makeICoreWebView2WebMessageReceivedEventArgs2(ref.value))
  }

  private fun as_1187132132(): ICoreWebView2WebMessageReceivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2WebMessageReceivedEventArgs.ABI.makeICoreWebView2WebMessageReceivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2WebMessageReceivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2WebMessageReceivedEventArgs.ABI.makeICoreWebView2WebMessageReceivedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2WebMessageReceivedEventArgs> {
    public override fun getValue() = CoreWebView2WebMessageReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2WebMessageReceivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2WebMessageReceivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        CoreWebView2WebMessageReceivedEventArgs {
      val address = segment.toRawLongValue()
      return CoreWebView2WebMessageReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2WebMessageReceivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
