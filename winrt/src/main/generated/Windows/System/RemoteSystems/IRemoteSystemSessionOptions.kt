package Windows.System.RemoteSystems

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

@ABIMarker(IRemoteSystemSessionOptions.ABI::class)
@Signature("{740ed755-8418-4f01-9353-e21c9ecc6cfc}")
@Guid("740ed75584184f019353e21c9ecc6cfc")
@WinRTInterface("740ed75584184f019353e21c9ecc6cfc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemSessionOptions.ByReference::class)
public interface IRemoteSystemSessionOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsInviteOnly(): Boolean

  @InterfaceMethod(1)
  public fun put_IsInviteOnly(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemSessionOptions> {
    public override fun getValue() = ABI.makeIRemoteSystemSessionOptions(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemSessionOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemSessionOptions {
    public val __1113033892_Ptr: Pointer?

    public val _1113033892_VtblPtr: Pointer?
      get() = __1113033892_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsInviteOnly(): Boolean {
      val fnPtr = _1113033892_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1113033892_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsInviteOnly(value: Boolean): Unit {
      val fnPtr = _1113033892_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1113033892_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRemoteSystemSessionOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1113033892_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemSessionOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("740ed75584184f019353e21c9ecc6cfc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemSessionOptions(ptr: Pointer?): WithDefault =
        IRemoteSystemSessionOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemSessionOptions {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemSessionOptions(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemSessionOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1113033892_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemSessionOptions):
        Array<IRemoteSystemSessionOptions?> = (elements as
        Array<IRemoteSystemSessionOptions?>).castToImpl<IRemoteSystemSessionOptions,IRemoteSystemSessionOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemSessionOptions?> =
        arrayOfNulls<IRemoteSystemSessionOptions_Impl>(size) as Array<IRemoteSystemSessionOptions?>
  }
}
