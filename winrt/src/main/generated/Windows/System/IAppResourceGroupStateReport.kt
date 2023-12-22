package Windows.System

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

@ABIMarker(IAppResourceGroupStateReport.ABI::class)
@Signature("{52849f18-2f70-4236-ab40-d04db0c7b931}")
@Guid("52849f182f704236ab40d04db0c7b931")
@WinRTInterface("52849f182f704236ab40d04db0c7b931")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppResourceGroupStateReport.ByReference::class)
public interface IAppResourceGroupStateReport : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExecutionState(): AppResourceGroupExecutionState?

  @InterfaceMethod(1)
  public fun get_EnergyQuotaState(): AppResourceGroupEnergyQuotaState?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppResourceGroupStateReport> {
    public override fun getValue() = ABI.makeIAppResourceGroupStateReport(pointer.getPointer(0))

    public fun setValue(value: IAppResourceGroupStateReport_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppResourceGroupStateReport {
    public val __1878133818_Ptr: Pointer?

    public val _1878133818_VtblPtr: Pointer?
      get() = __1878133818_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExecutionState(): AppResourceGroupExecutionState? {
      val fnPtr = _1878133818_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppResourceGroupExecutionState>()
      val hr = fn.invokeHR(arrayOf(__1878133818_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppResourceGroupExecutionState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_EnergyQuotaState(): AppResourceGroupEnergyQuotaState? {
      val fnPtr = _1878133818_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppResourceGroupEnergyQuotaState>()
      val hr = fn.invokeHR(arrayOf(__1878133818_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppResourceGroupEnergyQuotaState>(result.getValue())
      return resultValue
    }
  }

  public class IAppResourceGroupStateReport_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1878133818_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppResourceGroupStateReport, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("52849f182f704236ab40d04db0c7b931")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppResourceGroupStateReport(ptr: Pointer?): WithDefault =
        IAppResourceGroupStateReport_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppResourceGroupStateReport {
      val address = segment.toRawLongValue()
      return makeIAppResourceGroupStateReport(Pointer(address))
    }

    public override fun toNative(obj: IAppResourceGroupStateReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1878133818_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppResourceGroupStateReport):
        Array<IAppResourceGroupStateReport?> = (elements as
        Array<IAppResourceGroupStateReport?>).castToImpl<IAppResourceGroupStateReport,IAppResourceGroupStateReport_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppResourceGroupStateReport?> =
        arrayOfNulls<IAppResourceGroupStateReport_Impl>(size) as
        Array<IAppResourceGroupStateReport?>
  }
}
