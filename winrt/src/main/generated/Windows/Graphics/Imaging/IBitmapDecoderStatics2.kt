package Windows.Graphics.Imaging

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

@ABIMarker(IBitmapDecoderStatics2.ABI::class)
@Signature("{50ba68ea-99a1-40c4-80d9-aef0dafa6c3f}")
@Guid("50ba68ea99a140c480d9aef0dafa6c3f")
@WinRTInterface("50ba68ea99a140c480d9aef0dafa6c3f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBitmapDecoderStatics2.ByReference::class)
public interface IBitmapDecoderStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HeifDecoderId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_WebpDecoderId(): com.sun.jna.platform.win32.Guid.GUID?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBitmapDecoderStatics2> {
    public override fun getValue() = ABI.makeIBitmapDecoderStatics2(pointer.getPointer(0))

    public fun setValue(value: IBitmapDecoderStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBitmapDecoderStatics2 {
    public val __1396861593_Ptr: Pointer?

    public val _1396861593_VtblPtr: Pointer?
      get() = __1396861593_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HeifDecoderId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1396861593_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1396861593_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_WebpDecoderId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1396861593_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1396861593_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }
  }

  public class IBitmapDecoderStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1396861593_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBitmapDecoderStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("50ba68ea99a140c480d9aef0dafa6c3f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBitmapDecoderStatics2(ptr: Pointer?): WithDefault =
        IBitmapDecoderStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBitmapDecoderStatics2 {
      val address = segment.toRawLongValue()
      return makeIBitmapDecoderStatics2(Pointer(address))
    }

    public override fun toNative(obj: IBitmapDecoderStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1396861593_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBitmapDecoderStatics2): Array<IBitmapDecoderStatics2?> =
        (elements as
        Array<IBitmapDecoderStatics2?>).castToImpl<IBitmapDecoderStatics2,IBitmapDecoderStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBitmapDecoderStatics2?> =
        arrayOfNulls<IBitmapDecoderStatics2_Impl>(size) as Array<IBitmapDecoderStatics2?>
  }
}
