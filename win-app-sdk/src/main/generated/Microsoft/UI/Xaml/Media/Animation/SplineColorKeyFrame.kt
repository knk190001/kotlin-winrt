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

@ABIMarker(SplineColorKeyFrame.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.SplineColorKeyFrame;{60c5905f-4343-504d-a2c6-64b8d924b438})")
@WinRTByReference(brClass = SplineColorKeyFrame.ByReference::class)
public class SplineColorKeyFrame(
  ptr: JNAPointer? = NULL
) : ColorKeyFrame(ptr), ISplineColorKeyFrame.WithDefault, IWinRTObject {
  private val __1706591397_Interface: ISplineColorKeyFrame.WithDefault by lazy {
    as_1706591397()
  }


  public override val __1706591397_Ptr: JNAPointer? by lazy {
    __1706591397_Interface.__1706591397_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1706591397_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1706591397(): ISplineColorKeyFrame.WithDefault {
    if(pointer == NULL) {
      return(ISplineColorKeyFrame.ABI.makeISplineColorKeyFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISplineColorKeyFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISplineColorKeyFrame.ABI.makeISplineColorKeyFrame(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SplineColorKeyFrame> {
    public override fun getValue() = SplineColorKeyFrame(pointer.getPointer(0))

    public fun setValue(value: SplineColorKeyFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SplineColorKeyFrame, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ISplineColorKeyFrameStatics_Instance: ISplineColorKeyFrameStatics by lazy {
      createISplineColorKeyFrameStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.SplineColorKeyFrame".toHandle(),
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

    public fun createISplineColorKeyFrameStatics(): ISplineColorKeyFrameStatics {
      val refiid = Guid.REFIID(ISplineColorKeyFrameStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.SplineColorKeyFrame".toHandle(),refiid,interfacePtr)
      val result =
          ISplineColorKeyFrameStatics.ABI.makeISplineColorKeyFrameStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SplineColorKeyFrame {
      val address = segment.toRawLongValue()
      return SplineColorKeyFrame(Pointer(address))
    }

    public override fun toNative(obj: SplineColorKeyFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_KeySplineProperty() =
        ABI.ISplineColorKeyFrameStatics_Instance.get_KeySplineProperty()
  }
}
