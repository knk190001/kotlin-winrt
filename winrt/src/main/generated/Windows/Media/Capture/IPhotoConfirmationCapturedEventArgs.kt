package Windows.Media.Capture

import Windows.Foundation.TimeSpan
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

@ABIMarker(IPhotoConfirmationCapturedEventArgs.ABI::class)
@Signature("{ab473672-c28a-4827-8f8d-3636d3beb51e}")
@Guid("ab473672c28a48278f8d3636d3beb51e")
@WinRTInterface("ab473672c28a48278f8d3636d3beb51e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhotoConfirmationCapturedEventArgs.ByReference::class)
public interface IPhotoConfirmationCapturedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Frame(): CapturedFrame?

  @InterfaceMethod(1)
  public fun get_CaptureTimeOffset(): TimeSpan?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhotoConfirmationCapturedEventArgs> {
    public override fun getValue() =
        ABI.makeIPhotoConfirmationCapturedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPhotoConfirmationCapturedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhotoConfirmationCapturedEventArgs {
    public val __1260583786_Ptr: Pointer?

    public val _1260583786_VtblPtr: Pointer?
      get() = __1260583786_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Frame(): CapturedFrame? {
      val fnPtr = _1260583786_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CapturedFrame>()
      val hr = fn.invokeHR(arrayOf(__1260583786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CapturedFrame>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CaptureTimeOffset(): TimeSpan? {
      val fnPtr = _1260583786_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1260583786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }
  }

  public class IPhotoConfirmationCapturedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1260583786_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhotoConfirmationCapturedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ab473672c28a48278f8d3636d3beb51e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhotoConfirmationCapturedEventArgs(ptr: Pointer?): WithDefault =
        IPhotoConfirmationCapturedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhotoConfirmationCapturedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPhotoConfirmationCapturedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPhotoConfirmationCapturedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1260583786_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhotoConfirmationCapturedEventArgs):
        Array<IPhotoConfirmationCapturedEventArgs?> = (elements as
        Array<IPhotoConfirmationCapturedEventArgs?>).castToImpl<IPhotoConfirmationCapturedEventArgs,IPhotoConfirmationCapturedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhotoConfirmationCapturedEventArgs?> =
        arrayOfNulls<IPhotoConfirmationCapturedEventArgs_Impl>(size) as
        Array<IPhotoConfirmationCapturedEventArgs?>
  }
}
