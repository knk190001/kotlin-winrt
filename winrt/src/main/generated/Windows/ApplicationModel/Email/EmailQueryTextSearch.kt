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

@ABIMarker(EmailQueryTextSearch.ABI::class)
@Signature("rc(Windows.ApplicationModel.Email.EmailQueryTextSearch;{9fa0a288-3c5d-46a5-a6e2-31d6fd17e540})")
@WinRTByReference(brClass = EmailQueryTextSearch.ByReference::class)
public class EmailQueryTextSearch(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailQueryTextSearch.WithDefault, IWinRTObject {
  private val __2061559032_Interface: IEmailQueryTextSearch.WithDefault by lazy {
    as_2061559032()
  }


  public override val __2061559032_Ptr: JNAPointer? by lazy {
    __2061559032_Interface.__2061559032_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2061559032_Interface)

  private fun as_2061559032(): IEmailQueryTextSearch.WithDefault {
    if(pointer == NULL) {
      return(IEmailQueryTextSearch.ABI.makeIEmailQueryTextSearch(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailQueryTextSearch>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailQueryTextSearch.ABI.makeIEmailQueryTextSearch(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailQueryTextSearch> {
    public override fun getValue() = EmailQueryTextSearch(pointer.getPointer(0))

    public fun setValue(value: EmailQueryTextSearch): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailQueryTextSearch, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EmailQueryTextSearch {
      val address = segment.toRawLongValue()
      return EmailQueryTextSearch(Pointer(address))
    }

    public override fun toNative(obj: EmailQueryTextSearch): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
