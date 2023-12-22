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

@ABIMarker(IWidgetUpdateRequestOptions.ABI::class)
@Signature("{b09ca8f7-7424-5687-baaf-7dd6fa639672}")
@Guid("b09ca8f774245687baaf7dd6fa639672")
@WinRTInterface("b09ca8f774245687baaf7dd6fa639672")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWidgetUpdateRequestOptions.ByReference::class)
public interface IWidgetUpdateRequestOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_WidgetId(): String?

  @InterfaceMethod(1)
  public fun get_Template(): String?

  @InterfaceMethod(2)
  public fun put_Template(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_Data(): String?

  @InterfaceMethod(4)
  public fun put_Data(value: String?): Unit

  @InterfaceMethod(5)
  public fun get_CustomState(): String?

  @InterfaceMethod(6)
  public fun put_CustomState(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWidgetUpdateRequestOptions> {
    public override fun getValue() = ABI.makeIWidgetUpdateRequestOptions(pointer.getPointer(0))

    public fun setValue(value: IWidgetUpdateRequestOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWidgetUpdateRequestOptions {
    public val __506303795_Ptr: Pointer?

    public val _506303795_VtblPtr: Pointer?
      get() = __506303795_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_WidgetId(): String? {
      val fnPtr = _506303795_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__506303795_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Template(): String? {
      val fnPtr = _506303795_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__506303795_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Template(value: String?): Unit {
      val fnPtr = _506303795_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__506303795_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Data(): String? {
      val fnPtr = _506303795_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__506303795_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_Data(value: String?): Unit {
      val fnPtr = _506303795_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__506303795_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_CustomState(): String? {
      val fnPtr = _506303795_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__506303795_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_CustomState(value: String?): Unit {
      val fnPtr = _506303795_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__506303795_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWidgetUpdateRequestOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __506303795_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWidgetUpdateRequestOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b09ca8f774245687baaf7dd6fa639672")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWidgetUpdateRequestOptions(ptr: Pointer?): WithDefault =
        IWidgetUpdateRequestOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWidgetUpdateRequestOptions {
      val address = segment.toRawLongValue()
      return makeIWidgetUpdateRequestOptions(Pointer(address))
    }

    public override fun toNative(obj: IWidgetUpdateRequestOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__506303795_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWidgetUpdateRequestOptions):
        Array<IWidgetUpdateRequestOptions?> = (elements as
        Array<IWidgetUpdateRequestOptions?>).castToImpl<IWidgetUpdateRequestOptions,IWidgetUpdateRequestOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWidgetUpdateRequestOptions?> =
        arrayOfNulls<IWidgetUpdateRequestOptions_Impl>(size) as Array<IWidgetUpdateRequestOptions?>
  }
}
