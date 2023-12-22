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

@ABIMarker(ResourceNotFoundEventArgs.ABI::class)
@Signature("rc(Microsoft.Windows.ApplicationModel.Resources.ResourceNotFoundEventArgs;{64abb08b-e77d-5b26-830f-15941e0e8200})")
@WinRTByReference(brClass = ResourceNotFoundEventArgs.ByReference::class)
public class ResourceNotFoundEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IResourceNotFoundEventArgs.WithDefault, IWinRTObject {
  private val __1563779540_Interface: IResourceNotFoundEventArgs.WithDefault by lazy {
    as_1563779540()
  }


  public override val __1563779540_Ptr: JNAPointer? by lazy {
    __1563779540_Interface.__1563779540_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1563779540_Interface)

  private fun as_1563779540(): IResourceNotFoundEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IResourceNotFoundEventArgs.ABI.makeIResourceNotFoundEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IResourceNotFoundEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IResourceNotFoundEventArgs.ABI.makeIResourceNotFoundEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ResourceNotFoundEventArgs> {
    public override fun getValue() = ResourceNotFoundEventArgs(pointer.getPointer(0))

    public fun setValue(value: ResourceNotFoundEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ResourceNotFoundEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ResourceNotFoundEventArgs {
      val address = segment.toRawLongValue()
      return ResourceNotFoundEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ResourceNotFoundEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
