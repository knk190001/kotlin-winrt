package Windows.Media.Effects

import Windows.Foundation.Collections.IPropertySet
import Windows.Media.Effects.IVideoCompositorDefinitionFactory.ABI.IID
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

@ABIMarker(VideoCompositorDefinition.ABI::class)
@Signature("rc(Windows.Media.Effects.VideoCompositorDefinition;{7946b8d0-2010-4ae3-9ab2-2cef42edd4d2})")
@WinRTByReference(brClass = VideoCompositorDefinition.ByReference::class)
public class VideoCompositorDefinition(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVideoCompositorDefinition.WithDefault, IWinRTObject {
  private val __1653063475_Interface: IVideoCompositorDefinition.WithDefault by lazy {
    as_1653063475()
  }


  public override val __1653063475_Ptr: JNAPointer? by lazy {
    __1653063475_Interface.__1653063475_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1653063475_Interface)

  public constructor(activatableClassId: String) : this(ABI.activate(activatableClassId))

  public constructor(activatableClassId: String, props: IPropertySet) :
      this(ABI.activate(activatableClassId, props))

  private fun as_1653063475(): IVideoCompositorDefinition.WithDefault {
    if(pointer == NULL) {
      return(IVideoCompositorDefinition.ABI.makeIVideoCompositorDefinition(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVideoCompositorDefinition>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVideoCompositorDefinition.ABI.makeIVideoCompositorDefinition(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VideoCompositorDefinition> {
    public override fun getValue() = VideoCompositorDefinition(pointer.getPointer(0))

    public fun setValue(value: VideoCompositorDefinition): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VideoCompositorDefinition, MemoryAddress> {
    public val IVideoCompositorDefinitionFactory_Instance: IVideoCompositorDefinitionFactory by
        lazy {
      createIVideoCompositorDefinitionFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIVideoCompositorDefinitionFactory(): IVideoCompositorDefinitionFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Effects.VideoCompositorDefinition".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IVideoCompositorDefinitionFactory.ABI.makeIVideoCompositorDefinitionFactory(factoryActivatorPtr.value))
    }

    public fun activate(activatableClassId: String): JNAPointer? =
        IVideoCompositorDefinitionFactory_Instance.Create(activatableClassId)?.pointer

    public fun activate(activatableClassId: String, props: IPropertySet): JNAPointer? =
        IVideoCompositorDefinitionFactory_Instance.CreateWithProperties(activatableClassId,
        props)?.pointer

    public override fun fromNative(segment: MemoryAddress): VideoCompositorDefinition {
      val address = segment.toRawLongValue()
      return VideoCompositorDefinition(Pointer(address))
    }

    public override fun toNative(obj: VideoCompositorDefinition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
