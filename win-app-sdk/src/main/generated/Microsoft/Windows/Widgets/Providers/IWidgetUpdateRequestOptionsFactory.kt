package Microsoft.Windows.Widgets.Providers

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

@ABIMarker(IWidgetUpdateRequestOptionsFactory.ABI::class)
@Signature("{e0e00af8-1d10-57a8-9419-3f568e854daa}")
@Guid("e0e00af81d1057a894193f568e854daa")
@WinRTInterface("e0e00af81d1057a894193f568e854daa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWidgetUpdateRequestOptionsFactory.ByReference::class)
public interface IWidgetUpdateRequestOptionsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(widgetId: String?): WidgetUpdateRequestOptions?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWidgetUpdateRequestOptionsFactory> {
    public override fun getValue() =
        ABI.makeIWidgetUpdateRequestOptionsFactory(pointer.getPointer(0))

    public fun setValue(value: IWidgetUpdateRequestOptionsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWidgetUpdateRequestOptionsFactory {
    public val __1542917501_Ptr: Pointer?

    public val _1542917501_VtblPtr: Pointer?
      get() = __1542917501_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(widgetId: String?): WidgetUpdateRequestOptions? {
      val fnPtr = _1542917501_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WidgetUpdateRequestOptions>()
      val hr = fn.invokeHR(arrayOf(__1542917501_Ptr, marshalToNative(widgetId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WidgetUpdateRequestOptions>(result.getValue())
      return resultValue
    }
  }

  public class IWidgetUpdateRequestOptionsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1542917501_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWidgetUpdateRequestOptionsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e0e00af81d1057a894193f568e854daa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWidgetUpdateRequestOptionsFactory(ptr: Pointer?): WithDefault =
        IWidgetUpdateRequestOptionsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWidgetUpdateRequestOptionsFactory {
      val address = segment.toRawLongValue()
      return makeIWidgetUpdateRequestOptionsFactory(Pointer(address))
    }

    public override fun toNative(obj: IWidgetUpdateRequestOptionsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1542917501_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWidgetUpdateRequestOptionsFactory):
        Array<IWidgetUpdateRequestOptionsFactory?> = (elements as
        Array<IWidgetUpdateRequestOptionsFactory?>).castToImpl<IWidgetUpdateRequestOptionsFactory,IWidgetUpdateRequestOptionsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWidgetUpdateRequestOptionsFactory?> =
        arrayOfNulls<IWidgetUpdateRequestOptionsFactory_Impl>(size) as
        Array<IWidgetUpdateRequestOptionsFactory?>
  }
}
