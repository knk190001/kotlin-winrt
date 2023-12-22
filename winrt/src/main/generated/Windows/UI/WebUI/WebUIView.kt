package Windows.UI.WebUI

import Windows.Foundation.Uri
import Windows.Web.UI.IWebViewControl
import Windows.Web.UI.IWebViewControl2
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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(WebUIView.ABI::class)
@Signature("rc(Windows.UI.WebUI.WebUIView;{6783f64f-52da-4fd7-be69-8ef6284b423c})")
@WinRTByReference(brClass = WebUIView.ByReference::class)
public class WebUIView(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebUIView.WithDefault, IWebViewControl.WithDefault,
    IWebViewControl2.WithDefault, IWinRTObject {
  private val __268045763_Interface: IWebUIView.WithDefault by lazy {
    as_268045763()
  }


  private val __66234092_Interface: IWebViewControl.WithDefault by lazy {
    as_66234092()
  }


  private val __2053256802_Interface: IWebViewControl2.WithDefault by lazy {
    as_2053256802()
  }


  public override val __268045763_Ptr: JNAPointer? by lazy {
    __268045763_Interface.__268045763_Ptr
  }


  public override val __66234092_Ptr: JNAPointer? by lazy {
    __66234092_Interface.__66234092_Ptr
  }


  public override val __2053256802_Ptr: JNAPointer? by lazy {
    __2053256802_Interface.__2053256802_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__268045763_Interface, __66234092_Interface, __2053256802_Interface)

  private fun as_268045763(): IWebUIView.WithDefault {
    if(pointer == NULL) {
      return(IWebUIView.ABI.makeIWebUIView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebUIView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebUIView.ABI.makeIWebUIView(ref.value))
  }

  private fun as_66234092(): IWebViewControl.WithDefault {
    if(pointer == NULL) {
      return(IWebViewControl.ABI.makeIWebViewControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewControl.ABI.makeIWebViewControl(ref.value))
  }

  private fun as_2053256802(): IWebViewControl2.WithDefault {
    if(pointer == NULL) {
      return(IWebViewControl2.ABI.makeIWebViewControl2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewControl2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewControl2.ABI.makeIWebViewControl2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<WebUIView> {
    public override fun getValue() = WebUIView(pointer.getPointer(0))

    public fun setValue(value: WebUIView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebUIView, MemoryAddress> {
    public val IWebUIViewStatics_Instance: IWebUIViewStatics by lazy {
      createIWebUIViewStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWebUIViewStatics(): IWebUIViewStatics {
      val refiid = Guid.REFIID(IWebUIViewStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.WebUI.WebUIView".toHandle(),refiid,interfacePtr)
      val result = IWebUIViewStatics.ABI.makeIWebUIViewStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): WebUIView {
      val address = segment.toRawLongValue()
      return WebUIView(Pointer(address))
    }

    public override fun toNative(obj: WebUIView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateAsync() = ABI.IWebUIViewStatics_Instance.CreateAsync()

    public fun CreateAsync(uri: Uri) = ABI.IWebUIViewStatics_Instance.CreateAsync(uri)
  }
}
