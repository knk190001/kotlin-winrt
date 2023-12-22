package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IFontIconSourceFactory.ABI::class)
@Signature("{bb40eeee-64d1-5133-b1d6-ae13c21b6678}")
@Guid("bb40eeee64d15133b1d6ae13c21b6678")
@WinRTInterface("bb40eeee64d15133b1d6ae13c21b6678")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFontIconSourceFactory.ByReference::class)
public interface IFontIconSourceFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): FontIconSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFontIconSourceFactory> {
    public override fun getValue() = ABI.makeIFontIconSourceFactory(pointer.getPointer(0))

    public fun setValue(value: IFontIconSourceFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFontIconSourceFactory {
    public val __865944448_Ptr: Pointer?

    public val _865944448_VtblPtr: Pointer?
      get() = __865944448_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        FontIconSource? {
      val fnPtr = _865944448_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontIconSource>()
      val hr = fn.invokeHR(arrayOf(__865944448_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontIconSource>(result.getValue())
      return resultValue
    }
  }

  public class IFontIconSourceFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __865944448_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFontIconSourceFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bb40eeee64d15133b1d6ae13c21b6678")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFontIconSourceFactory(ptr: Pointer?): WithDefault =
        IFontIconSourceFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFontIconSourceFactory {
      val address = segment.toRawLongValue()
      return makeIFontIconSourceFactory(Pointer(address))
    }

    public override fun toNative(obj: IFontIconSourceFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__865944448_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFontIconSourceFactory): Array<IFontIconSourceFactory?> =
        (elements as
        Array<IFontIconSourceFactory?>).castToImpl<IFontIconSourceFactory,IFontIconSourceFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFontIconSourceFactory?> =
        arrayOfNulls<IFontIconSourceFactory_Impl>(size) as Array<IFontIconSourceFactory?>
  }
}
