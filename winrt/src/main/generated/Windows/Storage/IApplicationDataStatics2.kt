package Windows.Storage

import Windows.Foundation.IAsyncOperation
import Windows.System.User
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

@ABIMarker(IApplicationDataStatics2.ABI::class)
@Signature("{cd606211-cf49-40a4-a47c-c7f0dbba8107}")
@Guid("cd606211cf4940a4a47cc7f0dbba8107")
@WinRTInterface("cd606211cf4940a4a47cc7f0dbba8107")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationDataStatics2.ByReference::class)
public interface IApplicationDataStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForUserAsync(user: User?): IAsyncOperation<ApplicationData?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationDataStatics2> {
    public override fun getValue() = ABI.makeIApplicationDataStatics2(pointer.getPointer(0))

    public fun setValue(value: IApplicationDataStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationDataStatics2 {
    public val __848290930_Ptr: Pointer?

    public val _848290930_VtblPtr: Pointer?
      get() = __848290930_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForUserAsync(user: User?): IAsyncOperation<ApplicationData?>? {
      val fnPtr = _848290930_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ApplicationData?>>()
      val hr = fn.invokeHR(arrayOf(__848290930_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ApplicationData?>>(result.getValue())
      return resultValue
    }
  }

  public class IApplicationDataStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __848290930_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationDataStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cd606211cf4940a4a47cc7f0dbba8107")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationDataStatics2(ptr: Pointer?): WithDefault =
        IApplicationDataStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationDataStatics2 {
      val address = segment.toRawLongValue()
      return makeIApplicationDataStatics2(Pointer(address))
    }

    public override fun toNative(obj: IApplicationDataStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__848290930_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationDataStatics2):
        Array<IApplicationDataStatics2?> = (elements as
        Array<IApplicationDataStatics2?>).castToImpl<IApplicationDataStatics2,IApplicationDataStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationDataStatics2?> =
        arrayOfNulls<IApplicationDataStatics2_Impl>(size) as Array<IApplicationDataStatics2?>
  }
}
