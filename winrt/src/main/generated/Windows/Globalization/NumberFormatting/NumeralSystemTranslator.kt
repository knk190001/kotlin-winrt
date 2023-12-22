package Windows.Globalization.NumberFormatting

import Windows.Foundation.Collections.IIterable
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

@ABIMarker(NumeralSystemTranslator.ABI::class)
@Signature("rc(Windows.Globalization.NumberFormatting.NumeralSystemTranslator;{28f5bc2c-8c23-4234-ad2e-fa5a3a426e9b})")
@WinRTByReference(brClass = NumeralSystemTranslator.ByReference::class)
public class NumeralSystemTranslator(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INumeralSystemTranslator.WithDefault, IWinRTObject {
  private val __638200580_Interface: INumeralSystemTranslator.WithDefault by lazy {
    as_638200580()
  }


  public override val __638200580_Ptr: JNAPointer? by lazy {
    __638200580_Interface.__638200580_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__638200580_Interface)

  public constructor() : this(ABI.activate())

  public constructor(languages: IIterable<String?>) : this(ABI.activate(languages))

  private fun as_638200580(): INumeralSystemTranslator.WithDefault {
    if(pointer == NULL) {
      return(INumeralSystemTranslator.ABI.makeINumeralSystemTranslator(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INumeralSystemTranslator>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INumeralSystemTranslator.ABI.makeINumeralSystemTranslator(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NumeralSystemTranslator> {
    public override fun getValue() = NumeralSystemTranslator(pointer.getPointer(0))

    public fun setValue(value: NumeralSystemTranslator): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NumeralSystemTranslator, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val INumeralSystemTranslatorFactory_Instance: INumeralSystemTranslatorFactory by lazy {
      createINumeralSystemTranslatorFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Globalization.NumberFormatting.NumeralSystemTranslator".toHandle(),
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

    public fun createINumeralSystemTranslatorFactory(): INumeralSystemTranslatorFactory {
      val refiid = Guid.REFIID(INumeralSystemTranslatorFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Globalization.NumberFormatting.NumeralSystemTranslator".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(INumeralSystemTranslatorFactory.ABI.makeINumeralSystemTranslatorFactory(factoryActivatorPtr.value))
    }

    public fun activate(languages: IIterable<String?>): JNAPointer? =
        INumeralSystemTranslatorFactory_Instance.Create(languages)?.pointer

    public override fun fromNative(segment: MemoryAddress): NumeralSystemTranslator {
      val address = segment.toRawLongValue()
      return NumeralSystemTranslator(Pointer(address))
    }

    public override fun toNative(obj: NumeralSystemTranslator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
