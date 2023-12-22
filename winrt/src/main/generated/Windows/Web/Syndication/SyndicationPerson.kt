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

@ABIMarker(SyndicationPerson.ABI::class)
@Signature("rc(Windows.Web.Syndication.SyndicationPerson;{fa1ee5da-a7c6-4517-a096-0143faf29327})")
@WinRTByReference(brClass = SyndicationPerson.ByReference::class)
public class SyndicationPerson(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISyndicationPerson.WithDefault, ISyndicationNode.WithDefault, IWinRTObject {
  private val __1162502917_Interface: ISyndicationPerson.WithDefault by lazy {
    as_1162502917()
  }


  private val __1576492622_Interface: ISyndicationNode.WithDefault by lazy {
    as_1576492622()
  }


  public override val __1162502917_Ptr: JNAPointer? by lazy {
    __1162502917_Interface.__1162502917_Ptr
  }


  public override val __1576492622_Ptr: JNAPointer? by lazy {
    __1576492622_Interface.__1576492622_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1162502917_Interface, __1576492622_Interface)

  public constructor() : this(ABI.activate())

  public constructor(name: String) : this(ABI.activate(name))

  public constructor(
    name: String,
    email: String,
    uri: Uri
  ) : this(ABI.activate(name, email, uri))

  private fun as_1162502917(): ISyndicationPerson.WithDefault {
    if(pointer == NULL) {
      return(ISyndicationPerson.ABI.makeISyndicationPerson(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISyndicationPerson>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISyndicationPerson.ABI.makeISyndicationPerson(ref.value))
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
      IByReference<SyndicationPerson> {
    public override fun getValue() = SyndicationPerson(pointer.getPointer(0))

    public fun setValue(value: SyndicationPerson): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SyndicationPerson, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ISyndicationPersonFactory_Instance: ISyndicationPersonFactory by lazy {
      createISyndicationPersonFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Syndication.SyndicationPerson".toHandle(),
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

    public fun createISyndicationPersonFactory(): ISyndicationPersonFactory {
      val refiid = Guid.REFIID(ISyndicationPersonFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Syndication.SyndicationPerson".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISyndicationPersonFactory.ABI.makeISyndicationPersonFactory(factoryActivatorPtr.value))
    }

    public fun activate(name: String): JNAPointer? =
        ISyndicationPersonFactory_Instance.CreateSyndicationPerson(name)?.pointer

    public fun activate(
      name: String,
      email: String,
      uri: Uri
    ): JNAPointer? = ISyndicationPersonFactory_Instance.CreateSyndicationPersonEx(name, email,
        uri)?.pointer

    public override fun fromNative(segment: MemoryAddress): SyndicationPerson {
      val address = segment.toRawLongValue()
      return SyndicationPerson(Pointer(address))
    }

    public override fun toNative(obj: SyndicationPerson): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
