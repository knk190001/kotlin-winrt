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

@ABIMarker(Mpeg2ProfileIds.ABI::class)
@WinRTByReference(brClass = Mpeg2ProfileIds.ByReference::class)
public class Mpeg2ProfileIds(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<Mpeg2ProfileIds> {
    public override fun getValue() = Mpeg2ProfileIds(pointer.getPointer(0))

    public fun setValue(value: Mpeg2ProfileIds): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Mpeg2ProfileIds, MemoryAddress> {
    public val IMpeg2ProfileIdsStatics_Instance: IMpeg2ProfileIdsStatics by lazy {
      createIMpeg2ProfileIdsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMpeg2ProfileIdsStatics(): IMpeg2ProfileIdsStatics {
      val refiid = Guid.REFIID(IMpeg2ProfileIdsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.MediaProperties.Mpeg2ProfileIds".toHandle(),refiid,interfacePtr)
      val result = IMpeg2ProfileIdsStatics.ABI.makeIMpeg2ProfileIdsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Mpeg2ProfileIds {
      val address = segment.toRawLongValue()
      return Mpeg2ProfileIds(Pointer(address))
    }

    public override fun toNative(obj: Mpeg2ProfileIds): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Simple() = ABI.IMpeg2ProfileIdsStatics_Instance.get_Simple()

    public fun get_Main() = ABI.IMpeg2ProfileIdsStatics_Instance.get_Main()

    public fun get_SignalNoiseRatioScalable() =
        ABI.IMpeg2ProfileIdsStatics_Instance.get_SignalNoiseRatioScalable()

    public fun get_SpatiallyScalable() =
        ABI.IMpeg2ProfileIdsStatics_Instance.get_SpatiallyScalable()

    public fun get_High() = ABI.IMpeg2ProfileIdsStatics_Instance.get_High()
  }
}
