package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Media.TileBrush
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(WebViewBrush.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.WebViewBrush;{40e86f75-0cf4-4b72-a4d6-cf5d15780116})")
@WinRTByReference(brClass = WebViewBrush.ByReference::class)
public class WebViewBrush(
  ptr: JNAPointer? = NULL
) : TileBrush(ptr), IWebViewBrush.WithDefault, IWinRTObject {
  private val __1059795133_Interface: IWebViewBrush.WithDefault by lazy {
    as_1059795133()
  }


  public override val __1059795133_Ptr: JNAPointer? by lazy {
    __1059795133_Interface.__1059795133_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1059795133_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1059795133(): IWebViewBrush.WithDefault {
    if(pointer == NULL) {
      return(IWebViewBrush.ABI.makeIWebViewBrush(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewBrush>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewBrush.ABI.makeIWebViewBrush(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<WebViewBrush> {
    public override fun getValue() = WebViewBrush(pointer.getPointer(0))

    public fun setValue(value: WebViewBrush): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebViewBrush, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IWebViewBrushStatics_Instance: IWebViewBrushStatics by lazy {
      createIWebViewBrushStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.WebViewBrush".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIWebViewBrushStatics(): IWebViewBrushStatics {
      val refiid = Guid.REFIID(IWebViewBrushStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.WebViewBrush".toHandle(),refiid,interfacePtr)
      val result = IWebViewBrushStatics.ABI.makeIWebViewBrushStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): WebViewBrush {
      val address = segment.toRawLongValue()
      return WebViewBrush(Pointer(address))
    }

    public override fun toNative(obj: WebViewBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_SourceNameProperty() = ABI.IWebViewBrushStatics_Instance.get_SourceNameProperty()
  }
}
