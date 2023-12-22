package Windows.Media.MediaProperties

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

@ABIMarker(H264ProfileIds.ABI::class)
@WinRTByReference(brClass = H264ProfileIds.ByReference::class)
public class H264ProfileIds(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<H264ProfileIds>
      {
    public override fun getValue() = H264ProfileIds(pointer.getPointer(0))

    public fun setValue(value: H264ProfileIds): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<H264ProfileIds, MemoryAddress> {
    public val IH264ProfileIdsStatics_Instance: IH264ProfileIdsStatics by lazy {
      createIH264ProfileIdsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIH264ProfileIdsStatics(): IH264ProfileIdsStatics {
      val refiid = Guid.REFIID(IH264ProfileIdsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.MediaProperties.H264ProfileIds".toHandle(),refiid,interfacePtr)
      val result = IH264ProfileIdsStatics.ABI.makeIH264ProfileIdsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): H264ProfileIds {
      val address = segment.toRawLongValue()
      return H264ProfileIds(Pointer(address))
    }

    public override fun toNative(obj: H264ProfileIds): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ConstrainedBaseline() =
        ABI.IH264ProfileIdsStatics_Instance.get_ConstrainedBaseline()

    public fun get_Baseline() = ABI.IH264ProfileIdsStatics_Instance.get_Baseline()

    public fun get_Extended() = ABI.IH264ProfileIdsStatics_Instance.get_Extended()

    public fun get_Main() = ABI.IH264ProfileIdsStatics_Instance.get_Main()

    public fun get_High() = ABI.IH264ProfileIdsStatics_Instance.get_High()

    public fun get_High10() = ABI.IH264ProfileIdsStatics_Instance.get_High10()

    public fun get_High422() = ABI.IH264ProfileIdsStatics_Instance.get_High422()

    public fun get_High444() = ABI.IH264ProfileIdsStatics_Instance.get_High444()

    public fun get_StereoHigh() = ABI.IH264ProfileIdsStatics_Instance.get_StereoHigh()

    public fun get_MultiviewHigh() = ABI.IH264ProfileIdsStatics_Instance.get_MultiviewHigh()
  }
}
