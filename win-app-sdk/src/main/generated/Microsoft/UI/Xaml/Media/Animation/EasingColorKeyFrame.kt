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

@ABIMarker(EasingColorKeyFrame.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.EasingColorKeyFrame;{a137a710-da3c-5426-a1a2-3a5a672a4264})")
@WinRTByReference(brClass = EasingColorKeyFrame.ByReference::class)
public class EasingColorKeyFrame(
  ptr: JNAPointer? = NULL
) : ColorKeyFrame(ptr), IEasingColorKeyFrame.WithDefault, IWinRTObject {
  private val __1707372149_Interface: IEasingColorKeyFrame.WithDefault by lazy {
    as_1707372149()
  }


  public override val __1707372149_Ptr: JNAPointer? by lazy {
    __1707372149_Interface.__1707372149_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1707372149_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1707372149(): IEasingColorKeyFrame.WithDefault {
    if(pointer == NULL) {
      return(IEasingColorKeyFrame.ABI.makeIEasingColorKeyFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEasingColorKeyFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEasingColorKeyFrame.ABI.makeIEasingColorKeyFrame(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EasingColorKeyFrame> {
    public override fun getValue() = EasingColorKeyFrame(pointer.getPointer(0))

    public fun setValue(value: EasingColorKeyFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EasingColorKeyFrame, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IEasingColorKeyFrameStatics_Instance: IEasingColorKeyFrameStatics by lazy {
      createIEasingColorKeyFrameStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.EasingColorKeyFrame".toHandle(),
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

    public fun createIEasingColorKeyFrameStatics(): IEasingColorKeyFrameStatics {
      val refiid = Guid.REFIID(IEasingColorKeyFrameStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.EasingColorKeyFrame".toHandle(),refiid,interfacePtr)
      val result =
          IEasingColorKeyFrameStatics.ABI.makeIEasingColorKeyFrameStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): EasingColorKeyFrame {
      val address = segment.toRawLongValue()
      return EasingColorKeyFrame(Pointer(address))
    }

    public override fun toNative(obj: EasingColorKeyFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_EasingFunctionProperty() =
        ABI.IEasingColorKeyFrameStatics_Instance.get_EasingFunctionProperty()
  }
}
