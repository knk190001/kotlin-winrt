package Microsoft.Windows.ApplicationModel.Resources

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

@ABIMarker(ResourceMap.ABI::class)
@Signature("rc(Microsoft.Windows.ApplicationModel.Resources.ResourceMap;{4abbd9bc-df4e-5c7b-812c-7e7bb0c22377})")
@WinRTByReference(brClass = ResourceMap.ByReference::class)
public class ResourceMap(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IResourceMap.WithDefault, IWinRTObject {
  private val __653112416_Interface: IResourceMap.WithDefault by lazy {
    as_653112416()
  }


  public override val __653112416_Ptr: JNAPointer? by lazy {
    __653112416_Interface.__653112416_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__653112416_Interface)

  private fun as_653112416(): IResourceMap.WithDefault {
    if(pointer == NULL) {
      return(IResourceMap.ABI.makeIResourceMap(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IResourceMap>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IResourceMap.ABI.makeIResourceMap(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ResourceMap> {
    public override fun getValue() = ResourceMap(pointer.getPointer(0))

    public fun setValue(value: ResourceMap): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ResourceMap, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ResourceMap {
      val address = segment.toRawLongValue()
      return ResourceMap(Pointer(address))
    }

    public override fun toNative(obj: ResourceMap): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
