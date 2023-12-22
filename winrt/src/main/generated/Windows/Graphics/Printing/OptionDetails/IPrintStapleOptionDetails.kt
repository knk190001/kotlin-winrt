package Windows.Graphics.Printing.OptionDetails

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

@ABIMarker(IPrintStapleOptionDetails.ABI::class)
@Signature("{d43175bd-9c0b-44e0-84f6-ceebce653800}")
@Guid("d43175bd9c0b44e084f6ceebce653800")
@WinRTInterface("d43175bd9c0b44e084f6ceebce653800")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintStapleOptionDetails.ByReference::class)
public interface IPrintStapleOptionDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_WarningText(value: String?): Unit

  @InterfaceMethod(1)
  public fun get_WarningText(): String?

  @InterfaceMethod(2)
  public fun put_Description(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_Description(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintStapleOptionDetails> {
    public override fun getValue() = ABI.makeIPrintStapleOptionDetails(pointer.getPointer(0))

    public fun setValue(value: IPrintStapleOptionDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintStapleOptionDetails {
    public val __947616076_Ptr: Pointer?

    public val _947616076_VtblPtr: Pointer?
      get() = __947616076_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_WarningText(value: String?): Unit {
      val fnPtr = _947616076_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__947616076_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_WarningText(): String? {
      val fnPtr = _947616076_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__947616076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Description(value: String?): Unit {
      val fnPtr = _947616076_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__947616076_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Description(): String? {
      val fnPtr = _947616076_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__947616076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IPrintStapleOptionDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __947616076_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintStapleOptionDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d43175bd9c0b44e084f6ceebce653800")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintStapleOptionDetails(ptr: Pointer?): WithDefault =
        IPrintStapleOptionDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintStapleOptionDetails {
      val address = segment.toRawLongValue()
      return makeIPrintStapleOptionDetails(Pointer(address))
    }

    public override fun toNative(obj: IPrintStapleOptionDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__947616076_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintStapleOptionDetails):
        Array<IPrintStapleOptionDetails?> = (elements as
        Array<IPrintStapleOptionDetails?>).castToImpl<IPrintStapleOptionDetails,IPrintStapleOptionDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintStapleOptionDetails?> =
        arrayOfNulls<IPrintStapleOptionDetails_Impl>(size) as Array<IPrintStapleOptionDetails?>
  }
}
