package Windows.Services.Maps

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

@ABIMarker(IManeuverWarning.ABI::class)
@Signature("{c1a36d8a-2630-4378-9e4a-6e44253dceba}")
@Guid("c1a36d8a263043789e4a6e44253dceba")
@WinRTInterface("c1a36d8a263043789e4a6e44253dceba")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IManeuverWarning.ByReference::class)
public interface IManeuverWarning : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Kind(): ManeuverWarningKind?

  @InterfaceMethod(1)
  public fun get_Severity(): ManeuverWarningSeverity?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IManeuverWarning> {
    public override fun getValue() = ABI.makeIManeuverWarning(pointer.getPointer(0))

    public fun setValue(value: IManeuverWarning_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IManeuverWarning {
    public val __1836597290_Ptr: Pointer?

    public val _1836597290_VtblPtr: Pointer?
      get() = __1836597290_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Kind(): ManeuverWarningKind? {
      val fnPtr = _1836597290_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ManeuverWarningKind>()
      val hr = fn.invokeHR(arrayOf(__1836597290_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ManeuverWarningKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Severity(): ManeuverWarningSeverity? {
      val fnPtr = _1836597290_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ManeuverWarningSeverity>()
      val hr = fn.invokeHR(arrayOf(__1836597290_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ManeuverWarningSeverity>(result.getValue())
      return resultValue
    }
  }

  public class IManeuverWarning_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1836597290_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IManeuverWarning, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c1a36d8a263043789e4a6e44253dceba")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIManeuverWarning(ptr: Pointer?): WithDefault = IManeuverWarning_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IManeuverWarning {
      val address = segment.toRawLongValue()
      return makeIManeuverWarning(Pointer(address))
    }

    public override fun toNative(obj: IManeuverWarning): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1836597290_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IManeuverWarning): Array<IManeuverWarning?> = (elements as
        Array<IManeuverWarning?>).castToImpl<IManeuverWarning,IManeuverWarning_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IManeuverWarning?> =
        arrayOfNulls<IManeuverWarning_Impl>(size) as Array<IManeuverWarning?>
  }
}
