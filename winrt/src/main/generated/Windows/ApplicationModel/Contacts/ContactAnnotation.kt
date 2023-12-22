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

@ABIMarker(ContactAnnotation.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.ContactAnnotation;{821fc2ef-7d41-44a2-84c3-60a281dd7b86})")
@WinRTByReference(brClass = ContactAnnotation.ByReference::class)
public class ContactAnnotation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactAnnotation.WithDefault, IContactAnnotation2.WithDefault, IWinRTObject
    {
  private val __34647037_Interface: IContactAnnotation.WithDefault by lazy {
    as_34647037()
  }


  private val __1074058097_Interface: IContactAnnotation2.WithDefault by lazy {
    as_1074058097()
  }


  public override val __34647037_Ptr: JNAPointer? by lazy {
    __34647037_Interface.__34647037_Ptr
  }


  public override val __1074058097_Ptr: JNAPointer? by lazy {
    __1074058097_Interface.__1074058097_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__34647037_Interface, __1074058097_Interface)

  public constructor() : this(ABI.activate())

  private fun as_34647037(): IContactAnnotation.WithDefault {
    if(pointer == NULL) {
      return(IContactAnnotation.ABI.makeIContactAnnotation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactAnnotation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactAnnotation.ABI.makeIContactAnnotation(ref.value))
  }

  private fun as_1074058097(): IContactAnnotation2.WithDefault {
    if(pointer == NULL) {
      return(IContactAnnotation2.ABI.makeIContactAnnotation2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactAnnotation2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactAnnotation2.ABI.makeIContactAnnotation2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactAnnotation> {
    public override fun getValue() = ContactAnnotation(pointer.getPointer(0))

    public fun setValue(value: ContactAnnotation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactAnnotation, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Contacts.ContactAnnotation".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): ContactAnnotation {
      val address = segment.toRawLongValue()
      return ContactAnnotation(Pointer(address))
    }

    public override fun toNative(obj: ContactAnnotation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
