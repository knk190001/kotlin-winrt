package Windows.UI.Xaml.Media.Animation

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

@ABIMarker(EasingDoubleKeyFrame.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.EasingDoubleKeyFrame;{965adb8d-9a54-4108-b4ff-b5a5212cb338})")
@WinRTByReference(brClass = EasingDoubleKeyFrame.ByReference::class)
public class EasingDoubleKeyFrame(
  ptr: JNAPointer? = NULL
) : DoubleKeyFrame(ptr), IEasingDoubleKeyFrame.WithDefault, IWinRTObject {
  private val __457205328_Interface: IEasingDoubleKeyFrame.WithDefault by lazy {
    as_457205328()
  }


  public override val __457205328_Ptr: JNAPointer? by lazy {
    __457205328_Interface.__457205328_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__457205328_Interface)

  public constructor() : this(ABI.activate())

  private fun as_457205328(): IEasingDoubleKeyFrame.WithDefault {
    if(pointer == NULL) {
      return(IEasingDoubleKeyFrame.ABI.makeIEasingDoubleKeyFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEasingDoubleKeyFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEasingDoubleKeyFrame.ABI.makeIEasingDoubleKeyFrame(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EasingDoubleKeyFrame> {
    public override fun getValue() = EasingDoubleKeyFrame(pointer.getPointer(0))

    public fun setValue(value: EasingDoubleKeyFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EasingDoubleKeyFrame, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IEasingDoubleKeyFrameStatics_Instance: IEasingDoubleKeyFrameStatics by lazy {
      createIEasingDoubleKeyFrameStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.EasingDoubleKeyFrame".toHandle(),
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

    public fun createIEasingDoubleKeyFrameStatics(): IEasingDoubleKeyFrameStatics {
      val refiid = Guid.REFIID(IEasingDoubleKeyFrameStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.EasingDoubleKeyFrame".toHandle(),refiid,interfacePtr)
      val result =
          IEasingDoubleKeyFrameStatics.ABI.makeIEasingDoubleKeyFrameStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): EasingDoubleKeyFrame {
      val address = segment.toRawLongValue()
      return EasingDoubleKeyFrame(Pointer(address))
    }

    public override fun toNative(obj: EasingDoubleKeyFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_EasingFunctionProperty() =
        ABI.IEasingDoubleKeyFrameStatics_Instance.get_EasingFunctionProperty()
  }
}
