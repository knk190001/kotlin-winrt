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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IBarcodeSymbologiesStatics2.ABI::class)
@Signature("{8b7518f4-99d0-40bf-9424-b91d6dd4c6e0}")
@Guid("8b7518f499d040bf9424b91d6dd4c6e0")
@WinRTInterface("8b7518f499d040bf9424b91d6dd4c6e0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarcodeSymbologiesStatics2.ByReference::class)
public interface IBarcodeSymbologiesStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Gs1DWCode(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeSymbologiesStatics2> {
    public override fun getValue() = ABI.makeIBarcodeSymbologiesStatics2(pointer.getPointer(0))

    public fun setValue(value: IBarcodeSymbologiesStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeSymbologiesStatics2 {
    public val __351759187_Ptr: Pointer?

    public val _351759187_VtblPtr: Pointer?
      get() = __351759187_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Gs1DWCode(): WinDef.UINT {
      val fnPtr = _351759187_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__351759187_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IBarcodeSymbologiesStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __351759187_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeSymbologiesStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8b7518f499d040bf9424b91d6dd4c6e0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeSymbologiesStatics2(ptr: Pointer?): WithDefault =
        IBarcodeSymbologiesStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBarcodeSymbologiesStatics2 {
      val address = segment.toRawLongValue()
      return makeIBarcodeSymbologiesStatics2(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeSymbologiesStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__351759187_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeSymbologiesStatics2):
        Array<IBarcodeSymbologiesStatics2?> = (elements as
        Array<IBarcodeSymbologiesStatics2?>).castToImpl<IBarcodeSymbologiesStatics2,IBarcodeSymbologiesStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarcodeSymbologiesStatics2?> =
        arrayOfNulls<IBarcodeSymbologiesStatics2_Impl>(size) as Array<IBarcodeSymbologiesStatics2?>
  }
}
