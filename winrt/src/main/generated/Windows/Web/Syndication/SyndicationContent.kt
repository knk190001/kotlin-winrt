package Windows.Web.Syndication

import Windows.Foundation.Uri
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

@ABIMarker(SyndicationContent.ABI::class)
@Signature("rc(Windows.Web.Syndication.SyndicationContent;{b9cc5e80-313a-4091-a2a6-243e0ee923f9})")
@WinRTByReference(brClass = SyndicationContent.ByReference::class)
public class SyndicationContent(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISyndicationText.WithDefault, ISyndicationNode.WithDefault,
    ISyndicationContent.WithDefault, IWinRTObject {
  private val __1576322851_Interface: ISyndicationText.WithDefault by lazy {
    as_1576322851()
  }


  private val __1576492622_Interface: ISyndicationNode.WithDefault by lazy {
    as_1576492622()
  }


  private val __987143479_Interface: ISyndicationContent.WithDefault by lazy {
    as_987143479()
  }


  public override val __1576322851_Ptr: JNAPointer? by lazy {
    __1576322851_Interface.__1576322851_Ptr
  }


  public override val __1576492622_Ptr: JNAPointer? by lazy {
    __1576492622_Interface.__1576492622_Ptr
  }


  public override val __987143479_Ptr: JNAPointer? by lazy {
    __987143479_Interface.__987143479_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1576322851_Interface, __1576492622_Interface, __987143479_Interface)

  public constructor() : this(ABI.activate())

  public constructor(text: String, type: SyndicationTextType) : this(ABI.activate(text, type))

  public constructor(sourceUri: Uri) : this(ABI.activate(sourceUri))

  private fun as_1576322851(): ISyndicationText.WithDefault {
    if(pointer == NULL) {
      return(ISyndicationText.ABI.makeISyndicationText(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISyndicationText>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISyndicationText.ABI.makeISyndicationText(ref.value))
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

  private fun as_987143479(): ISyndicationContent.WithDefault {
    if(pointer == NULL) {
      return(ISyndicationContent.ABI.makeISyndicationContent(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISyndicationContent>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISyndicationContent.ABI.makeISyndicationContent(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SyndicationContent> {
    public override fun getValue() = SyndicationContent(pointer.getPointer(0))

    public fun setValue(value: SyndicationContent): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SyndicationContent, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ISyndicationContentFactory_Instance: ISyndicationContentFactory by lazy {
      createISyndicationContentFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Syndication.SyndicationContent".toHandle(),
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

    public fun createISyndicationContentFactory(): ISyndicationContentFactory {
      val refiid = Guid.REFIID(ISyndicationContentFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Syndication.SyndicationContent".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISyndicationContentFactory.ABI.makeISyndicationContentFactory(factoryActivatorPtr.value))
    }

    public fun activate(text: String, type: SyndicationTextType): JNAPointer? =
        ISyndicationContentFactory_Instance.CreateSyndicationContent(text, type)?.pointer

    public fun activate(sourceUri: Uri): JNAPointer? =
        ISyndicationContentFactory_Instance.CreateSyndicationContentWithSourceUri(sourceUri)?.pointer

    public override fun fromNative(segment: MemoryAddress): SyndicationContent {
      val address = segment.toRawLongValue()
      return SyndicationContent(Pointer(address))
    }

    public override fun toNative(obj: SyndicationContent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
