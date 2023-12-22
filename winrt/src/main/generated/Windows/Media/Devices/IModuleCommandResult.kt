package Windows.Media.Devices

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

@ABIMarker(IModuleCommandResult.ABI::class)
@Signature("{520d1eb4-1374-4c7d-b1e4-39dcdf3eae4e}")
@Guid("520d1eb413744c7db1e439dcdf3eae4e")
@WinRTInterface("520d1eb413744c7db1e439dcdf3eae4e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IModuleCommandResult.ByReference::class)
public interface IModuleCommandResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): SendCommandStatus?

  @InterfaceMethod(1)
  public fun get_Result(): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IModuleCommandResult> {
    public override fun getValue() = ABI.makeIModuleCommandResult(pointer.getPointer(0))

    public fun setValue(value: IModuleCommandResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IModuleCommandResult {
    public val __1090312571_Ptr: Pointer?

    public val _1090312571_VtblPtr: Pointer?
      get() = __1090312571_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): SendCommandStatus? {
      val fnPtr = _1090312571_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SendCommandStatus>()
      val hr = fn.invokeHR(arrayOf(__1090312571_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SendCommandStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Result(): IBuffer? {
      val fnPtr = _1090312571_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1090312571_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IModuleCommandResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1090312571_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IModuleCommandResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("520d1eb413744c7db1e439dcdf3eae4e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIModuleCommandResult(ptr: Pointer?): WithDefault = IModuleCommandResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IModuleCommandResult {
      val address = segment.toRawLongValue()
      return makeIModuleCommandResult(Pointer(address))
    }

    public override fun toNative(obj: IModuleCommandResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1090312571_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IModuleCommandResult): Array<IModuleCommandResult?> =
        (elements as
        Array<IModuleCommandResult?>).castToImpl<IModuleCommandResult,IModuleCommandResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IModuleCommandResult?> =
        arrayOfNulls<IModuleCommandResult_Impl>(size) as Array<IModuleCommandResult?>
  }
}
