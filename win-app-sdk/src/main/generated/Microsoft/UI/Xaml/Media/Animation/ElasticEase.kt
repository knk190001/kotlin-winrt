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

@ABIMarker(ElasticEase.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.ElasticEase;{2b18d50b-4d34-509b-915c-61b1aa6f83d8})")
@WinRTByReference(brClass = ElasticEase.ByReference::class)
public class ElasticEase(
  ptr: JNAPointer? = NULL
) : EasingFunctionBase(ptr), IElasticEase.WithDefault, IWinRTObject {
  private val __685895560_Interface: IElasticEase.WithDefault by lazy {
    as_685895560()
  }


  public override val __685895560_Ptr: JNAPointer? by lazy {
    __685895560_Interface.__685895560_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__685895560_Interface)

  public constructor() : this(ABI.activate())

  private fun as_685895560(): IElasticEase.WithDefault {
    if(pointer == NULL) {
      return(IElasticEase.ABI.makeIElasticEase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IElasticEase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IElasticEase.ABI.makeIElasticEase(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ElasticEase> {
    public override fun getValue() = ElasticEase(pointer.getPointer(0))

    public fun setValue(value: ElasticEase): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ElasticEase, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IElasticEaseStatics_Instance: IElasticEaseStatics by lazy {
      createIElasticEaseStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.ElasticEase".toHandle(),
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

    public fun createIElasticEaseStatics(): IElasticEaseStatics {
      val refiid = Guid.REFIID(IElasticEaseStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.ElasticEase".toHandle(),refiid,interfacePtr)
      val result = IElasticEaseStatics.ABI.makeIElasticEaseStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ElasticEase {
      val address = segment.toRawLongValue()
      return ElasticEase(Pointer(address))
    }

    public override fun toNative(obj: ElasticEase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_OscillationsProperty() =
        ABI.IElasticEaseStatics_Instance.get_OscillationsProperty()

    public fun get_SpringinessProperty() =
        ABI.IElasticEaseStatics_Instance.get_SpringinessProperty()
  }
}
