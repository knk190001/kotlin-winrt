package Windows.Media.Effects

import Windows.Foundation.Collections.IPropertySet
import Windows.Media.Effects.IVideoEffectDefinitionFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(VideoEffectDefinition.ABI::class)
@Signature("rc(Windows.Media.Effects.VideoEffectDefinition;{39f38cf0-8d0f-4f3e-84fc-2d46a5297943})")
@WinRTByReference(brClass = VideoEffectDefinition.ByReference::class)
public class VideoEffectDefinition(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVideoEffectDefinition.WithDefault, IWinRTObject {
  private val __1115276221_Interface: IVideoEffectDefinition.WithDefault by lazy {
    as_1115276221()
  }


  public override val __1115276221_Ptr: JNAPointer? by lazy {
    __1115276221_Interface.__1115276221_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1115276221_Interface)

  public constructor(activatableClassId: String) : this(ABI.activate(activatableClassId))

  public constructor(activatableClassId: String, props: IPropertySet) :
      this(ABI.activate(activatableClassId, props))

  private fun as_1115276221(): IVideoEffectDefinition.WithDefault {
    if(pointer == NULL) {
      return(IVideoEffectDefinition.ABI.makeIVideoEffectDefinition(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVideoEffectDefinition>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVideoEffectDefinition.ABI.makeIVideoEffectDefinition(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VideoEffectDefinition> {
    public override fun getValue() = VideoEffectDefinition(pointer.getPointer(0))

    public fun setValue(value: VideoEffectDefinition): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VideoEffectDefinition, MemoryAddress> {
    public val IVideoEffectDefinitionFactory_Instance: IVideoEffectDefinitionFactory by lazy {
      createIVideoEffectDefinitionFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIVideoEffectDefinitionFactory(): IVideoEffectDefinitionFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Effects.VideoEffectDefinition".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IVideoEffectDefinitionFactory.ABI.makeIVideoEffectDefinitionFactory(factoryActivatorPtr.value))
    }

    public fun activate(activatableClassId: String): JNAPointer? =
        IVideoEffectDefinitionFactory_Instance.Create(activatableClassId)?.pointer

    public fun activate(activatableClassId: String, props: IPropertySet): JNAPointer? =
        IVideoEffectDefinitionFactory_Instance.CreateWithProperties(activatableClassId,
        props)?.pointer

    public override fun fromNative(segment: MemoryAddress): VideoEffectDefinition {
      val address = segment.toRawLongValue()
      return VideoEffectDefinition(Pointer(address))
    }

    public override fun toNative(obj: VideoEffectDefinition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
