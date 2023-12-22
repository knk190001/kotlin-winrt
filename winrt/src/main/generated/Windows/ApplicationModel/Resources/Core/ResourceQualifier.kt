package Windows.ApplicationModel.Resources.Core

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

@ABIMarker(ResourceQualifier.ABI::class)
@Signature("rc(Windows.ApplicationModel.Resources.Core.ResourceQualifier;{785da5b2-4afd-4376-a888-c5f9a6b7a05c})")
@WinRTByReference(brClass = ResourceQualifier.ByReference::class)
public class ResourceQualifier(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IResourceQualifier.WithDefault, IWinRTObject {
  private val __662052773_Interface: IResourceQualifier.WithDefault by lazy {
    as_662052773()
  }


  public override val __662052773_Ptr: JNAPointer? by lazy {
    __662052773_Interface.__662052773_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__662052773_Interface)

  private fun as_662052773(): IResourceQualifier.WithDefault {
    if(pointer == NULL) {
      return(IResourceQualifier.ABI.makeIResourceQualifier(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IResourceQualifier>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IResourceQualifier.ABI.makeIResourceQualifier(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ResourceQualifier> {
    public override fun getValue() = ResourceQualifier(pointer.getPointer(0))

    public fun setValue(value: ResourceQualifier): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ResourceQualifier, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ResourceQualifier {
      val address = segment.toRawLongValue()
      return ResourceQualifier(Pointer(address))
    }

    public override fun toNative(obj: ResourceQualifier): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
