package Windows.System.Power.Diagnostics

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IForegroundEnergyDiagnosticsStatics.ABI::class)
@Signature("{23ca0917-cd07-4609-be15-8fe894c5e41e}")
@Guid("23ca0917cd074609be158fe894c5e41e")
@WinRTInterface("23ca0917cd074609be158fe894c5e41e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IForegroundEnergyDiagnosticsStatics.ByReference::class)
public interface IForegroundEnergyDiagnosticsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceSpecificConversionFactor(): Double

  @InterfaceMethod(1)
  public fun ComputeTotalEnergyUsage(): WinDef.ULONG

  @InterfaceMethod(2)
  public fun ResetTotalEnergyUsage(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IForegroundEnergyDiagnosticsStatics> {
    public override fun getValue() =
        ABI.makeIForegroundEnergyDiagnosticsStatics(pointer.getPointer(0))

    public fun setValue(value: IForegroundEnergyDiagnosticsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IForegroundEnergyDiagnosticsStatics {
    public val __1345947650_Ptr: Pointer?

    public val _1345947650_VtblPtr: Pointer?
      get() = __1345947650_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceSpecificConversionFactor(): Double {
      val fnPtr = _1345947650_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1345947650_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun ComputeTotalEnergyUsage(): WinDef.ULONG {
      val fnPtr = _1345947650_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1345947650_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun ResetTotalEnergyUsage(): Unit {
      val fnPtr = _1345947650_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1345947650_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IForegroundEnergyDiagnosticsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1345947650_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IForegroundEnergyDiagnosticsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("23ca0917cd074609be158fe894c5e41e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIForegroundEnergyDiagnosticsStatics(ptr: Pointer?): WithDefault =
        IForegroundEnergyDiagnosticsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IForegroundEnergyDiagnosticsStatics {
      val address = segment.toRawLongValue()
      return makeIForegroundEnergyDiagnosticsStatics(Pointer(address))
    }

    public override fun toNative(obj: IForegroundEnergyDiagnosticsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1345947650_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IForegroundEnergyDiagnosticsStatics):
        Array<IForegroundEnergyDiagnosticsStatics?> = (elements as
        Array<IForegroundEnergyDiagnosticsStatics?>).castToImpl<IForegroundEnergyDiagnosticsStatics,IForegroundEnergyDiagnosticsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IForegroundEnergyDiagnosticsStatics?> =
        arrayOfNulls<IForegroundEnergyDiagnosticsStatics_Impl>(size) as
        Array<IForegroundEnergyDiagnosticsStatics?>
  }
}
