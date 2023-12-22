package Microsoft.UI.Xaml.Media.Animation

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

@ABIMarker(PowerEase.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.PowerEase;{372dfad0-5177-5df9-8e1e-920962468714})")
@WinRTByReference(brClass = PowerEase.ByReference::class)
public class PowerEase(
  ptr: JNAPointer? = NULL
) : EasingFunctionBase(ptr), IPowerEase.WithDefault, IWinRTObject {
  private val __763474680_Interface: IPowerEase.WithDefault by lazy {
    as_763474680()
  }


  public override val __763474680_Ptr: JNAPointer? by lazy {
    __763474680_Interface.__763474680_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__763474680_Interface)

  public constructor() : this(ABI.activate())

  private fun as_763474680(): IPowerEase.WithDefault {
    if(pointer == NULL) {
      return(IPowerEase.ABI.makeIPowerEase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPowerEase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPowerEase.ABI.makeIPowerEase(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PowerEase> {
    public override fun getValue() = PowerEase(pointer.getPointer(0))

    public fun setValue(value: PowerEase): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PowerEase, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IPowerEaseStatics_Instance: IPowerEaseStatics by lazy {
      createIPowerEaseStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.PowerEase".toHandle(),
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

    public fun createIPowerEaseStatics(): IPowerEaseStatics {
      val refiid = Guid.REFIID(IPowerEaseStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.PowerEase".toHandle(),refiid,interfacePtr)
      val result = IPowerEaseStatics.ABI.makeIPowerEaseStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PowerEase {
      val address = segment.toRawLongValue()
      return PowerEase(Pointer(address))
    }

    public override fun toNative(obj: PowerEase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_PowerProperty() = ABI.IPowerEaseStatics_Instance.get_PowerProperty()
  }
}
