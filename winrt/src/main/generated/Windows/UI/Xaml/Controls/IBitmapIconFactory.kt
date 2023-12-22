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

@ABIMarker(IBitmapIconFactory.ABI::class)
@Signature("{46d64b1d-7a49-4f66-9729-2848c788e402}")
@Guid("46d64b1d7a494f6697292848c788e402")
@WinRTInterface("46d64b1d7a494f6697292848c788e402")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBitmapIconFactory.ByReference::class)
public interface IBitmapIconFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): BitmapIcon?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBitmapIconFactory> {
    public override fun getValue() = ABI.makeIBitmapIconFactory(pointer.getPointer(0))

    public fun setValue(value: IBitmapIconFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBitmapIconFactory {
    public val __373517050_Ptr: Pointer?

    public val _373517050_VtblPtr: Pointer?
      get() = __373517050_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        BitmapIcon? {
      val fnPtr = _373517050_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapIcon>()
      val hr = fn.invokeHR(arrayOf(__373517050_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapIcon>(result.getValue())
      return resultValue
    }
  }

  public class IBitmapIconFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __373517050_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBitmapIconFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("46d64b1d7a494f6697292848c788e402")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBitmapIconFactory(ptr: Pointer?): WithDefault = IBitmapIconFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBitmapIconFactory {
      val address = segment.toRawLongValue()
      return makeIBitmapIconFactory(Pointer(address))
    }

    public override fun toNative(obj: IBitmapIconFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__373517050_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBitmapIconFactory): Array<IBitmapIconFactory?> =
        (elements as
        Array<IBitmapIconFactory?>).castToImpl<IBitmapIconFactory,IBitmapIconFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBitmapIconFactory?> =
        arrayOfNulls<IBitmapIconFactory_Impl>(size) as Array<IBitmapIconFactory?>
  }
}
