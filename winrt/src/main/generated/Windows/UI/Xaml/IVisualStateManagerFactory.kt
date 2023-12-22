package Windows.UI.Xaml

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

@ABIMarker(IVisualStateManagerFactory.ABI::class)
@Signature("{85e598fd-a575-47b6-9e30-383cd08585f2}")
@Guid("85e598fda57547b69e30383cd08585f2")
@WinRTInterface("85e598fda57547b69e30383cd08585f2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVisualStateManagerFactory.ByReference::class)
public interface IVisualStateManagerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      VisualStateManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVisualStateManagerFactory> {
    public override fun getValue() = ABI.makeIVisualStateManagerFactory(pointer.getPointer(0))

    public fun setValue(value: IVisualStateManagerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVisualStateManagerFactory {
    public val __1775304220_Ptr: Pointer?

    public val _1775304220_VtblPtr: Pointer?
      get() = __1775304220_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        VisualStateManager? {
      val fnPtr = _1775304220_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VisualStateManager>()
      val hr = fn.invokeHR(arrayOf(__1775304220_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VisualStateManager>(result.getValue())
      return resultValue
    }
  }

  public class IVisualStateManagerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1775304220_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVisualStateManagerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("85e598fda57547b69e30383cd08585f2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVisualStateManagerFactory(ptr: Pointer?): WithDefault =
        IVisualStateManagerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVisualStateManagerFactory {
      val address = segment.toRawLongValue()
      return makeIVisualStateManagerFactory(Pointer(address))
    }

    public override fun toNative(obj: IVisualStateManagerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1775304220_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVisualStateManagerFactory):
        Array<IVisualStateManagerFactory?> = (elements as
        Array<IVisualStateManagerFactory?>).castToImpl<IVisualStateManagerFactory,IVisualStateManagerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVisualStateManagerFactory?> =
        arrayOfNulls<IVisualStateManagerFactory_Impl>(size) as Array<IVisualStateManagerFactory?>
  }
}
