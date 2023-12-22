package Windows.Web.AtomPub

import Windows.Web.Syndication.ISyndicationNode
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

@ABIMarker(ServiceDocument.ABI::class)
@Signature("rc(Windows.Web.AtomPub.ServiceDocument;{8b7ec771-2ab3-4dbe-8bcc-778f92b75e51})")
@WinRTByReference(brClass = ServiceDocument.ByReference::class)
public class ServiceDocument(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IServiceDocument.WithDefault, ISyndicationNode.WithDefault, IWinRTObject {
  private val __187766126_Interface: IServiceDocument.WithDefault by lazy {
    as_187766126()
  }


  private val __1576492622_Interface: ISyndicationNode.WithDefault by lazy {
    as_1576492622()
  }


  public override val __187766126_Ptr: JNAPointer? by lazy {
    __187766126_Interface.__187766126_Ptr
  }


  public override val __1576492622_Ptr: JNAPointer? by lazy {
    __1576492622_Interface.__1576492622_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__187766126_Interface, __1576492622_Interface)

  private fun as_187766126(): IServiceDocument.WithDefault {
    if(pointer == NULL) {
      return(IServiceDocument.ABI.makeIServiceDocument(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IServiceDocument>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IServiceDocument.ABI.makeIServiceDocument(ref.value))
  }

  private fun as_1576492622(): ISyndicationNode.WithDefault {
    if(pointer == NULL) {
      return(ISyndicationNode.ABI.makeISyndicationNode(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISyndicationNode>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISyndicationNode.ABI.makeISyndicationNode(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ServiceDocument> {
    public override fun getValue() = ServiceDocument(pointer.getPointer(0))

    public fun setValue(value: ServiceDocument): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ServiceDocument, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ServiceDocument {
      val address = segment.toRawLongValue()
      return ServiceDocument(Pointer(address))
    }

    public override fun toNative(obj: ServiceDocument): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
