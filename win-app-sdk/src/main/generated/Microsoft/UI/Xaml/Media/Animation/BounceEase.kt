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

@ABIMarker(BounceEase.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.BounceEase;{c138bfff-87c8-5c60-b280-682a499c58c3})")
@WinRTByReference(brClass = BounceEase.ByReference::class)
public class BounceEase(
  ptr: JNAPointer? = NULL
) : EasingFunctionBase(ptr), IBounceEase.WithDefault, IWinRTObject {
  private val __455310033_Interface: IBounceEase.WithDefault by lazy {
    as_455310033()
  }


  public override val __455310033_Ptr: JNAPointer? by lazy {
    __455310033_Interface.__455310033_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__455310033_Interface)

  public constructor() : this(ABI.activate())

  private fun as_455310033(): IBounceEase.WithDefault {
    if(pointer == NULL) {
      return(IBounceEase.ABI.makeIBounceEase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBounceEase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBounceEase.ABI.makeIBounceEase(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<BounceEase> {
    public override fun getValue() = BounceEase(pointer.getPointer(0))

    public fun setValue(value: BounceEase): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BounceEase, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IBounceEaseStatics_Instance: IBounceEaseStatics by lazy {
      createIBounceEaseStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.BounceEase".toHandle(),
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

    public fun createIBounceEaseStatics(): IBounceEaseStatics {
      val refiid = Guid.REFIID(IBounceEaseStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.BounceEase".toHandle(),refiid,interfacePtr)
      val result = IBounceEaseStatics.ABI.makeIBounceEaseStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): BounceEase {
      val address = segment.toRawLongValue()
      return BounceEase(Pointer(address))
    }

    public override fun toNative(obj: BounceEase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_BouncesProperty() = ABI.IBounceEaseStatics_Instance.get_BouncesProperty()

    public fun get_BouncinessProperty() = ABI.IBounceEaseStatics_Instance.get_BouncinessProperty()
  }
}
