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

@ABIMarker(DiscretePointKeyFrame.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.DiscretePointKeyFrame;{e0a9070d-4c42-4a90-983a-75f5a83a2fbe})")
@WinRTByReference(brClass = DiscretePointKeyFrame.ByReference::class)
public class DiscretePointKeyFrame(
  ptr: JNAPointer? = NULL
) : PointKeyFrame(ptr), IDiscretePointKeyFrame.WithDefault, IWinRTObject {
  private val __1886505153_Interface: IDiscretePointKeyFrame.WithDefault by lazy {
    as_1886505153()
  }


  public override val __1886505153_Ptr: JNAPointer? by lazy {
    __1886505153_Interface.__1886505153_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1886505153_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1886505153(): IDiscretePointKeyFrame.WithDefault {
    if(pointer == NULL) {
      return(IDiscretePointKeyFrame.ABI.makeIDiscretePointKeyFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDiscretePointKeyFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDiscretePointKeyFrame.ABI.makeIDiscretePointKeyFrame(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DiscretePointKeyFrame> {
    public override fun getValue() = DiscretePointKeyFrame(pointer.getPointer(0))

    public fun setValue(value: DiscretePointKeyFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DiscretePointKeyFrame, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.DiscretePointKeyFrame".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): DiscretePointKeyFrame {
      val address = segment.toRawLongValue()
      return DiscretePointKeyFrame(Pointer(address))
    }

    public override fun toNative(obj: DiscretePointKeyFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
