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

@ABIMarker(ICanvasFactory.ABI::class)
@Signature("{374c5050-3481-5557-9948-804c0b8eea89}")
@Guid("374c5050348155579948804c0b8eea89")
@WinRTInterface("374c5050348155579948804c0b8eea89")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICanvasFactory.ByReference::class)
public interface ICanvasFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): Canvas?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICanvasFactory>
      {
    public override fun getValue() = ABI.makeICanvasFactory(pointer.getPointer(0))

    public fun setValue(value: ICanvasFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICanvasFactory {
    public val __390606379_Ptr: Pointer?

    public val _390606379_VtblPtr: Pointer?
      get() = __390606379_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        Canvas? {
      val fnPtr = _390606379_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Canvas>()
      val hr = fn.invokeHR(arrayOf(__390606379_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Canvas>(result.getValue())
      return resultValue
    }
  }

  public class ICanvasFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __390606379_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICanvasFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("374c5050348155579948804c0b8eea89")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICanvasFactory(ptr: Pointer?): WithDefault = ICanvasFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICanvasFactory {
      val address = segment.toRawLongValue()
      return makeICanvasFactory(Pointer(address))
    }

    public override fun toNative(obj: ICanvasFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__390606379_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICanvasFactory): Array<ICanvasFactory?> = (elements as
        Array<ICanvasFactory?>).castToImpl<ICanvasFactory,ICanvasFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICanvasFactory?> =
        arrayOfNulls<ICanvasFactory_Impl>(size) as Array<ICanvasFactory?>
  }
}
