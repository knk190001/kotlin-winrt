package Windows.ApplicationModel.Email

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

@ABIMarker(IEmailMailboxPolicies3.ABI::class)
@Signature("{bdd4a01f-4867-414a-81a2-803919c44191}")
@Guid("bdd4a01f4867414a81a2803919c44191")
@WinRTInterface("bdd4a01f4867414a81a2803919c44191")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxPolicies3.ByReference::class)
public interface IEmailMailboxPolicies3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public
      fun put_AllowedSmimeEncryptionAlgorithmNegotiation(value: EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation?):
      Unit

  @InterfaceMethod(1)
  public fun put_AllowSmimeSoftCertificates(value: Boolean): Unit

  @InterfaceMethod(2)
  public
      fun put_RequiredSmimeEncryptionAlgorithm(value: IReference<EmailMailboxSmimeEncryptionAlgorithm?>?):
      Unit

  @InterfaceMethod(3)
  public
      fun put_RequiredSmimeSigningAlgorithm(value: IReference<EmailMailboxSmimeSigningAlgorithm?>?):
      Unit

  @InterfaceMethod(4)
  public fun put_MustEncryptSmimeMessages(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun put_MustSignSmimeMessages(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxPolicies3> {
    public override fun getValue() = ABI.makeIEmailMailboxPolicies3(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxPolicies3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxPolicies3 {
    public val __1780575508_Ptr: Pointer?

    public val _1780575508_VtblPtr: Pointer?
      get() = __1780575508_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun put_AllowedSmimeEncryptionAlgorithmNegotiation(value: EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation?):
        Unit {
      val fnPtr = _1780575508_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1780575508_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun put_AllowSmimeSoftCertificates(value: Boolean): Unit {
      val fnPtr = _1780575508_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1780575508_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override
        fun put_RequiredSmimeEncryptionAlgorithm(value: IReference<EmailMailboxSmimeEncryptionAlgorithm?>?):
        Unit {
      val fnPtr = _1780575508_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1780575508_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override
        fun put_RequiredSmimeSigningAlgorithm(value: IReference<EmailMailboxSmimeSigningAlgorithm?>?):
        Unit {
      val fnPtr = _1780575508_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1780575508_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun put_MustEncryptSmimeMessages(value: Boolean): Unit {
      val fnPtr = _1780575508_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1780575508_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun put_MustSignSmimeMessages(value: Boolean): Unit {
      val fnPtr = _1780575508_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1780575508_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IEmailMailboxPolicies3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1780575508_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxPolicies3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bdd4a01f4867414a81a2803919c44191")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxPolicies3(ptr: Pointer?): WithDefault =
        IEmailMailboxPolicies3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailMailboxPolicies3 {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxPolicies3(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxPolicies3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1780575508_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxPolicies3): Array<IEmailMailboxPolicies3?> =
        (elements as
        Array<IEmailMailboxPolicies3?>).castToImpl<IEmailMailboxPolicies3,IEmailMailboxPolicies3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailboxPolicies3?> =
        arrayOfNulls<IEmailMailboxPolicies3_Impl>(size) as Array<IEmailMailboxPolicies3?>
  }
}
