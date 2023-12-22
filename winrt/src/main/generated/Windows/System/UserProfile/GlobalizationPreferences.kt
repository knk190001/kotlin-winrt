package Windows.System.UserProfile

import Windows.Foundation.Collections.IIterable
import Windows.System.User
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(GlobalizationPreferences.ABI::class)
@WinRTByReference(brClass = GlobalizationPreferences.ByReference::class)
public class GlobalizationPreferences(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GlobalizationPreferences> {
    public override fun getValue() = GlobalizationPreferences(pointer.getPointer(0))

    public fun setValue(value: GlobalizationPreferences): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GlobalizationPreferences, MemoryAddress> {
    public val IGlobalizationPreferencesStatics3_Instance: IGlobalizationPreferencesStatics3 by
        lazy {
      createIGlobalizationPreferencesStatics3()
    }


    public val IGlobalizationPreferencesStatics_Instance: IGlobalizationPreferencesStatics by lazy {
      createIGlobalizationPreferencesStatics()
    }


    public val IGlobalizationPreferencesStatics2_Instance: IGlobalizationPreferencesStatics2 by
        lazy {
      createIGlobalizationPreferencesStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGlobalizationPreferencesStatics3(): IGlobalizationPreferencesStatics3 {
      val refiid = Guid.REFIID(IGlobalizationPreferencesStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.UserProfile.GlobalizationPreferences".toHandle(),refiid,interfacePtr)
      val result =
          IGlobalizationPreferencesStatics3.ABI.makeIGlobalizationPreferencesStatics3(interfacePtr.value)
      return result
    }

    public fun createIGlobalizationPreferencesStatics(): IGlobalizationPreferencesStatics {
      val refiid = Guid.REFIID(IGlobalizationPreferencesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.UserProfile.GlobalizationPreferences".toHandle(),refiid,interfacePtr)
      val result =
          IGlobalizationPreferencesStatics.ABI.makeIGlobalizationPreferencesStatics(interfacePtr.value)
      return result
    }

    public fun createIGlobalizationPreferencesStatics2(): IGlobalizationPreferencesStatics2 {
      val refiid = Guid.REFIID(IGlobalizationPreferencesStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.UserProfile.GlobalizationPreferences".toHandle(),refiid,interfacePtr)
      val result =
          IGlobalizationPreferencesStatics2.ABI.makeIGlobalizationPreferencesStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GlobalizationPreferences {
      val address = segment.toRawLongValue()
      return GlobalizationPreferences(Pointer(address))
    }

    public override fun toNative(obj: GlobalizationPreferences): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForUser(user: User) =
        ABI.IGlobalizationPreferencesStatics3_Instance.GetForUser(user)

    public fun get_Calendars() = ABI.IGlobalizationPreferencesStatics_Instance.get_Calendars()

    public fun get_Clocks() = ABI.IGlobalizationPreferencesStatics_Instance.get_Clocks()

    public fun get_Currencies() = ABI.IGlobalizationPreferencesStatics_Instance.get_Currencies()

    public fun get_Languages() = ABI.IGlobalizationPreferencesStatics_Instance.get_Languages()

    public fun get_HomeGeographicRegion() =
        ABI.IGlobalizationPreferencesStatics_Instance.get_HomeGeographicRegion()

    public fun get_WeekStartsOn() = ABI.IGlobalizationPreferencesStatics_Instance.get_WeekStartsOn()

    public fun TrySetHomeGeographicRegion(region: String) =
        ABI.IGlobalizationPreferencesStatics2_Instance.TrySetHomeGeographicRegion(region)

    public fun TrySetLanguages(languageTags: IIterable<String?>) =
        ABI.IGlobalizationPreferencesStatics2_Instance.TrySetLanguages(languageTags)
  }
}
