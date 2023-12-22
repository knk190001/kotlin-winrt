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

@ABIMarker(CoreWebView2Frame.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2Frame;{33dbc9c9-a103-56e3-b722-363814200320})")
@WinRTByReference(brClass = CoreWebView2Frame.ByReference::class)
public class CoreWebView2Frame(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2Frame2.WithDefault, ICoreWebView2Frame3.WithDefault,
    ICoreWebView2Frame4.WithDefault, ICoreWebView2Frame.WithDefault, IWinRTObject {
  private val __29555316_Interface: ICoreWebView2Frame2.WithDefault by lazy {
    as_29555316()
  }


  private val __29555315_Interface: ICoreWebView2Frame3.WithDefault by lazy {
    as_29555315()
  }


  private val __29555314_Interface: ICoreWebView2Frame4.WithDefault by lazy {
    as_29555314()
  }


  private val __968877926_Interface: ICoreWebView2Frame.WithDefault by lazy {
    as_968877926()
  }


  public override val __29555316_Ptr: JNAPointer? by lazy {
    __29555316_Interface.__29555316_Ptr
  }


  public override val __29555315_Ptr: JNAPointer? by lazy {
    __29555315_Interface.__29555315_Ptr
  }


  public override val __29555314_Ptr: JNAPointer? by lazy {
    __29555314_Interface.__29555314_Ptr
  }


  public override val __968877926_Ptr: JNAPointer? by lazy {
    __968877926_Interface.__968877926_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__29555316_Interface, __29555315_Interface, __29555314_Interface,
        __968877926_Interface)

  private fun as_29555316(): ICoreWebView2Frame2.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Frame2.ABI.makeICoreWebView2Frame2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Frame2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Frame2.ABI.makeICoreWebView2Frame2(ref.value))
  }

  private fun as_29555315(): ICoreWebView2Frame3.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Frame3.ABI.makeICoreWebView2Frame3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Frame3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Frame3.ABI.makeICoreWebView2Frame3(ref.value))
  }

  private fun as_29555314(): ICoreWebView2Frame4.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Frame4.ABI.makeICoreWebView2Frame4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Frame4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Frame4.ABI.makeICoreWebView2Frame4(ref.value))
  }

  private fun as_968877926(): ICoreWebView2Frame.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Frame.ABI.makeICoreWebView2Frame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Frame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Frame.ABI.makeICoreWebView2Frame(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2Frame> {
    public override fun getValue() = CoreWebView2Frame(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2Frame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2Frame, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreWebView2Frame {
      val address = segment.toRawLongValue()
      return CoreWebView2Frame(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2Frame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
