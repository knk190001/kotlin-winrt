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

@ABIMarker(IVirtualizingLayoutFactory.ABI::class)
@Signature("{c7c128e1-5df7-5345-b5cd-43afdfa948b4}")
@Guid("c7c128e15df75345b5cd43afdfa948b4")
@WinRTInterface("c7c128e15df75345b5cd43afdfa948b4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVirtualizingLayoutFactory.ByReference::class)
public interface IVirtualizingLayoutFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      VirtualizingLayout?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVirtualizingLayoutFactory> {
    public override fun getValue() = ABI.makeIVirtualizingLayoutFactory(pointer.getPointer(0))

    public fun setValue(value: IVirtualizingLayoutFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVirtualizingLayoutFactory {
    public val __259764397_Ptr: Pointer?

    public val _259764397_VtblPtr: Pointer?
      get() = __259764397_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        VirtualizingLayout? {
      val fnPtr = _259764397_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualizingLayout>()
      val hr = fn.invokeHR(arrayOf(__259764397_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualizingLayout>(result.getValue())
      return resultValue
    }
  }

  public class IVirtualizingLayoutFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __259764397_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVirtualizingLayoutFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c7c128e15df75345b5cd43afdfa948b4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVirtualizingLayoutFactory(ptr: Pointer?): WithDefault =
        IVirtualizingLayoutFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVirtualizingLayoutFactory {
      val address = segment.toRawLongValue()
      return makeIVirtualizingLayoutFactory(Pointer(address))
    }

    public override fun toNative(obj: IVirtualizingLayoutFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__259764397_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVirtualizingLayoutFactory):
        Array<IVirtualizingLayoutFactory?> = (elements as
        Array<IVirtualizingLayoutFactory?>).castToImpl<IVirtualizingLayoutFactory,IVirtualizingLayoutFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVirtualizingLayoutFactory?> =
        arrayOfNulls<IVirtualizingLayoutFactory_Impl>(size) as Array<IVirtualizingLayoutFactory?>
  }
}
