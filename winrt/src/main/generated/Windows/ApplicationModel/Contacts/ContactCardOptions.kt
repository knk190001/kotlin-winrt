package Windows.ApplicationModel.Contacts

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ContactCardOptions.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.ContactCardOptions;{8c0a4f7e-6ab6-4f3f-be72-817236eeea5b})")
@WinRTByReference(brClass = ContactCardOptions.ByReference::class)
public class ContactCardOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactCardOptions.WithDefault, IContactCardOptions2.WithDefault,
    IWinRTObject {
  private val __792673510_Interface: IContactCardOptions.WithDefault by lazy {
    as_792673510()
  }


  private val __1196925016_Interface: IContactCardOptions2.WithDefault by lazy {
    as_1196925016()
  }


  public override val __792673510_Ptr: JNAPointer? by lazy {
    __792673510_Interface.__792673510_Ptr
  }


  public override val __1196925016_Ptr: JNAPointer? by lazy {
    __1196925016_Interface.__1196925016_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__792673510_Interface, __1196925016_Interface)

  public constructor() : this(ABI.activate())

  private fun as_792673510(): IContactCardOptions.WithDefault {
    if(pointer == NULL) {
      return(IContactCardOptions.ABI.makeIContactCardOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactCardOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactCardOptions.ABI.makeIContactCardOptions(ref.value))
  }

  private fun as_1196925016(): IContactCardOptions2.WithDefault {
    if(pointer == NULL) {
      return(IContactCardOptions2.ABI.makeIContactCardOptions2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactCardOptions2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactCardOptions2.ABI.makeIContactCardOptions2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactCardOptions> {
    public override fun getValue() = ContactCardOptions(pointer.getPointer(0))

    public fun setValue(value: ContactCardOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactCardOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Contacts.ContactCardOptions".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): ContactCardOptions {
      val address = segment.toRawLongValue()
      return ContactCardOptions(Pointer(address))
    }

    public override fun toNative(obj: ContactCardOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
