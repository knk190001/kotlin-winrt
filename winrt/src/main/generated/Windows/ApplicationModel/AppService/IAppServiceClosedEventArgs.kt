package Windows.ApplicationModel.AppService

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppServiceClosedEventArgs.ABI::class)
@Signature("{de6016f6-cb03-4d35-ac8d-cc6303239731}")
@Guid("de6016f6cb034d35ac8dcc6303239731")
@WinRTInterface("de6016f6cb034d35ac8dcc6303239731")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppServiceClosedEventArgs.ByReference::class)
public interface IAppServiceClosedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): AppServiceClosedStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppServiceClosedEventArgs> {
    public override fun getValue() = ABI.makeIAppServiceClosedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppServiceClosedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppServiceClosedEventArgs {
    public val __1875974764_Ptr: Pointer?

    public val _1875974764_VtblPtr: Pointer?
      get() = __1875974764_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): AppServiceClosedStatus? {
      val fnPtr = _1875974764_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppServiceClosedStatus>()
      val hr = fn.invokeHR(arrayOf(__1875974764_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppServiceClosedStatus>(result.getValue())
      return resultValue
    }
  }

  public class IAppServiceClosedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1875974764_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppServiceClosedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("de6016f6cb034d35ac8dcc6303239731")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppServiceClosedEventArgs(ptr: Pointer?): WithDefault =
        IAppServiceClosedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppServiceClosedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppServiceClosedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppServiceClosedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1875974764_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppServiceClosedEventArgs):
        Array<IAppServiceClosedEventArgs?> = (elements as
        Array<IAppServiceClosedEventArgs?>).castToImpl<IAppServiceClosedEventArgs,IAppServiceClosedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppServiceClosedEventArgs?> =
        arrayOfNulls<IAppServiceClosedEventArgs_Impl>(size) as Array<IAppServiceClosedEventArgs?>
  }
}
