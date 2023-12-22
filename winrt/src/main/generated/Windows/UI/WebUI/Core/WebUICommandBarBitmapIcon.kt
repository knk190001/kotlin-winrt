package Windows.UI.WebUI.Core

import Windows.Foundation.Uri
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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(WebUICommandBarBitmapIcon.ABI::class)
@Signature("rc(Windows.UI.WebUI.Core.WebUICommandBarBitmapIcon;{858f4f45-08d8-4a46-81ec-00015b0b1c6c})")
@WinRTByReference(brClass = WebUICommandBarBitmapIcon.ByReference::class)
public class WebUICommandBarBitmapIcon(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebUICommandBarBitmapIcon.WithDefault, IWebUICommandBarIcon.WithDefault,
    IWinRTObject {
  private val __2068369053_Interface: IWebUICommandBarBitmapIcon.WithDefault by lazy {
    as_2068369053()
  }


  private val __1332685780_Interface: IWebUICommandBarIcon.WithDefault by lazy {
    as_1332685780()
  }


  public override val __2068369053_Ptr: JNAPointer? by lazy {
    __2068369053_Interface.__2068369053_Ptr
  }


  public override val __1332685780_Ptr: JNAPointer? by lazy {
    __1332685780_Interface.__1332685780_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2068369053_Interface, __1332685780_Interface)

  public constructor() : this(ABI.activate())

  public constructor(uri: Uri) : this(ABI.activate(uri))

  private fun as_2068369053(): IWebUICommandBarBitmapIcon.WithDefault {
    if(pointer == NULL) {
      return(IWebUICommandBarBitmapIcon.ABI.makeIWebUICommandBarBitmapIcon(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebUICommandBarBitmapIcon>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebUICommandBarBitmapIcon.ABI.makeIWebUICommandBarBitmapIcon(ref.value))
  }

  private fun as_1332685780(): IWebUICommandBarIcon.WithDefault {
    if(pointer == NULL) {
      return(IWebUICommandBarIcon.ABI.makeIWebUICommandBarIcon(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebUICommandBarIcon>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebUICommandBarIcon.ABI.makeIWebUICommandBarIcon(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebUICommandBarBitmapIcon> {
    public override fun getValue() = WebUICommandBarBitmapIcon(pointer.getPointer(0))

    public fun setValue(value: WebUICommandBarBitmapIcon): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebUICommandBarBitmapIcon, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IWebUICommandBarBitmapIconFactory_Instance: IWebUICommandBarBitmapIconFactory by
        lazy {
      createIWebUICommandBarBitmapIconFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.WebUI.Core.WebUICommandBarBitmapIcon".toHandle(),
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

    public fun createIWebUICommandBarBitmapIconFactory(): IWebUICommandBarBitmapIconFactory {
      val refiid = Guid.REFIID(IWebUICommandBarBitmapIconFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.WebUI.Core.WebUICommandBarBitmapIcon".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IWebUICommandBarBitmapIconFactory.ABI.makeIWebUICommandBarBitmapIconFactory(factoryActivatorPtr.value))
    }

    public fun activate(uri: Uri): JNAPointer? =
        IWebUICommandBarBitmapIconFactory_Instance.Create(uri)?.pointer

    public override fun fromNative(segment: MemoryAddress): WebUICommandBarBitmapIcon {
      val address = segment.toRawLongValue()
      return WebUICommandBarBitmapIcon(Pointer(address))
    }

    public override fun toNative(obj: WebUICommandBarBitmapIcon): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
