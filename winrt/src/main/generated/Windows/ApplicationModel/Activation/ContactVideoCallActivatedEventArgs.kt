package Windows.ApplicationModel.Activation

import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(ContactVideoCallActivatedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Activation.ContactVideoCallActivatedEventArgs;{61079db8-e3e7-4b4f-858d-5c63a96ef684})")
@WinRTByReference(brClass = ContactVideoCallActivatedEventArgs.ByReference::class)
public class ContactVideoCallActivatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactVideoCallActivatedEventArgs.WithDefault,
    IContactActivatedEventArgs.WithDefault, IActivatedEventArgs.WithDefault, IWinRTObject {
  private val __1426124200_Interface: IContactVideoCallActivatedEventArgs.WithDefault by lazy {
    as_1426124200()
  }


  private val __90994973_Interface: IContactActivatedEventArgs.WithDefault by lazy {
    as_90994973()
  }


  private val __1721660047_Interface: IActivatedEventArgs.WithDefault by lazy {
    as_1721660047()
  }


  public override val __1426124200_Ptr: JNAPointer? by lazy {
    __1426124200_Interface.__1426124200_Ptr
  }


  public override val __90994973_Ptr: JNAPointer? by lazy {
    __90994973_Interface.__90994973_Ptr
  }


  public override val __1721660047_Ptr: JNAPointer? by lazy {
    __1721660047_Interface.__1721660047_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1426124200_Interface, __90994973_Interface, __1721660047_Interface)

  private fun as_1426124200(): IContactVideoCallActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IContactVideoCallActivatedEventArgs.ABI.makeIContactVideoCallActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactVideoCallActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactVideoCallActivatedEventArgs.ABI.makeIContactVideoCallActivatedEventArgs(ref.value))
  }

  private fun as_90994973(): IContactActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IContactActivatedEventArgs.ABI.makeIContactActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactActivatedEventArgs.ABI.makeIContactActivatedEventArgs(ref.value))
  }

  private fun as_1721660047(): IActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IActivatedEventArgs.ABI.makeIActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IActivatedEventArgs.ABI.makeIActivatedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactVideoCallActivatedEventArgs> {
    public override fun getValue() = ContactVideoCallActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ContactVideoCallActivatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactVideoCallActivatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContactVideoCallActivatedEventArgs {
      val address = segment.toRawLongValue()
      return ContactVideoCallActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ContactVideoCallActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
