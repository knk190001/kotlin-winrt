package Windows.Globalization

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

@ABIMarker(ApplicationLanguages.ABI::class)
@WinRTByReference(brClass = ApplicationLanguages.ByReference::class)
public class ApplicationLanguages(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ApplicationLanguages> {
    public override fun getValue() = ApplicationLanguages(pointer.getPointer(0))

    public fun setValue(value: ApplicationLanguages): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ApplicationLanguages, MemoryAddress> {
    public val IApplicationLanguagesStatics2_Instance: IApplicationLanguagesStatics2 by lazy {
      createIApplicationLanguagesStatics2()
    }


    public val IApplicationLanguagesStatics_Instance: IApplicationLanguagesStatics by lazy {
      createIApplicationLanguagesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIApplicationLanguagesStatics2(): IApplicationLanguagesStatics2 {
      val refiid = Guid.REFIID(IApplicationLanguagesStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Globalization.ApplicationLanguages".toHandle(),refiid,interfacePtr)
      val result =
          IApplicationLanguagesStatics2.ABI.makeIApplicationLanguagesStatics2(interfacePtr.value)
      return result
    }

    public fun createIApplicationLanguagesStatics(): IApplicationLanguagesStatics {
      val refiid = Guid.REFIID(IApplicationLanguagesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Globalization.ApplicationLanguages".toHandle(),refiid,interfacePtr)
      val result =
          IApplicationLanguagesStatics.ABI.makeIApplicationLanguagesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ApplicationLanguages {
      val address = segment.toRawLongValue()
      return ApplicationLanguages(Pointer(address))
    }

    public override fun toNative(obj: ApplicationLanguages): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetLanguagesForUser(user: User) =
        ABI.IApplicationLanguagesStatics2_Instance.GetLanguagesForUser(user)

    public fun get_PrimaryLanguageOverride() =
        ABI.IApplicationLanguagesStatics_Instance.get_PrimaryLanguageOverride()

    public fun put_PrimaryLanguageOverride(value: String) =
        ABI.IApplicationLanguagesStatics_Instance.put_PrimaryLanguageOverride(value)

    public fun get_Languages() = ABI.IApplicationLanguagesStatics_Instance.get_Languages()

    public fun get_ManifestLanguages() =
        ABI.IApplicationLanguagesStatics_Instance.get_ManifestLanguages()
  }
}
