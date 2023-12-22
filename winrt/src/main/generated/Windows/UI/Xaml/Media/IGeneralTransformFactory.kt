package Windows.UI.Xaml.Media

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

@ABIMarker(IGeneralTransformFactory.ABI::class)
@Signature("{7a25c930-29c4-4e31-b6f9-dedd52e4df1b}")
@Guid("7a25c93029c44e31b6f9dedd52e4df1b")
@WinRTInterface("7a25c93029c44e31b6f9dedd52e4df1b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeneralTransformFactory.ByReference::class)
public interface IGeneralTransformFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): GeneralTransform?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGeneralTransformFactory> {
    public override fun getValue() = ABI.makeIGeneralTransformFactory(pointer.getPointer(0))

    public fun setValue(value: IGeneralTransformFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeneralTransformFactory {
    public val __824499082_Ptr: Pointer?

    public val _824499082_VtblPtr: Pointer?
      get() = __824499082_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        GeneralTransform? {
      val fnPtr = _824499082_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GeneralTransform>()
      val hr = fn.invokeHR(arrayOf(__824499082_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GeneralTransform>(result.getValue())
      return resultValue
    }
  }

  public class IGeneralTransformFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __824499082_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeneralTransformFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7a25c93029c44e31b6f9dedd52e4df1b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeneralTransformFactory(ptr: Pointer?): WithDefault =
        IGeneralTransformFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeneralTransformFactory {
      val address = segment.toRawLongValue()
      return makeIGeneralTransformFactory(Pointer(address))
    }

    public override fun toNative(obj: IGeneralTransformFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__824499082_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeneralTransformFactory):
        Array<IGeneralTransformFactory?> = (elements as
        Array<IGeneralTransformFactory?>).castToImpl<IGeneralTransformFactory,IGeneralTransformFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeneralTransformFactory?> =
        arrayOfNulls<IGeneralTransformFactory_Impl>(size) as Array<IGeneralTransformFactory?>
  }
}
