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

@ABIMarker(IDataRequest.ABI::class)
@Signature("{4341ae3b-fc12-4e53-8c02-ac714c415a27}")
@Guid("4341ae3bfc124e538c02ac714c415a27")
@WinRTInterface("4341ae3bfc124e538c02ac714c415a27")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataRequest.ByReference::class)
public interface IDataRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Data(): DataPackage?

  @InterfaceMethod(1)
  public fun put_Data(value: DataPackage?): Unit

  @InterfaceMethod(2)
  public fun get_Deadline(): DateTime?

  @InterfaceMethod(3)
  public fun FailWithDisplayText(value: String?): Unit

  @InterfaceMethod(4)
  public fun GetDeferral(): DataRequestDeferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDataRequest> {
    public override fun getValue() = ABI.makeIDataRequest(pointer.getPointer(0))

    public fun setValue(value: IDataRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataRequest {
    public val __1643839611_Ptr: Pointer?

    public val _1643839611_VtblPtr: Pointer?
      get() = __1643839611_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Data(): DataPackage? {
      val fnPtr = _1643839611_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackage>()
      val hr = fn.invokeHR(arrayOf(__1643839611_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Data(value: DataPackage?): Unit {
      val fnPtr = _1643839611_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1643839611_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Deadline(): DateTime? {
      val fnPtr = _1643839611_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1643839611_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun FailWithDisplayText(value: String?): Unit {
      val fnPtr = _1643839611_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1643839611_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun GetDeferral(): DataRequestDeferral? {
      val fnPtr = _1643839611_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataRequestDeferral>()
      val hr = fn.invokeHR(arrayOf(__1643839611_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataRequestDeferral>(result.getValue())
      return resultValue
    }
  }

  public class IDataRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1643839611_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4341ae3bfc124e538c02ac714c415a27")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataRequest(ptr: Pointer?): WithDefault = IDataRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataRequest {
      val address = segment.toRawLongValue()
      return makeIDataRequest(Pointer(address))
    }

    public override fun toNative(obj: IDataRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1643839611_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataRequest): Array<IDataRequest?> = (elements as
        Array<IDataRequest?>).castToImpl<IDataRequest,IDataRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataRequest?> =
        arrayOfNulls<IDataRequest_Impl>(size) as Array<IDataRequest?>
  }
}
