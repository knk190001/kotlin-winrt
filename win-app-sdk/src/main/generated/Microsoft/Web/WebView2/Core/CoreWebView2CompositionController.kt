package Microsoft.Web.WebView2.Core

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CoreWebView2CompositionController.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2CompositionController;{8cef61b9-fa55-547d-aae6-7bcaed4249a2})")
@WinRTByReference(brClass = CoreWebView2CompositionController.ByReference::class)
public class CoreWebView2CompositionController(
  ptr: JNAPointer? = NULL
) : CoreWebView2Controller(ptr), ICoreWebView2CompositionController2.WithDefault,
    ICoreWebView2CompositionController3.WithDefault, ICoreWebView2CompositionController.WithDefault,
    IWinRTObject {
  private val __1659227341_Interface: ICoreWebView2CompositionController2.WithDefault by lazy {
    as_1659227341()
  }


  private val __1659227340_Interface: ICoreWebView2CompositionController3.WithDefault by lazy {
    as_1659227340()
  }


  private val __884807457_Interface: ICoreWebView2CompositionController.WithDefault by lazy {
    as_884807457()
  }


  public override val __1659227341_Ptr: JNAPointer? by lazy {
    __1659227341_Interface.__1659227341_Ptr
  }


  public override val __1659227340_Ptr: JNAPointer? by lazy {
    __1659227340_Interface.__1659227340_Ptr
  }


  public override val __884807457_Ptr: JNAPointer? by lazy {
    __884807457_Interface.__884807457_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1659227341_Interface, __1659227340_Interface, __884807457_Interface)

  private fun as_1659227341(): ICoreWebView2CompositionController2.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2CompositionController2.ABI.makeICoreWebView2CompositionController2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2CompositionController2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2CompositionController2.ABI.makeICoreWebView2CompositionController2(ref.value))
  }

  private fun as_1659227340(): ICoreWebView2CompositionController3.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2CompositionController3.ABI.makeICoreWebView2CompositionController3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2CompositionController3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2CompositionController3.ABI.makeICoreWebView2CompositionController3(ref.value))
  }

  private fun as_884807457(): ICoreWebView2CompositionController.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2CompositionController.ABI.makeICoreWebView2CompositionController(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2CompositionController>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2CompositionController.ABI.makeICoreWebView2CompositionController(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2CompositionController> {
    public override fun getValue() = CoreWebView2CompositionController(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2CompositionController): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2CompositionController, MemoryAddress> {
    public val ICoreWebView2CompositionControllerStatics2_Manual_Instance:
        ICoreWebView2CompositionControllerStatics2_Manual by lazy {
      createICoreWebView2CompositionControllerStatics2_Manual()
    }


    public val ICoreWebView2CompositionControllerStatics_Instance:
        ICoreWebView2CompositionControllerStatics by lazy {
      createICoreWebView2CompositionControllerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICoreWebView2CompositionControllerStatics2_Manual():
        ICoreWebView2CompositionControllerStatics2_Manual {
      val refiid = Guid.REFIID(ICoreWebView2CompositionControllerStatics2_Manual.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Web.WebView2.Core.CoreWebView2CompositionController".toHandle(),refiid,interfacePtr)
      val result =
          ICoreWebView2CompositionControllerStatics2_Manual.ABI.makeICoreWebView2CompositionControllerStatics2_Manual(interfacePtr.value)
      return result
    }

    public fun createICoreWebView2CompositionControllerStatics():
        ICoreWebView2CompositionControllerStatics {
      val refiid = Guid.REFIID(ICoreWebView2CompositionControllerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Web.WebView2.Core.CoreWebView2CompositionController".toHandle(),refiid,interfacePtr)
      val result =
          ICoreWebView2CompositionControllerStatics.ABI.makeICoreWebView2CompositionControllerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CoreWebView2CompositionController {
      val address = segment.toRawLongValue()
      return CoreWebView2CompositionController(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2CompositionController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object
}
