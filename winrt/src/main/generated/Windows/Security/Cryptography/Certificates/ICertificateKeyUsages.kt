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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICertificateKeyUsages.ABI::class)
@Signature("{6ac6206f-e1cf-486a-b485-a69c83e46fd1}")
@Guid("6ac6206fe1cf486ab485a69c83e46fd1")
@WinRTInterface("6ac6206fe1cf486ab485a69c83e46fd1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICertificateKeyUsages.ByReference::class)
public interface ICertificateKeyUsages : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EncipherOnly(): Boolean

  @InterfaceMethod(1)
  public fun put_EncipherOnly(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_CrlSign(): Boolean

  @InterfaceMethod(3)
  public fun put_CrlSign(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_KeyCertificateSign(): Boolean

  @InterfaceMethod(5)
  public fun put_KeyCertificateSign(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_KeyAgreement(): Boolean

  @InterfaceMethod(7)
  public fun put_KeyAgreement(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_DataEncipherment(): Boolean

  @InterfaceMethod(9)
  public fun put_DataEncipherment(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun get_KeyEncipherment(): Boolean

  @InterfaceMethod(11)
  public fun put_KeyEncipherment(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun get_NonRepudiation(): Boolean

  @InterfaceMethod(13)
  public fun put_NonRepudiation(value: Boolean): Unit

  @InterfaceMethod(14)
  public fun get_DigitalSignature(): Boolean

  @InterfaceMethod(15)
  public fun put_DigitalSignature(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICertificateKeyUsages> {
    public override fun getValue() = ABI.makeICertificateKeyUsages(pointer.getPointer(0))

    public fun setValue(value: ICertificateKeyUsages_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICertificateKeyUsages {
    public val __1667345736_Ptr: Pointer?

    public val _1667345736_VtblPtr: Pointer?
      get() = __1667345736_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EncipherOnly(): Boolean {
      val fnPtr = _1667345736_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1667345736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_EncipherOnly(value: Boolean): Unit {
      val fnPtr = _1667345736_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1667345736_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CrlSign(): Boolean {
      val fnPtr = _1667345736_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1667345736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_CrlSign(value: Boolean): Unit {
      val fnPtr = _1667345736_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1667345736_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_KeyCertificateSign(): Boolean {
      val fnPtr = _1667345736_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1667345736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_KeyCertificateSign(value: Boolean): Unit {
      val fnPtr = _1667345736_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1667345736_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_KeyAgreement(): Boolean {
      val fnPtr = _1667345736_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1667345736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_KeyAgreement(value: Boolean): Unit {
      val fnPtr = _1667345736_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1667345736_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_DataEncipherment(): Boolean {
      val fnPtr = _1667345736_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1667345736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_DataEncipherment(value: Boolean): Unit {
      val fnPtr = _1667345736_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1667345736_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_KeyEncipherment(): Boolean {
      val fnPtr = _1667345736_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1667345736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_KeyEncipherment(value: Boolean): Unit {
      val fnPtr = _1667345736_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1667345736_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_NonRepudiation(): Boolean {
      val fnPtr = _1667345736_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1667345736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_NonRepudiation(value: Boolean): Unit {
      val fnPtr = _1667345736_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1667345736_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_DigitalSignature(): Boolean {
      val fnPtr = _1667345736_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1667345736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_DigitalSignature(value: Boolean): Unit {
      val fnPtr = _1667345736_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1667345736_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICertificateKeyUsages_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1667345736_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICertificateKeyUsages, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6ac6206fe1cf486ab485a69c83e46fd1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICertificateKeyUsages(ptr: Pointer?): WithDefault =
        ICertificateKeyUsages_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICertificateKeyUsages {
      val address = segment.toRawLongValue()
      return makeICertificateKeyUsages(Pointer(address))
    }

    public override fun toNative(obj: ICertificateKeyUsages): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1667345736_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICertificateKeyUsages): Array<ICertificateKeyUsages?> =
        (elements as
        Array<ICertificateKeyUsages?>).castToImpl<ICertificateKeyUsages,ICertificateKeyUsages_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICertificateKeyUsages?> =
        arrayOfNulls<ICertificateKeyUsages_Impl>(size) as Array<ICertificateKeyUsages?>
  }
}
