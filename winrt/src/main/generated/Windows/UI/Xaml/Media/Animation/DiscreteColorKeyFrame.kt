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

@ABIMarker(DiscreteColorKeyFrame.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.DiscreteColorKeyFrame;{230c08f4-e062-4cb1-8e2a-14093d73ed8c})")
@WinRTByReference(brClass = DiscreteColorKeyFrame.ByReference::class)
public class DiscreteColorKeyFrame(
  ptr: JNAPointer? = NULL
) : ColorKeyFrame(ptr), IDiscreteColorKeyFrame.WithDefault, IWinRTObject {
  private val __44724718_Interface: IDiscreteColorKeyFrame.WithDefault by lazy {
    as_44724718()
  }


  public override val __44724718_Ptr: JNAPointer? by lazy {
    __44724718_Interface.__44724718_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__44724718_Interface)

  public constructor() : this(ABI.activate())

  private fun as_44724718(): IDiscreteColorKeyFrame.WithDefault {
    if(pointer == NULL) {
      return(IDiscreteColorKeyFrame.ABI.makeIDiscreteColorKeyFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDiscreteColorKeyFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDiscreteColorKeyFrame.ABI.makeIDiscreteColorKeyFrame(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DiscreteColorKeyFrame> {
    public override fun getValue() = DiscreteColorKeyFrame(pointer.getPointer(0))

    public fun setValue(value: DiscreteColorKeyFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DiscreteColorKeyFrame, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.DiscreteColorKeyFrame".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): DiscreteColorKeyFrame {
      val address = segment.toRawLongValue()
      return DiscreteColorKeyFrame(Pointer(address))
    }

    public override fun toNative(obj: DiscreteColorKeyFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
