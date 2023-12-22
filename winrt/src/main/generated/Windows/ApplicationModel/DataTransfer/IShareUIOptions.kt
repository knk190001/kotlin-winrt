package Windows.ApplicationModel.DataTransfer

import Windows.Foundation.IReference
import Windows.Foundation.Rect
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

@ABIMarker(IShareUIOptions.ABI::class)
@Signature("{72fa8a80-342f-4d90-9551-2ae04e37680c}")
@Guid("72fa8a80342f4d9095512ae04e37680c")
@WinRTInterface("72fa8a80342f4d9095512ae04e37680c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IShareUIOptions.ByReference::class)
public interface IShareUIOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Theme(): ShareUITheme?

  @InterfaceMethod(1)
  public fun put_Theme(value: ShareUITheme?): Unit

  @InterfaceMethod(2)
  public fun get_SelectionRect(): IReference<Rect?>?

  @InterfaceMethod(3)
  public fun put_SelectionRect(value: IReference<Rect?>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IShareUIOptions> {
    public override fun getValue() = ABI.makeIShareUIOptions(pointer.getPointer(0))

    public fun setValue(value: IShareUIOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IShareUIOptions {
    public val __93469621_Ptr: Pointer?

    public val _93469621_VtblPtr: Pointer?
      get() = __93469621_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Theme(): ShareUITheme? {
      val fnPtr = _93469621_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ShareUITheme>()
      val hr = fn.invokeHR(arrayOf(__93469621_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ShareUITheme>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Theme(value: ShareUITheme?): Unit {
      val fnPtr = _93469621_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__93469621_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_SelectionRect(): IReference<Rect?>? {
      val fnPtr = _93469621_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Rect?>>()
      val hr = fn.invokeHR(arrayOf(__93469621_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Rect?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_SelectionRect(value: IReference<Rect?>?): Unit {
      val fnPtr = _93469621_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__93469621_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IShareUIOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __93469621_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IShareUIOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("72fa8a80342f4d9095512ae04e37680c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIShareUIOptions(ptr: Pointer?): WithDefault = IShareUIOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IShareUIOptions {
      val address = segment.toRawLongValue()
      return makeIShareUIOptions(Pointer(address))
    }

    public override fun toNative(obj: IShareUIOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__93469621_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IShareUIOptions): Array<IShareUIOptions?> = (elements as
        Array<IShareUIOptions?>).castToImpl<IShareUIOptions,IShareUIOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IShareUIOptions?> =
        arrayOfNulls<IShareUIOptions_Impl>(size) as Array<IShareUIOptions?>
  }
}
