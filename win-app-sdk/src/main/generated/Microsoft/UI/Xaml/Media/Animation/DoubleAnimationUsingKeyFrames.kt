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

@ABIMarker(DoubleAnimationUsingKeyFrames.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.DoubleAnimationUsingKeyFrames;{815437d5-63cf-54a5-aea5-24b84708d12d})")
@WinRTByReference(brClass = DoubleAnimationUsingKeyFrames.ByReference::class)
public class DoubleAnimationUsingKeyFrames(
  ptr: JNAPointer? = NULL
) : Timeline(ptr), IDoubleAnimationUsingKeyFrames.WithDefault, IWinRTObject {
  private val __701944519_Interface: IDoubleAnimationUsingKeyFrames.WithDefault by lazy {
    as_701944519()
  }


  public override val __701944519_Ptr: JNAPointer? by lazy {
    __701944519_Interface.__701944519_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__701944519_Interface)

  public constructor() : this(ABI.activate())

  private fun as_701944519(): IDoubleAnimationUsingKeyFrames.WithDefault {
    if(pointer == NULL) {
      return(IDoubleAnimationUsingKeyFrames.ABI.makeIDoubleAnimationUsingKeyFrames(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDoubleAnimationUsingKeyFrames>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDoubleAnimationUsingKeyFrames.ABI.makeIDoubleAnimationUsingKeyFrames(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DoubleAnimationUsingKeyFrames> {
    public override fun getValue() = DoubleAnimationUsingKeyFrames(pointer.getPointer(0))

    public fun setValue(value: DoubleAnimationUsingKeyFrames): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DoubleAnimationUsingKeyFrames, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IDoubleAnimationUsingKeyFramesStatics_Instance: IDoubleAnimationUsingKeyFramesStatics
        by lazy {
      createIDoubleAnimationUsingKeyFramesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.DoubleAnimationUsingKeyFrames".toHandle(),
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

    public fun createIDoubleAnimationUsingKeyFramesStatics():
        IDoubleAnimationUsingKeyFramesStatics {
      val refiid = Guid.REFIID(IDoubleAnimationUsingKeyFramesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.DoubleAnimationUsingKeyFrames".toHandle(),refiid,interfacePtr)
      val result =
          IDoubleAnimationUsingKeyFramesStatics.ABI.makeIDoubleAnimationUsingKeyFramesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DoubleAnimationUsingKeyFrames {
      val address = segment.toRawLongValue()
      return DoubleAnimationUsingKeyFrames(Pointer(address))
    }

    public override fun toNative(obj: DoubleAnimationUsingKeyFrames): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_EnableDependentAnimationProperty() =
        ABI.IDoubleAnimationUsingKeyFramesStatics_Instance.get_EnableDependentAnimationProperty()
  }
}
