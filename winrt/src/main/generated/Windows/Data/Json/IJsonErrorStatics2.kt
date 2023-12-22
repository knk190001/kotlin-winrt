package Windows.Data.Json

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
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
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IJsonErrorStatics2.ABI::class)
@Signature("{404030da-87d0-436c-83ab-fc7b12c0cc26}")
@Guid("404030da87d0436c83abfc7b12c0cc26")
@WinRTInterface("404030da87d0436c83abfc7b12c0cc26")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IJsonErrorStatics2.ByReference::class)
public interface IJsonErrorStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetJsonStatus(hresult: Int): JsonErrorStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IJsonErrorStatics2> {
    public override fun getValue() = ABI.makeIJsonErrorStatics2(pointer.getPointer(0))

    public fun setValue(value: IJsonErrorStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IJsonErrorStatics2 {
    public val __2123659909_Ptr: Pointer?

    public val _2123659909_VtblPtr: Pointer?
      get() = __2123659909_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetJsonStatus(hresult: Int): JsonErrorStatus? {
      val fnPtr = _2123659909_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<JsonErrorStatus>()
      val hr = fn.invokeHR(arrayOf(__2123659909_Ptr, hresult, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<JsonErrorStatus>(result.getValue())
      return resultValue
    }
  }

  public class IJsonErrorStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2123659909_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IJsonErrorStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("404030da87d0436c83abfc7b12c0cc26")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIJsonErrorStatics2(ptr: Pointer?): WithDefault = IJsonErrorStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IJsonErrorStatics2 {
      val address = segment.toRawLongValue()
      return makeIJsonErrorStatics2(Pointer(address))
    }

    public override fun toNative(obj: IJsonErrorStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2123659909_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IJsonErrorStatics2): Array<IJsonErrorStatics2?> =
        (elements as
        Array<IJsonErrorStatics2?>).castToImpl<IJsonErrorStatics2,IJsonErrorStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IJsonErrorStatics2?> =
        arrayOfNulls<IJsonErrorStatics2_Impl>(size) as Array<IJsonErrorStatics2?>
  }
}
