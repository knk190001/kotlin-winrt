package Microsoft.UI.Xaml.Media

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

@ABIMarker(IProjectionFactory.ABI::class)
@Signature("{870ea34f-db61-5b75-89ad-e0480c802937}")
@Guid("870ea34fdb615b7589ade0480c802937")
@WinRTInterface("870ea34fdb615b7589ade0480c802937")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProjectionFactory.ByReference::class)
public interface IProjectionFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): Projection?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProjectionFactory> {
    public override fun getValue() = ABI.makeIProjectionFactory(pointer.getPointer(0))

    public fun setValue(value: IProjectionFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProjectionFactory {
    public val __1764616106_Ptr: Pointer?

    public val _1764616106_VtblPtr: Pointer?
      get() = __1764616106_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        Projection? {
      val fnPtr = _1764616106_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Projection>()
      val hr = fn.invokeHR(arrayOf(__1764616106_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Projection>(result.getValue())
      return resultValue
    }
  }

  public class IProjectionFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1764616106_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProjectionFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("870ea34fdb615b7589ade0480c802937")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProjectionFactory(ptr: Pointer?): WithDefault = IProjectionFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProjectionFactory {
      val address = segment.toRawLongValue()
      return makeIProjectionFactory(Pointer(address))
    }

    public override fun toNative(obj: IProjectionFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1764616106_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProjectionFactory): Array<IProjectionFactory?> =
        (elements as
        Array<IProjectionFactory?>).castToImpl<IProjectionFactory,IProjectionFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProjectionFactory?> =
        arrayOfNulls<IProjectionFactory_Impl>(size) as Array<IProjectionFactory?>
  }
}
