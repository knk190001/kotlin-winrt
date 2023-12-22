package Windows.Devices.Sensors

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISensorDataThreshold.ABI::class)
@Signature("{54daec61-fe4b-4e07-b260-3a4cdfbe396e}")
@Guid("54daec61fe4b4e07b2603a4cdfbe396e")
@WinRTInterface("54daec61fe4b4e07b2603a4cdfbe396e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISensorDataThreshold.ByReference::class)
public interface ISensorDataThreshold : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISensorDataThreshold> {
    public override fun getValue() = ABI.makeISensorDataThreshold(pointer.getPointer(0))

    public fun setValue(value: ISensorDataThreshold_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISensorDataThreshold {
    public val __1145502939_Ptr: Pointer?

    public val _1145502939_VtblPtr: Pointer?
      get() = __1145502939_Ptr?.getPointer(0)
  }

  public class ISensorDataThreshold_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1145502939_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISensorDataThreshold, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("54daec61fe4b4e07b2603a4cdfbe396e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISensorDataThreshold(ptr: Pointer?): WithDefault = ISensorDataThreshold_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISensorDataThreshold {
      val address = segment.toRawLongValue()
      return makeISensorDataThreshold(Pointer(address))
    }

    public override fun toNative(obj: ISensorDataThreshold): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1145502939_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISensorDataThreshold): Array<ISensorDataThreshold?> =
        (elements as
        Array<ISensorDataThreshold?>).castToImpl<ISensorDataThreshold,ISensorDataThreshold_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISensorDataThreshold?> =
        arrayOfNulls<ISensorDataThreshold_Impl>(size) as Array<ISensorDataThreshold?>
  }
}
