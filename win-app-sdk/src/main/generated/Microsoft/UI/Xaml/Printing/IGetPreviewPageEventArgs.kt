package Microsoft.UI.Xaml.Printing

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

@ABIMarker(IGetPreviewPageEventArgs.ABI::class)
@Signature("{a68fbe17-f577-597f-b3ab-b379447149e6}")
@Guid("a68fbe17f577597fb3abb379447149e6")
@WinRTInterface("a68fbe17f577597fb3abb379447149e6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGetPreviewPageEventArgs.ByReference::class)
public interface IGetPreviewPageEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PageNumber(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGetPreviewPageEventArgs> {
    public override fun getValue() = ABI.makeIGetPreviewPageEventArgs(pointer.getPointer(0))

    public fun setValue(value: IGetPreviewPageEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGetPreviewPageEventArgs {
    public val __655708402_Ptr: Pointer?

    public val _655708402_VtblPtr: Pointer?
      get() = __655708402_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PageNumber(): Int {
      val fnPtr = _655708402_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__655708402_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IGetPreviewPageEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __655708402_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGetPreviewPageEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a68fbe17f577597fb3abb379447149e6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGetPreviewPageEventArgs(ptr: Pointer?): WithDefault =
        IGetPreviewPageEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGetPreviewPageEventArgs {
      val address = segment.toRawLongValue()
      return makeIGetPreviewPageEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IGetPreviewPageEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__655708402_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGetPreviewPageEventArgs):
        Array<IGetPreviewPageEventArgs?> = (elements as
        Array<IGetPreviewPageEventArgs?>).castToImpl<IGetPreviewPageEventArgs,IGetPreviewPageEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGetPreviewPageEventArgs?> =
        arrayOfNulls<IGetPreviewPageEventArgs_Impl>(size) as Array<IGetPreviewPageEventArgs?>
  }
}
