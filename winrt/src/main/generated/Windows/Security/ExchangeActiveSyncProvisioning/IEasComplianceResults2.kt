package Windows.Security.ExchangeActiveSyncProvisioning

import Windows.Security.ExchangeActiveSyncProvisioning.IEasComplianceResults.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IEasComplianceResults2.ABI::class)
@Signature("{2fbe60c9-1aa8-47f5-88bb-cb3ef0bffb15}")
@Guid("2fbe60c91aa847f588bbcb3ef0bffb15")
@WinRTInterface("2fbe60c91aa847f588bbcb3ef0bffb15")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEasComplianceResults2.ByReference::class)
public interface IEasComplianceResults2 : NativeMapped, IWinRTInterface, IEasComplianceResults {
  @InterfaceMethod(0)
  public fun get_EncryptionProviderType(): EasEncryptionProviderType?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEasComplianceResults2> {
    public override fun getValue() = ABI.makeIEasComplianceResults2(pointer.getPointer(0))

    public fun setValue(value: IEasComplianceResults2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEasComplianceResults2, IEasComplianceResults.WithDefault {
    public val __2072914521_Ptr: Pointer?

    public val _2072914521_VtblPtr: Pointer?
      get() = __2072914521_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EncryptionProviderType(): EasEncryptionProviderType? {
      val fnPtr = _2072914521_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EasEncryptionProviderType>()
      val hr = fn.invokeHR(arrayOf(__2072914521_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EasEncryptionProviderType>(result.getValue())
      return resultValue
    }
  }

  public class IEasComplianceResults2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IEasComplianceResults {
    public override val __343962873_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2072914521_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2072914521_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEasComplianceResults2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2fbe60c91aa847f588bbcb3ef0bffb15")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEasComplianceResults2(ptr: Pointer?): WithDefault =
        IEasComplianceResults2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEasComplianceResults2 {
      val address = segment.toRawLongValue()
      return makeIEasComplianceResults2(Pointer(address))
    }

    public override fun toNative(obj: IEasComplianceResults2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2072914521_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEasComplianceResults2): Array<IEasComplianceResults2?> =
        (elements as
        Array<IEasComplianceResults2?>).castToImpl<IEasComplianceResults2,IEasComplianceResults2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEasComplianceResults2?> =
        arrayOfNulls<IEasComplianceResults2_Impl>(size) as Array<IEasComplianceResults2?>
  }
}
