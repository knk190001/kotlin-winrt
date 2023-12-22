package Windows.Phone.System

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SystemProtection.ABI::class)
@WinRTByReference(brClass = SystemProtection.ByReference::class)
public class SystemProtection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SystemProtection> {
    public override fun getValue() = SystemProtection(pointer.getPointer(0))

    public fun setValue(value: SystemProtection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemProtection, MemoryAddress> {
    public val ISystemProtectionUnlockStatics_Instance: ISystemProtectionUnlockStatics by lazy {
      createISystemProtectionUnlockStatics()
    }


    public val ISystemProtectionStatics_Instance: ISystemProtectionStatics by lazy {
      createISystemProtectionStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISystemProtectionUnlockStatics(): ISystemProtectionUnlockStatics {
      val refiid = Guid.REFIID(ISystemProtectionUnlockStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Phone.System.SystemProtection".toHandle(),refiid,interfacePtr)
      val result =
          ISystemProtectionUnlockStatics.ABI.makeISystemProtectionUnlockStatics(interfacePtr.value)
      return result
    }

    public fun createISystemProtectionStatics(): ISystemProtectionStatics {
      val refiid = Guid.REFIID(ISystemProtectionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Phone.System.SystemProtection".toHandle(),refiid,interfacePtr)
      val result = ISystemProtectionStatics.ABI.makeISystemProtectionStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SystemProtection {
      val address = segment.toRawLongValue()
      return SystemProtection(Pointer(address))
    }

    public override fun toNative(obj: SystemProtection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun RequestScreenUnlock() =
        ABI.ISystemProtectionUnlockStatics_Instance.RequestScreenUnlock()

    public fun get_ScreenLocked() = ABI.ISystemProtectionStatics_Instance.get_ScreenLocked()
  }
}
