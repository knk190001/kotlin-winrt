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

@ABIMarker(SplinePointKeyFrame.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.SplinePointKeyFrame;{2b7eb049-708c-5220-a178-a25dbc14ffbe})")
@WinRTByReference(brClass = SplinePointKeyFrame.ByReference::class)
public class SplinePointKeyFrame(
  ptr: JNAPointer? = NULL
) : PointKeyFrame(ptr), ISplinePointKeyFrame.WithDefault, IWinRTObject {
  private val __135189038_Interface: ISplinePointKeyFrame.WithDefault by lazy {
    as_135189038()
  }


  public override val __135189038_Ptr: JNAPointer? by lazy {
    __135189038_Interface.__135189038_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__135189038_Interface)

  public constructor() : this(ABI.activate())

  private fun as_135189038(): ISplinePointKeyFrame.WithDefault {
    if(pointer == NULL) {
      return(ISplinePointKeyFrame.ABI.makeISplinePointKeyFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISplinePointKeyFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISplinePointKeyFrame.ABI.makeISplinePointKeyFrame(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SplinePointKeyFrame> {
    public override fun getValue() = SplinePointKeyFrame(pointer.getPointer(0))

    public fun setValue(value: SplinePointKeyFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SplinePointKeyFrame, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ISplinePointKeyFrameStatics_Instance: ISplinePointKeyFrameStatics by lazy {
      createISplinePointKeyFrameStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.SplinePointKeyFrame".toHandle(),
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

    public fun createISplinePointKeyFrameStatics(): ISplinePointKeyFrameStatics {
      val refiid = Guid.REFIID(ISplinePointKeyFrameStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.SplinePointKeyFrame".toHandle(),refiid,interfacePtr)
      val result =
          ISplinePointKeyFrameStatics.ABI.makeISplinePointKeyFrameStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SplinePointKeyFrame {
      val address = segment.toRawLongValue()
      return SplinePointKeyFrame(Pointer(address))
    }

    public override fun toNative(obj: SplinePointKeyFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_KeySplineProperty() =
        ABI.ISplinePointKeyFrameStatics_Instance.get_KeySplineProperty()
  }
}
