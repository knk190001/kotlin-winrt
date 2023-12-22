package Windows.Devices.Printers

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.HResult
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

@ABIMarker(IIppAttributeError.ABI::class)
@Signature("{750feda1-9eef-5c39-93e4-46149bbcef27}")
@Guid("750feda19eef5c3993e446149bbcef27")
@WinRTInterface("750feda19eef5c3993e446149bbcef27")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIppAttributeError.ByReference::class)
public interface IIppAttributeError : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reason(): IppAttributeErrorReason?

  @InterfaceMethod(1)
  public fun get_ExtendedError(): HResult?

  @InterfaceMethod(2)
  public fun GetUnsupportedValues(): IVectorView<IppAttributeValue?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIppAttributeError> {
    public override fun getValue() = ABI.makeIIppAttributeError(pointer.getPointer(0))

    public fun setValue(value: IIppAttributeError_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIppAttributeError {
    public val __180382015_Ptr: Pointer?

    public val _180382015_VtblPtr: Pointer?
      get() = __180382015_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reason(): IppAttributeErrorReason? {
      val fnPtr = _180382015_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeErrorReason>()
      val hr = fn.invokeHR(arrayOf(__180382015_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeErrorReason>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _180382015_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__180382015_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetUnsupportedValues(): IVectorView<IppAttributeValue?>? {
      val fnPtr = _180382015_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<IppAttributeValue?>>()
      val hr = fn.invokeHR(arrayOf(__180382015_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<IppAttributeValue?>>(result.getValue())
      return resultValue
    }
  }

  public class IIppAttributeError_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __180382015_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIppAttributeError, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("750feda19eef5c3993e446149bbcef27")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIppAttributeError(ptr: Pointer?): WithDefault = IIppAttributeError_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIppAttributeError {
      val address = segment.toRawLongValue()
      return makeIIppAttributeError(Pointer(address))
    }

    public override fun toNative(obj: IIppAttributeError): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__180382015_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIppAttributeError): Array<IIppAttributeError?> =
        (elements as
        Array<IIppAttributeError?>).castToImpl<IIppAttributeError,IIppAttributeError_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIppAttributeError?> =
        arrayOfNulls<IIppAttributeError_Impl>(size) as Array<IIppAttributeError?>
  }
}
