package Windows.Devices.Printers

import Windows.Foundation.Collections.IMapView
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IIppSetAttributesResult.ABI::class)
@Signature("{7d1c7f55-aa9d-58a3-90e9-17bdc5281f07}")
@Guid("7d1c7f55aa9d58a390e917bdc5281f07")
@WinRTInterface("7d1c7f55aa9d58a390e917bdc5281f07")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIppSetAttributesResult.ByReference::class)
public interface IIppSetAttributesResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Succeeded(): Boolean

  @InterfaceMethod(1)
  public fun get_AttributeErrors(): IMapView<String?, IppAttributeError?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIppSetAttributesResult> {
    public override fun getValue() = ABI.makeIIppSetAttributesResult(pointer.getPointer(0))

    public fun setValue(value: IIppSetAttributesResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIppSetAttributesResult {
    public val __1330180095_Ptr: Pointer?

    public val _1330180095_VtblPtr: Pointer?
      get() = __1330180095_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Succeeded(): Boolean {
      val fnPtr = _1330180095_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1330180095_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_AttributeErrors(): IMapView<String?, IppAttributeError?>? {
      val fnPtr = _1330180095_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, IppAttributeError?>>()
      val hr = fn.invokeHR(arrayOf(__1330180095_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, IppAttributeError?>>(result.getValue())
      return resultValue
    }
  }

  public class IIppSetAttributesResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1330180095_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIppSetAttributesResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7d1c7f55aa9d58a390e917bdc5281f07")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIppSetAttributesResult(ptr: Pointer?): WithDefault =
        IIppSetAttributesResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIppSetAttributesResult {
      val address = segment.toRawLongValue()
      return makeIIppSetAttributesResult(Pointer(address))
    }

    public override fun toNative(obj: IIppSetAttributesResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1330180095_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIppSetAttributesResult): Array<IIppSetAttributesResult?>
        = (elements as
        Array<IIppSetAttributesResult?>).castToImpl<IIppSetAttributesResult,IIppSetAttributesResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIppSetAttributesResult?> =
        arrayOfNulls<IIppSetAttributesResult_Impl>(size) as Array<IIppSetAttributesResult?>
  }
}
