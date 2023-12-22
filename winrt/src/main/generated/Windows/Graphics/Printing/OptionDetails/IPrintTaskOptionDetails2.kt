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

@ABIMarker(IPrintTaskOptionDetails2.ABI::class)
@Signature("{53730a09-f968-4692-a177-c074597186db}")
@Guid("53730a09f9684692a177c074597186db")
@WinRTInterface("53730a09f9684692a177c074597186db")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintTaskOptionDetails2.ByReference::class)
public interface IPrintTaskOptionDetails2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateToggleOption(optionId: String?, displayName: String?):
      PrintCustomToggleOptionDetails?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintTaskOptionDetails2> {
    public override fun getValue() = ABI.makeIPrintTaskOptionDetails2(pointer.getPointer(0))

    public fun setValue(value: IPrintTaskOptionDetails2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintTaskOptionDetails2 {
    public val __2044374854_Ptr: Pointer?

    public val _2044374854_VtblPtr: Pointer?
      get() = __2044374854_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateToggleOption(optionId: String?, displayName: String?):
        PrintCustomToggleOptionDetails? {
      val fnPtr = _2044374854_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintCustomToggleOptionDetails>()
      val hr = fn.invokeHR(arrayOf(__2044374854_Ptr, marshalToNative(optionId),
          marshalToNative(displayName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintCustomToggleOptionDetails>(result.getValue())
      return resultValue
    }
  }

  public class IPrintTaskOptionDetails2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2044374854_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintTaskOptionDetails2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("53730a09f9684692a177c074597186db")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintTaskOptionDetails2(ptr: Pointer?): WithDefault =
        IPrintTaskOptionDetails2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintTaskOptionDetails2 {
      val address = segment.toRawLongValue()
      return makeIPrintTaskOptionDetails2(Pointer(address))
    }

    public override fun toNative(obj: IPrintTaskOptionDetails2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2044374854_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintTaskOptionDetails2):
        Array<IPrintTaskOptionDetails2?> = (elements as
        Array<IPrintTaskOptionDetails2?>).castToImpl<IPrintTaskOptionDetails2,IPrintTaskOptionDetails2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintTaskOptionDetails2?> =
        arrayOfNulls<IPrintTaskOptionDetails2_Impl>(size) as Array<IPrintTaskOptionDetails2?>
  }
}
