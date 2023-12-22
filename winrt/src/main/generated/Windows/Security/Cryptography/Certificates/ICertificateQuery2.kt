package Windows.Security.Cryptography.Certificates

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

@ABIMarker(ICertificateQuery2.ABI::class)
@Signature("{935a0af7-0bd9-4f75-b8c2-e27a7f74eecd}")
@Guid("935a0af70bd94f75b8c2e27a7f74eecd")
@WinRTInterface("935a0af70bd94f75b8c2e27a7f74eecd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICertificateQuery2.ByReference::class)
public interface ICertificateQuery2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IncludeDuplicates(): Boolean

  @InterfaceMethod(1)
  public fun put_IncludeDuplicates(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_IncludeExpiredCertificates(): Boolean

  @InterfaceMethod(3)
  public fun put_IncludeExpiredCertificates(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_StoreName(): String?

  @InterfaceMethod(5)
  public fun put_StoreName(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICertificateQuery2> {
    public override fun getValue() = ABI.makeICertificateQuery2(pointer.getPointer(0))

    public fun setValue(value: ICertificateQuery2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICertificateQuery2 {
    public val __649281357_Ptr: Pointer?

    public val _649281357_VtblPtr: Pointer?
      get() = __649281357_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IncludeDuplicates(): Boolean {
      val fnPtr = _649281357_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__649281357_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IncludeDuplicates(value: Boolean): Unit {
      val fnPtr = _649281357_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__649281357_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IncludeExpiredCertificates(): Boolean {
      val fnPtr = _649281357_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__649281357_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IncludeExpiredCertificates(value: Boolean): Unit {
      val fnPtr = _649281357_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__649281357_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_StoreName(): String? {
      val fnPtr = _649281357_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__649281357_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_StoreName(value: String?): Unit {
      val fnPtr = _649281357_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__649281357_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICertificateQuery2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __649281357_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICertificateQuery2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("935a0af70bd94f75b8c2e27a7f74eecd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICertificateQuery2(ptr: Pointer?): WithDefault = ICertificateQuery2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICertificateQuery2 {
      val address = segment.toRawLongValue()
      return makeICertificateQuery2(Pointer(address))
    }

    public override fun toNative(obj: ICertificateQuery2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__649281357_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICertificateQuery2): Array<ICertificateQuery2?> =
        (elements as
        Array<ICertificateQuery2?>).castToImpl<ICertificateQuery2,ICertificateQuery2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICertificateQuery2?> =
        arrayOfNulls<ICertificateQuery2_Impl>(size) as Array<ICertificateQuery2?>
  }
}
