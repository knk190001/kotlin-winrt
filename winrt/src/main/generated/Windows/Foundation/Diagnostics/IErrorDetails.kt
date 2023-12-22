package Windows.Foundation.Diagnostics

import Windows.Foundation.Uri
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

@ABIMarker(IErrorDetails.ABI::class)
@Signature("{378cbb01-2cc9-428f-8c55-2c990d463e8f}")
@Guid("378cbb012cc9428f8c552c990d463e8f")
@WinRTInterface("378cbb012cc9428f8c552c990d463e8f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IErrorDetails.ByReference::class)
public interface IErrorDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Description(): String?

  @InterfaceMethod(1)
  public fun get_LongDescription(): String?

  @InterfaceMethod(2)
  public fun get_HelpUri(): Uri?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IErrorDetails>
      {
    public override fun getValue() = ABI.makeIErrorDetails(pointer.getPointer(0))

    public fun setValue(value: IErrorDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IErrorDetails {
    public val __1481159001_Ptr: Pointer?

    public val _1481159001_VtblPtr: Pointer?
      get() = __1481159001_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Description(): String? {
      val fnPtr = _1481159001_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1481159001_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_LongDescription(): String? {
      val fnPtr = _1481159001_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1481159001_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_HelpUri(): Uri? {
      val fnPtr = _1481159001_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1481159001_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }
  }

  public class IErrorDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1481159001_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IErrorDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("378cbb012cc9428f8c552c990d463e8f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIErrorDetails(ptr: Pointer?): WithDefault = IErrorDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IErrorDetails {
      val address = segment.toRawLongValue()
      return makeIErrorDetails(Pointer(address))
    }

    public override fun toNative(obj: IErrorDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1481159001_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IErrorDetails): Array<IErrorDetails?> = (elements as
        Array<IErrorDetails?>).castToImpl<IErrorDetails,IErrorDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IErrorDetails?> =
        arrayOfNulls<IErrorDetails_Impl>(size) as Array<IErrorDetails?>
  }
}
