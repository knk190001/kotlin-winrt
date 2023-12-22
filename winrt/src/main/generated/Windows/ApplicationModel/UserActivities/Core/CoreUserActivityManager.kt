package Windows.ApplicationModel.UserActivities.Core

import Windows.ApplicationModel.UserActivities.UserActivity
import Windows.ApplicationModel.UserActivities.UserActivityChannel
import Windows.Foundation.DateTime
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

@ABIMarker(CoreUserActivityManager.ABI::class)
@WinRTByReference(brClass = CoreUserActivityManager.ByReference::class)
public class CoreUserActivityManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreUserActivityManager> {
    public override fun getValue() = CoreUserActivityManager(pointer.getPointer(0))

    public fun setValue(value: CoreUserActivityManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreUserActivityManager, MemoryAddress> {
    public val ICoreUserActivityManagerStatics_Instance: ICoreUserActivityManagerStatics by lazy {
      createICoreUserActivityManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICoreUserActivityManagerStatics(): ICoreUserActivityManagerStatics {
      val refiid = Guid.REFIID(ICoreUserActivityManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.UserActivities.Core.CoreUserActivityManager".toHandle(),refiid,interfacePtr)
      val result =
          ICoreUserActivityManagerStatics.ABI.makeICoreUserActivityManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CoreUserActivityManager {
      val address = segment.toRawLongValue()
      return CoreUserActivityManager(Pointer(address))
    }

    public override fun toNative(obj: CoreUserActivityManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateUserActivitySessionInBackground(activity: UserActivity) =
        ABI.ICoreUserActivityManagerStatics_Instance.CreateUserActivitySessionInBackground(activity)

    public fun DeleteUserActivitySessionsInTimeRangeAsync(
      channel: UserActivityChannel,
      startTime: DateTime,
      endTime: DateTime
    ) =
        ABI.ICoreUserActivityManagerStatics_Instance.DeleteUserActivitySessionsInTimeRangeAsync(channel,
        startTime, endTime)
  }
}
