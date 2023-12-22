package Windows.System.Diagnostics

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
import kotlin.Long
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IProcessDiskUsageReport.ABI::class)
@Signature("{401627fd-535d-4c1f-81b8-da54e1be635e}")
@Guid("401627fd535d4c1f81b8da54e1be635e")
@WinRTInterface("401627fd535d4c1f81b8da54e1be635e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProcessDiskUsageReport.ByReference::class)
public interface IProcessDiskUsageReport : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ReadOperationCount(): Long

  @InterfaceMethod(1)
  public fun get_WriteOperationCount(): Long

  @InterfaceMethod(2)
  public fun get_OtherOperationCount(): Long

  @InterfaceMethod(3)
  public fun get_BytesReadCount(): Long

  @InterfaceMethod(4)
  public fun get_BytesWrittenCount(): Long

  @InterfaceMethod(5)
  public fun get_OtherBytesCount(): Long

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProcessDiskUsageReport> {
    public override fun getValue() = ABI.makeIProcessDiskUsageReport(pointer.getPointer(0))

    public fun setValue(value: IProcessDiskUsageReport_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProcessDiskUsageReport {
    public val __34394950_Ptr: Pointer?

    public val _34394950_VtblPtr: Pointer?
      get() = __34394950_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ReadOperationCount(): Long {
      val fnPtr = _34394950_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Long>()
      val hr = fn.invokeHR(arrayOf(__34394950_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Long>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_WriteOperationCount(): Long {
      val fnPtr = _34394950_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Long>()
      val hr = fn.invokeHR(arrayOf(__34394950_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Long>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_OtherOperationCount(): Long {
      val fnPtr = _34394950_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Long>()
      val hr = fn.invokeHR(arrayOf(__34394950_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Long>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_BytesReadCount(): Long {
      val fnPtr = _34394950_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Long>()
      val hr = fn.invokeHR(arrayOf(__34394950_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Long>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_BytesWrittenCount(): Long {
      val fnPtr = _34394950_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Long>()
      val hr = fn.invokeHR(arrayOf(__34394950_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Long>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_OtherBytesCount(): Long {
      val fnPtr = _34394950_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Long>()
      val hr = fn.invokeHR(arrayOf(__34394950_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Long>(result.getValue())
      return resultValue!!
    }
  }

  public class IProcessDiskUsageReport_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __34394950_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProcessDiskUsageReport, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("401627fd535d4c1f81b8da54e1be635e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProcessDiskUsageReport(ptr: Pointer?): WithDefault =
        IProcessDiskUsageReport_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProcessDiskUsageReport {
      val address = segment.toRawLongValue()
      return makeIProcessDiskUsageReport(Pointer(address))
    }

    public override fun toNative(obj: IProcessDiskUsageReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__34394950_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProcessDiskUsageReport): Array<IProcessDiskUsageReport?>
        = (elements as
        Array<IProcessDiskUsageReport?>).castToImpl<IProcessDiskUsageReport,IProcessDiskUsageReport_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProcessDiskUsageReport?> =
        arrayOfNulls<IProcessDiskUsageReport_Impl>(size) as Array<IProcessDiskUsageReport?>
  }
}
