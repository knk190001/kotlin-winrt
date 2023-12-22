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

@ABIMarker(IUniformGridLayoutFactory.ABI::class)
@Signature("{0d9ed808-f3f9-5034-9627-152b91e91b4b}")
@Guid("0d9ed808f3f950349627152b91e91b4b")
@WinRTInterface("0d9ed808f3f950349627152b91e91b4b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUniformGridLayoutFactory.ByReference::class)
public interface IUniformGridLayoutFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): UniformGridLayout?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUniformGridLayoutFactory> {
    public override fun getValue() = ABI.makeIUniformGridLayoutFactory(pointer.getPointer(0))

    public fun setValue(value: IUniformGridLayoutFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUniformGridLayoutFactory {
    public val __1128096179_Ptr: Pointer?

    public val _1128096179_VtblPtr: Pointer?
      get() = __1128096179_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        UniformGridLayout? {
      val fnPtr = _1128096179_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UniformGridLayout>()
      val hr = fn.invokeHR(arrayOf(__1128096179_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UniformGridLayout>(result.getValue())
      return resultValue
    }
  }

  public class IUniformGridLayoutFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1128096179_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUniformGridLayoutFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0d9ed808f3f950349627152b91e91b4b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUniformGridLayoutFactory(ptr: Pointer?): WithDefault =
        IUniformGridLayoutFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUniformGridLayoutFactory {
      val address = segment.toRawLongValue()
      return makeIUniformGridLayoutFactory(Pointer(address))
    }

    public override fun toNative(obj: IUniformGridLayoutFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1128096179_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUniformGridLayoutFactory):
        Array<IUniformGridLayoutFactory?> = (elements as
        Array<IUniformGridLayoutFactory?>).castToImpl<IUniformGridLayoutFactory,IUniformGridLayoutFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUniformGridLayoutFactory?> =
        arrayOfNulls<IUniformGridLayoutFactory_Impl>(size) as Array<IUniformGridLayoutFactory?>
  }
}
