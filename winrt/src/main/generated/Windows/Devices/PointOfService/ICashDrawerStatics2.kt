package Windows.Devices.PointOfService

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICashDrawerStatics2.ABI::class)
@Signature("{3e818121-8c42-40e8-9c0e-40297048104c}")
@Guid("3e8181218c4240e89c0e40297048104c")
@WinRTInterface("3e8181218c4240e89c0e40297048104c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICashDrawerStatics2.ByReference::class)
public interface ICashDrawerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeviceSelector(connectionTypes: PosConnectionTypes?): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICashDrawerStatics2> {
    public override fun getValue() = ABI.makeICashDrawerStatics2(pointer.getPointer(0))

    public fun setValue(value: ICashDrawerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICashDrawerStatics2 {
    public val __1487517552_Ptr: Pointer?

    public val _1487517552_VtblPtr: Pointer?
      get() = __1487517552_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeviceSelector(connectionTypes: PosConnectionTypes?): String? {
      val fnPtr = _1487517552_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1487517552_Ptr, marshalToNative(connectionTypes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ICashDrawerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1487517552_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICashDrawerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3e8181218c4240e89c0e40297048104c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICashDrawerStatics2(ptr: Pointer?): WithDefault = ICashDrawerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICashDrawerStatics2 {
      val address = segment.toRawLongValue()
      return makeICashDrawerStatics2(Pointer(address))
    }

    public override fun toNative(obj: ICashDrawerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1487517552_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICashDrawerStatics2): Array<ICashDrawerStatics2?> =
        (elements as
        Array<ICashDrawerStatics2?>).castToImpl<ICashDrawerStatics2,ICashDrawerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICashDrawerStatics2?> =
        arrayOfNulls<ICashDrawerStatics2_Impl>(size) as Array<ICashDrawerStatics2?>
  }
}
