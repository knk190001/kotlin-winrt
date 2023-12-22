package Microsoft.Windows.Widgets.Providers

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

@ABIMarker(IWidgetActionInvokedArgs.ABI::class)
@Signature("{c593cc57-04b9-52ca-88ad-46fea21ea340}")
@Guid("c593cc5704b952ca88ad46fea21ea340")
@WinRTInterface("c593cc5704b952ca88ad46fea21ea340")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWidgetActionInvokedArgs.ByReference::class)
public interface IWidgetActionInvokedArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_WidgetContext(): WidgetContext?

  @InterfaceMethod(1)
  public fun get_Verb(): String?

  @InterfaceMethod(2)
  public fun get_Data(): String?

  @InterfaceMethod(3)
  public fun get_CustomState(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWidgetActionInvokedArgs> {
    public override fun getValue() = ABI.makeIWidgetActionInvokedArgs(pointer.getPointer(0))

    public fun setValue(value: IWidgetActionInvokedArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWidgetActionInvokedArgs {
    public val __2146294110_Ptr: Pointer?

    public val _2146294110_VtblPtr: Pointer?
      get() = __2146294110_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_WidgetContext(): WidgetContext? {
      val fnPtr = _2146294110_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WidgetContext>()
      val hr = fn.invokeHR(arrayOf(__2146294110_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WidgetContext>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Verb(): String? {
      val fnPtr = _2146294110_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2146294110_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Data(): String? {
      val fnPtr = _2146294110_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2146294110_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_CustomState(): String? {
      val fnPtr = _2146294110_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2146294110_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IWidgetActionInvokedArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2146294110_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWidgetActionInvokedArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c593cc5704b952ca88ad46fea21ea340")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWidgetActionInvokedArgs(ptr: Pointer?): WithDefault =
        IWidgetActionInvokedArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWidgetActionInvokedArgs {
      val address = segment.toRawLongValue()
      return makeIWidgetActionInvokedArgs(Pointer(address))
    }

    public override fun toNative(obj: IWidgetActionInvokedArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2146294110_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWidgetActionInvokedArgs):
        Array<IWidgetActionInvokedArgs?> = (elements as
        Array<IWidgetActionInvokedArgs?>).castToImpl<IWidgetActionInvokedArgs,IWidgetActionInvokedArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWidgetActionInvokedArgs?> =
        arrayOfNulls<IWidgetActionInvokedArgs_Impl>(size) as Array<IWidgetActionInvokedArgs?>
  }
}
