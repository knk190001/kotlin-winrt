package Microsoft.Windows.AppNotifications

import Windows.Foundation.Collections.IMap
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

@ABIMarker(IAppNotificationActivatedEventArgs.ABI::class)
@Signature("{7a8afaf9-31cb-51d5-82be-db6bd5878b77}")
@Guid("7a8afaf931cb51d582bedb6bd5878b77")
@WinRTInterface("7a8afaf931cb51d582bedb6bd5878b77")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppNotificationActivatedEventArgs.ByReference::class)
public interface IAppNotificationActivatedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Argument(): String?

  @InterfaceMethod(1)
  public fun get_UserInput(): IMap<String?, String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppNotificationActivatedEventArgs> {
    public override fun getValue() =
        ABI.makeIAppNotificationActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppNotificationActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppNotificationActivatedEventArgs {
    public val __1077417083_Ptr: Pointer?

    public val _1077417083_VtblPtr: Pointer?
      get() = __1077417083_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Argument(): String? {
      val fnPtr = _1077417083_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1077417083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_UserInput(): IMap<String?, String?>? {
      val fnPtr = _1077417083_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<String?, String?>>()
      val hr = fn.invokeHR(arrayOf(__1077417083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<String?, String?>>(result.getValue())
      return resultValue
    }
  }

  public class IAppNotificationActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1077417083_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppNotificationActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7a8afaf931cb51d582bedb6bd5878b77")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppNotificationActivatedEventArgs(ptr: Pointer?): WithDefault =
        IAppNotificationActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppNotificationActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppNotificationActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppNotificationActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1077417083_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppNotificationActivatedEventArgs):
        Array<IAppNotificationActivatedEventArgs?> = (elements as
        Array<IAppNotificationActivatedEventArgs?>).castToImpl<IAppNotificationActivatedEventArgs,IAppNotificationActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppNotificationActivatedEventArgs?> =
        arrayOfNulls<IAppNotificationActivatedEventArgs_Impl>(size) as
        Array<IAppNotificationActivatedEventArgs?>
  }
}
