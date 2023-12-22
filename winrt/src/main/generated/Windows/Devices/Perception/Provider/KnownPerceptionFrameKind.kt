package Windows.Devices.Perception.Provider

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

@ABIMarker(KnownPerceptionFrameKind.ABI::class)
@WinRTByReference(brClass = KnownPerceptionFrameKind.ByReference::class)
public class KnownPerceptionFrameKind(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KnownPerceptionFrameKind> {
    public override fun getValue() = KnownPerceptionFrameKind(pointer.getPointer(0))

    public fun setValue(value: KnownPerceptionFrameKind): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KnownPerceptionFrameKind, MemoryAddress> {
    public val IKnownPerceptionFrameKindStatics_Instance: IKnownPerceptionFrameKindStatics by lazy {
      createIKnownPerceptionFrameKindStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIKnownPerceptionFrameKindStatics(): IKnownPerceptionFrameKindStatics {
      val refiid = Guid.REFIID(IKnownPerceptionFrameKindStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Perception.Provider.KnownPerceptionFrameKind".toHandle(),refiid,interfacePtr)
      val result =
          IKnownPerceptionFrameKindStatics.ABI.makeIKnownPerceptionFrameKindStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): KnownPerceptionFrameKind {
      val address = segment.toRawLongValue()
      return KnownPerceptionFrameKind(Pointer(address))
    }

    public override fun toNative(obj: KnownPerceptionFrameKind): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Color() = ABI.IKnownPerceptionFrameKindStatics_Instance.get_Color()

    public fun get_Depth() = ABI.IKnownPerceptionFrameKindStatics_Instance.get_Depth()

    public fun get_Infrared() = ABI.IKnownPerceptionFrameKindStatics_Instance.get_Infrared()
  }
}
