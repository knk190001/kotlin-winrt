package Microsoft.UI.Xaml

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
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(Setter.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Setter;{bbd6074d-686f-5ae1-b8de-5f16aa30b80a})")
@WinRTByReference(brClass = Setter.ByReference::class)
public class Setter(
  ptr: JNAPointer? = NULL
) : SetterBase(ptr), ISetter.WithDefault, IWinRTObject {
  private val __694040454_Interface: ISetter.WithDefault by lazy {
    as_694040454()
  }


  public override val __694040454_Ptr: JNAPointer? by lazy {
    __694040454_Interface.__694040454_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__694040454_Interface)

  public constructor() : this(ABI.activate())

  public constructor(targetProperty: DependencyProperty, value: IUnknown) :
      this(ABI.activate(targetProperty, value))

  private fun as_694040454(): ISetter.WithDefault {
    if(pointer == NULL) {
      return(ISetter.ABI.makeISetter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISetter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISetter.ABI.makeISetter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Setter> {
    public override fun getValue() = Setter(pointer.getPointer(0))

    public fun setValue(value: Setter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Setter, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ISetterFactory_Instance: ISetterFactory by lazy {
      createISetterFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Setter".toHandle(), refiid,
          iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createISetterFactory(): ISetterFactory {
      val refiid = Guid.REFIID(ISetterFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Setter".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISetterFactory.ABI.makeISetterFactory(factoryActivatorPtr.value))
    }

    public fun activate(targetProperty: DependencyProperty, value: IUnknown): JNAPointer? =
        ISetterFactory_Instance.CreateInstance(targetProperty, value)?.pointer

    public override fun fromNative(segment: MemoryAddress): Setter {
      val address = segment.toRawLongValue()
      return Setter(Pointer(address))
    }

    public override fun toNative(obj: Setter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
