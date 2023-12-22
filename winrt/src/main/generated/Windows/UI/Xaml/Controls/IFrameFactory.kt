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

@ABIMarker(IFrameFactory.ABI::class)
@Signature("{02ee93d4-448e-469e-9799-0a8a1f70f171}")
@Guid("02ee93d4448e469e97990a8a1f70f171")
@WinRTInterface("02ee93d4448e469e97990a8a1f70f171")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameFactory.ByReference::class)
public interface IFrameFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): Frame?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IFrameFactory>
      {
    public override fun getValue() = ABI.makeIFrameFactory(pointer.getPointer(0))

    public fun setValue(value: IFrameFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameFactory {
    public val __2126130425_Ptr: Pointer?

    public val _2126130425_VtblPtr: Pointer?
      get() = __2126130425_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        Frame? {
      val fnPtr = _2126130425_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Frame>()
      val hr = fn.invokeHR(arrayOf(__2126130425_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Frame>(result.getValue())
      return resultValue
    }
  }

  public class IFrameFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2126130425_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("02ee93d4448e469e97990a8a1f70f171")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameFactory(ptr: Pointer?): WithDefault = IFrameFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameFactory {
      val address = segment.toRawLongValue()
      return makeIFrameFactory(Pointer(address))
    }

    public override fun toNative(obj: IFrameFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2126130425_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameFactory): Array<IFrameFactory?> = (elements as
        Array<IFrameFactory?>).castToImpl<IFrameFactory,IFrameFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameFactory?> =
        arrayOfNulls<IFrameFactory_Impl>(size) as Array<IFrameFactory?>
  }
}
