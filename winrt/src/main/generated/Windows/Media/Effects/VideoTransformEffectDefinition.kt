package Windows.Media.Effects

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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(VideoTransformEffectDefinition.ABI::class)
@Signature("rc(Windows.Media.Effects.VideoTransformEffectDefinition;{39f38cf0-8d0f-4f3e-84fc-2d46a5297943})")
@WinRTByReference(brClass = VideoTransformEffectDefinition.ByReference::class)
public class VideoTransformEffectDefinition(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVideoEffectDefinition.WithDefault,
    IVideoTransformEffectDefinition.WithDefault, IVideoTransformEffectDefinition2.WithDefault,
    IWinRTObject {
  private val __1115276221_Interface: IVideoEffectDefinition.WithDefault by lazy {
    as_1115276221()
  }


  private val __965800527_Interface: IVideoTransformEffectDefinition.WithDefault by lazy {
    as_965800527()
  }


  private val __124954785_Interface: IVideoTransformEffectDefinition2.WithDefault by lazy {
    as_124954785()
  }


  public override val __1115276221_Ptr: JNAPointer? by lazy {
    __1115276221_Interface.__1115276221_Ptr
  }


  public override val __965800527_Ptr: JNAPointer? by lazy {
    __965800527_Interface.__965800527_Ptr
  }


  public override val __124954785_Ptr: JNAPointer? by lazy {
    __124954785_Interface.__124954785_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1115276221_Interface, __965800527_Interface, __124954785_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1115276221(): IVideoEffectDefinition.WithDefault {
    if(pointer == NULL) {
      return(IVideoEffectDefinition.ABI.makeIVideoEffectDefinition(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVideoEffectDefinition>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVideoEffectDefinition.ABI.makeIVideoEffectDefinition(ref.value))
  }

  private fun as_965800527(): IVideoTransformEffectDefinition.WithDefault {
    if(pointer == NULL) {
      return(IVideoTransformEffectDefinition.ABI.makeIVideoTransformEffectDefinition(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVideoTransformEffectDefinition>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVideoTransformEffectDefinition.ABI.makeIVideoTransformEffectDefinition(ref.value))
  }

  private fun as_124954785(): IVideoTransformEffectDefinition2.WithDefault {
    if(pointer == NULL) {
      return(IVideoTransformEffectDefinition2.ABI.makeIVideoTransformEffectDefinition2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVideoTransformEffectDefinition2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVideoTransformEffectDefinition2.ABI.makeIVideoTransformEffectDefinition2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VideoTransformEffectDefinition> {
    public override fun getValue() = VideoTransformEffectDefinition(pointer.getPointer(0))

    public fun setValue(value: VideoTransformEffectDefinition): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VideoTransformEffectDefinition, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Effects.VideoTransformEffectDefinition".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): VideoTransformEffectDefinition {
      val address = segment.toRawLongValue()
      return VideoTransformEffectDefinition(Pointer(address))
    }

    public override fun toNative(obj: VideoTransformEffectDefinition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
