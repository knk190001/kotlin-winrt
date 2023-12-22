package Windows.ApplicationModel.Email

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

@ABIMarker(EmailMailbox.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.EmailMailbox;{a8790649-cf5b-411b-80b1-4a6a1484ce25})")
@WinRTByReference(brClass = EmailMailbox.ByReference::class)
public class EmailMailbox(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailMailbox.WithDefault, IEmailMailbox2.WithDefault,
    IEmailMailbox3.WithDefault, IEmailMailbox4.WithDefault, IEmailMailbox5.WithDefault, IWinRTObject
    {
  private val __164914033_Interface: IEmailMailbox.WithDefault by lazy {
    as_164914033()
  }


  private val __817367677_Interface: IEmailMailbox2.WithDefault by lazy {
    as_817367677()
  }


  private val __817367676_Interface: IEmailMailbox3.WithDefault by lazy {
    as_817367676()
  }


  private val __817367675_Interface: IEmailMailbox4.WithDefault by lazy {
    as_817367675()
  }


  private val __817367674_Interface: IEmailMailbox5.WithDefault by lazy {
    as_817367674()
  }


  public override val __164914033_Ptr: JNAPointer? by lazy {
    __164914033_Interface.__164914033_Ptr
  }


  public override val __817367677_Ptr: JNAPointer? by lazy {
    __817367677_Interface.__817367677_Ptr
  }


  public override val __817367676_Ptr: JNAPointer? by lazy {
    __817367676_Interface.__817367676_Ptr
  }


  public override val __817367675_Ptr: JNAPointer? by lazy {
    __817367675_Interface.__817367675_Ptr
  }


  public override val __817367674_Ptr: JNAPointer? by lazy {
    __817367674_Interface.__817367674_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__164914033_Interface, __817367677_Interface, __817367676_Interface,
        __817367675_Interface, __817367674_Interface)

  private fun as_164914033(): IEmailMailbox.WithDefault {
    if(pointer == NULL) {
      return(IEmailMailbox.ABI.makeIEmailMailbox(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMailbox>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMailbox.ABI.makeIEmailMailbox(ref.value))
  }

  private fun as_817367677(): IEmailMailbox2.WithDefault {
    if(pointer == NULL) {
      return(IEmailMailbox2.ABI.makeIEmailMailbox2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMailbox2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMailbox2.ABI.makeIEmailMailbox2(ref.value))
  }

  private fun as_817367676(): IEmailMailbox3.WithDefault {
    if(pointer == NULL) {
      return(IEmailMailbox3.ABI.makeIEmailMailbox3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMailbox3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMailbox3.ABI.makeIEmailMailbox3(ref.value))
  }

  private fun as_817367675(): IEmailMailbox4.WithDefault {
    if(pointer == NULL) {
      return(IEmailMailbox4.ABI.makeIEmailMailbox4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMailbox4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMailbox4.ABI.makeIEmailMailbox4(ref.value))
  }

  private fun as_817367674(): IEmailMailbox5.WithDefault {
    if(pointer == NULL) {
      return(IEmailMailbox5.ABI.makeIEmailMailbox5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailMailbox5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailMailbox5.ABI.makeIEmailMailbox5(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<EmailMailbox> {
    public override fun getValue() = EmailMailbox(pointer.getPointer(0))

    public fun setValue(value: EmailMailbox): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailMailbox, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EmailMailbox {
      val address = segment.toRawLongValue()
      return EmailMailbox(Pointer(address))
    }

    public override fun toNative(obj: EmailMailbox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
