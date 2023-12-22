package Microsoft.Windows.ApplicationModel.Resources

import Microsoft.Windows.ApplicationModel.Resources.IResourceCandidateFactory.ABI.IID
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
import kotlin.Byte
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ResourceCandidate.ABI::class)
@Signature("rc(Microsoft.Windows.ApplicationModel.Resources.ResourceCandidate;{6c54bc0c-ef1e-57b8-b478-34fece737356})")
@WinRTByReference(brClass = ResourceCandidate.ByReference::class)
public class ResourceCandidate(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IResourceCandidate.WithDefault, IWinRTObject {
  private val __1123383495_Interface: IResourceCandidate.WithDefault by lazy {
    as_1123383495()
  }


  public override val __1123383495_Ptr: JNAPointer? by lazy {
    __1123383495_Interface.__1123383495_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1123383495_Interface)

  public constructor(kind: ResourceCandidateKind, `data`: String) : this(ABI.activate(kind, data))

  public constructor(`data`: Array<Byte>) : this(ABI.activate(data))

  private fun as_1123383495(): IResourceCandidate.WithDefault {
    if(pointer == NULL) {
      return(IResourceCandidate.ABI.makeIResourceCandidate(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IResourceCandidate>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IResourceCandidate.ABI.makeIResourceCandidate(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ResourceCandidate> {
    public override fun getValue() = ResourceCandidate(pointer.getPointer(0))

    public fun setValue(value: ResourceCandidate): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ResourceCandidate, MemoryAddress> {
    public val IResourceCandidateFactory_Instance: IResourceCandidateFactory by lazy {
      createIResourceCandidateFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIResourceCandidateFactory(): IResourceCandidateFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.ApplicationModel.Resources.ResourceCandidate".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IResourceCandidateFactory.ABI.makeIResourceCandidateFactory(factoryActivatorPtr.value))
    }

    public fun activate(kind: ResourceCandidateKind, `data`: String): JNAPointer? =
        IResourceCandidateFactory_Instance.CreateInstance(kind, data)?.pointer

    public fun activate(`data`: Array<Byte>): JNAPointer? =
        IResourceCandidateFactory_Instance.CreateInstance2(data)?.pointer

    public override fun fromNative(segment: MemoryAddress): ResourceCandidate {
      val address = segment.toRawLongValue()
      return ResourceCandidate(Pointer(address))
    }

    public override fun toNative(obj: ResourceCandidate): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
