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

@ABIMarker(CoreWebView2Certificate.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2Certificate;{4b9b0fe5-0ad9-5594-81e7-b18ecc0636de})")
@WinRTByReference(brClass = CoreWebView2Certificate.ByReference::class)
public class CoreWebView2Certificate(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), CoreWebView2Certificate_Manual.WithDefault,
    ICoreWebView2Certificate.WithDefault, IWinRTObject {
  private val __1313909984_Interface: CoreWebView2Certificate_Manual.WithDefault by lazy {
    as_1313909984()
  }


  private val __1835376432_Interface: ICoreWebView2Certificate.WithDefault by lazy {
    as_1835376432()
  }


  public override val __1313909984_Ptr: JNAPointer? by lazy {
    __1313909984_Interface.__1313909984_Ptr
  }


  public override val __1835376432_Ptr: JNAPointer? by lazy {
    __1835376432_Interface.__1835376432_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1313909984_Interface, __1835376432_Interface)

  private fun as_1313909984(): CoreWebView2Certificate_Manual.WithDefault {
    if(pointer == NULL) {
      return(CoreWebView2Certificate_Manual.ABI.makeCoreWebView2Certificate_Manual(NULL))
    }
    val refiid = Guid.REFIID(guidOf<CoreWebView2Certificate_Manual>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(CoreWebView2Certificate_Manual.ABI.makeCoreWebView2Certificate_Manual(ref.value))
  }

  private fun as_1835376432(): ICoreWebView2Certificate.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Certificate.ABI.makeICoreWebView2Certificate(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Certificate>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Certificate.ABI.makeICoreWebView2Certificate(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2Certificate> {
    public override fun getValue() = CoreWebView2Certificate(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2Certificate): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2Certificate, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreWebView2Certificate {
      val address = segment.toRawLongValue()
      return CoreWebView2Certificate(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2Certificate): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
