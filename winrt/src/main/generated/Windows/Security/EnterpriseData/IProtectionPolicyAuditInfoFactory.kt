package Windows.Security.EnterpriseData

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IProtectionPolicyAuditInfoFactory.ABI::class)
@Signature("{7ed4180b-92e8-42d5-83d4-25440b423549}")
@Guid("7ed4180b92e842d583d425440b423549")
@WinRTInterface("7ed4180b92e842d583d425440b423549")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProtectionPolicyAuditInfoFactory.ByReference::class)
public interface IProtectionPolicyAuditInfoFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(
    action: ProtectionPolicyAuditAction?,
    dataDescription: String?,
    sourceDescription: String?,
    targetDescription: String?
  ): ProtectionPolicyAuditInfo?

  @InterfaceMethod(1)
  public fun CreateWithActionAndDataDescription(action: ProtectionPolicyAuditAction?,
      dataDescription: String?): ProtectionPolicyAuditInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProtectionPolicyAuditInfoFactory> {
    public override fun getValue() =
        ABI.makeIProtectionPolicyAuditInfoFactory(pointer.getPointer(0))

    public fun setValue(value: IProtectionPolicyAuditInfoFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProtectionPolicyAuditInfoFactory {
    public val __414146247_Ptr: Pointer?

    public val _414146247_VtblPtr: Pointer?
      get() = __414146247_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(
      action: ProtectionPolicyAuditAction?,
      dataDescription: String?,
      sourceDescription: String?,
      targetDescription: String?
    ): ProtectionPolicyAuditInfo? {
      val fnPtr = _414146247_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProtectionPolicyAuditInfo>()
      val hr = fn.invokeHR(arrayOf(__414146247_Ptr, marshalToNative(action),
          marshalToNative(dataDescription), marshalToNative(sourceDescription),
          marshalToNative(targetDescription), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProtectionPolicyAuditInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithActionAndDataDescription(action: ProtectionPolicyAuditAction?,
        dataDescription: String?): ProtectionPolicyAuditInfo? {
      val fnPtr = _414146247_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProtectionPolicyAuditInfo>()
      val hr = fn.invokeHR(arrayOf(__414146247_Ptr, marshalToNative(action),
          marshalToNative(dataDescription), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProtectionPolicyAuditInfo>(result.getValue())
      return resultValue
    }
  }

  public class IProtectionPolicyAuditInfoFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __414146247_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProtectionPolicyAuditInfoFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7ed4180b92e842d583d425440b423549")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProtectionPolicyAuditInfoFactory(ptr: Pointer?): WithDefault =
        IProtectionPolicyAuditInfoFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProtectionPolicyAuditInfoFactory {
      val address = segment.toRawLongValue()
      return makeIProtectionPolicyAuditInfoFactory(Pointer(address))
    }

    public override fun toNative(obj: IProtectionPolicyAuditInfoFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__414146247_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProtectionPolicyAuditInfoFactory):
        Array<IProtectionPolicyAuditInfoFactory?> = (elements as
        Array<IProtectionPolicyAuditInfoFactory?>).castToImpl<IProtectionPolicyAuditInfoFactory,IProtectionPolicyAuditInfoFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProtectionPolicyAuditInfoFactory?> =
        arrayOfNulls<IProtectionPolicyAuditInfoFactory_Impl>(size) as
        Array<IProtectionPolicyAuditInfoFactory?>
  }
}
