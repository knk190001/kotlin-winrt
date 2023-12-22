package Windows.Phone.PersonalInformation

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

@ABIMarker(ContactQueryOptions.ABI::class)
@Signature("rc(Windows.Phone.PersonalInformation.ContactQueryOptions;{580cab76-3f31-46c1-9a50-424a53dacae3})")
@WinRTByReference(brClass = ContactQueryOptions.ByReference::class)
public class ContactQueryOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactQueryOptions.WithDefault, IWinRTObject {
  private val __806013522_Interface: IContactQueryOptions.WithDefault by lazy {
    as_806013522()
  }


  public override val __806013522_Ptr: JNAPointer? by lazy {
    __806013522_Interface.__806013522_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__806013522_Interface)

  public constructor() : this(ABI.activate())

  private fun as_806013522(): IContactQueryOptions.WithDefault {
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


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Phone.PersonalInformation.ContactQueryOptions".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): ContactQueryOptions {
      val address = segment.toRawLongValue()
      return ContactQueryOptions(Pointer(address))
    }

    public override fun toNative(obj: ContactQueryOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
