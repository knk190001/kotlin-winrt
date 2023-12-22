package Windows.ApplicationModel

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

@ABIMarker(DesignMode.ABI::class)
@WinRTByReference(brClass = DesignMode.ByReference::class)
public class DesignMode(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DesignMode> {
    public override fun getValue() = DesignMode(pointer.getPointer(0))

    public fun setValue(value: DesignMode): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DesignMode, MemoryAddress> {
    public val IDesignModeStatics2_Instance: IDesignModeStatics2 by lazy {
      createIDesignModeStatics2()
    }


    public val IDesignModeStatics_Instance: IDesignModeStatics by lazy {
      createIDesignModeStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDesignModeStatics2(): IDesignModeStatics2 {
      val refiid = Guid.REFIID(IDesignModeStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.DesignMode".toHandle(),refiid,interfacePtr)
      val result = IDesignModeStatics2.ABI.makeIDesignModeStatics2(interfacePtr.value)
      return result
    }

    public fun createIDesignModeStatics(): IDesignModeStatics {
      val refiid = Guid.REFIID(IDesignModeStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.DesignMode".toHandle(),refiid,interfacePtr)
      val result = IDesignModeStatics.ABI.makeIDesignModeStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DesignMode {
      val address = segment.toRawLongValue()
      return DesignMode(Pointer(address))
    }

    public override fun toNative(obj: DesignMode): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_DesignMode2Enabled() = ABI.IDesignModeStatics2_Instance.get_DesignMode2Enabled()

    public fun get_DesignModeEnabled() = ABI.IDesignModeStatics_Instance.get_DesignModeEnabled()
  }
}
