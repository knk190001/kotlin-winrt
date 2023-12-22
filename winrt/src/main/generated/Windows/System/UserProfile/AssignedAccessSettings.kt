package Windows.System.UserProfile

import Windows.System.User
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(AssignedAccessSettings.ABI::class)
@Signature("rc(Windows.System.UserProfile.AssignedAccessSettings;{1bc57f1c-e971-5757-b8e0-512f8b8c46d2})")
@WinRTByReference(brClass = AssignedAccessSettings.ByReference::class)
public class AssignedAccessSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAssignedAccessSettings.WithDefault, IWinRTObject {
  private val __1012738036_Interface: IAssignedAccessSettings.WithDefault by lazy {
    as_1012738036()
  }


  public override val __1012738036_Ptr: JNAPointer? by lazy {
    __1012738036_Interface.__1012738036_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1012738036_Interface)

  private fun as_1012738036(): IAssignedAccessSettings.WithDefault {
    if(pointer == NULL) {
      return(IAssignedAccessSettings.ABI.makeIAssignedAccessSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAssignedAccessSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAssignedAccessSettings.ABI.makeIAssignedAccessSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AssignedAccessSettings> {
    public override fun getValue() = AssignedAccessSettings(pointer.getPointer(0))

    public fun setValue(value: AssignedAccessSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AssignedAccessSettings, MemoryAddress> {
    public val IAssignedAccessSettingsStatics_Instance: IAssignedAccessSettingsStatics by lazy {
      createIAssignedAccessSettingsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAssignedAccessSettingsStatics(): IAssignedAccessSettingsStatics {
      val refiid = Guid.REFIID(IAssignedAccessSettingsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.UserProfile.AssignedAccessSettings".toHandle(),refiid,interfacePtr)
      val result =
          IAssignedAccessSettingsStatics.ABI.makeIAssignedAccessSettingsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AssignedAccessSettings {
      val address = segment.toRawLongValue()
      return AssignedAccessSettings(Pointer(address))
    }

    public override fun toNative(obj: AssignedAccessSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.IAssignedAccessSettingsStatics_Instance.GetDefault()

    public fun GetForUser(user: User) = ABI.IAssignedAccessSettingsStatics_Instance.GetForUser(user)
  }
}
