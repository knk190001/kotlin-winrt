package Windows.Web.Syndication

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(SyndicationNode.ABI::class)
@Signature("rc(Windows.Web.Syndication.SyndicationNode;{753cef78-51f8-45c0-a9f5-f1719dec3fb2})")
@WinRTByReference(brClass = SyndicationNode.ByReference::class)
public class SyndicationNode(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISyndicationNode.WithDefault, IWinRTObject {
  private val __1576492622_Interface: ISyndicationNode.WithDefault by lazy {
    as_1576492622()
  }


  public override val __1576492622_Ptr: JNAPointer? by lazy {
    __1576492622_Interface.__1576492622_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1576492622_Interface)

  public constructor() : this(ABI.activate())

  public constructor(
    nodeName: String,
    nodeNamespace: String,
    nodeValue: String
  ) : this(ABI.activate(nodeName, nodeNamespace, nodeValue))

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
      IByReference<SyndicationNode> {
    public override fun getValue() = SyndicationNode(pointer.getPointer(0))

    public fun setValue(value: SyndicationNode): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SyndicationNode, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ISyndicationNodeFactory_Instance: ISyndicationNodeFactory by lazy {
      createISyndicationNodeFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Web.Syndication.SyndicationNode".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createISyndicationNodeFactory(): ISyndicationNodeFactory {
      val refiid = Guid.REFIID(ISyndicationNodeFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Syndication.SyndicationNode".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISyndicationNodeFactory.ABI.makeISyndicationNodeFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      nodeName: String,
      nodeNamespace: String,
      nodeValue: String
    ): JNAPointer? = ISyndicationNodeFactory_Instance.CreateSyndicationNode(nodeName, nodeNamespace,
        nodeValue)?.pointer

    public override fun fromNative(segment: MemoryAddress): SyndicationNode {
      val address = segment.toRawLongValue()
      return SyndicationNode(Pointer(address))
    }

    public override fun toNative(obj: SyndicationNode): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
