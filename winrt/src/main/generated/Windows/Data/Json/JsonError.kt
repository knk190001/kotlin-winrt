package Windows.Data.Json

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

@ABIMarker(JsonError.ABI::class)
@WinRTByReference(brClass = JsonError.ByReference::class)
public class JsonError(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<JsonError> {
    public override fun getValue() = JsonError(pointer.getPointer(0))

    public fun setValue(value: JsonError): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<JsonError, MemoryAddress> {
    public val IJsonErrorStatics2_Instance: IJsonErrorStatics2 by lazy {
      createIJsonErrorStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIJsonErrorStatics2(): IJsonErrorStatics2 {
      val refiid = Guid.REFIID(IJsonErrorStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Data.Json.JsonError".toHandle(),refiid,interfacePtr)
      val result = IJsonErrorStatics2.ABI.makeIJsonErrorStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): JsonError {
      val address = segment.toRawLongValue()
      return JsonError(Pointer(address))
    }

    public override fun toNative(obj: JsonError): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetJsonStatus(hresult: Int) = ABI.IJsonErrorStatics2_Instance.GetJsonStatus(hresult)
  }
}
