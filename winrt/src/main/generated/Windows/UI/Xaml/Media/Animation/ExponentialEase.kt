package Windows.UI.Xaml.Media.Animation

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

@ABIMarker(ExponentialEase.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.ExponentialEase;{7cb9e41d-f0bb-4bca-9da5-9ba3a11734c4})")
@WinRTByReference(brClass = ExponentialEase.ByReference::class)
public class ExponentialEase(
  ptr: JNAPointer? = NULL
) : EasingFunctionBase(ptr), IExponentialEase.WithDefault, IWinRTObject {
  private val __1880048653_Interface: IExponentialEase.WithDefault by lazy {
    as_1880048653()
  }


  public override val __1880048653_Ptr: JNAPointer? by lazy {
    __1880048653_Interface.__1880048653_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1880048653_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1880048653(): IExponentialEase.WithDefault {
    if(pointer == NULL) {
      return(IExponentialEase.ABI.makeIExponentialEase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IExponentialEase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IExponentialEase.ABI.makeIExponentialEase(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ExponentialEase> {
    public override fun getValue() = ExponentialEase(pointer.getPointer(0))

    public fun setValue(value: ExponentialEase): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ExponentialEase, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IExponentialEaseStatics_Instance: IExponentialEaseStatics by lazy {
      createIExponentialEaseStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.ExponentialEase".toHandle(),
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

    public fun createIExponentialEaseStatics(): IExponentialEaseStatics {
      val refiid = Guid.REFIID(IExponentialEaseStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.ExponentialEase".toHandle(),refiid,interfacePtr)
      val result = IExponentialEaseStatics.ABI.makeIExponentialEaseStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ExponentialEase {
      val address = segment.toRawLongValue()
      return ExponentialEase(Pointer(address))
    }

    public override fun toNative(obj: ExponentialEase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ExponentProperty() = ABI.IExponentialEaseStatics_Instance.get_ExponentProperty()
  }
}
