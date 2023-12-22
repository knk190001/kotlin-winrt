package Windows.Web.Http.Headers

import Windows.Foundation.Collections.IVector
import Windows.Foundation.IReference
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IHttpContentDispositionHeaderValue.ABI::class)
@Signature("{f2a2eedc-2629-4b49-9908-96a168e9365e}")
@Guid("f2a2eedc26294b49990896a168e9365e")
@WinRTInterface("f2a2eedc26294b49990896a168e9365e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpContentDispositionHeaderValue.ByReference::class)
public interface IHttpContentDispositionHeaderValue : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DispositionType(): String?

  @InterfaceMethod(1)
  public fun put_DispositionType(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_FileName(): String?

  @InterfaceMethod(3)
  public fun put_FileName(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_FileNameStar(): String?

  @InterfaceMethod(5)
  public fun put_FileNameStar(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_Name(): String?

  @InterfaceMethod(7)
  public fun put_Name(value: String?): Unit

  @InterfaceMethod(8)
  public fun get_Parameters(): IVector<HttpNameValueHeaderValue?>?

  @InterfaceMethod(9)
  public fun get_Size(): IReference<WinDef.ULONG>?

  @InterfaceMethod(10)
  public fun put_Size(value: IReference<WinDef.ULONG>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpContentDispositionHeaderValue> {
    public override fun getValue() =
        ABI.makeIHttpContentDispositionHeaderValue(pointer.getPointer(0))

    public fun setValue(value: IHttpContentDispositionHeaderValue_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpContentDispositionHeaderValue {
    public val __1866697958_Ptr: Pointer?

    public val _1866697958_VtblPtr: Pointer?
      get() = __1866697958_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DispositionType(): String? {
      val fnPtr = _1866697958_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1866697958_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DispositionType(value: String?): Unit {
      val fnPtr = _1866697958_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1866697958_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_FileName(): String? {
      val fnPtr = _1866697958_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1866697958_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_FileName(value: String?): Unit {
      val fnPtr = _1866697958_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1866697958_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_FileNameStar(): String? {
      val fnPtr = _1866697958_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1866697958_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_FileNameStar(value: String?): Unit {
      val fnPtr = _1866697958_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1866697958_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Name(): String? {
      val fnPtr = _1866697958_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1866697958_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Name(value: String?): Unit {
      val fnPtr = _1866697958_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1866697958_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Parameters(): IVector<HttpNameValueHeaderValue?>? {
      val fnPtr = _1866697958_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<HttpNameValueHeaderValue?>>()
      val hr = fn.invokeHR(arrayOf(__1866697958_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<HttpNameValueHeaderValue?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_Size(): IReference<WinDef.ULONG>? {
      val fnPtr = _1866697958_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.ULONG>>()
      val hr = fn.invokeHR(arrayOf(__1866697958_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.ULONG>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_Size(value: IReference<WinDef.ULONG>?): Unit {
      val fnPtr = _1866697958_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1866697958_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHttpContentDispositionHeaderValue_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1866697958_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpContentDispositionHeaderValue, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f2a2eedc26294b49990896a168e9365e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpContentDispositionHeaderValue(ptr: Pointer?): WithDefault =
        IHttpContentDispositionHeaderValue_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpContentDispositionHeaderValue {
      val address = segment.toRawLongValue()
      return makeIHttpContentDispositionHeaderValue(Pointer(address))
    }

    public override fun toNative(obj: IHttpContentDispositionHeaderValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1866697958_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpContentDispositionHeaderValue):
        Array<IHttpContentDispositionHeaderValue?> = (elements as
        Array<IHttpContentDispositionHeaderValue?>).castToImpl<IHttpContentDispositionHeaderValue,IHttpContentDispositionHeaderValue_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpContentDispositionHeaderValue?> =
        arrayOfNulls<IHttpContentDispositionHeaderValue_Impl>(size) as
        Array<IHttpContentDispositionHeaderValue?>
  }
}
