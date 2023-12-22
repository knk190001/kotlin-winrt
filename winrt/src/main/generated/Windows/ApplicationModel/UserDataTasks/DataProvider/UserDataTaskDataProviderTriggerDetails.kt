package Windows.ApplicationModel.UserDataTasks.DataProvider

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

@ABIMarker(UserDataTaskDataProviderTriggerDetails.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserDataTasks.DataProvider.UserDataTaskDataProviderTriggerDetails;{ae273202-b1c9-453e-afc5-b30af3bd217d})")
@WinRTByReference(brClass = UserDataTaskDataProviderTriggerDetails.ByReference::class)
public class UserDataTaskDataProviderTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserDataTaskDataProviderTriggerDetails.WithDefault, IWinRTObject {
  private val __164107726_Interface: IUserDataTaskDataProviderTriggerDetails.WithDefault by lazy {
    as_164107726()
  }


  public override val __164107726_Ptr: JNAPointer? by lazy {
    __164107726_Interface.__164107726_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__164107726_Interface)

  private fun as_164107726(): IUserDataTaskDataProviderTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IUserDataTaskDataProviderTriggerDetails.ABI.makeIUserDataTaskDataProviderTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataTaskDataProviderTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataTaskDataProviderTriggerDetails.ABI.makeIUserDataTaskDataProviderTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserDataTaskDataProviderTriggerDetails> {
    public override fun getValue() = UserDataTaskDataProviderTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: UserDataTaskDataProviderTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataTaskDataProviderTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UserDataTaskDataProviderTriggerDetails {
      val address = segment.toRawLongValue()
      return UserDataTaskDataProviderTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: UserDataTaskDataProviderTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
