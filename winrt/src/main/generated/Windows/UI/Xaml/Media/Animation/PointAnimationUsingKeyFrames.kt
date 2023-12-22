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

@ABIMarker(PointAnimationUsingKeyFrames.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.PointAnimationUsingKeyFrames;{9b944f72-446a-41d0-a129-41a620f4595d})")
@WinRTByReference(brClass = PointAnimationUsingKeyFrames.ByReference::class)
public class PointAnimationUsingKeyFrames(
  ptr: JNAPointer? = NULL
) : Timeline(ptr), IPointAnimationUsingKeyFrames.WithDefault, IWinRTObject {
  private val __2120960581_Interface: IPointAnimationUsingKeyFrames.WithDefault by lazy {
    as_2120960581()
  }


  public override val __2120960581_Ptr: JNAPointer? by lazy {
    __2120960581_Interface.__2120960581_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2120960581_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2120960581(): IPointAnimationUsingKeyFrames.WithDefault {
    if(pointer == NULL) {
      return(IPointAnimationUsingKeyFrames.ABI.makeIPointAnimationUsingKeyFrames(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPointAnimationUsingKeyFrames>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPointAnimationUsingKeyFrames.ABI.makeIPointAnimationUsingKeyFrames(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PointAnimationUsingKeyFrames> {
    public override fun getValue() = PointAnimationUsingKeyFrames(pointer.getPointer(0))

    public fun setValue(value: PointAnimationUsingKeyFrames): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PointAnimationUsingKeyFrames, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IPointAnimationUsingKeyFramesStatics_Instance: IPointAnimationUsingKeyFramesStatics
        by lazy {
      createIPointAnimationUsingKeyFramesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.PointAnimationUsingKeyFrames".toHandle(),
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

    public fun createIPointAnimationUsingKeyFramesStatics(): IPointAnimationUsingKeyFramesStatics {
      val refiid = Guid.REFIID(IPointAnimationUsingKeyFramesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.PointAnimationUsingKeyFrames".toHandle(),refiid,interfacePtr)
      val result =
          IPointAnimationUsingKeyFramesStatics.ABI.makeIPointAnimationUsingKeyFramesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PointAnimationUsingKeyFrames {
      val address = segment.toRawLongValue()
      return PointAnimationUsingKeyFrames(Pointer(address))
    }

    public override fun toNative(obj: PointAnimationUsingKeyFrames): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_EnableDependentAnimationProperty() =
        ABI.IPointAnimationUsingKeyFramesStatics_Instance.get_EnableDependentAnimationProperty()
  }
}
