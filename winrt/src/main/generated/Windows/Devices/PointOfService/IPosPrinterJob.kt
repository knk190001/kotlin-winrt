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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPosPrinterJob.ABI::class)
@Signature("{9a94005c-0615-4591-a58f-30f87edfe2e4}")
@Guid("9a94005c06154591a58f30f87edfe2e4")
@WinRTInterface("9a94005c06154591a58f30f87edfe2e4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPosPrinterJob.ByReference::class)
public interface IPosPrinterJob : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Print(`data`: String?): Unit

  @InterfaceMethod(1)
  public fun PrintLine(`data`: String?): Unit

  @InterfaceMethod(2)
  public fun PrintLine(): Unit

  @InterfaceMethod(3)
  public fun ExecuteAsync(): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPosPrinterJob>
      {
    public override fun getValue() = ABI.makeIPosPrinterJob(pointer.getPointer(0))

    public fun setValue(value: IPosPrinterJob_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPosPrinterJob {
    public val __738591224_Ptr: Pointer?

    public val _738591224_VtblPtr: Pointer?
      get() = __738591224_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Print(`data`: String?): Unit {
      val fnPtr = _738591224_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__738591224_Ptr, marshalToNative(data),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun PrintLine(`data`: String?): Unit {
      val fnPtr = _738591224_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__738591224_Ptr, marshalToNative(data),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun PrintLine(): Unit {
      val fnPtr = _738591224_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__738591224_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun ExecuteAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _738591224_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__738591224_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IPosPrinterJob_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __738591224_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPosPrinterJob, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9a94005c06154591a58f30f87edfe2e4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPosPrinterJob(ptr: Pointer?): WithDefault = IPosPrinterJob_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPosPrinterJob {
      val address = segment.toRawLongValue()
      return makeIPosPrinterJob(Pointer(address))
    }

    public override fun toNative(obj: IPosPrinterJob): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__738591224_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPosPrinterJob): Array<IPosPrinterJob?> = (elements as
        Array<IPosPrinterJob?>).castToImpl<IPosPrinterJob,IPosPrinterJob_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPosPrinterJob?> =
        arrayOfNulls<IPosPrinterJob_Impl>(size) as Array<IPosPrinterJob?>
  }
}
