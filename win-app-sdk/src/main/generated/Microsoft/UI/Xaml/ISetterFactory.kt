package Microsoft.UI.Xaml

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
@Signature("{13910a06-a327-5407-ae91-b9d2cc3a7ab5}")
@Guid("13910a06a3275407ae91b9d2cc3a7ab5")
@WinRTInterface("13910a06a3275407ae91b9d2cc3a7ab5")
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
    public val __327626404_Ptr: Pointer?

    public val _327626404_VtblPtr: Pointer?
      get() = __327626404_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(targetProperty: DependencyProperty?, value: IUnknown?):
        Setter? {
      val fnPtr = _327626404_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Setter>()
      val hr = fn.invokeHR(arrayOf(__327626404_Ptr, marshalToNative(targetProperty),
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
    public override val __327626404_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISetterFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("13910a06a3275407ae91b9d2cc3a7ab5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISetterFactory(ptr: Pointer?): WithDefault = ISetterFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISetterFactory {
      val address = segment.toRawLongValue()
      return makeISetterFactory(Pointer(address))
    }

    public override fun toNative(obj: ISetterFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__327626404_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISetterFactory): Array<ISetterFactory?> = (elements as
        Array<ISetterFactory?>).castToImpl<ISetterFactory,ISetterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISetterFactory?> =
        arrayOfNulls<ISetterFactory_Impl>(size) as Array<ISetterFactory?>
  }
}
