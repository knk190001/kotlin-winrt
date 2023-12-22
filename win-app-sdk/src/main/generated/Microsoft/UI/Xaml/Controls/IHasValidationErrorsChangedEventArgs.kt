package Microsoft.UI.Xaml.Controls

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHasValidationErrorsChangedEventArgs.ABI::class)
@Signature("{e1f0f2cf-b0ef-5f56-b597-f0771f5cffd2}")
@Guid("e1f0f2cfb0ef5f56b597f0771f5cffd2")
@WinRTInterface("e1f0f2cfb0ef5f56b597f0771f5cffd2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHasValidationErrorsChangedEventArgs.ByReference::class)
public interface IHasValidationErrorsChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NewValue(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHasValidationErrorsChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIHasValidationErrorsChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IHasValidationErrorsChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHasValidationErrorsChangedEventArgs {
    public val __721365190_Ptr: Pointer?

    public val _721365190_VtblPtr: Pointer?
      get() = __721365190_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NewValue(): Boolean {
      val fnPtr = _721365190_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__721365190_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IHasValidationErrorsChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __721365190_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHasValidationErrorsChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e1f0f2cfb0ef5f56b597f0771f5cffd2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHasValidationErrorsChangedEventArgs(ptr: Pointer?): WithDefault =
        IHasValidationErrorsChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHasValidationErrorsChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIHasValidationErrorsChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IHasValidationErrorsChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__721365190_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHasValidationErrorsChangedEventArgs):
        Array<IHasValidationErrorsChangedEventArgs?> = (elements as
        Array<IHasValidationErrorsChangedEventArgs?>).castToImpl<IHasValidationErrorsChangedEventArgs,IHasValidationErrorsChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHasValidationErrorsChangedEventArgs?> =
        arrayOfNulls<IHasValidationErrorsChangedEventArgs_Impl>(size) as
        Array<IHasValidationErrorsChangedEventArgs?>
  }
}
