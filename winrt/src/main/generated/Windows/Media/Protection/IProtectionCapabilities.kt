package Windows.Media.Protection

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

@ABIMarker(IProtectionCapabilities.ABI::class)
@Signature("{c7ac5d7e-7480-4d29-a464-7bcd913dd8e4}")
@Guid("c7ac5d7e74804d29a4647bcd913dd8e4")
@WinRTInterface("c7ac5d7e74804d29a4647bcd913dd8e4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProtectionCapabilities.ByReference::class)
public interface IProtectionCapabilities : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsTypeSupported(type: String?, keySystem: String?): ProtectionCapabilityResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProtectionCapabilities> {
    public override fun getValue() = ABI.makeIProtectionCapabilities(pointer.getPointer(0))

    public fun setValue(value: IProtectionCapabilities_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProtectionCapabilities {
    public val __567176822_Ptr: Pointer?

    public val _567176822_VtblPtr: Pointer?
      get() = __567176822_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsTypeSupported(type: String?, keySystem: String?):
        ProtectionCapabilityResult? {
      val fnPtr = _567176822_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProtectionCapabilityResult>()
      val hr = fn.invokeHR(arrayOf(__567176822_Ptr, marshalToNative(type),
          marshalToNative(keySystem), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProtectionCapabilityResult>(result.getValue())
      return resultValue
    }
  }

  public class IProtectionCapabilities_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __567176822_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProtectionCapabilities, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c7ac5d7e74804d29a4647bcd913dd8e4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProtectionCapabilities(ptr: Pointer?): WithDefault =
        IProtectionCapabilities_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProtectionCapabilities {
      val address = segment.toRawLongValue()
      return makeIProtectionCapabilities(Pointer(address))
    }

    public override fun toNative(obj: IProtectionCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__567176822_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProtectionCapabilities): Array<IProtectionCapabilities?>
        = (elements as
        Array<IProtectionCapabilities?>).castToImpl<IProtectionCapabilities,IProtectionCapabilities_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProtectionCapabilities?> =
        arrayOfNulls<IProtectionCapabilities_Impl>(size) as Array<IProtectionCapabilities?>
  }
}
