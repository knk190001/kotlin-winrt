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

@ABIMarker(IDataTemplateFactory.ABI::class)
@Signature("{51ed9d7e-2b53-475b-9c88-0c1832c8351a}")
@Guid("51ed9d7e2b53475b9c880c1832c8351a")
@WinRTInterface("51ed9d7e2b53475b9c880c1832c8351a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataTemplateFactory.ByReference::class)
public interface IDataTemplateFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): DataTemplate?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataTemplateFactory> {
    public override fun getValue() = ABI.makeIDataTemplateFactory(pointer.getPointer(0))

    public fun setValue(value: IDataTemplateFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataTemplateFactory {
    public val __2055650668_Ptr: Pointer?

    public val _2055650668_VtblPtr: Pointer?
      get() = __2055650668_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        DataTemplate? {
      val fnPtr = _2055650668_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__2055650668_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }
  }

  public class IDataTemplateFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2055650668_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataTemplateFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("51ed9d7e2b53475b9c880c1832c8351a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataTemplateFactory(ptr: Pointer?): WithDefault = IDataTemplateFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataTemplateFactory {
      val address = segment.toRawLongValue()
      return makeIDataTemplateFactory(Pointer(address))
    }

    public override fun toNative(obj: IDataTemplateFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2055650668_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataTemplateFactory): Array<IDataTemplateFactory?> =
        (elements as
        Array<IDataTemplateFactory?>).castToImpl<IDataTemplateFactory,IDataTemplateFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataTemplateFactory?> =
        arrayOfNulls<IDataTemplateFactory_Impl>(size) as Array<IDataTemplateFactory?>
  }
}
