package Windows.Devices.PointOfService

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(ILineDisplay2.ABI::class)
@Signature("{c296a628-ef44-40f3-bd1c-b04c6a5cdc7d}")
@Guid("c296a628ef4440f3bd1cb04c6a5cdc7d")
@WinRTInterface("c296a628ef4440f3bd1cb04c6a5cdc7d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILineDisplay2.ByReference::class)
public interface ILineDisplay2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CheckPowerStatusAsync(): IAsyncOperation<LineDisplayPowerStatus?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ILineDisplay2>
      {
    public override fun getValue() = ABI.makeILineDisplay2(pointer.getPointer(0))

    public fun setValue(value: ILineDisplay2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILineDisplay2 {
    public val __1695525789_Ptr: Pointer?

    public val _1695525789_VtblPtr: Pointer?
      get() = __1695525789_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CheckPowerStatusAsync(): IAsyncOperation<LineDisplayPowerStatus?>? {
      val fnPtr = _1695525789_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LineDisplayPowerStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1695525789_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<LineDisplayPowerStatus?>>(result.getValue())
      return resultValue
    }
  }

  public class ILineDisplay2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1695525789_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILineDisplay2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c296a628ef4440f3bd1cb04c6a5cdc7d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILineDisplay2(ptr: Pointer?): WithDefault = ILineDisplay2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILineDisplay2 {
      val address = segment.toRawLongValue()
      return makeILineDisplay2(Pointer(address))
    }

    public override fun toNative(obj: ILineDisplay2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1695525789_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILineDisplay2): Array<ILineDisplay2?> = (elements as
        Array<ILineDisplay2?>).castToImpl<ILineDisplay2,ILineDisplay2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILineDisplay2?> =
        arrayOfNulls<ILineDisplay2_Impl>(size) as Array<ILineDisplay2?>
  }
}
