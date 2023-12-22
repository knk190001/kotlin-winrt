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

@ABIMarker(ContactMapActivatedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Activation.ContactMapActivatedEventArgs;{b32bf870-eee7-4ad2-aaf1-a87effcf00a4})")
@WinRTByReference(brClass = ContactMapActivatedEventArgs.ByReference::class)
public class ContactMapActivatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactMapActivatedEventArgs.WithDefault,
    IContactActivatedEventArgs.WithDefault, IActivatedEventArgs.WithDefault, IWinRTObject {
  private val __716213643_Interface: IContactMapActivatedEventArgs.WithDefault by lazy {
    as_716213643()
  }


  private val __90994973_Interface: IContactActivatedEventArgs.WithDefault by lazy {
    as_90994973()
  }


  private val __1721660047_Interface: IActivatedEventArgs.WithDefault by lazy {
    as_1721660047()
  }


  public override val __716213643_Ptr: JNAPointer? by lazy {
    __716213643_Interface.__716213643_Ptr
  }


  public override val __90994973_Ptr: JNAPointer? by lazy {
    __90994973_Interface.__90994973_Ptr
  }


  public override val __1721660047_Ptr: JNAPointer? by lazy {
    __1721660047_Interface.__1721660047_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__716213643_Interface, __90994973_Interface, __1721660047_Interface)

  private fun as_716213643(): IContactMapActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IContactMapActivatedEventArgs.ABI.makeIContactMapActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactMapActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactMapActivatedEventArgs.ABI.makeIContactMapActivatedEventArgs(ref.value))
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
      IByReference<ContactMapActivatedEventArgs> {
    public override fun getValue() = ContactMapActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ContactMapActivatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactMapActivatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContactMapActivatedEventArgs {
      val address = segment.toRawLongValue()
      return ContactMapActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ContactMapActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
