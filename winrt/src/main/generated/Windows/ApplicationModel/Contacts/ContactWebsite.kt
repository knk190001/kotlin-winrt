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

@ABIMarker(ContactWebsite.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.ContactWebsite;{9f130176-dc1b-4055-ad66-652f39d990e8})")
@WinRTByReference(brClass = ContactWebsite.ByReference::class)
public class ContactWebsite(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactWebsite.WithDefault, IContactWebsite2.WithDefault, IWinRTObject {
  private val __438613945_Interface: IContactWebsite.WithDefault by lazy {
    as_438613945()
  }


  private val __712130357_Interface: IContactWebsite2.WithDefault by lazy {
    as_712130357()
  }


  public override val __438613945_Ptr: JNAPointer? by lazy {
    __438613945_Interface.__438613945_Ptr
  }


  public override val __712130357_Ptr: JNAPointer? by lazy {
    __712130357_Interface.__712130357_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__438613945_Interface, __712130357_Interface)

  public constructor() : this(ABI.activate())

  private fun as_438613945(): IContactWebsite.WithDefault {
    if(pointer == NULL) {
      return(IContactWebsite.ABI.makeIContactWebsite(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactWebsite>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactWebsite.ABI.makeIContactWebsite(ref.value))
  }

  private fun as_712130357(): IContactWebsite2.WithDefault {
    if(pointer == NULL) {
      return(IContactWebsite2.ABI.makeIContactWebsite2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactWebsite2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactWebsite2.ABI.makeIContactWebsite2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ContactWebsite>
      {
    public override fun getValue() = ContactWebsite(pointer.getPointer(0))

    public fun setValue(value: ContactWebsite): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactWebsite, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Contacts.ContactWebsite".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): ContactWebsite {
      val address = segment.toRawLongValue()
      return ContactWebsite(Pointer(address))
    }

    public override fun toNative(obj: ContactWebsite): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
