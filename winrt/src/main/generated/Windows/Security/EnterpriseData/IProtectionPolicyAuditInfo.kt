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

@ABIMarker(IProtectionPolicyAuditInfo.ABI::class)
@Signature("{425ab7e4-feb7-44fc-b3bb-c3c4d7ecbebb}")
@Guid("425ab7e4feb744fcb3bbc3c4d7ecbebb")
@WinRTInterface("425ab7e4feb744fcb3bbc3c4d7ecbebb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProtectionPolicyAuditInfo.ByReference::class)
public interface IProtectionPolicyAuditInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_Action(value: ProtectionPolicyAuditAction?): Unit

  @InterfaceMethod(1)
  public fun get_Action(): ProtectionPolicyAuditAction?

  @InterfaceMethod(2)
  public fun put_DataDescription(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_DataDescription(): String?

  @InterfaceMethod(4)
  public fun put_SourceDescription(value: String?): Unit

  @InterfaceMethod(5)
  public fun get_SourceDescription(): String?

  @InterfaceMethod(6)
  public fun put_TargetDescription(value: String?): Unit

  @InterfaceMethod(7)
  public fun get_TargetDescription(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProtectionPolicyAuditInfo> {
    public override fun getValue() = ABI.makeIProtectionPolicyAuditInfo(pointer.getPointer(0))

    public fun setValue(value: IProtectionPolicyAuditInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProtectionPolicyAuditInfo {
    public val __115251395_Ptr: Pointer?

    public val _115251395_VtblPtr: Pointer?
      get() = __115251395_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Action(value: ProtectionPolicyAuditAction?): Unit {
      val fnPtr = _115251395_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__115251395_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Action(): ProtectionPolicyAuditAction? {
      val fnPtr = _115251395_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProtectionPolicyAuditAction>()
      val hr = fn.invokeHR(arrayOf(__115251395_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProtectionPolicyAuditAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_DataDescription(value: String?): Unit {
      val fnPtr = _115251395_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__115251395_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_DataDescription(): String? {
      val fnPtr = _115251395_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__115251395_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_SourceDescription(value: String?): Unit {
      val fnPtr = _115251395_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__115251395_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_SourceDescription(): String? {
      val fnPtr = _115251395_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__115251395_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_TargetDescription(value: String?): Unit {
      val fnPtr = _115251395_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__115251395_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_TargetDescription(): String? {
      val fnPtr = _115251395_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__115251395_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IProtectionPolicyAuditInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __115251395_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProtectionPolicyAuditInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("425ab7e4feb744fcb3bbc3c4d7ecbebb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProtectionPolicyAuditInfo(ptr: Pointer?): WithDefault =
        IProtectionPolicyAuditInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProtectionPolicyAuditInfo {
      val address = segment.toRawLongValue()
      return makeIProtectionPolicyAuditInfo(Pointer(address))
    }

    public override fun toNative(obj: IProtectionPolicyAuditInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__115251395_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProtectionPolicyAuditInfo):
        Array<IProtectionPolicyAuditInfo?> = (elements as
        Array<IProtectionPolicyAuditInfo?>).castToImpl<IProtectionPolicyAuditInfo,IProtectionPolicyAuditInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProtectionPolicyAuditInfo?> =
        arrayOfNulls<IProtectionPolicyAuditInfo_Impl>(size) as Array<IProtectionPolicyAuditInfo?>
  }
}
