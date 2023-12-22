package Windows.ApplicationModel.Background

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

@ABIMarker(BackgroundWorkCost.ABI::class)
@WinRTByReference(brClass = BackgroundWorkCost.ByReference::class)
public class BackgroundWorkCost(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BackgroundWorkCost> {
    public override fun getValue() = BackgroundWorkCost(pointer.getPointer(0))

    public fun setValue(value: BackgroundWorkCost): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BackgroundWorkCost, MemoryAddress> {
    public val IBackgroundWorkCostStatics_Instance: IBackgroundWorkCostStatics by lazy {
      createIBackgroundWorkCostStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBackgroundWorkCostStatics(): IBackgroundWorkCostStatics {
      val refiid = Guid.REFIID(IBackgroundWorkCostStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Background.BackgroundWorkCost".toHandle(),refiid,interfacePtr)
      val result = IBackgroundWorkCostStatics.ABI.makeIBackgroundWorkCostStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): BackgroundWorkCost {
      val address = segment.toRawLongValue()
      return BackgroundWorkCost(Pointer(address))
    }

    public override fun toNative(obj: BackgroundWorkCost): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_CurrentBackgroundWorkCost() =
        ABI.IBackgroundWorkCostStatics_Instance.get_CurrentBackgroundWorkCost()
  }
}
