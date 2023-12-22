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

@ABIMarker(IAppBarOverrides.ABI::class)
@Signature("{67f17798-e281-5e53-8edf-42c29c354d63}")
@Guid("67f17798e2815e538edf42c29c354d63")
@WinRTInterface("67f17798e2815e538edf42c29c354d63")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBarOverrides.ByReference::class)
public interface IAppBarOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OnClosed(e: IUnknown?): Unit

  @InterfaceMethod(1)
  public fun OnOpened(e: IUnknown?): Unit

  @InterfaceMethod(2)
  public fun OnClosing(e: IUnknown?): Unit

  @InterfaceMethod(3)
  public fun OnOpening(e: IUnknown?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBarOverrides> {
    public override fun getValue() = ABI.makeIAppBarOverrides(pointer.getPointer(0))

    public fun setValue(value: IAppBarOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBarOverrides {
    public val __1766692718_Ptr: Pointer?

    public val _1766692718_VtblPtr: Pointer?
      get() = __1766692718_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OnClosed(e: IUnknown?): Unit {
      val fnPtr = _1766692718_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1766692718_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun OnOpened(e: IUnknown?): Unit {
      val fnPtr = _1766692718_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1766692718_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun OnClosing(e: IUnknown?): Unit {
      val fnPtr = _1766692718_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1766692718_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun OnOpening(e: IUnknown?): Unit {
      val fnPtr = _1766692718_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1766692718_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppBarOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1766692718_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBarOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("67f17798e2815e538edf42c29c354d63")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBarOverrides(ptr: Pointer?): WithDefault = IAppBarOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBarOverrides {
      val address = segment.toRawLongValue()
      return makeIAppBarOverrides(Pointer(address))
    }

    public override fun toNative(obj: IAppBarOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1766692718_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBarOverrides): Array<IAppBarOverrides?> = (elements as
        Array<IAppBarOverrides?>).castToImpl<IAppBarOverrides,IAppBarOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBarOverrides?> =
        arrayOfNulls<IAppBarOverrides_Impl>(size) as Array<IAppBarOverrides?>
  }
}
