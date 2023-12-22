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

@ABIMarker(EasingPointKeyFrame.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.EasingPointKeyFrame;{9406ee8e-3641-54fe-a424-83420ea45cd3})")
@WinRTByReference(brClass = EasingPointKeyFrame.ByReference::class)
public class EasingPointKeyFrame(
  ptr: JNAPointer? = NULL
) : PointKeyFrame(ptr), IEasingPointKeyFrame.WithDefault, IWinRTObject {
  private val __745814712_Interface: IEasingPointKeyFrame.WithDefault by lazy {
    as_745814712()
  }


  public override val __745814712_Ptr: JNAPointer? by lazy {
    __745814712_Interface.__745814712_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__745814712_Interface)

  public constructor() : this(ABI.activate())

  private fun as_745814712(): IEasingPointKeyFrame.WithDefault {
    if(pointer == NULL) {
      return(IEasingPointKeyFrame.ABI.makeIEasingPointKeyFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEasingPointKeyFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEasingPointKeyFrame.ABI.makeIEasingPointKeyFrame(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EasingPointKeyFrame> {
    public override fun getValue() = EasingPointKeyFrame(pointer.getPointer(0))

    public fun setValue(value: EasingPointKeyFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EasingPointKeyFrame, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IEasingPointKeyFrameStatics_Instance: IEasingPointKeyFrameStatics by lazy {
      createIEasingPointKeyFrameStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.EasingPointKeyFrame".toHandle(),
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

    public fun createIEasingPointKeyFrameStatics(): IEasingPointKeyFrameStatics {
      val refiid = Guid.REFIID(IEasingPointKeyFrameStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.EasingPointKeyFrame".toHandle(),refiid,interfacePtr)
      val result =
          IEasingPointKeyFrameStatics.ABI.makeIEasingPointKeyFrameStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): EasingPointKeyFrame {
      val address = segment.toRawLongValue()
      return EasingPointKeyFrame(Pointer(address))
    }

    public override fun toNative(obj: EasingPointKeyFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_EasingFunctionProperty() =
        ABI.IEasingPointKeyFrameStatics_Instance.get_EasingFunctionProperty()
  }
}
