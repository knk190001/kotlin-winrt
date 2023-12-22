package Windows.Media.Core

import Windows.Foundation.Collections.IIterable
import Windows.Graphics.Imaging.SoftwareBitmap
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

@ABIMarker(LowLightFusion.ABI::class)
@WinRTByReference(brClass = LowLightFusion.ByReference::class)
public class LowLightFusion(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<LowLightFusion>
      {
    public override fun getValue() = LowLightFusion(pointer.getPointer(0))

    public fun setValue(value: LowLightFusion): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LowLightFusion, MemoryAddress> {
    public val ILowLightFusionStatics_Instance: ILowLightFusionStatics by lazy {
      createILowLightFusionStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILowLightFusionStatics(): ILowLightFusionStatics {
      val refiid = Guid.REFIID(ILowLightFusionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Core.LowLightFusion".toHandle(),refiid,interfacePtr)
      val result = ILowLightFusionStatics.ABI.makeILowLightFusionStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): LowLightFusion {
      val address = segment.toRawLongValue()
      return LowLightFusion(Pointer(address))
    }

    public override fun toNative(obj: LowLightFusion): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_SupportedBitmapPixelFormats() =
        ABI.ILowLightFusionStatics_Instance.get_SupportedBitmapPixelFormats()

    public fun get_MaxSupportedFrameCount() =
        ABI.ILowLightFusionStatics_Instance.get_MaxSupportedFrameCount()

    public fun FuseAsync(frameSet: IIterable<SoftwareBitmap?>) =
        ABI.ILowLightFusionStatics_Instance.FuseAsync(frameSet)
  }
}
