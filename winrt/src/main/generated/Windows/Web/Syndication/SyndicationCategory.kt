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

@ABIMarker(SyndicationCategory.ABI::class)
@Signature("rc(Windows.Web.Syndication.SyndicationCategory;{8715626f-0cba-4a7f-89ff-ecb5281423b6})")
@WinRTByReference(brClass = SyndicationCategory.ByReference::class)
public class SyndicationCategory(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISyndicationCategory.WithDefault, ISyndicationNode.WithDefault, IWinRTObject {
  private val __81156270_Interface: ISyndicationCategory.WithDefault by lazy {
    as_81156270()
  }


  private val __1576492622_Interface: ISyndicationNode.WithDefault by lazy {
    as_1576492622()
  }


  public override val __81156270_Ptr: JNAPointer? by lazy {
    __81156270_Interface.__81156270_Ptr
  }


  public override val __1576492622_Ptr: JNAPointer? by lazy {
    __1576492622_Interface.__1576492622_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__81156270_Interface, __1576492622_Interface)

  public constructor() : this(ABI.activate())

  public constructor(term: String) : this(ABI.activate(term))

  public constructor(
    term: String,
    scheme: String,
    label: String
  ) : this(ABI.activate(term, scheme, label))

  private fun as_81156270(): ISyndicationCategory.WithDefault {
    if(pointer == NULL) {
      return(ISyndicationCategory.ABI.makeISyndicationCategory(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISyndicationCategory>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISyndicationCategory.ABI.makeISyndicationCategory(ref.value))
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
      IByReference<SyndicationCategory> {
    public override fun getValue() = SyndicationCategory(pointer.getPointer(0))

    public fun setValue(value: SyndicationCategory): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SyndicationCategory, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ISyndicationCategoryFactory_Instance: ISyndicationCategoryFactory by lazy {
      createISyndicationCategoryFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Syndication.SyndicationCategory".toHandle(),
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

    public fun createISyndicationCategoryFactory(): ISyndicationCategoryFactory {
      val refiid = Guid.REFIID(ISyndicationCategoryFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Syndication.SyndicationCategory".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISyndicationCategoryFactory.ABI.makeISyndicationCategoryFactory(factoryActivatorPtr.value))
    }

    public fun activate(term: String): JNAPointer? =
        ISyndicationCategoryFactory_Instance.CreateSyndicationCategory(term)?.pointer

    public fun activate(
      term: String,
      scheme: String,
      label: String
    ): JNAPointer? = ISyndicationCategoryFactory_Instance.CreateSyndicationCategoryEx(term, scheme,
        label)?.pointer

    public override fun fromNative(segment: MemoryAddress): SyndicationCategory {
      val address = segment.toRawLongValue()
      return SyndicationCategory(Pointer(address))
    }

    public override fun toNative(obj: SyndicationCategory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
