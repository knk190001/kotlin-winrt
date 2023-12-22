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

@ABIMarker(ResourceContext.ABI::class)
@Signature("rc(Microsoft.Windows.ApplicationModel.Resources.ResourceContext;{7a3b1158-798c-5949-969d-03510b9ce6ca})")
@WinRTByReference(brClass = ResourceContext.ByReference::class)
public class ResourceContext(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IResourceContext2.WithDefault, IResourceContext.WithDefault, IWinRTObject {
  private val __408935265_Interface: IResourceContext2.WithDefault by lazy {
    as_408935265()
  }


  private val __818092531_Interface: IResourceContext.WithDefault by lazy {
    as_818092531()
  }


  public override val __408935265_Ptr: JNAPointer? by lazy {
    __408935265_Interface.__408935265_Ptr
  }


  public override val __818092531_Ptr: JNAPointer? by lazy {
    __818092531_Interface.__818092531_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__408935265_Interface, __818092531_Interface)

  private fun as_408935265(): IResourceContext2.WithDefault {
    if(pointer == NULL) {
      return(IResourceContext2.ABI.makeIResourceContext2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IResourceContext2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IResourceContext2.ABI.makeIResourceContext2(ref.value))
  }

  private fun as_818092531(): IResourceContext.WithDefault {
    if(pointer == NULL) {
      return(IResourceContext.ABI.makeIResourceContext(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IResourceContext>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IResourceContext.ABI.makeIResourceContext(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ResourceContext> {
    public override fun getValue() = ResourceContext(pointer.getPointer(0))

    public fun setValue(value: ResourceContext): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ResourceContext, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ResourceContext {
      val address = segment.toRawLongValue()
      return ResourceContext(Pointer(address))
    }

    public override fun toNative(obj: ResourceContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
