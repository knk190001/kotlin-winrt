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

@ABIMarker(SplineDoubleKeyFrame.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.SplineDoubleKeyFrame;{aea80957-bb56-59b6-bb7a-6295f94bc961})")
@WinRTByReference(brClass = SplineDoubleKeyFrame.ByReference::class)
public class SplineDoubleKeyFrame(
  ptr: JNAPointer? = NULL
) : DoubleKeyFrame(ptr), ISplineDoubleKeyFrame.WithDefault, IWinRTObject {
  private val __472272405_Interface: ISplineDoubleKeyFrame.WithDefault by lazy {
    as_472272405()
  }


  public override val __472272405_Ptr: JNAPointer? by lazy {
    __472272405_Interface.__472272405_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__472272405_Interface)

  public constructor() : this(ABI.activate())

  private fun as_472272405(): ISplineDoubleKeyFrame.WithDefault {
    if(pointer == NULL) {
      return(ISplineDoubleKeyFrame.ABI.makeISplineDoubleKeyFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISplineDoubleKeyFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISplineDoubleKeyFrame.ABI.makeISplineDoubleKeyFrame(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SplineDoubleKeyFrame> {
    public override fun getValue() = SplineDoubleKeyFrame(pointer.getPointer(0))

    public fun setValue(value: SplineDoubleKeyFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SplineDoubleKeyFrame, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ISplineDoubleKeyFrameStatics_Instance: ISplineDoubleKeyFrameStatics by lazy {
      createISplineDoubleKeyFrameStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.SplineDoubleKeyFrame".toHandle(),
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

    public fun createISplineDoubleKeyFrameStatics(): ISplineDoubleKeyFrameStatics {
      val refiid = Guid.REFIID(ISplineDoubleKeyFrameStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.SplineDoubleKeyFrame".toHandle(),refiid,interfacePtr)
      val result =
          ISplineDoubleKeyFrameStatics.ABI.makeISplineDoubleKeyFrameStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SplineDoubleKeyFrame {
      val address = segment.toRawLongValue()
      return SplineDoubleKeyFrame(Pointer(address))
    }

    public override fun toNative(obj: SplineDoubleKeyFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_KeySplineProperty() =
        ABI.ISplineDoubleKeyFrameStatics_Instance.get_KeySplineProperty()
  }
}
