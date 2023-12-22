package Microsoft.UI.Xaml

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDataTemplateStatics.ABI::class)
@Signature("{cf6ada69-4bf1-5f2d-8bdb-09ea1a26f975}")
@Guid("cf6ada694bf15f2d8bdb09ea1a26f975")
@WinRTInterface("cf6ada694bf15f2d8bdb09ea1a26f975")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataTemplateStatics.ByReference::class)
public interface IDataTemplateStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExtensionInstanceProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun GetExtensionInstance(element: FrameworkElement?): IDataTemplateExtension?

  @InterfaceMethod(2)
  public fun SetExtensionInstance(element: FrameworkElement?, value: IDataTemplateExtension?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataTemplateStatics> {
    public override fun getValue() = ABI.makeIDataTemplateStatics(pointer.getPointer(0))

    public fun setValue(value: IDataTemplateStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataTemplateStatics {
    public val __2074978618_Ptr: Pointer?

    public val _2074978618_VtblPtr: Pointer?
      get() = __2074978618_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExtensionInstanceProperty(): DependencyProperty? {
      val fnPtr = _2074978618_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2074978618_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetExtensionInstance(element: FrameworkElement?): IDataTemplateExtension? {
      val fnPtr = _2074978618_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IDataTemplateExtension>()
      val hr = fn.invokeHR(arrayOf(__2074978618_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IDataTemplateExtension>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetExtensionInstance(element: FrameworkElement?,
        value: IDataTemplateExtension?): Unit {
      val fnPtr = _2074978618_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2074978618_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDataTemplateStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2074978618_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataTemplateStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cf6ada694bf15f2d8bdb09ea1a26f975")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataTemplateStatics(ptr: Pointer?): WithDefault = IDataTemplateStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataTemplateStatics {
      val address = segment.toRawLongValue()
      return makeIDataTemplateStatics(Pointer(address))
    }

    public override fun toNative(obj: IDataTemplateStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2074978618_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataTemplateStatics): Array<IDataTemplateStatics?> =
        (elements as
        Array<IDataTemplateStatics?>).castToImpl<IDataTemplateStatics,IDataTemplateStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataTemplateStatics?> =
        arrayOfNulls<IDataTemplateStatics_Impl>(size) as Array<IDataTemplateStatics?>
  }
}
