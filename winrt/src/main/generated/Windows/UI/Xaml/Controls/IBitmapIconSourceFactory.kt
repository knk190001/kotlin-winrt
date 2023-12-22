package Windows.UI.Xaml.Controls

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

@ABIMarker(IBitmapIconSourceFactory.ABI::class)
@Signature("{6509e5c6-44b6-4cd1-86cd-c3189b12c43c}")
@Guid("6509e5c644b64cd186cdc3189b12c43c")
@WinRTInterface("6509e5c644b64cd186cdc3189b12c43c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBitmapIconSourceFactory.ByReference::class)
public interface IBitmapIconSourceFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): BitmapIconSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBitmapIconSourceFactory> {
    public override fun getValue() = ABI.makeIBitmapIconSourceFactory(pointer.getPointer(0))

    public fun setValue(value: IBitmapIconSourceFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBitmapIconSourceFactory {
    public val __366242965_Ptr: Pointer?

    public val _366242965_VtblPtr: Pointer?
      get() = __366242965_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        BitmapIconSource? {
      val fnPtr = _366242965_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapIconSource>()
      val hr = fn.invokeHR(arrayOf(__366242965_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapIconSource>(result.getValue())
      return resultValue
    }
  }

  public class IBitmapIconSourceFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __366242965_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBitmapIconSourceFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6509e5c644b64cd186cdc3189b12c43c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBitmapIconSourceFactory(ptr: Pointer?): WithDefault =
        IBitmapIconSourceFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBitmapIconSourceFactory {
      val address = segment.toRawLongValue()
      return makeIBitmapIconSourceFactory(Pointer(address))
    }

    public override fun toNative(obj: IBitmapIconSourceFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__366242965_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBitmapIconSourceFactory):
        Array<IBitmapIconSourceFactory?> = (elements as
        Array<IBitmapIconSourceFactory?>).castToImpl<IBitmapIconSourceFactory,IBitmapIconSourceFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBitmapIconSourceFactory?> =
        arrayOfNulls<IBitmapIconSourceFactory_Impl>(size) as Array<IBitmapIconSourceFactory?>
  }
}
