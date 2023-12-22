package Windows.UI.Xaml.Controls

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IContentDialog3.ABI::class)
@Signature("{9d9a089e-f954-4ede-b07f-6b069a9c0180}")
@Guid("9d9a089ef9544edeb07f6b069a9c0180")
@WinRTInterface("9d9a089ef9544edeb07f6b069a9c0180")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentDialog3.ByReference::class)
public interface IContentDialog3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ShowAsync(placement: ContentDialogPlacement?): IAsyncOperation<ContentDialogResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentDialog3> {
    public override fun getValue() = ABI.makeIContentDialog3(pointer.getPointer(0))

    public fun setValue(value: IContentDialog3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentDialog3 {
    public val __587186254_Ptr: Pointer?

    public val _587186254_VtblPtr: Pointer?
      get() = __587186254_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ShowAsync(placement: ContentDialogPlacement?):
        IAsyncOperation<ContentDialogResult?>? {
      val fnPtr = _587186254_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ContentDialogResult?>>()
      val hr = fn.invokeHR(arrayOf(__587186254_Ptr, marshalToNative(placement), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ContentDialogResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IContentDialog3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __587186254_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentDialog3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9d9a089ef9544edeb07f6b069a9c0180")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentDialog3(ptr: Pointer?): WithDefault = IContentDialog3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentDialog3 {
      val address = segment.toRawLongValue()
      return makeIContentDialog3(Pointer(address))
    }

    public override fun toNative(obj: IContentDialog3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__587186254_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentDialog3): Array<IContentDialog3?> = (elements as
        Array<IContentDialog3?>).castToImpl<IContentDialog3,IContentDialog3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentDialog3?> =
        arrayOfNulls<IContentDialog3_Impl>(size) as Array<IContentDialog3?>
  }
}
