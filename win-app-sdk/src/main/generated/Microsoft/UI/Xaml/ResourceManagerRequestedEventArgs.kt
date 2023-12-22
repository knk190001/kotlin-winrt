package Microsoft.UI.Xaml

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

@ABIMarker(ResourceManagerRequestedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.ResourceManagerRequestedEventArgs;{c35f4cf1-fcd6-5c6b-9be2-4cfaefb68b2a})")
@WinRTByReference(brClass = ResourceManagerRequestedEventArgs.ByReference::class)
public class ResourceManagerRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IResourceManagerRequestedEventArgs.WithDefault, IWinRTObject {
  private val __1213379199_Interface: IResourceManagerRequestedEventArgs.WithDefault by lazy {
    as_1213379199()
  }


  public override val __1213379199_Ptr: JNAPointer? by lazy {
    __1213379199_Interface.__1213379199_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1213379199_Interface)

  private fun as_1213379199(): IResourceManagerRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IResourceManagerRequestedEventArgs.ABI.makeIResourceManagerRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IResourceManagerRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IResourceManagerRequestedEventArgs.ABI.makeIResourceManagerRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ResourceManagerRequestedEventArgs> {
    public override fun getValue() = ResourceManagerRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ResourceManagerRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ResourceManagerRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ResourceManagerRequestedEventArgs {
      val address = segment.toRawLongValue()
      return ResourceManagerRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ResourceManagerRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
