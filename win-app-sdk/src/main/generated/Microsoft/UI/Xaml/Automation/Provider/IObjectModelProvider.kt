package Microsoft.UI.Xaml.Automation.Provider

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

@ABIMarker(IObjectModelProvider.ABI::class)
@Signature("{92953ed0-4bd8-5624-8e3d-78d45fde9cf2}")
@Guid("92953ed04bd856248e3d78d45fde9cf2")
@WinRTInterface("92953ed04bd856248e3d78d45fde9cf2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IObjectModelProvider.ByReference::class)
public interface IObjectModelProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetUnderlyingObjectModel(): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IObjectModelProvider> {
    public override fun getValue() = ABI.makeIObjectModelProvider(pointer.getPointer(0))

    public fun setValue(value: IObjectModelProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IObjectModelProvider {
    public val __641528946_Ptr: Pointer?

    public val _641528946_VtblPtr: Pointer?
      get() = __641528946_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetUnderlyingObjectModel(): IUnknown? {
      val fnPtr = _641528946_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__641528946_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IObjectModelProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __641528946_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IObjectModelProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("92953ed04bd856248e3d78d45fde9cf2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIObjectModelProvider(ptr: Pointer?): WithDefault = IObjectModelProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IObjectModelProvider {
      val address = segment.toRawLongValue()
      return makeIObjectModelProvider(Pointer(address))
    }

    public override fun toNative(obj: IObjectModelProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__641528946_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IObjectModelProvider): Array<IObjectModelProvider?> =
        (elements as
        Array<IObjectModelProvider?>).castToImpl<IObjectModelProvider,IObjectModelProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IObjectModelProvider?> =
        arrayOfNulls<IObjectModelProvider_Impl>(size) as Array<IObjectModelProvider?>
  }
}
