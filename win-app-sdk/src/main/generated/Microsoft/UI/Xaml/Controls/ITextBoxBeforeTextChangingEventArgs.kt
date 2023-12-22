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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITextBoxBeforeTextChangingEventArgs.ABI::class)
@Signature("{ba46105b-9a16-5237-a20f-5df750992a05}")
@Guid("ba46105b9a165237a20f5df750992a05")
@WinRTInterface("ba46105b9a165237a20f5df750992a05")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextBoxBeforeTextChangingEventArgs.ByReference::class)
public interface ITextBoxBeforeTextChangingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NewText(): String?

  @InterfaceMethod(1)
  public fun get_Cancel(): Boolean

  @InterfaceMethod(2)
  public fun put_Cancel(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextBoxBeforeTextChangingEventArgs> {
    public override fun getValue() =
        ABI.makeITextBoxBeforeTextChangingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITextBoxBeforeTextChangingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextBoxBeforeTextChangingEventArgs {
    public val __326040441_Ptr: Pointer?

    public val _326040441_VtblPtr: Pointer?
      get() = __326040441_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NewText(): String? {
      val fnPtr = _326040441_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__326040441_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Cancel(): Boolean {
      val fnPtr = _326040441_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__326040441_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_Cancel(value: Boolean): Unit {
      val fnPtr = _326040441_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__326040441_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITextBoxBeforeTextChangingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __326040441_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextBoxBeforeTextChangingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ba46105b9a165237a20f5df750992a05")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextBoxBeforeTextChangingEventArgs(ptr: Pointer?): WithDefault =
        ITextBoxBeforeTextChangingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextBoxBeforeTextChangingEventArgs {
      val address = segment.toRawLongValue()
      return makeITextBoxBeforeTextChangingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITextBoxBeforeTextChangingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__326040441_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextBoxBeforeTextChangingEventArgs):
        Array<ITextBoxBeforeTextChangingEventArgs?> = (elements as
        Array<ITextBoxBeforeTextChangingEventArgs?>).castToImpl<ITextBoxBeforeTextChangingEventArgs,ITextBoxBeforeTextChangingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextBoxBeforeTextChangingEventArgs?> =
        arrayOfNulls<ITextBoxBeforeTextChangingEventArgs_Impl>(size) as
        Array<ITextBoxBeforeTextChangingEventArgs?>
  }
}
