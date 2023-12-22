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

@ABIMarker(ICashDrawerStatus.ABI::class)
@Signature("{6bbd78bf-dca1-4e06-99eb-5af6a5aec108}")
@Guid("6bbd78bfdca14e0699eb5af6a5aec108")
@WinRTInterface("6bbd78bfdca14e0699eb5af6a5aec108")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICashDrawerStatus.ByReference::class)
public interface ICashDrawerStatus : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StatusKind(): CashDrawerStatusKind?

  @InterfaceMethod(1)
  public fun get_ExtendedStatus(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICashDrawerStatus> {
    public override fun getValue() = ABI.makeICashDrawerStatus(pointer.getPointer(0))

    public fun setValue(value: ICashDrawerStatus_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICashDrawerStatus {
    public val __1272194101_Ptr: Pointer?

    public val _1272194101_VtblPtr: Pointer?
      get() = __1272194101_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StatusKind(): CashDrawerStatusKind? {
      val fnPtr = _1272194101_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CashDrawerStatusKind>()
      val hr = fn.invokeHR(arrayOf(__1272194101_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CashDrawerStatusKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedStatus(): WinDef.UINT {
      val fnPtr = _1272194101_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1272194101_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class ICashDrawerStatus_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1272194101_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICashDrawerStatus, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6bbd78bfdca14e0699eb5af6a5aec108")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICashDrawerStatus(ptr: Pointer?): WithDefault = ICashDrawerStatus_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICashDrawerStatus {
      val address = segment.toRawLongValue()
      return makeICashDrawerStatus(Pointer(address))
    }

    public override fun toNative(obj: ICashDrawerStatus): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1272194101_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICashDrawerStatus): Array<ICashDrawerStatus?> = (elements
        as Array<ICashDrawerStatus?>).castToImpl<ICashDrawerStatus,ICashDrawerStatus_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICashDrawerStatus?> =
        arrayOfNulls<ICashDrawerStatus_Impl>(size) as Array<ICashDrawerStatus?>
  }
}
