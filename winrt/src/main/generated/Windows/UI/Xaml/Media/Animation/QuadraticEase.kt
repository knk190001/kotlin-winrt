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

@ABIMarker(QuadraticEase.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.QuadraticEase;{e1510e91-ef6d-44f0-803d-68d16de0ddfc})")
@WinRTByReference(brClass = QuadraticEase.ByReference::class)
public class QuadraticEase(
  ptr: JNAPointer? = NULL
) : EasingFunctionBase(ptr), IQuadraticEase.WithDefault, IWinRTObject {
  private val __513024736_Interface: IQuadraticEase.WithDefault by lazy {
    as_513024736()
  }


  public override val __513024736_Ptr: JNAPointer? by lazy {
    __513024736_Interface.__513024736_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__513024736_Interface)

  public constructor() : this(ABI.activate())

  private fun as_513024736(): IQuadraticEase.WithDefault {
    if(pointer == NULL) {
      return(IQuadraticEase.ABI.makeIQuadraticEase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IQuadraticEase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IQuadraticEase.ABI.makeIQuadraticEase(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<QuadraticEase>
      {
    public override fun getValue() = QuadraticEase(pointer.getPointer(0))

    public fun setValue(value: QuadraticEase): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<QuadraticEase, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.QuadraticEase".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): QuadraticEase {
      val address = segment.toRawLongValue()
      return QuadraticEase(Pointer(address))
    }

    public override fun toNative(obj: QuadraticEase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
