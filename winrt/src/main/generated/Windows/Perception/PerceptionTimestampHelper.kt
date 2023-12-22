package Windows.Perception

import Windows.Foundation.DateTime
import Windows.Foundation.TimeSpan
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

@ABIMarker(PerceptionTimestampHelper.ABI::class)
@WinRTByReference(brClass = PerceptionTimestampHelper.ByReference::class)
public class PerceptionTimestampHelper(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PerceptionTimestampHelper> {
    public override fun getValue() = PerceptionTimestampHelper(pointer.getPointer(0))

    public fun setValue(value: PerceptionTimestampHelper): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PerceptionTimestampHelper, MemoryAddress> {
    public val IPerceptionTimestampHelperStatics2_Instance: IPerceptionTimestampHelperStatics2 by
        lazy {
      createIPerceptionTimestampHelperStatics2()
    }


    public val IPerceptionTimestampHelperStatics_Instance: IPerceptionTimestampHelperStatics by
        lazy {
      createIPerceptionTimestampHelperStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPerceptionTimestampHelperStatics2(): IPerceptionTimestampHelperStatics2 {
      val refiid = Guid.REFIID(IPerceptionTimestampHelperStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Perception.PerceptionTimestampHelper".toHandle(),refiid,interfacePtr)
      val result =
          IPerceptionTimestampHelperStatics2.ABI.makeIPerceptionTimestampHelperStatics2(interfacePtr.value)
      return result
    }

    public fun createIPerceptionTimestampHelperStatics(): IPerceptionTimestampHelperStatics {
      val refiid = Guid.REFIID(IPerceptionTimestampHelperStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Perception.PerceptionTimestampHelper".toHandle(),refiid,interfacePtr)
      val result =
          IPerceptionTimestampHelperStatics.ABI.makeIPerceptionTimestampHelperStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PerceptionTimestampHelper {
      val address = segment.toRawLongValue()
      return PerceptionTimestampHelper(Pointer(address))
    }

    public override fun toNative(obj: PerceptionTimestampHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FromSystemRelativeTargetTime(targetTime: TimeSpan) =
        ABI.IPerceptionTimestampHelperStatics2_Instance.FromSystemRelativeTargetTime(targetTime)

    public fun FromHistoricalTargetTime(targetTime: DateTime) =
        ABI.IPerceptionTimestampHelperStatics_Instance.FromHistoricalTargetTime(targetTime)
  }
}
