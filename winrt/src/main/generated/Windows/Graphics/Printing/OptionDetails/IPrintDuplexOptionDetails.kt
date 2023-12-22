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

@ABIMarker(IPrintDuplexOptionDetails.ABI::class)
@Signature("{fcd94591-d4a4-44fa-b3fe-42e0ba28d5ad}")
@Guid("fcd94591d4a444fab3fe42e0ba28d5ad")
@WinRTInterface("fcd94591d4a444fab3fe42e0ba28d5ad")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintDuplexOptionDetails.ByReference::class)
public interface IPrintDuplexOptionDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_WarningText(value: String?): Unit

  @InterfaceMethod(1)
  public fun get_WarningText(): String?

  @InterfaceMethod(2)
  public fun put_Description(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_Description(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintDuplexOptionDetails> {
    public override fun getValue() = ABI.makeIPrintDuplexOptionDetails(pointer.getPointer(0))

    public fun setValue(value: IPrintDuplexOptionDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintDuplexOptionDetails {
    public val __20793373_Ptr: Pointer?

    public val _20793373_VtblPtr: Pointer?
      get() = __20793373_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_WarningText(value: String?): Unit {
      val fnPtr = _20793373_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__20793373_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_WarningText(): String? {
      val fnPtr = _20793373_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__20793373_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Description(value: String?): Unit {
      val fnPtr = _20793373_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__20793373_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Description(): String? {
      val fnPtr = _20793373_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__20793373_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IPrintDuplexOptionDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __20793373_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintDuplexOptionDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fcd94591d4a444fab3fe42e0ba28d5ad")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintDuplexOptionDetails(ptr: Pointer?): WithDefault =
        IPrintDuplexOptionDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintDuplexOptionDetails {
      val address = segment.toRawLongValue()
      return makeIPrintDuplexOptionDetails(Pointer(address))
    }

    public override fun toNative(obj: IPrintDuplexOptionDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__20793373_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintDuplexOptionDetails):
        Array<IPrintDuplexOptionDetails?> = (elements as
        Array<IPrintDuplexOptionDetails?>).castToImpl<IPrintDuplexOptionDetails,IPrintDuplexOptionDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintDuplexOptionDetails?> =
        arrayOfNulls<IPrintDuplexOptionDetails_Impl>(size) as Array<IPrintDuplexOptionDetails?>
  }
}
