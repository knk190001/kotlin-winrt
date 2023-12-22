package Windows.UI.Input.Spatial

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SpatialInteractionControllerProperties.ABI::class)
@Signature("rc(Windows.UI.Input.Spatial.SpatialInteractionControllerProperties;{61056fb1-7ba9-4e35-b93f-9272cba9b28b})")
@WinRTByReference(brClass = SpatialInteractionControllerProperties.ByReference::class)
public class SpatialInteractionControllerProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialInteractionControllerProperties.WithDefault, IWinRTObject {
  private val __1393444587_Interface: ISpatialInteractionControllerProperties.WithDefault by lazy {
    as_1393444587()
  }


  public override val __1393444587_Ptr: JNAPointer? by lazy {
    __1393444587_Interface.__1393444587_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1393444587_Interface)

  private fun as_1393444587(): ISpatialInteractionControllerProperties.WithDefault {
    if(pointer == NULL) {
      return(ISpatialInteractionControllerProperties.ABI.makeISpatialInteractionControllerProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialInteractionControllerProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialInteractionControllerProperties.ABI.makeISpatialInteractionControllerProperties(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialInteractionControllerProperties> {
    public override fun getValue() = SpatialInteractionControllerProperties(pointer.getPointer(0))

    public fun setValue(value: SpatialInteractionControllerProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialInteractionControllerProperties, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpatialInteractionControllerProperties {
      val address = segment.toRawLongValue()
      return SpatialInteractionControllerProperties(Pointer(address))
    }

    public override fun toNative(obj: SpatialInteractionControllerProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
