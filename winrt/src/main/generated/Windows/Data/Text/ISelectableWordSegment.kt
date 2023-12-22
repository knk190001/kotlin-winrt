package Windows.Data.Text

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

@ABIMarker(ISelectableWordSegment.ABI::class)
@Signature("{916a4cb7-8aa7-4c78-b374-5dedb752e60b}")
@Guid("916a4cb78aa74c78b3745dedb752e60b")
@WinRTInterface("916a4cb78aa74c78b3745dedb752e60b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISelectableWordSegment.ByReference::class)
public interface ISelectableWordSegment : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Text(): String?

  @InterfaceMethod(1)
  public fun get_SourceTextSegment(): TextSegment?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISelectableWordSegment> {
    public override fun getValue() = ABI.makeISelectableWordSegment(pointer.getPointer(0))

    public fun setValue(value: ISelectableWordSegment_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISelectableWordSegment {
    public val __1580641392_Ptr: Pointer?

    public val _1580641392_VtblPtr: Pointer?
      get() = __1580641392_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Text(): String? {
      val fnPtr = _1580641392_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1580641392_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SourceTextSegment(): TextSegment? {
      val fnPtr = _1580641392_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextSegment>()
      val hr = fn.invokeHR(arrayOf(__1580641392_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextSegment>(result.getValue())
      return resultValue
    }
  }

  public class ISelectableWordSegment_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1580641392_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISelectableWordSegment, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("916a4cb78aa74c78b3745dedb752e60b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISelectableWordSegment(ptr: Pointer?): WithDefault =
        ISelectableWordSegment_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISelectableWordSegment {
      val address = segment.toRawLongValue()
      return makeISelectableWordSegment(Pointer(address))
    }

    public override fun toNative(obj: ISelectableWordSegment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1580641392_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISelectableWordSegment): Array<ISelectableWordSegment?> =
        (elements as
        Array<ISelectableWordSegment?>).castToImpl<ISelectableWordSegment,ISelectableWordSegment_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISelectableWordSegment?> =
        arrayOfNulls<ISelectableWordSegment_Impl>(size) as Array<ISelectableWordSegment?>
  }
}
