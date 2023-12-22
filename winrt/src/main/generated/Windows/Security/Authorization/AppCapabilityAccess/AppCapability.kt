package Windows.Security.Authorization.AppCapabilityAccess

import Windows.Foundation.Collections.IIterable
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AppCapability.ABI::class)
@Signature("rc(Windows.Security.Authorization.AppCapabilityAccess.AppCapability;{4c49d915-8a2a-4295-9437-2df7c396aff4})")
@WinRTByReference(brClass = AppCapability.ByReference::class)
public class AppCapability(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppCapability.WithDefault, IWinRTObject {
  private val __1695161493_Interface: IAppCapability.WithDefault by lazy {
    as_1695161493()
  }


  public override val __1695161493_Ptr: JNAPointer? by lazy {
    __1695161493_Interface.__1695161493_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1695161493_Interface)

  private fun as_1695161493(): IAppCapability.WithDefault {
    if(pointer == NULL) {
      return(IAppCapability.ABI.makeIAppCapability(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppCapability>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppCapability.ABI.makeIAppCapability(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<AppCapability>
      {
    public override fun getValue() = AppCapability(pointer.getPointer(0))

    public fun setValue(value: AppCapability): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppCapability, MemoryAddress> {
    public val IAppCapabilityStatics_Instance: IAppCapabilityStatics by lazy {
      createIAppCapabilityStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppCapabilityStatics(): IAppCapabilityStatics {
      val refiid = Guid.REFIID(IAppCapabilityStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Authorization.AppCapabilityAccess.AppCapability".toHandle(),refiid,interfacePtr)
      val result = IAppCapabilityStatics.ABI.makeIAppCapabilityStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AppCapability {
      val address = segment.toRawLongValue()
      return AppCapability(Pointer(address))
    }

    public override fun toNative(obj: AppCapability): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun RequestAccessForCapabilitiesAsync(capabilityNames: IIterable<String?>) =
        ABI.IAppCapabilityStatics_Instance.RequestAccessForCapabilitiesAsync(capabilityNames)

    public fun RequestAccessForCapabilitiesForUserAsync(user: User,
        capabilityNames: IIterable<String?>) =
        ABI.IAppCapabilityStatics_Instance.RequestAccessForCapabilitiesForUserAsync(user,
        capabilityNames)

    public fun Create(capabilityName: String) =
        ABI.IAppCapabilityStatics_Instance.Create(capabilityName)

    public fun CreateWithProcessIdForUser(
      user: User,
      capabilityName: String,
      pid: WinDef.UINT
    ) = ABI.IAppCapabilityStatics_Instance.CreateWithProcessIdForUser(user, capabilityName, pid)
  }
}
