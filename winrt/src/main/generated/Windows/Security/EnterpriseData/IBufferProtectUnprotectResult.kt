package Windows.Security.EnterpriseData

import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IBufferProtectUnprotectResult.ABI::class)
@Signature("{47995edc-6cec-4e3a-b251-9e7485d79e7a}")
@Guid("47995edc6cec4e3ab2519e7485d79e7a")
@WinRTInterface("47995edc6cec4e3ab2519e7485d79e7a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBufferProtectUnprotectResult.ByReference::class)
public interface IBufferProtectUnprotectResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Buffer(): IBuffer?

  @InterfaceMethod(1)
  public fun get_ProtectionInfo(): DataProtectionInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBufferProtectUnprotectResult> {
    public override fun getValue() = ABI.makeIBufferProtectUnprotectResult(pointer.getPointer(0))

    public fun setValue(value: IBufferProtectUnprotectResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBufferProtectUnprotectResult {
    public val __1108334977_Ptr: Pointer?

    public val _1108334977_VtblPtr: Pointer?
      get() = __1108334977_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Buffer(): IBuffer? {
      val fnPtr = _1108334977_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1108334977_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ProtectionInfo(): DataProtectionInfo? {
      val fnPtr = _1108334977_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataProtectionInfo>()
      val hr = fn.invokeHR(arrayOf(__1108334977_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataProtectionInfo>(result.getValue())
      return resultValue
    }
  }

  public class IBufferProtectUnprotectResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1108334977_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBufferProtectUnprotectResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("47995edc6cec4e3ab2519e7485d79e7a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBufferProtectUnprotectResult(ptr: Pointer?): WithDefault =
        IBufferProtectUnprotectResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBufferProtectUnprotectResult {
      val address = segment.toRawLongValue()
      return makeIBufferProtectUnprotectResult(Pointer(address))
    }

    public override fun toNative(obj: IBufferProtectUnprotectResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1108334977_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBufferProtectUnprotectResult):
        Array<IBufferProtectUnprotectResult?> = (elements as
        Array<IBufferProtectUnprotectResult?>).castToImpl<IBufferProtectUnprotectResult,IBufferProtectUnprotectResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBufferProtectUnprotectResult?> =
        arrayOfNulls<IBufferProtectUnprotectResult_Impl>(size) as
        Array<IBufferProtectUnprotectResult?>
  }
}
