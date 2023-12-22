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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IReceiptPrintJob.ABI::class)
@Signature("{aa96066e-acad-4b79-9d0f-c0cfc08dc77b}")
@Guid("aa96066eacad4b799d0fc0cfc08dc77b")
@WinRTInterface("aa96066eacad4b799d0fc0cfc08dc77b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IReceiptPrintJob.ByReference::class)
public interface IReceiptPrintJob : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun MarkFeed(kind: PosPrinterMarkFeedKind?): Unit

  @InterfaceMethod(1)
  public fun CutPaper(percentage: Double): Unit

  @InterfaceMethod(2)
  public fun CutPaper(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IReceiptPrintJob> {
    public override fun getValue() = ABI.makeIReceiptPrintJob(pointer.getPointer(0))

    public fun setValue(value: IReceiptPrintJob_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IReceiptPrintJob {
    public val __818460887_Ptr: Pointer?

    public val _818460887_VtblPtr: Pointer?
      get() = __818460887_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun MarkFeed(kind: PosPrinterMarkFeedKind?): Unit {
      val fnPtr = _818460887_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__818460887_Ptr, marshalToNative(kind),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun CutPaper(percentage: Double): Unit {
      val fnPtr = _818460887_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__818460887_Ptr, percentage,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun CutPaper(): Unit {
      val fnPtr = _818460887_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__818460887_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IReceiptPrintJob_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __818460887_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IReceiptPrintJob, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aa96066eacad4b799d0fc0cfc08dc77b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIReceiptPrintJob(ptr: Pointer?): WithDefault = IReceiptPrintJob_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IReceiptPrintJob {
      val address = segment.toRawLongValue()
      return makeIReceiptPrintJob(Pointer(address))
    }

    public override fun toNative(obj: IReceiptPrintJob): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__818460887_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IReceiptPrintJob): Array<IReceiptPrintJob?> = (elements as
        Array<IReceiptPrintJob?>).castToImpl<IReceiptPrintJob,IReceiptPrintJob_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IReceiptPrintJob?> =
        arrayOfNulls<IReceiptPrintJob_Impl>(size) as Array<IReceiptPrintJob?>
  }
}
