package Microsoft.UI.Xaml.Controls

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IXamlControlsResources.ABI::class)
@Signature("{918ca043-f42c-5805-861b-62d6d1d0c162}")
@Guid("918ca043f42c5805861b62d6d1d0c162")
@WinRTInterface("918ca043f42c5805861b62d6d1d0c162")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlControlsResources.ByReference::class)
public interface IXamlControlsResources : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UseCompactResources(): Boolean

  @InterfaceMethod(1)
  public fun put_UseCompactResources(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlControlsResources> {
    public override fun getValue() = ABI.makeIXamlControlsResources(pointer.getPointer(0))

    public fun setValue(value: IXamlControlsResources_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlControlsResources {
    public val __651314368_Ptr: Pointer?

    public val _651314368_VtblPtr: Pointer?
      get() = __651314368_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UseCompactResources(): Boolean {
      val fnPtr = _651314368_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__651314368_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_UseCompactResources(value: Boolean): Unit {
      val fnPtr = _651314368_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__651314368_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IXamlControlsResources_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __651314368_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlControlsResources, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("918ca043f42c5805861b62d6d1d0c162")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlControlsResources(ptr: Pointer?): WithDefault =
        IXamlControlsResources_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlControlsResources {
      val address = segment.toRawLongValue()
      return makeIXamlControlsResources(Pointer(address))
    }

    public override fun toNative(obj: IXamlControlsResources): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__651314368_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlControlsResources): Array<IXamlControlsResources?> =
        (elements as
        Array<IXamlControlsResources?>).castToImpl<IXamlControlsResources,IXamlControlsResources_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlControlsResources?> =
        arrayOfNulls<IXamlControlsResources_Impl>(size) as Array<IXamlControlsResources?>
  }
}
