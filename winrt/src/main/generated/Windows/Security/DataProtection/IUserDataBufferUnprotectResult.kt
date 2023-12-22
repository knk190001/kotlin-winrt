package Windows.Security.DataProtection

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

@ABIMarker(IUserDataBufferUnprotectResult.ABI::class)
@Signature("{8efd0e90-fa9a-46a4-a377-01cebf1e74d8}")
@Guid("8efd0e90fa9a46a4a37701cebf1e74d8")
@WinRTInterface("8efd0e90fa9a46a4a37701cebf1e74d8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataBufferUnprotectResult.ByReference::class)
public interface IUserDataBufferUnprotectResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): UserDataBufferUnprotectStatus?

  @InterfaceMethod(1)
  public fun get_UnprotectedBuffer(): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataBufferUnprotectResult> {
    public override fun getValue() = ABI.makeIUserDataBufferUnprotectResult(pointer.getPointer(0))

    public fun setValue(value: IUserDataBufferUnprotectResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataBufferUnprotectResult {
    public val __1650074651_Ptr: Pointer?

    public val _1650074651_VtblPtr: Pointer?
      get() = __1650074651_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): UserDataBufferUnprotectStatus? {
      val fnPtr = _1650074651_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserDataBufferUnprotectStatus>()
      val hr = fn.invokeHR(arrayOf(__1650074651_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserDataBufferUnprotectStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_UnprotectedBuffer(): IBuffer? {
      val fnPtr = _1650074651_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1650074651_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IUserDataBufferUnprotectResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1650074651_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataBufferUnprotectResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8efd0e90fa9a46a4a37701cebf1e74d8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataBufferUnprotectResult(ptr: Pointer?): WithDefault =
        IUserDataBufferUnprotectResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserDataBufferUnprotectResult {
      val address = segment.toRawLongValue()
      return makeIUserDataBufferUnprotectResult(Pointer(address))
    }

    public override fun toNative(obj: IUserDataBufferUnprotectResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1650074651_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataBufferUnprotectResult):
        Array<IUserDataBufferUnprotectResult?> = (elements as
        Array<IUserDataBufferUnprotectResult?>).castToImpl<IUserDataBufferUnprotectResult,IUserDataBufferUnprotectResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataBufferUnprotectResult?> =
        arrayOfNulls<IUserDataBufferUnprotectResult_Impl>(size) as
        Array<IUserDataBufferUnprotectResult?>
  }
}
