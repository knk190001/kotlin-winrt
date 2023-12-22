package Windows.UI.Notifications

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

@ABIMarker(IToastActivatedEventArgs.ABI::class)
@Signature("{e3bf92f3-c197-436f-8265-0625824f8dac}")
@Guid("e3bf92f3c197436f82650625824f8dac")
@WinRTInterface("e3bf92f3c197436f82650625824f8dac")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToastActivatedEventArgs.ByReference::class)
public interface IToastActivatedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Arguments(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToastActivatedEventArgs> {
    public override fun getValue() = ABI.makeIToastActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IToastActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToastActivatedEventArgs {
    public val __1770532899_Ptr: Pointer?

    public val _1770532899_VtblPtr: Pointer?
      get() = __1770532899_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Arguments(): String? {
      val fnPtr = _1770532899_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1770532899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IToastActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1770532899_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToastActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e3bf92f3c197436f82650625824f8dac")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToastActivatedEventArgs(ptr: Pointer?): WithDefault =
        IToastActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToastActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIToastActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IToastActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1770532899_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToastActivatedEventArgs):
        Array<IToastActivatedEventArgs?> = (elements as
        Array<IToastActivatedEventArgs?>).castToImpl<IToastActivatedEventArgs,IToastActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastActivatedEventArgs?> =
        arrayOfNulls<IToastActivatedEventArgs_Impl>(size) as Array<IToastActivatedEventArgs?>
  }
}
