package Windows.UI.WebUI.Core

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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(WebUICommandBarIconButton.ABI::class)
@Signature("rc(Windows.UI.WebUI.Core.WebUICommandBarIconButton;{8f1bc93a-3a7c-4842-a0cf-aff6ea308586})")
@WinRTByReference(brClass = WebUICommandBarIconButton.ByReference::class)
public class WebUICommandBarIconButton(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebUICommandBarIconButton.WithDefault, IWebUICommandBarElement.WithDefault,
    IWinRTObject {
  private val __1307373530_Interface: IWebUICommandBarIconButton.WithDefault by lazy {
    as_1307373530()
  }


  private val __357838273_Interface: IWebUICommandBarElement.WithDefault by lazy {
    as_357838273()
  }


  public override val __1307373530_Ptr: JNAPointer? by lazy {
    __1307373530_Interface.__1307373530_Ptr
  }


  public override val __357838273_Ptr: JNAPointer? by lazy {
    __357838273_Interface.__357838273_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1307373530_Interface, __357838273_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1307373530(): IWebUICommandBarIconButton.WithDefault {
    if(pointer == NULL) {
      return(IWebUICommandBarIconButton.ABI.makeIWebUICommandBarIconButton(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebUICommandBarIconButton>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebUICommandBarIconButton.ABI.makeIWebUICommandBarIconButton(ref.value))
  }

  private fun as_357838273(): IWebUICommandBarElement.WithDefault {
    if(pointer == NULL) {
      return(IWebUICommandBarElement.ABI.makeIWebUICommandBarElement(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebUICommandBarElement>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebUICommandBarElement.ABI.makeIWebUICommandBarElement(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebUICommandBarIconButton> {
    public override fun getValue() = WebUICommandBarIconButton(pointer.getPointer(0))

    public fun setValue(value: WebUICommandBarIconButton): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebUICommandBarIconButton, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.WebUI.Core.WebUICommandBarIconButton".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): WebUICommandBarIconButton {
      val address = segment.toRawLongValue()
      return WebUICommandBarIconButton(Pointer(address))
    }

    public override fun toNative(obj: WebUICommandBarIconButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
