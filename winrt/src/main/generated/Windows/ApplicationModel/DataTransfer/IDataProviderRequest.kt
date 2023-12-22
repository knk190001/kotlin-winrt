package Windows.ApplicationModel.DataTransfer

import Windows.Foundation.DateTime
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IDataProviderRequest.ABI::class)
@Signature("{ebbc7157-d3c8-47da-acde-f82388d5f716}")
@Guid("ebbc7157d3c847daacdef82388d5f716")
@WinRTInterface("ebbc7157d3c847daacdef82388d5f716")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataProviderRequest.ByReference::class)
public interface IDataProviderRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FormatId(): String?

  @InterfaceMethod(1)
  public fun get_Deadline(): DateTime?

  @InterfaceMethod(2)
  public fun GetDeferral(): DataProviderDeferral?

  @InterfaceMethod(3)
  public fun SetData(value: IUnknown?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataProviderRequest> {
    public override fun getValue() = ABI.makeIDataProviderRequest(pointer.getPointer(0))

    public fun setValue(value: IDataProviderRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataProviderRequest {
    public val __1658550966_Ptr: Pointer?

    public val _1658550966_VtblPtr: Pointer?
      get() = __1658550966_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FormatId(): String? {
      val fnPtr = _1658550966_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1658550966_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Deadline(): DateTime? {
      val fnPtr = _1658550966_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1658550966_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetDeferral(): DataProviderDeferral? {
      val fnPtr = _1658550966_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataProviderDeferral>()
      val hr = fn.invokeHR(arrayOf(__1658550966_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataProviderDeferral>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun SetData(value: IUnknown?): Unit {
      val fnPtr = _1658550966_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1658550966_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDataProviderRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1658550966_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataProviderRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ebbc7157d3c847daacdef82388d5f716")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataProviderRequest(ptr: Pointer?): WithDefault = IDataProviderRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataProviderRequest {
      val address = segment.toRawLongValue()
      return makeIDataProviderRequest(Pointer(address))
    }

    public override fun toNative(obj: IDataProviderRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1658550966_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataProviderRequest): Array<IDataProviderRequest?> =
        (elements as
        Array<IDataProviderRequest?>).castToImpl<IDataProviderRequest,IDataProviderRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataProviderRequest?> =
        arrayOfNulls<IDataProviderRequest_Impl>(size) as Array<IDataProviderRequest?>
  }
}
