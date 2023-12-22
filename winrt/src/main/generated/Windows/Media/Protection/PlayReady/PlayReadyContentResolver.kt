package Windows.Media.Protection.PlayReady

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

@ABIMarker(PlayReadyContentResolver.ABI::class)
@WinRTByReference(brClass = PlayReadyContentResolver.ByReference::class)
public class PlayReadyContentResolver(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PlayReadyContentResolver> {
    public override fun getValue() = PlayReadyContentResolver(pointer.getPointer(0))

    public fun setValue(value: PlayReadyContentResolver): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlayReadyContentResolver, MemoryAddress> {
    public val IPlayReadyContentResolver_Instance: IPlayReadyContentResolver by lazy {
      createIPlayReadyContentResolver()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPlayReadyContentResolver(): IPlayReadyContentResolver {
      val refiid = Guid.REFIID(IPlayReadyContentResolver.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Protection.PlayReady.PlayReadyContentResolver".toHandle(),refiid,interfacePtr)
      val result = IPlayReadyContentResolver.ABI.makeIPlayReadyContentResolver(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PlayReadyContentResolver {
      val address = segment.toRawLongValue()
      return PlayReadyContentResolver(Pointer(address))
    }

    public override fun toNative(obj: PlayReadyContentResolver): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun ServiceRequest(contentHeader: PlayReadyContentHeader) =
        ABI.IPlayReadyContentResolver_Instance.ServiceRequest(contentHeader)
  }
}
