package Windows.UI.Notifications

import Windows.Foundation.HResult
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

@ABIMarker(IToastFailedEventArgs.ABI::class)
@Signature("{35176862-cfd4-44f8-ad64-f500fd896c3b}")
@Guid("35176862cfd444f8ad64f500fd896c3b")
@WinRTInterface("35176862cfd444f8ad64f500fd896c3b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToastFailedEventArgs.ByReference::class)
public interface IToastFailedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ErrorCode(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToastFailedEventArgs> {
    public override fun getValue() = ABI.makeIToastFailedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IToastFailedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToastFailedEventArgs {
    public val __164628003_Ptr: Pointer?

    public val _164628003_VtblPtr: Pointer?
      get() = __164628003_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ErrorCode(): HResult? {
      val fnPtr = _164628003_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__164628003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IToastFailedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __164628003_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToastFailedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("35176862cfd444f8ad64f500fd896c3b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToastFailedEventArgs(ptr: Pointer?): WithDefault =
        IToastFailedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToastFailedEventArgs {
      val address = segment.toRawLongValue()
      return makeIToastFailedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IToastFailedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__164628003_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToastFailedEventArgs): Array<IToastFailedEventArgs?> =
        (elements as
        Array<IToastFailedEventArgs?>).castToImpl<IToastFailedEventArgs,IToastFailedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastFailedEventArgs?> =
        arrayOfNulls<IToastFailedEventArgs_Impl>(size) as Array<IToastFailedEventArgs?>
  }
}
