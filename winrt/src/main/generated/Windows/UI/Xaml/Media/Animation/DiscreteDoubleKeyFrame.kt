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

@ABIMarker(DiscreteDoubleKeyFrame.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.DiscreteDoubleKeyFrame;{f5f51f3a-ad11-49ce-8e1c-08fdf1447446})")
@WinRTByReference(brClass = DiscreteDoubleKeyFrame.ByReference::class)
public class DiscreteDoubleKeyFrame(
  ptr: JNAPointer? = NULL
) : DoubleKeyFrame(ptr), IDiscreteDoubleKeyFrame.WithDefault, IWinRTObject {
  private val __1071502878_Interface: IDiscreteDoubleKeyFrame.WithDefault by lazy {
    as_1071502878()
  }


  public override val __1071502878_Ptr: JNAPointer? by lazy {
    __1071502878_Interface.__1071502878_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1071502878_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1071502878(): IDiscreteDoubleKeyFrame.WithDefault {
    if(pointer == NULL) {
      return(IDiscreteDoubleKeyFrame.ABI.makeIDiscreteDoubleKeyFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDiscreteDoubleKeyFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDiscreteDoubleKeyFrame.ABI.makeIDiscreteDoubleKeyFrame(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DiscreteDoubleKeyFrame> {
    public override fun getValue() = DiscreteDoubleKeyFrame(pointer.getPointer(0))

    public fun setValue(value: DiscreteDoubleKeyFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DiscreteDoubleKeyFrame, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.DiscreteDoubleKeyFrame".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): DiscreteDoubleKeyFrame {
      val address = segment.toRawLongValue()
      return DiscreteDoubleKeyFrame(Pointer(address))
    }

    public override fun toNative(obj: DiscreteDoubleKeyFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
