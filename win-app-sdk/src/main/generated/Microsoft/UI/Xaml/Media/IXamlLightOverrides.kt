package Microsoft.UI.Xaml.Media

import Microsoft.UI.Xaml.UIElement
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IXamlLightOverrides.ABI::class)
@Signature("{696d4f30-92ee-540d-ad70-33d4489514d0}")
@Guid("696d4f3092ee540dad7033d4489514d0")
@WinRTInterface("696d4f3092ee540dad7033d4489514d0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlLightOverrides.ByReference::class)
public interface IXamlLightOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetId(): String?

  @InterfaceMethod(1)
  public fun OnConnected(newElement: UIElement?): Unit

  @InterfaceMethod(2)
  public fun OnDisconnected(oldElement: UIElement?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlLightOverrides> {
    public override fun getValue() = ABI.makeIXamlLightOverrides(pointer.getPointer(0))

    public fun setValue(value: IXamlLightOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlLightOverrides {
    public val __1046053898_Ptr: Pointer?

    public val _1046053898_VtblPtr: Pointer?
      get() = __1046053898_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetId(): String? {
      val fnPtr = _1046053898_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1046053898_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun OnConnected(newElement: UIElement?): Unit {
      val fnPtr = _1046053898_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1046053898_Ptr, marshalToNative(newElement),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun OnDisconnected(oldElement: UIElement?): Unit {
      val fnPtr = _1046053898_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1046053898_Ptr, marshalToNative(oldElement),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IXamlLightOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1046053898_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlLightOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("696d4f3092ee540dad7033d4489514d0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlLightOverrides(ptr: Pointer?): WithDefault = IXamlLightOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlLightOverrides {
      val address = segment.toRawLongValue()
      return makeIXamlLightOverrides(Pointer(address))
    }

    public override fun toNative(obj: IXamlLightOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1046053898_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlLightOverrides): Array<IXamlLightOverrides?> =
        (elements as
        Array<IXamlLightOverrides?>).castToImpl<IXamlLightOverrides,IXamlLightOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlLightOverrides?> =
        arrayOfNulls<IXamlLightOverrides_Impl>(size) as Array<IXamlLightOverrides?>
  }
}
