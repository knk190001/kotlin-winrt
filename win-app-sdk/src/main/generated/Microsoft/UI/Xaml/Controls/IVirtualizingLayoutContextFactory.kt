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

@ABIMarker(IVirtualizingLayoutContextFactory.ABI::class)
@Signature("{3f790b67-fdfb-505a-8b85-6210506df311}")
@Guid("3f790b67fdfb505a8b856210506df311")
@WinRTInterface("3f790b67fdfb505a8b856210506df311")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVirtualizingLayoutContextFactory.ByReference::class)
public interface IVirtualizingLayoutContextFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      VirtualizingLayoutContext?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVirtualizingLayoutContextFactory> {
    public override fun getValue() =
        ABI.makeIVirtualizingLayoutContextFactory(pointer.getPointer(0))

    public fun setValue(value: IVirtualizingLayoutContextFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVirtualizingLayoutContextFactory {
    public val __562269682_Ptr: Pointer?

    public val _562269682_VtblPtr: Pointer?
      get() = __562269682_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        VirtualizingLayoutContext? {
      val fnPtr = _562269682_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualizingLayoutContext>()
      val hr = fn.invokeHR(arrayOf(__562269682_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualizingLayoutContext>(result.getValue())
      return resultValue
    }
  }

  public class IVirtualizingLayoutContextFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __562269682_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVirtualizingLayoutContextFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3f790b67fdfb505a8b856210506df311")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVirtualizingLayoutContextFactory(ptr: Pointer?): WithDefault =
        IVirtualizingLayoutContextFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVirtualizingLayoutContextFactory {
      val address = segment.toRawLongValue()
      return makeIVirtualizingLayoutContextFactory(Pointer(address))
    }

    public override fun toNative(obj: IVirtualizingLayoutContextFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__562269682_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVirtualizingLayoutContextFactory):
        Array<IVirtualizingLayoutContextFactory?> = (elements as
        Array<IVirtualizingLayoutContextFactory?>).castToImpl<IVirtualizingLayoutContextFactory,IVirtualizingLayoutContextFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVirtualizingLayoutContextFactory?> =
        arrayOfNulls<IVirtualizingLayoutContextFactory_Impl>(size) as
        Array<IVirtualizingLayoutContextFactory?>
  }
}
