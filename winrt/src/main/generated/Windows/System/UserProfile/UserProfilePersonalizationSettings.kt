package Windows.System.UserProfile

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

@ABIMarker(UserProfilePersonalizationSettings.ABI::class)
@Signature("rc(Windows.System.UserProfile.UserProfilePersonalizationSettings;{8ceddab4-7998-46d5-8dd3-184f1c5f9ab9})")
@WinRTByReference(brClass = UserProfilePersonalizationSettings.ByReference::class)
public class UserProfilePersonalizationSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserProfilePersonalizationSettings.WithDefault, IWinRTObject {
  private val __1653777528_Interface: IUserProfilePersonalizationSettings.WithDefault by lazy {
    as_1653777528()
  }


  public override val __1653777528_Ptr: JNAPointer? by lazy {
    __1653777528_Interface.__1653777528_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1653777528_Interface)

  private fun as_1653777528(): IUserProfilePersonalizationSettings.WithDefault {
    if(pointer == NULL) {
      return(IUserProfilePersonalizationSettings.ABI.makeIUserProfilePersonalizationSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserProfilePersonalizationSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserProfilePersonalizationSettings.ABI.makeIUserProfilePersonalizationSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserProfilePersonalizationSettings> {
    public override fun getValue() = UserProfilePersonalizationSettings(pointer.getPointer(0))

    public fun setValue(value: UserProfilePersonalizationSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserProfilePersonalizationSettings, MemoryAddress> {
    public val IUserProfilePersonalizationSettingsStatics_Instance:
        IUserProfilePersonalizationSettingsStatics by lazy {
      createIUserProfilePersonalizationSettingsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIUserProfilePersonalizationSettingsStatics():
        IUserProfilePersonalizationSettingsStatics {
      val refiid = Guid.REFIID(IUserProfilePersonalizationSettingsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.UserProfile.UserProfilePersonalizationSettings".toHandle(),refiid,interfacePtr)
      val result =
          IUserProfilePersonalizationSettingsStatics.ABI.makeIUserProfilePersonalizationSettingsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): UserProfilePersonalizationSettings {
      val address = segment.toRawLongValue()
      return UserProfilePersonalizationSettings(Pointer(address))
    }

    public override fun toNative(obj: UserProfilePersonalizationSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Current() = ABI.IUserProfilePersonalizationSettingsStatics_Instance.get_Current()

    public fun IsSupported() = ABI.IUserProfilePersonalizationSettingsStatics_Instance.IsSupported()
  }
}
