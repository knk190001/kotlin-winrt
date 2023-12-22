package Microsoft.UI.Xaml.Controls

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

@ABIMarker(SymbolIcon.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.SymbolIcon;{a4322906-0dbe-5eb7-8b64-3e832246eb7f})")
@WinRTByReference(brClass = SymbolIcon.ByReference::class)
public class SymbolIcon(
  ptr: JNAPointer? = NULL
) : IconElement(ptr), ISymbolIcon.WithDefault, IWinRTObject {
  private val __615900360_Interface: ISymbolIcon.WithDefault by lazy {
    as_615900360()
  }


  public override val __615900360_Ptr: JNAPointer? by lazy {
    __615900360_Interface.__615900360_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__615900360_Interface)

  public constructor() : this(ABI.activate())

  public constructor(symbol: Symbol) : this(ABI.activate(symbol))

  private fun as_615900360(): ISymbolIcon.WithDefault {
    if(pointer == NULL) {
      return(ISymbolIcon.ABI.makeISymbolIcon(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISymbolIcon>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISymbolIcon.ABI.makeISymbolIcon(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SymbolIcon> {
    public override fun getValue() = SymbolIcon(pointer.getPointer(0))

    public fun setValue(value: SymbolIcon): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SymbolIcon, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ISymbolIconStatics_Instance: ISymbolIconStatics by lazy {
      createISymbolIconStatics()
    }


    public val ISymbolIconFactory_Instance: ISymbolIconFactory by lazy {
      createISymbolIconFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.SymbolIcon".toHandle(),
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

    public fun createISymbolIconStatics(): ISymbolIconStatics {
      val refiid = Guid.REFIID(ISymbolIconStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.SymbolIcon".toHandle(),refiid,interfacePtr)
      val result = ISymbolIconStatics.ABI.makeISymbolIconStatics(interfacePtr.value)
      return result
    }

    public fun createISymbolIconFactory(): ISymbolIconFactory {
      val refiid = Guid.REFIID(ISymbolIconFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.SymbolIcon".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISymbolIconFactory.ABI.makeISymbolIconFactory(factoryActivatorPtr.value))
    }

    public fun activate(symbol: Symbol): JNAPointer? =
        ISymbolIconFactory_Instance.CreateInstanceWithSymbol(symbol)?.pointer

    public override fun fromNative(segment: MemoryAddress): SymbolIcon {
      val address = segment.toRawLongValue()
      return SymbolIcon(Pointer(address))
    }

    public override fun toNative(obj: SymbolIcon): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_SymbolProperty() = ABI.ISymbolIconStatics_Instance.get_SymbolProperty()
  }
}
