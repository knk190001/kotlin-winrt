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

@ABIMarker(DiagnosticsSettings.ABI::class)
@Signature("rc(Windows.System.UserProfile.DiagnosticsSettings;{e5e9eccd-2711-44e0-973c-491d78048d24})")
@WinRTByReference(brClass = DiagnosticsSettings.ByReference::class)
public class DiagnosticsSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDiagnosticsSettings.WithDefault, IWinRTObject {
  private val __488125808_Interface: IDiagnosticsSettings.WithDefault by lazy {
    as_488125808()
  }


  public override val __488125808_Ptr: JNAPointer? by lazy {
    __488125808_Interface.__488125808_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__488125808_Interface)

  private fun as_488125808(): IDiagnosticsSettings.WithDefault {
    if(pointer == NULL) {
      return(IDiagnosticsSettings.ABI.makeIDiagnosticsSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDiagnosticsSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDiagnosticsSettings.ABI.makeIDiagnosticsSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DiagnosticsSettings> {
    public override fun getValue() = DiagnosticsSettings(pointer.getPointer(0))

    public fun setValue(value: DiagnosticsSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DiagnosticsSettings, MemoryAddress> {
    public val IDiagnosticsSettingsStatics_Instance: IDiagnosticsSettingsStatics by lazy {
      createIDiagnosticsSettingsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDiagnosticsSettingsStatics(): IDiagnosticsSettingsStatics {
      val refiid = Guid.REFIID(IDiagnosticsSettingsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.UserProfile.DiagnosticsSettings".toHandle(),refiid,interfacePtr)
      val result =
          IDiagnosticsSettingsStatics.ABI.makeIDiagnosticsSettingsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DiagnosticsSettings {
      val address = segment.toRawLongValue()
      return DiagnosticsSettings(Pointer(address))
    }

    public override fun toNative(obj: DiagnosticsSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.IDiagnosticsSettingsStatics_Instance.GetDefault()

    public fun GetForUser(user: User) = ABI.IDiagnosticsSettingsStatics_Instance.GetForUser(user)
  }
}
