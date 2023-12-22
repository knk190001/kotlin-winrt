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

@ABIMarker(CoreWebView2PrintSettings.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2PrintSettings;{d2a97895-ca6e-57fc-905d-c6f77a081768})")
@WinRTByReference(brClass = CoreWebView2PrintSettings.ByReference::class)
public class CoreWebView2PrintSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2PrintSettings2.WithDefault,
    ICoreWebView2PrintSettings.WithDefault, IWinRTObject {
  private val __1356377495_Interface: ICoreWebView2PrintSettings2.WithDefault by lazy {
    as_1356377495()
  }


  private val __736490775_Interface: ICoreWebView2PrintSettings.WithDefault by lazy {
    as_736490775()
  }


  public override val __1356377495_Ptr: JNAPointer? by lazy {
    __1356377495_Interface.__1356377495_Ptr
  }


  public override val __736490775_Ptr: JNAPointer? by lazy {
    __736490775_Interface.__736490775_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1356377495_Interface, __736490775_Interface)

  private fun as_1356377495(): ICoreWebView2PrintSettings2.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2PrintSettings2.ABI.makeICoreWebView2PrintSettings2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2PrintSettings2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2PrintSettings2.ABI.makeICoreWebView2PrintSettings2(ref.value))
  }

  private fun as_736490775(): ICoreWebView2PrintSettings.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2PrintSettings.ABI.makeICoreWebView2PrintSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2PrintSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2PrintSettings.ABI.makeICoreWebView2PrintSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2PrintSettings> {
    public override fun getValue() = CoreWebView2PrintSettings(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2PrintSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2PrintSettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreWebView2PrintSettings {
      val address = segment.toRawLongValue()
      return CoreWebView2PrintSettings(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2PrintSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
