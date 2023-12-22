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

@ABIMarker(CoreWebView2Controller.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2Controller;{0069c40b-2e8a-513f-9d9d-e0c2b64f7200})")
@WinRTByReference(brClass = CoreWebView2Controller.ByReference::class)
public open class CoreWebView2Controller(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2Controller2.WithDefault, ICoreWebView2Controller3.WithDefault,
    ICoreWebView2Controller4.WithDefault, ICoreWebView2PrivatePartialController.WithDefault,
    ICoreWebView2Controller.WithDefault, IWinRTObject {
  private val __1207357617_Interface: ICoreWebView2Controller2.WithDefault by lazy {
    as_1207357617()
  }


  private val __1207357616_Interface: ICoreWebView2Controller3.WithDefault by lazy {
    as_1207357616()
  }


  private val __1207357615_Interface: ICoreWebView2Controller4.WithDefault by lazy {
    as_1207357615()
  }


  private val __1032679969_Interface: ICoreWebView2PrivatePartialController.WithDefault by lazy {
    as_1032679969()
  }


  private val __515242307_Interface: ICoreWebView2Controller.WithDefault by lazy {
    as_515242307()
  }


  public override val __1207357617_Ptr: JNAPointer? by lazy {
    __1207357617_Interface.__1207357617_Ptr
  }


  public override val __1207357616_Ptr: JNAPointer? by lazy {
    __1207357616_Interface.__1207357616_Ptr
  }


  public override val __1207357615_Ptr: JNAPointer? by lazy {
    __1207357615_Interface.__1207357615_Ptr
  }


  public override val __1032679969_Ptr: JNAPointer? by lazy {
    __1032679969_Interface.__1032679969_Ptr
  }


  public override val __515242307_Ptr: JNAPointer? by lazy {
    __515242307_Interface.__515242307_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1207357617_Interface, __1207357616_Interface, __1207357615_Interface,
        __1032679969_Interface, __515242307_Interface)

  private fun as_1207357617(): ICoreWebView2Controller2.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Controller2.ABI.makeICoreWebView2Controller2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Controller2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Controller2.ABI.makeICoreWebView2Controller2(ref.value))
  }

  private fun as_1207357616(): ICoreWebView2Controller3.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Controller3.ABI.makeICoreWebView2Controller3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Controller3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Controller3.ABI.makeICoreWebView2Controller3(ref.value))
  }

  private fun as_1207357615(): ICoreWebView2Controller4.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Controller4.ABI.makeICoreWebView2Controller4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Controller4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Controller4.ABI.makeICoreWebView2Controller4(ref.value))
  }

  private fun as_1032679969(): ICoreWebView2PrivatePartialController.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2PrivatePartialController.ABI.makeICoreWebView2PrivatePartialController(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2PrivatePartialController>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2PrivatePartialController.ABI.makeICoreWebView2PrivatePartialController(ref.value))
  }

  private fun as_515242307(): ICoreWebView2Controller.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Controller.ABI.makeICoreWebView2Controller(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Controller>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Controller.ABI.makeICoreWebView2Controller(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2Controller> {
    public override fun getValue() = CoreWebView2Controller(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2Controller): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2Controller, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreWebView2Controller {
      val address = segment.toRawLongValue()
      return CoreWebView2Controller(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2Controller): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
