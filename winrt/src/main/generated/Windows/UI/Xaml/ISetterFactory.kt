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

@ABIMarker(ISetterFactory.ABI::class)
@Signature("{d3ca3d42-09b1-49d5-8891-e7b5648e02a2}")
@Guid("d3ca3d4209b149d58891e7b5648e02a2")
@WinRTInterface("d3ca3d4209b149d58891e7b5648e02a2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISetterFactory.ByReference::class)
public interface ISetterFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(targetProperty: DependencyProperty?, value: IUnknown?): Setter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISetterFactory>
      {
    public override fun getValue() = ABI.makeISetterFactory(pointer.getPointer(0))

    public fun setValue(value: ISetterFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISetterFactory {
    public val __947161721_Ptr: Pointer?

    public val _947161721_VtblPtr: Pointer?
      get() = __947161721_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(targetProperty: DependencyProperty?, value: IUnknown?):
        Setter? {
      val fnPtr = _947161721_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Setter>()
      val hr = fn.invokeHR(arrayOf(__947161721_Ptr, marshalToNative(targetProperty),
          marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Setter>(result.getValue())
      return resultValue
    }
  }

  public class ISetterFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __947161721_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISetterFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d3ca3d4209b149d58891e7b5648e02a2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISetterFactory(ptr: Pointer?): WithDefault = ISetterFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISetterFactory {
      val address = segment.toRawLongValue()
      return makeISetterFactory(Pointer(address))
    }

    public override fun toNative(obj: ISetterFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__947161721_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISetterFactory): Array<ISetterFactory?> = (elements as
        Array<ISetterFactory?>).castToImpl<ISetterFactory,ISetterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISetterFactory?> =
        arrayOfNulls<ISetterFactory_Impl>(size) as Array<ISetterFactory?>
  }
}
