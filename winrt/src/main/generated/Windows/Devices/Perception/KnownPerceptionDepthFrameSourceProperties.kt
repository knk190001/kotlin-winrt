package Windows.Devices.Perception

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(KnownPerceptionDepthFrameSourceProperties.ABI::class)
@WinRTByReference(brClass = KnownPerceptionDepthFrameSourceProperties.ByReference::class)
public class KnownPerceptionDepthFrameSourceProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KnownPerceptionDepthFrameSourceProperties> {
    public override fun getValue() =
        KnownPerceptionDepthFrameSourceProperties(pointer.getPointer(0))

    public fun setValue(value: KnownPerceptionDepthFrameSourceProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KnownPerceptionDepthFrameSourceProperties, MemoryAddress> {
    public val IKnownPerceptionDepthFrameSourcePropertiesStatics_Instance:
        IKnownPerceptionDepthFrameSourcePropertiesStatics by lazy {
      createIKnownPerceptionDepthFrameSourcePropertiesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIKnownPerceptionDepthFrameSourcePropertiesStatics():
        IKnownPerceptionDepthFrameSourcePropertiesStatics {
      val refiid = Guid.REFIID(IKnownPerceptionDepthFrameSourcePropertiesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Perception.KnownPerceptionDepthFrameSourceProperties".toHandle(),refiid,interfacePtr)
      val result =
          IKnownPerceptionDepthFrameSourcePropertiesStatics.ABI.makeIKnownPerceptionDepthFrameSourcePropertiesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress):
        KnownPerceptionDepthFrameSourceProperties {
      val address = segment.toRawLongValue()
      return KnownPerceptionDepthFrameSourceProperties(Pointer(address))
    }

    public override fun toNative(obj: KnownPerceptionDepthFrameSourceProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_MinDepth() =
        ABI.IKnownPerceptionDepthFrameSourcePropertiesStatics_Instance.get_MinDepth()

    public fun get_MaxDepth() =
        ABI.IKnownPerceptionDepthFrameSourcePropertiesStatics_Instance.get_MaxDepth()
  }
}
