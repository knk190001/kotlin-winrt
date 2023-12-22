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

@ABIMarker(INonVirtualizingLayoutContextFactory.ABI::class)
@Signature("{dabac020-189c-5bbf-a4dc-97da1199f577}")
@Guid("dabac020189c5bbfa4dc97da1199f577")
@WinRTInterface("dabac020189c5bbfa4dc97da1199f577")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INonVirtualizingLayoutContextFactory.ByReference::class)
public interface INonVirtualizingLayoutContextFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      NonVirtualizingLayoutContext?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INonVirtualizingLayoutContextFactory> {
    public override fun getValue() =
        ABI.makeINonVirtualizingLayoutContextFactory(pointer.getPointer(0))

    public fun setValue(value: INonVirtualizingLayoutContextFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INonVirtualizingLayoutContextFactory {
    public val __959560689_Ptr: Pointer?

    public val _959560689_VtblPtr: Pointer?
      get() = __959560689_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        NonVirtualizingLayoutContext? {
      val fnPtr = _959560689_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NonVirtualizingLayoutContext>()
      val hr = fn.invokeHR(arrayOf(__959560689_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NonVirtualizingLayoutContext>(result.getValue())
      return resultValue
    }
  }

  public class INonVirtualizingLayoutContextFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __959560689_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INonVirtualizingLayoutContextFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dabac020189c5bbfa4dc97da1199f577")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINonVirtualizingLayoutContextFactory(ptr: Pointer?): WithDefault =
        INonVirtualizingLayoutContextFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INonVirtualizingLayoutContextFactory {
      val address = segment.toRawLongValue()
      return makeINonVirtualizingLayoutContextFactory(Pointer(address))
    }

    public override fun toNative(obj: INonVirtualizingLayoutContextFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__959560689_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INonVirtualizingLayoutContextFactory):
        Array<INonVirtualizingLayoutContextFactory?> = (elements as
        Array<INonVirtualizingLayoutContextFactory?>).castToImpl<INonVirtualizingLayoutContextFactory,INonVirtualizingLayoutContextFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INonVirtualizingLayoutContextFactory?> =
        arrayOfNulls<INonVirtualizingLayoutContextFactory_Impl>(size) as
        Array<INonVirtualizingLayoutContextFactory?>
  }
}
