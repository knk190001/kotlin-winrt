package Windows.ApplicationModel.Core

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

@ABIMarker(IUnhandledErrorDetectedEventArgs.ABI::class)
@Signature("{679ab78b-b336-4822-ac40-0d750f0b7a2b}")
@Guid("679ab78bb3364822ac400d750f0b7a2b")
@WinRTInterface("679ab78bb3364822ac400d750f0b7a2b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUnhandledErrorDetectedEventArgs.ByReference::class)
public interface IUnhandledErrorDetectedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UnhandledError(): UnhandledError?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUnhandledErrorDetectedEventArgs> {
    public override fun getValue() = ABI.makeIUnhandledErrorDetectedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IUnhandledErrorDetectedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUnhandledErrorDetectedEventArgs {
    public val __1187423920_Ptr: Pointer?

    public val _1187423920_VtblPtr: Pointer?
      get() = __1187423920_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UnhandledError(): UnhandledError? {
      val fnPtr = _1187423920_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UnhandledError>()
      val hr = fn.invokeHR(arrayOf(__1187423920_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UnhandledError>(result.getValue())
      return resultValue
    }
  }

  public class IUnhandledErrorDetectedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1187423920_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUnhandledErrorDetectedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("679ab78bb3364822ac400d750f0b7a2b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUnhandledErrorDetectedEventArgs(ptr: Pointer?): WithDefault =
        IUnhandledErrorDetectedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUnhandledErrorDetectedEventArgs {
      val address = segment.toRawLongValue()
      return makeIUnhandledErrorDetectedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IUnhandledErrorDetectedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1187423920_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUnhandledErrorDetectedEventArgs):
        Array<IUnhandledErrorDetectedEventArgs?> = (elements as
        Array<IUnhandledErrorDetectedEventArgs?>).castToImpl<IUnhandledErrorDetectedEventArgs,IUnhandledErrorDetectedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUnhandledErrorDetectedEventArgs?> =
        arrayOfNulls<IUnhandledErrorDetectedEventArgs_Impl>(size) as
        Array<IUnhandledErrorDetectedEventArgs?>
  }
}
