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

@ABIMarker(CoreWebView2PermissionRequestedEventArgs.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2PermissionRequestedEventArgs;{a6652fba-ebe5-5891-addc-cb37da8f7e66})")
@WinRTByReference(brClass = CoreWebView2PermissionRequestedEventArgs.ByReference::class)
public class CoreWebView2PermissionRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2PermissionRequestedEventArgs2.WithDefault,
    ICoreWebView2PermissionRequestedEventArgs3.WithDefault,
    ICoreWebView2PermissionRequestedEventArgs.WithDefault, IWinRTObject {
  private val __479570125_Interface: ICoreWebView2PermissionRequestedEventArgs2.WithDefault by
      lazy {
    as_479570125()
  }


  private val __479570124_Interface: ICoreWebView2PermissionRequestedEventArgs3.WithDefault by
      lazy {
    as_479570124()
  }


  private val __677266655_Interface: ICoreWebView2PermissionRequestedEventArgs.WithDefault by lazy {
    as_677266655()
  }


  public override val __479570125_Ptr: JNAPointer? by lazy {
    __479570125_Interface.__479570125_Ptr
  }


  public override val __479570124_Ptr: JNAPointer? by lazy {
    __479570124_Interface.__479570124_Ptr
  }


  public override val __677266655_Ptr: JNAPointer? by lazy {
    __677266655_Interface.__677266655_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__479570125_Interface, __479570124_Interface, __677266655_Interface)

  private fun as_479570125(): ICoreWebView2PermissionRequestedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2PermissionRequestedEventArgs2.ABI.makeICoreWebView2PermissionRequestedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2PermissionRequestedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2PermissionRequestedEventArgs2.ABI.makeICoreWebView2PermissionRequestedEventArgs2(ref.value))
  }

  private fun as_479570124(): ICoreWebView2PermissionRequestedEventArgs3.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2PermissionRequestedEventArgs3.ABI.makeICoreWebView2PermissionRequestedEventArgs3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2PermissionRequestedEventArgs3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2PermissionRequestedEventArgs3.ABI.makeICoreWebView2PermissionRequestedEventArgs3(ref.value))
  }

  private fun as_677266655(): ICoreWebView2PermissionRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2PermissionRequestedEventArgs.ABI.makeICoreWebView2PermissionRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2PermissionRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2PermissionRequestedEventArgs.ABI.makeICoreWebView2PermissionRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2PermissionRequestedEventArgs> {
    public override fun getValue() = CoreWebView2PermissionRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2PermissionRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2PermissionRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        CoreWebView2PermissionRequestedEventArgs {
      val address = segment.toRawLongValue()
      return CoreWebView2PermissionRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2PermissionRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
