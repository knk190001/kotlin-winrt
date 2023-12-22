package Windows.Media.Casting

import Windows.Foundation.Collections.IVector
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICastingDevicePickerFilter.ABI::class)
@Signature("{be8c619c-b563-4354-ae33-9fdaad8c6291}")
@Guid("be8c619cb5634354ae339fdaad8c6291")
@WinRTInterface("be8c619cb5634354ae339fdaad8c6291")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICastingDevicePickerFilter.ByReference::class)
public interface ICastingDevicePickerFilter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SupportsAudio(): Boolean

  @InterfaceMethod(1)
  public fun put_SupportsAudio(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_SupportsVideo(): Boolean

  @InterfaceMethod(3)
  public fun put_SupportsVideo(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_SupportsPictures(): Boolean

  @InterfaceMethod(5)
  public fun put_SupportsPictures(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_SupportedCastingSources(): IVector<CastingSource?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICastingDevicePickerFilter> {
    public override fun getValue() = ABI.makeICastingDevicePickerFilter(pointer.getPointer(0))

    public fun setValue(value: ICastingDevicePickerFilter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICastingDevicePickerFilter {
    public val __1171638620_Ptr: Pointer?

    public val _1171638620_VtblPtr: Pointer?
      get() = __1171638620_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SupportsAudio(): Boolean {
      val fnPtr = _1171638620_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1171638620_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_SupportsAudio(value: Boolean): Unit {
      val fnPtr = _1171638620_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1171638620_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_SupportsVideo(): Boolean {
      val fnPtr = _1171638620_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1171638620_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_SupportsVideo(value: Boolean): Unit {
      val fnPtr = _1171638620_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1171638620_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_SupportsPictures(): Boolean {
      val fnPtr = _1171638620_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1171638620_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_SupportsPictures(value: Boolean): Unit {
      val fnPtr = _1171638620_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1171638620_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_SupportedCastingSources(): IVector<CastingSource?>? {
      val fnPtr = _1171638620_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<CastingSource?>>()
      val hr = fn.invokeHR(arrayOf(__1171638620_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<CastingSource?>>(result.getValue())
      return resultValue
    }
  }

  public class ICastingDevicePickerFilter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1171638620_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICastingDevicePickerFilter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("be8c619cb5634354ae339fdaad8c6291")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICastingDevicePickerFilter(ptr: Pointer?): WithDefault =
        ICastingDevicePickerFilter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICastingDevicePickerFilter {
      val address = segment.toRawLongValue()
      return makeICastingDevicePickerFilter(Pointer(address))
    }

    public override fun toNative(obj: ICastingDevicePickerFilter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1171638620_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICastingDevicePickerFilter):
        Array<ICastingDevicePickerFilter?> = (elements as
        Array<ICastingDevicePickerFilter?>).castToImpl<ICastingDevicePickerFilter,ICastingDevicePickerFilter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICastingDevicePickerFilter?> =
        arrayOfNulls<ICastingDevicePickerFilter_Impl>(size) as Array<ICastingDevicePickerFilter?>
  }
}
