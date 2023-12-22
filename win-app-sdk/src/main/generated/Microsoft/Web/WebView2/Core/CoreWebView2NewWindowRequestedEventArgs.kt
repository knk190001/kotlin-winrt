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

@ABIMarker(CoreWebView2NewWindowRequestedEventArgs.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2NewWindowRequestedEventArgs;{f4806259-e63a-5c0b-a02c-5f10e11094f4})")
@WinRTByReference(brClass = CoreWebView2NewWindowRequestedEventArgs.ByReference::class)
public class CoreWebView2NewWindowRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2NewWindowRequestedEventArgs2.WithDefault,
    ICoreWebView2NewWindowRequestedEventArgs.WithDefault, IWinRTObject {
  private val __90774368_Interface: ICoreWebView2NewWindowRequestedEventArgs2.WithDefault by lazy {
    as_90774368()
  }


  private val __1105450450_Interface: ICoreWebView2NewWindowRequestedEventArgs.WithDefault by lazy {
    as_1105450450()
  }


  public override val __90774368_Ptr: JNAPointer? by lazy {
    __90774368_Interface.__90774368_Ptr
  }


  public override val __1105450450_Ptr: JNAPointer? by lazy {
    __1105450450_Interface.__1105450450_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__90774368_Interface, __1105450450_Interface)

  private fun as_90774368(): ICoreWebView2NewWindowRequestedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2NewWindowRequestedEventArgs2.ABI.makeICoreWebView2NewWindowRequestedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2NewWindowRequestedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2NewWindowRequestedEventArgs2.ABI.makeICoreWebView2NewWindowRequestedEventArgs2(ref.value))
  }

  private fun as_1105450450(): ICoreWebView2NewWindowRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2NewWindowRequestedEventArgs.ABI.makeICoreWebView2NewWindowRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2NewWindowRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2NewWindowRequestedEventArgs.ABI.makeICoreWebView2NewWindowRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2NewWindowRequestedEventArgs> {
    public override fun getValue() = CoreWebView2NewWindowRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2NewWindowRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2NewWindowRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        CoreWebView2NewWindowRequestedEventArgs {
      val address = segment.toRawLongValue()
      return CoreWebView2NewWindowRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2NewWindowRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
