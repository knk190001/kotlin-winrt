package Windows.UI.Input

import Windows.Foundation.Collections.IIterable
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

@ABIMarker(IRadialControllerConfiguration.ABI::class)
@Signature("{a6b79ecb-6a52-4430-910c-56370a9d6b42}")
@Guid("a6b79ecb6a524430910c56370a9d6b42")
@WinRTInterface("a6b79ecb6a524430910c56370a9d6b42")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadialControllerConfiguration.ByReference::class)
public interface IRadialControllerConfiguration : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetDefaultMenuItems(buttons: IIterable<RadialControllerSystemMenuItemKind?>?): Unit

  @InterfaceMethod(1)
  public fun ResetToDefaultMenuItems(): Unit

  @InterfaceMethod(2)
  public fun TrySelectDefaultMenuItem(type: RadialControllerSystemMenuItemKind?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRadialControllerConfiguration> {
    public override fun getValue() = ABI.makeIRadialControllerConfiguration(pointer.getPointer(0))

    public fun setValue(value: IRadialControllerConfiguration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadialControllerConfiguration {
    public val __956594291_Ptr: Pointer?

    public val _956594291_VtblPtr: Pointer?
      get() = __956594291_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun SetDefaultMenuItems(buttons: IIterable<RadialControllerSystemMenuItemKind?>?): Unit {
      val fnPtr = _956594291_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__956594291_Ptr, marshalToNative(buttons),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun ResetToDefaultMenuItems(): Unit {
      val fnPtr = _956594291_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__956594291_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun TrySelectDefaultMenuItem(type: RadialControllerSystemMenuItemKind?):
        Boolean {
      val fnPtr = _956594291_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__956594291_Ptr, marshalToNative(type), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IRadialControllerConfiguration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __956594291_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadialControllerConfiguration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a6b79ecb6a524430910c56370a9d6b42")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadialControllerConfiguration(ptr: Pointer?): WithDefault =
        IRadialControllerConfiguration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRadialControllerConfiguration {
      val address = segment.toRawLongValue()
      return makeIRadialControllerConfiguration(Pointer(address))
    }

    public override fun toNative(obj: IRadialControllerConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__956594291_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadialControllerConfiguration):
        Array<IRadialControllerConfiguration?> = (elements as
        Array<IRadialControllerConfiguration?>).castToImpl<IRadialControllerConfiguration,IRadialControllerConfiguration_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadialControllerConfiguration?> =
        arrayOfNulls<IRadialControllerConfiguration_Impl>(size) as
        Array<IRadialControllerConfiguration?>
  }
}
