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

@ABIMarker(ObjectAnimationUsingKeyFrames.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.ObjectAnimationUsingKeyFrames;{334a2d92-b74a-4c64-b9a6-58bcfa314f22})")
@WinRTByReference(brClass = ObjectAnimationUsingKeyFrames.ByReference::class)
public class ObjectAnimationUsingKeyFrames(
  ptr: JNAPointer? = NULL
) : Timeline(ptr), IObjectAnimationUsingKeyFrames.WithDefault, IWinRTObject {
  private val __1531948576_Interface: IObjectAnimationUsingKeyFrames.WithDefault by lazy {
    as_1531948576()
  }


  public override val __1531948576_Ptr: JNAPointer? by lazy {
    __1531948576_Interface.__1531948576_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1531948576_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1531948576(): IObjectAnimationUsingKeyFrames.WithDefault {
    if(pointer == NULL) {
      return(IObjectAnimationUsingKeyFrames.ABI.makeIObjectAnimationUsingKeyFrames(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IObjectAnimationUsingKeyFrames>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IObjectAnimationUsingKeyFrames.ABI.makeIObjectAnimationUsingKeyFrames(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ObjectAnimationUsingKeyFrames> {
    public override fun getValue() = ObjectAnimationUsingKeyFrames(pointer.getPointer(0))

    public fun setValue(value: ObjectAnimationUsingKeyFrames): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ObjectAnimationUsingKeyFrames, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IObjectAnimationUsingKeyFramesStatics_Instance: IObjectAnimationUsingKeyFramesStatics
        by lazy {
      createIObjectAnimationUsingKeyFramesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.ObjectAnimationUsingKeyFrames".toHandle(),
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

    public fun createIObjectAnimationUsingKeyFramesStatics():
        IObjectAnimationUsingKeyFramesStatics {
      val refiid = Guid.REFIID(IObjectAnimationUsingKeyFramesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.ObjectAnimationUsingKeyFrames".toHandle(),refiid,interfacePtr)
      val result =
          IObjectAnimationUsingKeyFramesStatics.ABI.makeIObjectAnimationUsingKeyFramesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ObjectAnimationUsingKeyFrames {
      val address = segment.toRawLongValue()
      return ObjectAnimationUsingKeyFrames(Pointer(address))
    }

    public override fun toNative(obj: ObjectAnimationUsingKeyFrames): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_EnableDependentAnimationProperty() =
        ABI.IObjectAnimationUsingKeyFramesStatics_Instance.get_EnableDependentAnimationProperty()
  }
}
