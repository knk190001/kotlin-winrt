package Windows.System

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MemoryManager.ABI::class)
@WinRTByReference(brClass = MemoryManager.ByReference::class)
public class MemoryManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MemoryManager>
      {
    public override fun getValue() = MemoryManager(pointer.getPointer(0))

    public fun setValue(value: MemoryManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MemoryManager, MemoryAddress> {
    public val IMemoryManagerStatics4_Instance: IMemoryManagerStatics4 by lazy {
      createIMemoryManagerStatics4()
    }


    public val IMemoryManagerStatics3_Instance: IMemoryManagerStatics3 by lazy {
      createIMemoryManagerStatics3()
    }


    public val IMemoryManagerStatics_Instance: IMemoryManagerStatics by lazy {
      createIMemoryManagerStatics()
    }


    public val IMemoryManagerStatics2_Instance: IMemoryManagerStatics2 by lazy {
      createIMemoryManagerStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMemoryManagerStatics4(): IMemoryManagerStatics4 {
      val refiid = Guid.REFIID(IMemoryManagerStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.MemoryManager".toHandle(),refiid,interfacePtr)
      val result = IMemoryManagerStatics4.ABI.makeIMemoryManagerStatics4(interfacePtr.value)
      return result
    }

    public fun createIMemoryManagerStatics3(): IMemoryManagerStatics3 {
      val refiid = Guid.REFIID(IMemoryManagerStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.MemoryManager".toHandle(),refiid,interfacePtr)
      val result = IMemoryManagerStatics3.ABI.makeIMemoryManagerStatics3(interfacePtr.value)
      return result
    }

    public fun createIMemoryManagerStatics(): IMemoryManagerStatics {
      val refiid = Guid.REFIID(IMemoryManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.MemoryManager".toHandle(),refiid,interfacePtr)
      val result = IMemoryManagerStatics.ABI.makeIMemoryManagerStatics(interfacePtr.value)
      return result
    }

    public fun createIMemoryManagerStatics2(): IMemoryManagerStatics2 {
      val refiid = Guid.REFIID(IMemoryManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.MemoryManager".toHandle(),refiid,interfacePtr)
      val result = IMemoryManagerStatics2.ABI.makeIMemoryManagerStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MemoryManager {
      val address = segment.toRawLongValue()
      return MemoryManager(Pointer(address))
    }

    public override fun toNative(obj: MemoryManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ExpectedAppMemoryUsageLimit() =
        ABI.IMemoryManagerStatics4_Instance.get_ExpectedAppMemoryUsageLimit()

    public fun TrySetAppMemoryUsageLimit(value: WinDef.ULONG) =
        ABI.IMemoryManagerStatics3_Instance.TrySetAppMemoryUsageLimit(value)

    public fun get_AppMemoryUsage() = ABI.IMemoryManagerStatics_Instance.get_AppMemoryUsage()

    public fun get_AppMemoryUsageLimit() =
        ABI.IMemoryManagerStatics_Instance.get_AppMemoryUsageLimit()

    public fun get_AppMemoryUsageLevel() =
        ABI.IMemoryManagerStatics_Instance.get_AppMemoryUsageLevel()

    public fun add_AppMemoryUsageIncreased(handler: EventHandler<IUnknown?>) =
        ABI.IMemoryManagerStatics_Instance.add_AppMemoryUsageIncreased(handler)

    public fun remove_AppMemoryUsageIncreased(token: EventRegistrationToken) =
        ABI.IMemoryManagerStatics_Instance.remove_AppMemoryUsageIncreased(token)

    public fun add_AppMemoryUsageDecreased(handler: EventHandler<IUnknown?>) =
        ABI.IMemoryManagerStatics_Instance.add_AppMemoryUsageDecreased(handler)

    public fun remove_AppMemoryUsageDecreased(token: EventRegistrationToken) =
        ABI.IMemoryManagerStatics_Instance.remove_AppMemoryUsageDecreased(token)

    public
        fun add_AppMemoryUsageLimitChanging(handler: EventHandler<AppMemoryUsageLimitChangingEventArgs?>)
        = ABI.IMemoryManagerStatics_Instance.add_AppMemoryUsageLimitChanging(handler)

    public fun remove_AppMemoryUsageLimitChanging(token: EventRegistrationToken) =
        ABI.IMemoryManagerStatics_Instance.remove_AppMemoryUsageLimitChanging(token)

    public fun GetAppMemoryReport() = ABI.IMemoryManagerStatics2_Instance.GetAppMemoryReport()

    public fun GetProcessMemoryReport() =
        ABI.IMemoryManagerStatics2_Instance.GetProcessMemoryReport()
  }
}
