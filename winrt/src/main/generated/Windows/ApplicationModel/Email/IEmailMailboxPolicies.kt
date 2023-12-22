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

@ABIMarker(IEmailMailboxPolicies.ABI::class)
@Signature("{1f3345c5-1c3b-4dc7-b410-6373783e545d}")
@Guid("1f3345c51c3b4dc7b4106373783e545d")
@WinRTInterface("1f3345c51c3b4dc7b4106373783e545d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxPolicies.ByReference::class)
public interface IEmailMailboxPolicies : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AllowedSmimeEncryptionAlgorithmNegotiation():
      EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation?

  @InterfaceMethod(1)
  public fun get_AllowSmimeSoftCertificates(): Boolean

  @InterfaceMethod(2)
  public fun get_RequiredSmimeEncryptionAlgorithm():
      IReference<EmailMailboxSmimeEncryptionAlgorithm?>?

  @InterfaceMethod(3)
  public fun get_RequiredSmimeSigningAlgorithm(): IReference<EmailMailboxSmimeSigningAlgorithm?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxPolicies> {
    public override fun getValue() = ABI.makeIEmailMailboxPolicies(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxPolicies_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxPolicies {
    public val __1165816575_Ptr: Pointer?

    public val _1165816575_VtblPtr: Pointer?
      get() = __1165816575_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AllowedSmimeEncryptionAlgorithmNegotiation():
        EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation? {
      val fnPtr = _1165816575_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation>()
      val hr = fn.invokeHR(arrayOf(__1165816575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AllowSmimeSoftCertificates(): Boolean {
      val fnPtr = _1165816575_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1165816575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_RequiredSmimeEncryptionAlgorithm():
        IReference<EmailMailboxSmimeEncryptionAlgorithm?>? {
      val fnPtr = _1165816575_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<EmailMailboxSmimeEncryptionAlgorithm?>>()
      val hr = fn.invokeHR(arrayOf(__1165816575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IReference<EmailMailboxSmimeEncryptionAlgorithm?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_RequiredSmimeSigningAlgorithm():
        IReference<EmailMailboxSmimeSigningAlgorithm?>? {
      val fnPtr = _1165816575_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<EmailMailboxSmimeSigningAlgorithm?>>()
      val hr = fn.invokeHR(arrayOf(__1165816575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IReference<EmailMailboxSmimeSigningAlgorithm?>>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMailboxPolicies_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1165816575_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxPolicies, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1f3345c51c3b4dc7b4106373783e545d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxPolicies(ptr: Pointer?): WithDefault =
        IEmailMailboxPolicies_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailMailboxPolicies {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxPolicies(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxPolicies): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1165816575_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxPolicies): Array<IEmailMailboxPolicies?> =
        (elements as
        Array<IEmailMailboxPolicies?>).castToImpl<IEmailMailboxPolicies,IEmailMailboxPolicies_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailboxPolicies?> =
        arrayOfNulls<IEmailMailboxPolicies_Impl>(size) as Array<IEmailMailboxPolicies?>
  }
}
