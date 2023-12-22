package Windows.System.RemoteSystems

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRemoteSystemApp2.ABI::class)
@Signature("{6369bf15-0a96-577a-8ff6-c35904dfa8f3}")
@Guid("6369bf150a96577a8ff6c35904dfa8f3")
@WinRTInterface("6369bf150a96577a8ff6c35904dfa8f3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemApp2.ByReference::class)
public interface IRemoteSystemApp2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_User(): User?

  @InterfaceMethod(1)
  public fun get_ConnectionToken(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemApp2> {
    public override fun getValue() = ABI.makeIRemoteSystemApp2(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemApp2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemApp2 {
    public val __201226395_Ptr: Pointer?

    public val _201226395_VtblPtr: Pointer?
      get() = __201226395_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_User(): User? {
      val fnPtr = _201226395_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__201226395_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ConnectionToken(): String? {
      val fnPtr = _201226395_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__201226395_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemApp2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __201226395_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemApp2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6369bf150a96577a8ff6c35904dfa8f3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemApp2(ptr: Pointer?): WithDefault = IRemoteSystemApp2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemApp2 {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemApp2(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemApp2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__201226395_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemApp2): Array<IRemoteSystemApp2?> = (elements
        as Array<IRemoteSystemApp2?>).castToImpl<IRemoteSystemApp2,IRemoteSystemApp2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemApp2?> =
        arrayOfNulls<IRemoteSystemApp2_Impl>(size) as Array<IRemoteSystemApp2?>
  }
}
