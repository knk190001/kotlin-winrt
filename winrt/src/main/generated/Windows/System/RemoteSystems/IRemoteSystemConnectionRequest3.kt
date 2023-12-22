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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRemoteSystemConnectionRequest3.ABI::class)
@Signature("{de86c3e7-c9cc-5a50-b8d9-ba7b34bb8d0e}")
@Guid("de86c3e7c9cc5a50b8d9ba7b34bb8d0e")
@WinRTInterface("de86c3e7c9cc5a50b8d9ba7b34bb8d0e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemConnectionRequest3.ByReference::class)
public interface IRemoteSystemConnectionRequest3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ConnectionToken(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemConnectionRequest3> {
    public override fun getValue() = ABI.makeIRemoteSystemConnectionRequest3(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemConnectionRequest3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemConnectionRequest3 {
    public val __2134960458_Ptr: Pointer?

    public val _2134960458_VtblPtr: Pointer?
      get() = __2134960458_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ConnectionToken(): String? {
      val fnPtr = _2134960458_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2134960458_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemConnectionRequest3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2134960458_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemConnectionRequest3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("de86c3e7c9cc5a50b8d9ba7b34bb8d0e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemConnectionRequest3(ptr: Pointer?): WithDefault =
        IRemoteSystemConnectionRequest3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemConnectionRequest3 {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemConnectionRequest3(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemConnectionRequest3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2134960458_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemConnectionRequest3):
        Array<IRemoteSystemConnectionRequest3?> = (elements as
        Array<IRemoteSystemConnectionRequest3?>).castToImpl<IRemoteSystemConnectionRequest3,IRemoteSystemConnectionRequest3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemConnectionRequest3?> =
        arrayOfNulls<IRemoteSystemConnectionRequest3_Impl>(size) as
        Array<IRemoteSystemConnectionRequest3?>
  }
}
