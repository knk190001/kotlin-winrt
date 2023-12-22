package Windows.ApplicationModel.Contacts

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

@ABIMarker(ContactQueryOptions.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.ContactQueryOptions;{4408cc9e-7d7c-42f0-8ac7-f50733ecdbc1})")
@WinRTByReference(brClass = ContactQueryOptions.ByReference::class)
public class ContactQueryOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactQueryOptions.WithDefault, IWinRTObject {
  private val __1006147722_Interface: IContactQueryOptions.WithDefault by lazy {
    as_1006147722()
  }


  public override val __1006147722_Ptr: JNAPointer? by lazy {
    __1006147722_Interface.__1006147722_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1006147722_Interface)

  public constructor() : this(ABI.activate())

  public constructor(text: String) : this(ABI.activate(text))

  public constructor(text: String, fields: ContactQuerySearchFields) : this(ABI.activate(text,
      fields))

  private fun as_1006147722(): IContactQueryOptions.WithDefault {
    if(pointer == NULL) {
      return(IContactQueryOptions.ABI.makeIContactQueryOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactQueryOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactQueryOptions.ABI.makeIContactQueryOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactQueryOptions> {
    public override fun getValue() = ContactQueryOptions(pointer.getPointer(0))

    public fun setValue(value: ContactQueryOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactQueryOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IContactQueryOptionsFactory_Instance: IContactQueryOptionsFactory by lazy {
      createIContactQueryOptionsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Contacts.ContactQueryOptions".toHandle(),
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

    public fun createIContactQueryOptionsFactory(): IContactQueryOptionsFactory {
      val refiid = Guid.REFIID(IContactQueryOptionsFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Contacts.ContactQueryOptions".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IContactQueryOptionsFactory.ABI.makeIContactQueryOptionsFactory(factoryActivatorPtr.value))
    }

    public fun activate(text: String): JNAPointer? =
        IContactQueryOptionsFactory_Instance.CreateWithText(text)?.pointer

    public fun activate(text: String, fields: ContactQuerySearchFields): JNAPointer? =
        IContactQueryOptionsFactory_Instance.CreateWithTextAndFields(text, fields)?.pointer

    public override fun fromNative(segment: MemoryAddress): ContactQueryOptions {
      val address = segment.toRawLongValue()
      return ContactQueryOptions(Pointer(address))
    }

    public override fun toNative(obj: ContactQueryOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
