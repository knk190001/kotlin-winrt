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

@ABIMarker(IPrintBindingOptionDetails.ABI::class)
@Signature("{c3f4cc98-9564-4f16-a055-a98b9a49e9d3}")
@Guid("c3f4cc9895644f16a055a98b9a49e9d3")
@WinRTInterface("c3f4cc9895644f16a055a98b9a49e9d3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintBindingOptionDetails.ByReference::class)
public interface IPrintBindingOptionDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_WarningText(value: String?): Unit

  @InterfaceMethod(1)
  public fun get_WarningText(): String?

  @InterfaceMethod(2)
  public fun put_Description(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_Description(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintBindingOptionDetails> {
    public override fun getValue() = ABI.makeIPrintBindingOptionDetails(pointer.getPointer(0))

    public fun setValue(value: IPrintBindingOptionDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintBindingOptionDetails {
    public val __1486954392_Ptr: Pointer?

    public val _1486954392_VtblPtr: Pointer?
      get() = __1486954392_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_WarningText(value: String?): Unit {
      val fnPtr = _1486954392_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1486954392_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_WarningText(): String? {
      val fnPtr = _1486954392_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1486954392_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Description(value: String?): Unit {
      val fnPtr = _1486954392_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1486954392_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Description(): String? {
      val fnPtr = _1486954392_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1486954392_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IPrintBindingOptionDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1486954392_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintBindingOptionDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c3f4cc9895644f16a055a98b9a49e9d3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintBindingOptionDetails(ptr: Pointer?): WithDefault =
        IPrintBindingOptionDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintBindingOptionDetails {
      val address = segment.toRawLongValue()
      return makeIPrintBindingOptionDetails(Pointer(address))
    }

    public override fun toNative(obj: IPrintBindingOptionDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1486954392_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintBindingOptionDetails):
        Array<IPrintBindingOptionDetails?> = (elements as
        Array<IPrintBindingOptionDetails?>).castToImpl<IPrintBindingOptionDetails,IPrintBindingOptionDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintBindingOptionDetails?> =
        arrayOfNulls<IPrintBindingOptionDetails_Impl>(size) as Array<IPrintBindingOptionDetails?>
  }
}
