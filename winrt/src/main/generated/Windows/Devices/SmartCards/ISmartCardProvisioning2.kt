package Windows.Devices.SmartCards

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(ISmartCardProvisioning2.ABI::class)
@Signature("{10fd28eb-3f79-4b66-9b7c-11c149b7d0bc}")
@Guid("10fd28eb3f794b669b7c11c149b7d0bc")
@WinRTInterface("10fd28eb3f794b669b7c11c149b7d0bc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardProvisioning2.ByReference::class)
public interface ISmartCardProvisioning2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAuthorityKeyContainerNameAsync(): IAsyncOperation<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardProvisioning2> {
    public override fun getValue() = ABI.makeISmartCardProvisioning2(pointer.getPointer(0))

    public fun setValue(value: ISmartCardProvisioning2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardProvisioning2 {
    public val __154753185_Ptr: Pointer?

    public val _154753185_VtblPtr: Pointer?
      get() = __154753185_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAuthorityKeyContainerNameAsync(): IAsyncOperation<String?>? {
      val fnPtr = _154753185_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__154753185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }
  }

  public class ISmartCardProvisioning2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __154753185_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardProvisioning2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("10fd28eb3f794b669b7c11c149b7d0bc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardProvisioning2(ptr: Pointer?): WithDefault =
        ISmartCardProvisioning2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardProvisioning2 {
      val address = segment.toRawLongValue()
      return makeISmartCardProvisioning2(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardProvisioning2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__154753185_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardProvisioning2): Array<ISmartCardProvisioning2?>
        = (elements as
        Array<ISmartCardProvisioning2?>).castToImpl<ISmartCardProvisioning2,ISmartCardProvisioning2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardProvisioning2?> =
        arrayOfNulls<ISmartCardProvisioning2_Impl>(size) as Array<ISmartCardProvisioning2?>
  }
}
