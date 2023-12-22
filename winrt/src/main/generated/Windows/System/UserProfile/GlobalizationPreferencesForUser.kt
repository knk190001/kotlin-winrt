package Windows.System.UserProfile

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

@ABIMarker(GlobalizationPreferencesForUser.ABI::class)
@Signature("rc(Windows.System.UserProfile.GlobalizationPreferencesForUser;{150f0795-4f6e-40ba-a010-e27d81bda7f5})")
@WinRTByReference(brClass = GlobalizationPreferencesForUser.ByReference::class)
public class GlobalizationPreferencesForUser(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGlobalizationPreferencesForUser.WithDefault, IWinRTObject {
  private val __1814922914_Interface: IGlobalizationPreferencesForUser.WithDefault by lazy {
    as_1814922914()
  }


  public override val __1814922914_Ptr: JNAPointer? by lazy {
    __1814922914_Interface.__1814922914_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1814922914_Interface)

  private fun as_1814922914(): IGlobalizationPreferencesForUser.WithDefault {
    if(pointer == NULL) {
      return(IGlobalizationPreferencesForUser.ABI.makeIGlobalizationPreferencesForUser(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGlobalizationPreferencesForUser>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGlobalizationPreferencesForUser.ABI.makeIGlobalizationPreferencesForUser(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GlobalizationPreferencesForUser> {
    public override fun getValue() = GlobalizationPreferencesForUser(pointer.getPointer(0))

    public fun setValue(value: GlobalizationPreferencesForUser): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GlobalizationPreferencesForUser, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GlobalizationPreferencesForUser {
      val address = segment.toRawLongValue()
      return GlobalizationPreferencesForUser(Pointer(address))
    }

    public override fun toNative(obj: GlobalizationPreferencesForUser): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
