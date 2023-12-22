package Windows.Media.Capture

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IOptionalReferencePhotoCapturedEventArgs.ABI::class)
@Signature("{470f88b3-1e6d-4051-9c8b-f1d85af047b7}")
@Guid("470f88b31e6d40519c8bf1d85af047b7")
@WinRTInterface("470f88b31e6d40519c8bf1d85af047b7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IOptionalReferencePhotoCapturedEventArgs.ByReference::class)
public interface IOptionalReferencePhotoCapturedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Frame(): CapturedFrame?

  @InterfaceMethod(1)
  public fun get_Context(): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IOptionalReferencePhotoCapturedEventArgs> {
    public override fun getValue() =
        ABI.makeIOptionalReferencePhotoCapturedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IOptionalReferencePhotoCapturedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IOptionalReferencePhotoCapturedEventArgs {
    public val __1821882086_Ptr: Pointer?

    public val _1821882086_VtblPtr: Pointer?
      get() = __1821882086_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Frame(): CapturedFrame? {
      val fnPtr = _1821882086_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CapturedFrame>()
      val hr = fn.invokeHR(arrayOf(__1821882086_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CapturedFrame>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Context(): IUnknown? {
      val fnPtr = _1821882086_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1821882086_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IOptionalReferencePhotoCapturedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1821882086_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IOptionalReferencePhotoCapturedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("470f88b31e6d40519c8bf1d85af047b7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIOptionalReferencePhotoCapturedEventArgs(ptr: Pointer?): WithDefault =
        IOptionalReferencePhotoCapturedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IOptionalReferencePhotoCapturedEventArgs {
      val address = segment.toRawLongValue()
      return makeIOptionalReferencePhotoCapturedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IOptionalReferencePhotoCapturedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1821882086_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IOptionalReferencePhotoCapturedEventArgs):
        Array<IOptionalReferencePhotoCapturedEventArgs?> = (elements as
        Array<IOptionalReferencePhotoCapturedEventArgs?>).castToImpl<IOptionalReferencePhotoCapturedEventArgs,IOptionalReferencePhotoCapturedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOptionalReferencePhotoCapturedEventArgs?> =
        arrayOfNulls<IOptionalReferencePhotoCapturedEventArgs_Impl>(size) as
        Array<IOptionalReferencePhotoCapturedEventArgs?>
  }
}
