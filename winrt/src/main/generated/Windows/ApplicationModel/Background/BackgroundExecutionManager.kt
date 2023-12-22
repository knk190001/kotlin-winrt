package Windows.ApplicationModel.Background

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

@ABIMarker(BackgroundExecutionManager.ABI::class)
@WinRTByReference(brClass = BackgroundExecutionManager.ByReference::class)
public class BackgroundExecutionManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BackgroundExecutionManager> {
    public override fun getValue() = BackgroundExecutionManager(pointer.getPointer(0))

    public fun setValue(value: BackgroundExecutionManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BackgroundExecutionManager, MemoryAddress> {
    public val IBackgroundExecutionManagerStatics_Instance: IBackgroundExecutionManagerStatics by
        lazy {
      createIBackgroundExecutionManagerStatics()
    }


    public val IBackgroundExecutionManagerStatics3_Instance: IBackgroundExecutionManagerStatics3 by
        lazy {
      createIBackgroundExecutionManagerStatics3()
    }


    public val IBackgroundExecutionManagerStatics2_Instance: IBackgroundExecutionManagerStatics2 by
        lazy {
      createIBackgroundExecutionManagerStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBackgroundExecutionManagerStatics(): IBackgroundExecutionManagerStatics {
      val refiid = Guid.REFIID(IBackgroundExecutionManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Background.BackgroundExecutionManager".toHandle(),refiid,interfacePtr)
      val result =
          IBackgroundExecutionManagerStatics.ABI.makeIBackgroundExecutionManagerStatics(interfacePtr.value)
      return result
    }

    public fun createIBackgroundExecutionManagerStatics3(): IBackgroundExecutionManagerStatics3 {
      val refiid = Guid.REFIID(IBackgroundExecutionManagerStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Background.BackgroundExecutionManager".toHandle(),refiid,interfacePtr)
      val result =
          IBackgroundExecutionManagerStatics3.ABI.makeIBackgroundExecutionManagerStatics3(interfacePtr.value)
      return result
    }

    public fun createIBackgroundExecutionManagerStatics2(): IBackgroundExecutionManagerStatics2 {
      val refiid = Guid.REFIID(IBackgroundExecutionManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Background.BackgroundExecutionManager".toHandle(),refiid,interfacePtr)
      val result =
          IBackgroundExecutionManagerStatics2.ABI.makeIBackgroundExecutionManagerStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): BackgroundExecutionManager {
      val address = segment.toRawLongValue()
      return BackgroundExecutionManager(Pointer(address))
    }

    public override fun toNative(obj: BackgroundExecutionManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun RequestAccessAsync() =
        ABI.IBackgroundExecutionManagerStatics_Instance.RequestAccessAsync()

    public fun RequestAccessAsync(applicationId: String) =
        ABI.IBackgroundExecutionManagerStatics_Instance.RequestAccessAsync(applicationId)

    public fun RemoveAccess() = ABI.IBackgroundExecutionManagerStatics_Instance.RemoveAccess()

    public fun RemoveAccess(applicationId: String) =
        ABI.IBackgroundExecutionManagerStatics_Instance.RemoveAccess(applicationId)

    public fun GetAccessStatus() = ABI.IBackgroundExecutionManagerStatics_Instance.GetAccessStatus()

    public fun GetAccessStatus(applicationId: String) =
        ABI.IBackgroundExecutionManagerStatics_Instance.GetAccessStatus(applicationId)

    public fun RequestAccessKindForModernStandbyAsync(requestedAccess: BackgroundAccessRequestKind,
        reason: String) =
        ABI.IBackgroundExecutionManagerStatics3_Instance.RequestAccessKindForModernStandbyAsync(requestedAccess,
        reason)

    public fun GetAccessStatusForModernStandby() =
        ABI.IBackgroundExecutionManagerStatics3_Instance.GetAccessStatusForModernStandby()

    public fun GetAccessStatusForModernStandby(applicationId: String) =
        ABI.IBackgroundExecutionManagerStatics3_Instance.GetAccessStatusForModernStandby(applicationId)

    public fun RequestAccessKindAsync(requestedAccess: BackgroundAccessRequestKind, reason: String)
        = ABI.IBackgroundExecutionManagerStatics2_Instance.RequestAccessKindAsync(requestedAccess,
        reason)
  }
}
