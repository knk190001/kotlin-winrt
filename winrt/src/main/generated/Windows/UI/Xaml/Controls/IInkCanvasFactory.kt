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

@ABIMarker(IInkCanvasFactory.ABI::class)
@Signature("{924ac2de-ab04-48f0-9653-e0f2da4dbf1a}")
@Guid("924ac2deab0448f09653e0f2da4dbf1a")
@WinRTInterface("924ac2deab0448f09653e0f2da4dbf1a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkCanvasFactory.ByReference::class)
public interface IInkCanvasFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): InkCanvas?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkCanvasFactory> {
    public override fun getValue() = ABI.makeIInkCanvasFactory(pointer.getPointer(0))

    public fun setValue(value: IInkCanvasFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkCanvasFactory {
    public val __26993256_Ptr: Pointer?

    public val _26993256_VtblPtr: Pointer?
      get() = __26993256_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        InkCanvas? {
      val fnPtr = _26993256_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkCanvas>()
      val hr = fn.invokeHR(arrayOf(__26993256_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkCanvas>(result.getValue())
      return resultValue
    }
  }

  public class IInkCanvasFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __26993256_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkCanvasFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("924ac2deab0448f09653e0f2da4dbf1a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkCanvasFactory(ptr: Pointer?): WithDefault = IInkCanvasFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkCanvasFactory {
      val address = segment.toRawLongValue()
      return makeIInkCanvasFactory(Pointer(address))
    }

    public override fun toNative(obj: IInkCanvasFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__26993256_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkCanvasFactory): Array<IInkCanvasFactory?> = (elements
        as Array<IInkCanvasFactory?>).castToImpl<IInkCanvasFactory,IInkCanvasFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkCanvasFactory?> =
        arrayOfNulls<IInkCanvasFactory_Impl>(size) as Array<IInkCanvasFactory?>
  }
}
