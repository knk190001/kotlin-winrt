package Windows.ApplicationModel.Calls

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

@ABIMarker(PhoneCallHistoryManagerForUser.ABI::class)
@Signature("rc(Windows.ApplicationModel.Calls.PhoneCallHistoryManagerForUser;{d925c523-f55f-4353-9db4-0205a5265a55})")
@WinRTByReference(brClass = PhoneCallHistoryManagerForUser.ByReference::class)
public class PhoneCallHistoryManagerForUser(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhoneCallHistoryManagerForUser.WithDefault, IWinRTObject {
  private val __1712544237_Interface: IPhoneCallHistoryManagerForUser.WithDefault by lazy {
    as_1712544237()
  }


  public override val __1712544237_Ptr: JNAPointer? by lazy {
    __1712544237_Interface.__1712544237_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1712544237_Interface)

  private fun as_1712544237(): IPhoneCallHistoryManagerForUser.WithDefault {
    if(pointer == NULL) {
      return(IPhoneCallHistoryManagerForUser.ABI.makeIPhoneCallHistoryManagerForUser(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneCallHistoryManagerForUser>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneCallHistoryManagerForUser.ABI.makeIPhoneCallHistoryManagerForUser(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhoneCallHistoryManagerForUser> {
    public override fun getValue() = PhoneCallHistoryManagerForUser(pointer.getPointer(0))

    public fun setValue(value: PhoneCallHistoryManagerForUser): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneCallHistoryManagerForUser, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PhoneCallHistoryManagerForUser {
      val address = segment.toRawLongValue()
      return PhoneCallHistoryManagerForUser(Pointer(address))
    }

    public override fun toNative(obj: PhoneCallHistoryManagerForUser): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
