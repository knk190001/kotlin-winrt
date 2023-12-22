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

@ABIMarker(SyndicationAttribute.ABI::class)
@Signature("rc(Windows.Web.Syndication.SyndicationAttribute;{71e8f969-526e-4001-9a91-e84f83161ab1})")
@WinRTByReference(brClass = SyndicationAttribute.ByReference::class)
public class SyndicationAttribute(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISyndicationAttribute.WithDefault, IWinRTObject {
  private val __963085548_Interface: ISyndicationAttribute.WithDefault by lazy {
    as_963085548()
  }


  public override val __963085548_Ptr: JNAPointer? by lazy {
    __963085548_Interface.__963085548_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__963085548_Interface)

  public constructor() : this(ABI.activate())

  public constructor(
    attributeName: String,
    attributeNamespace: String,
    attributeValue: String
  ) : this(ABI.activate(attributeName, attributeNamespace, attributeValue))

  private fun as_963085548(): ISyndicationAttribute.WithDefault {
    if(pointer == NULL) {
      return(ISyndicationAttribute.ABI.makeISyndicationAttribute(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISyndicationAttribute>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISyndicationAttribute.ABI.makeISyndicationAttribute(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SyndicationAttribute> {
    public override fun getValue() = SyndicationAttribute(pointer.getPointer(0))

    public fun setValue(value: SyndicationAttribute): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SyndicationAttribute, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ISyndicationAttributeFactory_Instance: ISyndicationAttributeFactory by lazy {
      createISyndicationAttributeFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Syndication.SyndicationAttribute".toHandle(),
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

    public fun createISyndicationAttributeFactory(): ISyndicationAttributeFactory {
      val refiid = Guid.REFIID(ISyndicationAttributeFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Syndication.SyndicationAttribute".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISyndicationAttributeFactory.ABI.makeISyndicationAttributeFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      attributeName: String,
      attributeNamespace: String,
      attributeValue: String
    ): JNAPointer? = ISyndicationAttributeFactory_Instance.CreateSyndicationAttribute(attributeName,
        attributeNamespace, attributeValue)?.pointer

    public override fun fromNative(segment: MemoryAddress): SyndicationAttribute {
      val address = segment.toRawLongValue()
      return SyndicationAttribute(Pointer(address))
    }

    public override fun toNative(obj: SyndicationAttribute): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
