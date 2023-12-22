package Windows.Web.Syndication

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
import kotlin.Int
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SyndicationError.ABI::class)
@WinRTByReference(brClass = SyndicationError.ByReference::class)
public class SyndicationError(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SyndicationError> {
    public override fun getValue() = SyndicationError(pointer.getPointer(0))

    public fun setValue(value: SyndicationError): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SyndicationError, MemoryAddress> {
    public val ISyndicationErrorStatics_Instance: ISyndicationErrorStatics by lazy {
      createISyndicationErrorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISyndicationErrorStatics(): ISyndicationErrorStatics {
      val refiid = Guid.REFIID(ISyndicationErrorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Syndication.SyndicationError".toHandle(),refiid,interfacePtr)
      val result = ISyndicationErrorStatics.ABI.makeISyndicationErrorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SyndicationError {
      val address = segment.toRawLongValue()
      return SyndicationError(Pointer(address))
    }

    public override fun toNative(obj: SyndicationError): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetStatus(hresult: Int) = ABI.ISyndicationErrorStatics_Instance.GetStatus(hresult)
  }
}
