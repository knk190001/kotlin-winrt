package Windows.UI.WebUI.Core

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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(WebUICommandBarSymbolIcon.ABI::class)
@Signature("rc(Windows.UI.WebUI.Core.WebUICommandBarSymbolIcon;{d4935477-fd26-46ed-8658-1a3f4400e7b3})")
@WinRTByReference(brClass = WebUICommandBarSymbolIcon.ByReference::class)
public class WebUICommandBarSymbolIcon(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebUICommandBarSymbolIcon.WithDefault, IWebUICommandBarIcon.WithDefault,
    IWinRTObject {
  private val __58894004_Interface: IWebUICommandBarSymbolIcon.WithDefault by lazy {
    as_58894004()
  }


  private val __1332685780_Interface: IWebUICommandBarIcon.WithDefault by lazy {
    as_1332685780()
  }


  public override val __58894004_Ptr: JNAPointer? by lazy {
    __58894004_Interface.__58894004_Ptr
  }


  public override val __1332685780_Ptr: JNAPointer? by lazy {
    __1332685780_Interface.__1332685780_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__58894004_Interface, __1332685780_Interface)

  public constructor() : this(ABI.activate())

  public constructor(symbol: String) : this(ABI.activate(symbol))

  private fun as_58894004(): IWebUICommandBarSymbolIcon.WithDefault {
    if(pointer == NULL) {
      return(IWebUICommandBarSymbolIcon.ABI.makeIWebUICommandBarSymbolIcon(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebUICommandBarSymbolIcon>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebUICommandBarSymbolIcon.ABI.makeIWebUICommandBarSymbolIcon(ref.value))
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
      IByReference<WebUICommandBarSymbolIcon> {
    public override fun getValue() = WebUICommandBarSymbolIcon(pointer.getPointer(0))

    public fun setValue(value: WebUICommandBarSymbolIcon): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebUICommandBarSymbolIcon, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IWebUICommandBarSymbolIconFactory_Instance: IWebUICommandBarSymbolIconFactory by
        lazy {
      createIWebUICommandBarSymbolIconFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.WebUI.Core.WebUICommandBarSymbolIcon".toHandle(),
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

    public fun createIWebUICommandBarSymbolIconFactory(): IWebUICommandBarSymbolIconFactory {
      val refiid = Guid.REFIID(IWebUICommandBarSymbolIconFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.WebUI.Core.WebUICommandBarSymbolIcon".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IWebUICommandBarSymbolIconFactory.ABI.makeIWebUICommandBarSymbolIconFactory(factoryActivatorPtr.value))
    }

    public fun activate(symbol: String): JNAPointer? =
        IWebUICommandBarSymbolIconFactory_Instance.Create(symbol)?.pointer

    public override fun fromNative(segment: MemoryAddress): WebUICommandBarSymbolIcon {
      val address = segment.toRawLongValue()
      return WebUICommandBarSymbolIcon(Pointer(address))
    }

    public override fun toNative(obj: WebUICommandBarSymbolIcon): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
