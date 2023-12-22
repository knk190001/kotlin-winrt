package Windows.UI.Xaml.Media.Imaging

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

@ABIMarker(IBitmapSourceFactory.ABI::class)
@Signature("{e240420e-d4a7-49a4-a0b4-a59fdd77e508}")
@Guid("e240420ed4a749a4a0b4a59fdd77e508")
@WinRTInterface("e240420ed4a749a4a0b4a59fdd77e508")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBitmapSourceFactory.ByReference::class)
public interface IBitmapSourceFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): BitmapSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBitmapSourceFactory> {
    public override fun getValue() = ABI.makeIBitmapSourceFactory(pointer.getPointer(0))

    public fun setValue(value: IBitmapSourceFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBitmapSourceFactory {
    public val __688623282_Ptr: Pointer?

    public val _688623282_VtblPtr: Pointer?
      get() = __688623282_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        BitmapSource? {
      val fnPtr = _688623282_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapSource>()
      val hr = fn.invokeHR(arrayOf(__688623282_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapSource>(result.getValue())
      return resultValue
    }
  }

  public class IBitmapSourceFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __688623282_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBitmapSourceFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e240420ed4a749a4a0b4a59fdd77e508")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBitmapSourceFactory(ptr: Pointer?): WithDefault = IBitmapSourceFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBitmapSourceFactory {
      val address = segment.toRawLongValue()
      return makeIBitmapSourceFactory(Pointer(address))
    }

    public override fun toNative(obj: IBitmapSourceFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__688623282_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBitmapSourceFactory): Array<IBitmapSourceFactory?> =
        (elements as
        Array<IBitmapSourceFactory?>).castToImpl<IBitmapSourceFactory,IBitmapSourceFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBitmapSourceFactory?> =
        arrayOfNulls<IBitmapSourceFactory_Impl>(size) as Array<IBitmapSourceFactory?>
  }
}
