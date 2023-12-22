package Windows.UI.Xaml.Media.Animation

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

@ABIMarker(CircleEase.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.CircleEase;{53a3bdb2-9177-4e6e-a043-5082d889ab1f})")
@WinRTByReference(brClass = CircleEase.ByReference::class)
public class CircleEase(
  ptr: JNAPointer? = NULL
) : EasingFunctionBase(ptr), ICircleEase.WithDefault, IWinRTObject {
  private val __267574428_Interface: ICircleEase.WithDefault by lazy {
    as_267574428()
  }


  public override val __267574428_Ptr: JNAPointer? by lazy {
    __267574428_Interface.__267574428_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__267574428_Interface)

  public constructor() : this(ABI.activate())

  private fun as_267574428(): ICircleEase.WithDefault {
    if(pointer == NULL) {
      return(ICircleEase.ABI.makeICircleEase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICircleEase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICircleEase.ABI.makeICircleEase(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<CircleEase> {
    public override fun getValue() = CircleEase(pointer.getPointer(0))

    public fun setValue(value: CircleEase): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CircleEase, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.CircleEase".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): CircleEase {
      val address = segment.toRawLongValue()
      return CircleEase(Pointer(address))
    }

    public override fun toNative(obj: CircleEase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
